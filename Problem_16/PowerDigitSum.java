package Problem_16;

import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		BigInteger number = BigInteger.valueOf(2);
		number = number.pow(1000);
		String splitNumbers[] = String.valueOf(number).split("");
		int powerSum = 0;
		
		for(int i=0; i<splitNumbers.length; i++){
			powerSum += Integer.valueOf(splitNumbers[i]);
		}
		System.out.println("The power sum is: "+powerSum);
		
		long finish = System.currentTimeMillis();
		System.out.println("Run in: "+(finish-start)+"ms.");
	}

}
