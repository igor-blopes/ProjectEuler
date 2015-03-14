package Problem_4;

public class LargestPalindromeProduct {
	
	public static boolean isPalindrome(String number){
		boolean palindrome = false;
		String numberSplit[] = number.split("");
		String numberInverse = "";
		for(int i=numberSplit.length-1; i>=0; i--){
			numberInverse += numberSplit[i];
		}
		int num1 = Integer.parseInt(number);
		int num2 = Integer.parseInt(numberInverse);
		if(num1-num2 == 0){
			return true;
		}
		return palindrome;
	}
	
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int largest_palindrome = 0;
		int product = 0;
		for(int i=100; i<1000; i++){
			for(int j=100; j<1000; j++){
				product = i*j;
				if(isPalindrome(String.valueOf(product))){
					if(largest_palindrome < product){
						largest_palindrome = product;
					}
				}
			}
		}
		
		System.out.println(largest_palindrome);
		
		long finish = System.currentTimeMillis();
		System.out.println("Run in: "+(finish-start)+"ms.");
	}

}
