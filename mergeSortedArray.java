package Leetcode;

public class mergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0,0,0,0};
        int[] nums2 = {4,5,6,7};

        merge(nums1, 3,nums2,4);
        String a = "ADBccd *(((^(%%&&(,,,, s --== s323va3ee";
        System.out.println(a);
        System.out.println(removeNoiseOfString(a));

        StringBuilder sb = new StringBuilder();
        char[] arr = a.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])){
                sb.append(arr[i]);
            }
        }

        int i = 0 ;
        int j = sb.length() - 1;

        while (i<=j){
            if (sb.charAt(i) != sb.charAt(j)){
                // return false;
            }
            i++;
            j--;
        }

    }

    public static String removeNoiseOfString(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toLowerCase().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])){
                sb.append(arr[i]);
            }
        }

        return sb.toString();

    }

    public static boolean isPalidrome(String s, int left, int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    /**
     *
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     *
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6,7],       n = 3
     *
     * Output: [1,2,2,3,5,6,7]
     *
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n){

        int len = nums1.length-1;

        while(m >0 && n >0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[len] = nums1[m-1];
                m--;
            }else {
                nums1[len] = nums2[n-1];
                n--;
            }
            len--;
        }

        while(n >0){
            nums1[len] = nums2[n-1];
            n--;
            len--;
        }
    }
}
