import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void constrainedSubsetSumTest1() {
        int[] nums = {10, 2, -10, 5, 20};
        int k = 2;
        int expected = 37;
        int actual = new Solution().constrainedSubsetSum(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constrainedSubsetSumTest2() {
        int[] nums = {-1, -2, -3};
        int k = 1;
        int expected = -1;
        int actual = new Solution().constrainedSubsetSum(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constrainedSubsetSumTest3() {
        int[] nums = {10, -2, -10, -5, 20};
        int k = 2;
        int expected = 23;
        int actual = new Solution().constrainedSubsetSum(nums, k);

        Assert.assertEquals(expected, actual);
    }
}
