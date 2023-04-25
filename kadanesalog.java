package arraysmain;
import java.util.*;
public class kadanesalog {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int a=sc.nextInt();
	int sum=0,max=Integer.MIN_VALUE;
	int arr[]=new int[a];
	System.out.println("enter number in array");
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<a;i++) {
			sum+=arr[i];
		if(sum>max) {
			max=sum;	
		}
		if(sum<0) {
		   sum=0;
		}
	}
	System.out.println(max);
	}
}
