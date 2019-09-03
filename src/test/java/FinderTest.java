import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void findMax() {
        int[] array= {1,2,3,4,5,6};
        int max = Finder.findMax(array);
        assertEquals(6, max);
    }

    @Test
    void findMin() {
        int[] array= {1,2,3,4,5,6};
        int min = Finder.findMin(array);
        assertEquals(1, min);
    }

    @Test
    void testFindMax_empty() {
        int[] array = {};
        Integer max = Finder.findMax(array);
//        System.out.println(max);
        assertEquals((Integer) null, max);
    }

    @Test
    void testFindMin_empty() {
        int[] array = {};
        Integer min = Finder.findMin(array);
//        System.out.println(max);
        assertEquals((Integer) null, min);
    }

    @Test
    void testFindMax_null() {
        int[] array = null;
        Integer max = Finder.findMax(array);
//        System.out.println(max);
        assertEquals((Integer) null, max);
    }

    @Test
    void testFindMin_null() {
        int[] array = null;
        Integer min = Finder.findMin(array);
//        System.out.println(max);
        assertEquals((Integer) null, min);
    }
}