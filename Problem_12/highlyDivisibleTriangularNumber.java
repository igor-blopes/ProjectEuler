package Problem_12;

public class highlyDivisibleTriangularNumber {

	public static int qtdDivisor(long number){
		int qtdDivisor = 0;
		for(long i=number; i>0; i--){
			if(number % i == 0){
				qtdDivisor++;
			}
		}
		return qtdDivisor;
	}
	
	
	public static void main(String[] args) {
		/* 20 minutes
		long sum = 0l;
		for(int i=1; ; i++){
			sum += i;
			int qtd = qtdDivisor(sum);
			if(qtd>100){
				System.out.println("sum: "+sum+" | qtdDivisor: "+qtd);
			}
			if(qtd > 500){
				break;
			}
		}
		
		System.out.println(sum);*/
		
		
		long n=1l,trianguleNumber,count;
		while(n!=0){
			trianguleNumber = n*(n+1)/2;
			count = 2;
			for(int i=2; i<=Math.sqrt(trianguleNumber); i++){
				if(trianguleNumber%i == 0){
					count+=2;
				}
				if(count>=500){
					System.out.println("Firts triangule number have over five hundred divisors: "+trianguleNumber);
					return;
				}
			}
			n++;
		}
		return;
	}

}
