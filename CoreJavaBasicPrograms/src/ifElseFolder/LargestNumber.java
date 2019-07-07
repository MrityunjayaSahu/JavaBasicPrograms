package ifElseFolder;

public class LargestNumber {

	public static void main(String[] args) {
		
		int n1, n2,n3, largestNumber;
		
		n1 = 10;
		n2 = 23;
		n3 = 7;
		
		if(n1 >= n2){
			if(n1 >= n3){
				largestNumber = n1;
			}else{
				largestNumber = n2;
			}
		}else{
			if(n2 >= n3){
				largestNumber = n2;
			}else{
				largestNumber = n3;
			}
			
		}
		System.out.println("Largsest Number is : " + largestNumber);
		
		
	}

}
