package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ketan on 18/01/2017.
 */
public class BubbleSorter implements Sorter{

    @Override
    public List<Integer> sort(final List<Integer> inputList) {
        int temp;
        final List<Integer> sortedList = new ArrayList<>();
        //Defensive copying
        sortedList.addAll(inputList);
        if (sortedList != null && sortedList.size()>1)
        {
            for (int i=0; i<sortedList.size(); i++)
            {
                for (int j=0; j < sortedList.size()-i-1; j++) {
                    if (sortedList.get(j) > (sortedList.get(j+1)))
                    {
                        temp = sortedList.get(j);
                        sortedList.set(j,sortedList.get(j+1) );
                        sortedList.set(j+1, temp);
                    }
                }
            }
        }
        return sortedList;
    }
}
