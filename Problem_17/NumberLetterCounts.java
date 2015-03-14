package Problem_17;

public class NumberLetterCounts {
	
	private static String[] unit = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	private static String[] dozen = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String[] hundred = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	public static int belowHundred(int number){
		int amount = 0;
		if(number<10){
			amount += unit[number].length();
		}else{
			if(number < 20){
				amount += dozen[number-10].length();
			}else{
				String help = null;
				if(number%10!=0){
					help = unit[number%10];
				}else{
					help ="";
				}
				amount += hundred[number/10 - 2].length()+help.length();
			}
		}
		return amount;
	}
	
	
	public static int countNumberLetters(int number){
		int amount = 0;
		if(number<100){
			amount += belowHundred(number);
		}else{
			if(number>999){
				amount +=unit[1].length()+"thousand".length();
			}
			if(number / 100 % 10 != 0){
				amount += unit[number / 100 % 10].length()+"hundred".length();
			}
			if( number%100 != 0){
				amount += "and".length()+belowHundred(number % 100);
			}else{
				amount += "".length();
			}
		}
		return amount;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sum = 0;
		
		for(int i=1; i<=1000; i++){
			sum += countNumberLetters(i);
		}
		
		System.out.println(sum+" letters");
		long finish = System.currentTimeMillis();
		System.out.println("Run in: "+(finish-start)+"ms.");
	}

}
