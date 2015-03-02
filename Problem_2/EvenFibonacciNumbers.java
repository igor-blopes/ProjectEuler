package Problem_2;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		int value1= 1;
		int value2= 1;
		int aux = 0;
		
		int sum = 0;
		
		System.out.print(value1+" ");
		System.out.print(value2+" ");
		for(int i=0; i<4000000; i++){
			if((value1+value2) >= 4000000)
				break;
			aux = value1+value2;
			value1=value2;
			value2=aux;
			System.out.print(value2+" ");
			if(value2 % 2==0)
				sum += value2;
		}
		
		System.out.println("\nSum result of the even-valued terms: "+sum);
	}

}
