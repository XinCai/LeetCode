package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BackPack {

    public static void main(String[] args) {

        // backpack contains 4 kilo
        // items has 3 items to be stolen

        int bagSize = 4;
        String[] items = {"guitar", "stereo", "laptdop"};
        Integer[] weights = {1,4,3};
        Integer[] values = {1500, 2000, 3000};

        Integer[][] dp = new Integer[values.length+1][bagSize+1];

//        HashMap<String,List<Integer>> hashMap = new HashMap<>();
//        List<Integer> guitarSizeValue = new ArrayList<>();
//        guitarSizeValue.add(values[0]);
//        guitarSizeValue.add(size[0]);
//
//        List<Integer> stereoSizeValue = new ArrayList<>();
//        stereoSizeValue.add(values[1]);
//        stereoSizeValue.add(size[1]);
//
//        List<Integer> laptopSizeValue = new ArrayList<>();
//        laptopSizeValue.add(values[2]);
//        laptopSizeValue.add(size[2]);


//        hashMap.put(items[0], guitarSizeValue);
//        hashMap.put(items[1], stereoSizeValue);
//        hashMap.put(items[2], laptopSizeValue);
//
//        System.out.println(hashMap.get("guitar"));


        // items = row , bagSize = column
        for (int row = 0; row < dp.length; row++) {
            for (int col = 0; col < dp[0].length; col++) {
                if (col==0){
                    dp[row][col] = 0;
                }else {
                    dp[row][col] = 1;
                }
            }
        }


        for (int row = 0; row < dp.length; row++) {
            for (int col = 0; col < dp[0].length; col++) {

               dp[row][col] = Math.max(dp[row-1][col-1],values[row]);
            }
        }





        System.out.printf(" ");

    }


}
