package spell;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

/**
 * Created by ketan on 18/01/2017.
 */
public class NumberSpellerTest {

    NumberSpeller numberSpeller;

    @Before
    public void setUp() throws Exception {
        numberSpeller = new NumberSpeller();
    }

    @Test
    public void spellZero() throws Exception {
        final String word = numberSpeller.getWordFromNumber(0);
        assertThat(word, is(equalTo("zero")));
    }

    @Test
    public void spellNumberInTens() throws Exception {
        final String word = numberSpeller.getWordFromNumber(34);
        assertThat(word, is(equalTo("thirty-four")));
    }

    @Test
    public void spellNumberInHundreds() throws Exception {
        final String word = numberSpeller.getWordFromNumber(542);
        assertThat(word, is(equalTo("five hundred forty-two")));
    }


    @Test
    public void spellNumberInThousands() throws Exception {
        final String word = numberSpeller.getWordFromNumber(23212);
        assertThat(word, is(equalTo("twenty-three thousand two hundred twelve")));
    }

    @Test
    public void spellNumberInMillions() throws Exception {
        final String word = numberSpeller.getWordFromNumber(1049875);
        assertThat(word, is(equalTo("one million forty-nine thousand eight hundred seventy-five")));
    }

    @Test
    public void spellNumberInBillions() throws Exception {
        final String word = numberSpeller.getWordFromNumber(1049875000);
        assertThat(word, is(equalTo("one billion forty-nine million eight hundred seventy-five thousand")));
    }
}
