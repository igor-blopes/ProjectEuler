package Problem_4;

public class moreFast {

	public static void main(String[] args) {
		outerloop:
			for(int i=999;;i--)
			{
				//Takes the number, mirrors it and adds it to the end of itself.
				int palen=i*1000 + i%10*100 + i/10%10*10 + i/100%10;
				//Checks if it is a product of two 3-digit numbers.
				for(double j=100; palen/j>=j && j<1000; j++)
				{
					double div=palen/j;
					if(div%1==0 && div<1000 && div>99)
					{
						System.out.println(palen);
						break outerloop;
					}
				}
			}

	}

}
