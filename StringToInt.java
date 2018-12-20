package leetcode;

public class StringToInt {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);

        sb.append('1');
        sb.append('2');
        sb.append("d");
        System.out.println(sb);

        String str = "123";

        int digit1 = str.charAt(0) - '0';
        System.out.println(digit1);

        int digit2 = str.charAt(2) - '0';
        System.out.println(digit2);
        System.out.println(str.trim());

        StringToInt stringToInt = new StringToInt();

        //int i  = stringToInt.myAtoi(" ");
        int i  = stringToInt.atoi(" ");
        System.out.println(i);

    }


    public int myAtoi(String str) {

        if(str.length() == 0 || str == null || str ==" "){
            return 0;
        }
        long result = 0;
        int sign = 1;
        int start = 0;

        // remove space
        String nonWhiteSpaceStr = str.trim();

        // negative number or positive number
        if (nonWhiteSpaceStr.charAt(0) == '-' || nonWhiteSpaceStr.charAt(0) == '+'){
            if (nonWhiteSpaceStr.charAt(0) == '-'){
                sign = -1;
                start = 1;
            }
            if (nonWhiteSpaceStr.charAt(0) == '+'){
                sign = 1;
                start = 1;
            }
        }


        while (start < nonWhiteSpaceStr.length()){
            if (!Character.isDigit(nonWhiteSpaceStr.charAt(start))){
                return (int)result * sign;
            }

            result = result * 10 + nonWhiteSpaceStr.charAt(start) - '0';
            if (sign == 1 && result > Integer.MAX_VALUE){
                return  Integer.MAX_VALUE;
            }
            if (sign == -1 && (-1)*result < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            start++;
        }

        result = result * sign;
        return (int)result;

//
//        char[] chars = str.toCharArray();
//        int nonWhiteSpaceIndex = 0 ;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == ' '){
//                continue;
//            }else {
//                nonWhiteSpaceIndex = i;
//                break;
//            }
//        }
//
//        HashSet<Character> numSet = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            numSet.add(Character.forDigit(i,10));
//        }
//
//        String nonLeadingWhiteSpaceStr = str.substring(nonWhiteSpaceIndex);
//        for (int i = 0; i < nonLeadingWhiteSpaceStr.length(); i++) {
//            if (numSet.contains(nonLeadingWhiteSpaceStr.charAt(i)) ){
//                //sb.append(nonLeadingWhiteSpaceStr.charAt(i));
//            }
//        }

        //result = Integer.parseInt(sb.toString());

        //return (int) result;
    }

    public int atoi(String str){

        str = str.trim();
        if (str.length() == 0){
            return 0;
        }
        char firstChar = str.charAt(0);
        int sign = 1, start = 0, len = str.length();
        long sum = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < len; i++) {
            if (!Character.isDigit(str.charAt(i)))
                return (int) sum * sign;
            sum = sum * 10 + str.charAt(i) - '0';  // 2 digit , ( previous digit * 10 ) + (current digit )
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) sum * sign;
    }

}
