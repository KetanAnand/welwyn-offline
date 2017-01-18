package spell;

/**
 * Created by ketan on 18/01/2017.
 */
public class NumberSpeller {

    private static final String ZERO = "zero";

    private static final String[] UNITS = {
                "", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine"
        };

    private static final String[] FIRST_TENS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] OTHER_TENS = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty",
                "ninety"
        };

    public String getWordFromNumber(final int n){
        if (n ==0){
            return ZERO;
        }
        return spellNumber(n);
    }

    private String spellNumber(final int n) {
        if (n < 10) {
            return UNITS[n];
        }

        if (n < 20) {
            return FIRST_TENS[n-10];
        }

        if (n < 100) {
            return OTHER_TENS[n / 10] + ((n % 10 != 0) ? "-" : "") + UNITS[n % 10];
        }

        if (n < 1000) {
            return UNITS[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + spellNumber(n % 100);
        }

        if (n < 1000000) {
            return spellNumber(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + spellNumber(n % 1000);
        }

        if (n < 1000000000) {
            return spellNumber(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + spellNumber(n % 1000000);
        }

        return spellNumber(n / 1000000000) + " billion"  + ((n % 1000000000 != 0) ? " " : "") + spellNumber(n % 1000000000);
    }
}
