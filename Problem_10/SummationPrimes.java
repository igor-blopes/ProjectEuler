package Problem_10;

public class SummationPrimes {
	
	
	public static boolean isPrimeFaster(long x) {	
		if(x==2 || x==3) return true;
		if(x==1 || x%2==0 || x%3==0) return false;
		for(int i=6; i<=Math.ceil(Math.sqrt(x))+1; i+=6)
			if(x%(i-1)==0 || x%(i+1)==0) return false;
		return true;
	}
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		//Use Chronometer project
		Chronometer.Chronometer.start();
		long sumPrimes = 0l;
		for(int i=2; i<2000000; i++){
			if(isPrime(i)){
				sumPrimes += i;
			}
		}
		Chronometer.Chronometer.stop();
		System.out.println(Chronometer.Chronometer.elapsedTime()+"ms");
		System.out.println("Summation of primes bellow two millions: "+sumPrimes);
	}

}
