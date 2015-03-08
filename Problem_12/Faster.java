package Problem_12;

public class Faster {
	public static void main(String[] args) {
		int n = 501, maxFactors = 2, i = 2, num = 2, qty = 0;
		while(maxFactors < n) {
			num = i * (i + 1) / 2; 
			qty = 0;
			for (int j = 1; j <= (int) Math.sqrt(num); j++){
				if (num % j == 0) { 
					qty++;
					if (num / j != j) qty++;
				}
			}
			if (qty > maxFactors) maxFactors = qty;
			i++;
		}
		System.out.println(i + "  triangle numbers is : " + num + " Factors: " + qty);
	}
}
