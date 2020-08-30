import java.util.*;
import java.io.*;
class Prime{
	public static void main(String args[])throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = scan.nextInt();
		int i = 0, j = 0, index = -1, flag = 0, sum = 0, count = 0;
		int array[] = new int[1000];
		for(i=2; i<=n; i++){
			for(j=2; j<=i/2; j++){
				if(i%j==0){
					flag = 1;
					break;
				}
			}
			if(flag==0)
			array[++index]=i;
			flag=0;
		}
		for(i=0; i<index-1; i++){
			sum = sum + array[i];
			for(j=i+1; j<=index; j++){
				if(sum==array[j])
				count++;
			}
		}
	System.out.println("Result : "+ count);
	}
}