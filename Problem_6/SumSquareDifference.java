package Problem_6;

public class SumSquareDifference {
	public static void main(String[] args) {
		long sumSquareFirstHundred = 0;
		long sumFirstHundredSquare = 0;
		
		for(int i=1; i<=100; i++){
			sumSquareFirstHundred += Math.pow(i, 2);
			sumFirstHundredSquare += i;
		}
		
		System.out.println((long)Math.pow(sumFirstHundredSquare, 2)-sumSquareFirstHundred);
	}

}
