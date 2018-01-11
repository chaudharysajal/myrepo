package co.sorting;

public class lengthofstringwithoutlengthfunction {
	
	public static void main(String[] args) {
		
		String name="sajal";
		int count=0;
		
		String[] temp = name.split("");
		
		for(String length: temp){
			System.out.print(length);
			count++;
		}
		System.out.println();
		System.out.println(count);
		
	}

}
