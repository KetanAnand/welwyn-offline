import java.util.ArrayList;
import java.util.List;

/**
 * Created by ketan on 18/01/2017.
 */
public class Rack {

    private List<Integer> balls;

    private final Sorter bubbleSorter;

    public Rack() {
        balls = new ArrayList<>();
        bubbleSorter = new BubbleSorter();
    }

    public void add(final Integer number){
        balls.add(number);
        balls = bubbleSorter.sort(balls);
    }

    public List<Integer> getBalls() {
       return balls;
    }
}
