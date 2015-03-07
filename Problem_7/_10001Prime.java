package Problem_7;

public class _10001Prime {

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
		int cont = 1;
		int _10001Prime = 0;
		for(int i=2;;i++){
			if(isPrime(i)){
				System.out.println("Contagem: "+cont);
				System.out.println(i);
				if(cont == 10001){
					_10001Prime = i;
					break;
				}
				cont++;
			}
		}
		
		System.out.println("10001st Prime: "+_10001Prime);
	}

}
