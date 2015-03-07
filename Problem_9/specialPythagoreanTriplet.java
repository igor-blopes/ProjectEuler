package Problem_9;

public class specialPythagoreanTriplet {

	public static void main(String[] args) {
		
		long product =0l;
		
		for(int i=1;i<500;i++){
			for(int j=i+1;j<500;j++){
				for(int l=j+1;l<500;l++){
					if((i*i + j*j == l*l) && (i+j+l == 1000)){
						product = i*j*l;
						System.out.println("Product of special pythagorean triplet: "+product);
						break;
					}
				}
			}
		}
		
		
	}

}
