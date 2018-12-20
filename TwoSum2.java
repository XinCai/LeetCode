package leetcode;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        twoSum(arr,6);

    }


    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0){
            return null;
        }

        int[] result = new int[2];

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) ==target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }




}
