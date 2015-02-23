package Problem_1;

public class SumMultiple_3and5 {
	
	public static void main(String[] args){
		int soma = 0;
		for(int i=0; i<1000; i++){
			if(i%3==0 || i%5==0){
				soma +=i;
			}
		}
		
		System.out.println("Sum of the multiples of 3 and 5: "+soma);
	}

}
