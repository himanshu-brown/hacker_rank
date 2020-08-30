import java.util.*;
import java.io.*;
import java.util.Arrays;
class Increaments{
	public static void main(String args[])throws Exception{
		Scanner scan = new Scanner(System.in);
		int array[] = new int[1000];
		System.out.println("Enter the size of array : ");
		int size_of_array = scan.nextInt();
		System.out.println("Enter the size of operations : ");
		int size_of_operation = scan.nextInt();
		int index = 0;
		for(index=0; index<size_of_operation; index++){
			System.out.println("This is the "+index+" operation");
			System.out.println("Enter the value of a : ");
			int a = scan.nextInt();
			System.out.println("Enter the value of b : ");
			int b = scan.nextInt();
			System.out.println("Enter the value of k : ");
			int k = scan.nextInt();
			for(int j=a; j<=b; j++){
				array[j] = array[j] + k;
			}
		}
		 int maximum = Arrays.stream(array).max().getAsInt(); 
		System.out.println("Maximum element in array after m operations : "+ maximum);
	}
}