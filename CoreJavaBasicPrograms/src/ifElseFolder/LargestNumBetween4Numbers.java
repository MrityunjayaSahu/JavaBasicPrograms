package ifElseFolder;

public class LargestNumBetween4Numbers {

	public static void main(String[] args) {
		int n1,n2,n3,n4,largestNumber = 0;
		
		n1 = 20;
		n2 = 30;
		n3 = 50;
		n4 = 10;
		
		if(n1 >= n2){
			if(n1 >= n3){
				if(n1 >= n4){
					largestNumber = n1;
				}
			}
		}else if(n2 >= n3){
			if(n2 >= n4){
				largestNumber = n2;
			}
		}else if (n3 >= n4) {
			largestNumber=n3;
		}else{
			largestNumber=n4;
		}
		System.out.println("Largest Numebr is : " + largestNumber);
	}

}
