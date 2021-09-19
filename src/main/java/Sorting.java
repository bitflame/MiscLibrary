import edu.princeton.cs.algs4.In;

public class Sorting {
    public Integer sort(Integer[] nums) {
        /* move forward while it is 0 until you see a 1, move backwards while it is 1 until you see 0 then
         * swap them */
        int i = 0, j = nums.length-1, moves=0;

        while (i < nums.length) {
            if (nums[i] == 0) i++;
            while (j > i) {
                if (nums[j] == 1) j--;
                exchange(nums,i,j);
                moves+=2;
                j--;
                break;
            }
            i++;
        }
        return moves;
    }

    private void exchange(Integer[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {

    }
}
