package Problem_14;

import java.io.IOException;
import java.util.LinkedList;

public class LongestCollatzSequence {
	
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		long largestNumber=0l;
		int cont=0;
		int maxCont=0;
		
		for(int i = 10; i<1000000; i++){
			long init = i;
			
			while(init!=1){
				cont++;
				if(init%2==0){
					init /= 2;
				}else{
					init = 3*init+1;
				}
			}
			if(cont > maxCont){
				maxCont = cont;
				largestNumber = i;
			}
			cont = 1;
		}
		System.out.println(largestNumber+" | "+maxCont);
		
		long finish = System.currentTimeMillis();
		System.out.println("Run in: "+(finish-start)+"ms.");
	}
	
	
}

