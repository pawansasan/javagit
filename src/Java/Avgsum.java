package Java;

public class Avgsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,30,40,50};
		int sum = 0;
		int Average = 0;
		int length = arr.length;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
			Average = sum/length;
			
		}
		System.out.println("Sum of all the array elements =" + sum);
		System.out.println("Average of all the array elements =" + Average);
		
	}

}
