package node;

public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(IntToRoman(12));
    }


    /**
     * 1 - 3999 input int range
     * output roman string
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     *
     * @param target
     * @return
     */
    public static String IntToRoman(int target){
        String M[] = {"","M","MM", "MMM"}; // 1000, 2000, 3000
        String C[] = {"","C", "CC", "CCC", "CD", "D", "DC","DCC", "DCCC", "CM"}; // 100, 200, 300, 400, 500, 600, 700, 800, 900,
        String X[] = {"","X","XX","XXX","XL", "L","LX", "LXX", "LXXX","XC"}; // 10, 20, 30, 40, 50, 60, 70, 80, 90
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; // 1, 2, 3, 4,5,6,7,8,9

        return M[target/1000] + C[(target%1000)/100] + X[(target%100)/10] + I[target%10];
    }
}
