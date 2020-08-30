import java.util.*;
import java.io.*;
import java.util.Arrays;
class Maximum{
	public static void main(String args[])throws Exception{
		Scanner scan = new Scanner(System.in);
		int array[] = new int [1000];
		int index1=0, index2=0, index3=0, sum=0, max=0;
		System.out.println("Enter the size of test cases : ");
		int size_of_test_cases = scan.nextInt();
		for(index1=0; index1<size_of_test_cases; index1++){
			System.out.println("Enter the size of an array : ");
			int size_of_array = scan.nextInt();
			System.out.println("Enter the element of an array : ");
			for(index2=0; index2<size_of_array; index2++){
				array[index2] = scan.nextInt();
			}
			for(index3=0; index3<size_of_array; index3++){
				for(index2=index3; index2<size_of_array; index2++){
					sum+=array[index2];
					if(sum>max)
					max=sum;
				}
				sum=0;
			}
			System.out.println("Maximum subarray sum is : "+ max);
		}
	}
}