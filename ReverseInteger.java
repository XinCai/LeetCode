
public class ReverseInteger {
	
	public static void main(String[] args){
		int x = -152999190;
		
		ReverseInteger myDemo = new ReverseInteger();
		int result = myDemo.reverse(x);
		
		System.out.println(result);
		
	}
	
	public int reverse(int x) {
		int result = 0;
		
		while(x!=0){
			result = result * 10 + x%10;
			x= x/10;
			if(result > Integer.MAX_VALUE || result< Integer.MIN_VALUE){
				return 0;
			}
		}
		
		return result;
	}
}
