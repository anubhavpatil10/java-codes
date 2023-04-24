import java.util.*;

public class arrayswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, size, total = 0;
		System.out.println("1:Read array\n 2:Print array \n " + "3:Search elements in array\n 4:Reverse array\n "
				+ "5:Even no\n 6:sum of array element");
		System.out.println("Enter size of array");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("array created for length" + arr.length);

		do {
			System.out.println("Enter choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter the elements in array");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				break;
			case 2:
				for (int i = 0; i < arr.length; i++) {
					System.out.println(" array" + arr[i]);
				}
				break;
			case 3:
				System.out.println("enter elemts to search");
				int no = sc.nextInt();
				// boolean flag=false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == no) 
						System.out.println("true");
					 else 
						System.out.println("false");		
				}
				break;
			case 4:
				System.out.println("reverse array is");
				for (int i = size - 1; i >= 0; i--) {
					System.out.println(""+arr[i]);
				}break;
			case 5:
				System.out.println("even no  in array");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i]%2==0) 
						System.out.println(""+arr[i]);
						
					}break;
			case 6:
				System.out.println("Sum of elements in array are");
				for(int i=0;i<arr.length;i++) {
					total=total+arr[i];
			System.out.println(total);
				break;}
				default :
					System.out.println("invalid choice");
					break;
					
			
			}
		
		}while(ch<= 7);
		sc.close();
	}
}


