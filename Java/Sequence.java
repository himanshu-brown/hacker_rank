import java.util.*;
import java.io.*;
class Sequence{
	public static void main(String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of test case");
		int test_case = scan.nextInt();
		int index1 = 0, index2 = 0, diff = 0, result = 0;
		int array[] = null;
		for(index1=0; index1<test_case; index1++){
			System.out.println("Enter the size of array");
			int size = scan.nextInt();
			array = new int[size];
			System.out.println("Enter the element of array : ");
			for(index2=0; index2<size; index2++){
				array[index2] = scan.nextInt();
			}
			diff = array[1] - array[0];
			for(index2=0; index2<size-1; index2++){
				if(array[index2] + diff != array[index2+1] ){
				result = array[index2+1];
				break;
				}
			}
			System.out.println("Wrong : "+result);
			result = 0;
		}
	}
}