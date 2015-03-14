package Problem_15;

import java.math.BigInteger;

public class LatticePaths {
	//A!/(!B(A-B)!)
	//From pascal triangle 40!/(20!)^2
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int grid = 20;
		long path = 1;
		
		for(int i=0; i<grid; i++){
			path *= 2*grid-1;
			path /= (i+1);
		}
		
		System.out.println("Paths: "+path);
		long finish = System.currentTimeMillis();
		System.out.println("Run in: "+(finish-start)+"ms.");
	}

}
