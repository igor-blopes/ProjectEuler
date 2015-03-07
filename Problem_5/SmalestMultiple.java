package Problem_5;

public class SmalestMultiple {
	
	
	public static boolean isMultiple(int number){
		for(int i=1; i<21; i++){
			if(number%i != 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int SmalestMultiple = 0;
		for(int i=1;;i++){
			if(isMultiple(i)){
				SmalestMultiple = i;
				break;
			}
		}
		
		System.out.println(SmalestMultiple);
	}

}
