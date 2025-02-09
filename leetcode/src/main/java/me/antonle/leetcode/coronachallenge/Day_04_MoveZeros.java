package me.antonle.leetcode.coronachallenge;

public class Day_04_MoveZeros {

    public void moveZeroes(int[] nums) {
        int firstZeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0 && firstZeroIndex != -1) {
                nums[firstZeroIndex] = num;
                nums[i] = 0;
                firstZeroIndex++;
            } else if (num == 0 && firstZeroIndex == -1) {
                firstZeroIndex = i;
            }
        }
    }

    public int[] moveZeroesWithReturn(int[] nums) {
        final int[] newArr = new int[nums.length];
        int beginIndex = 0;
        int endIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                newArr[beginIndex++] = num;
            } else {
                newArr[endIndex--] = num;
            }
        }
        return newArr;
    }

}
