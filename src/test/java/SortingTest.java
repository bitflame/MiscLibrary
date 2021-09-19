import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
Sorting s = new Sorting();
    @Test
    void sort() {
        Integer[] nums = {0,1,0,1};
        Assertions.assertEquals(2,s.sort(nums));
    }
}