package Problem_3;

public class LargestPrimeFactor {
	
	public static boolean isPrime(long number){
		boolean prime = true;
		for(int i=2; i<number; i++){
			if(number%i==0){
				return false;
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		long number = 600851475143l;
		for(int i=2; i<number; i++){
			if(isPrime(i)){
				if(number % i==0){
					number /= i;
				}
			}
		}
		System.out.println(number);
	}

}
