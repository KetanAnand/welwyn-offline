package sort;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ketan on 18/01/2017.
 */
public class RackTest {

    Rack rack;

    @Before
    public void setUp() throws Exception {
        rack = new Rack();
    }

    @Test
    public void testSortingEmptyList() throws Exception {
        assertThat(rack.getBalls(), IsEmptyCollection.empty());
    }

    @Test
    public void testSortingRandomList() throws Exception {
        rack.add(20);
        Assert.assertEquals(Arrays.asList(new Integer[]{20}), rack.getBalls());
        rack.add(10);
        Assert.assertEquals(Arrays.asList(new Integer[]{10,20}), rack.getBalls());
        rack.add(30);
        Assert.assertEquals(Arrays.asList(new Integer[]{10,20,30}), rack.getBalls());
    }

    @Test
    public void testSortingSortedList() throws Exception {
        rack.add(10);
        Assert.assertEquals(Arrays.asList(new Integer[]{10}), rack.getBalls());
        rack.add(20);
        Assert.assertEquals(Arrays.asList(new Integer[]{10,20}), rack.getBalls());
        rack.add(30);
        Assert.assertEquals(Arrays.asList(new Integer[]{10,20,30}), rack.getBalls());
    }
}
