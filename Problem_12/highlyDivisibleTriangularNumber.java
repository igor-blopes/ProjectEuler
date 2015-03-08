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
		
		System.out.println(sum);
	}

}
