package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import static utils.IOUtils.*;

import static utils.ValidationRule.*;
public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			Map<String,Student> studmap = new HashMap<>();
			boolean exit =false;
			System.out.println("Enter filename");
			String filename = sc.next();
			while(!exit)
			{
				try {
					
					System.out.println("1.Register new student , 2. Display students"
							+ "3. Remove if doc not submitted,  4. Display student name from specific city"
							+ "5. sort by dob, 6.display email of student fee less than 70000");
					System.out.println("Enter a choice");
					switch(sc.nextInt())
					{
					case 1:
						Student s = validateStudents(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean(),studmap);
						studmap.put(s.getEmail(), s);
						System.out.println("Student added");
						//System.out.println("Enter file name  ");
						storedStudDetails(filename,studmap);
						
						break;
						
					case 2:
						System.out.println("Display all students");
						studmap.values().stream().forEach(p->System.out.println(p));
						break;
						
					case 3:
						System.out.println("Remove students if docs not submitted");
						String s6="";
						for(Student s1 : studmap.values())
						{
							if(s1.isDocSubmit()==false)
							{
								//studmap.values().remove(s1);
								//studmap.remove(s1.getRollno());
								 s6 = s1.getEmail();
							}
							
						}
						studmap.remove(s6);
						storedStudDetails(filename,studmap);
						
						
						break;
						
					case 4:
						System.out.println("Enter city name");
						String str = sc.next();
						for(Student s1 :studmap.values())
						{	
							if(s1.getAddress().equals(str))
							{
								
								System.out.println(s1.getFname());
							}
//							if(s1.getAddress().equalsIgnoreCase(str))
//							{
//								System.out.println(studmap.);
//							}
//							else {
//								System.out.println("Address not found ...");
//							}
						}
						break;
						
					case 5:
						System.out.println("Sorting by dob");
						studmap.values().stream().
						sorted((p1,p2)->p1.getDob().compareTo(p2.getDob())).forEach(p->System.out.println(p));
						break;
						
					case 6:
						for(com.app.core.Student s1 :studmap.values())
						{	
							if(s1.getFees()<70000)
							{
								System.out.println(s1.getEmail());
							}
						}
						break;
						
					case 7:
						System.out.println("Restoring file");
						Map<String, Student> maps =restoredStudDetails(filename);
						
						maps.values().stream().forEach(p->System.out.println(p));
						break;
						
					case 0:
						exit=true;
						break;
						
					}
				}catch(Exception e)
				{
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}
	}

}
//sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),
//sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean()
//234rrr Mohit Lokhande mohit@gmail satara 2001-08-19 Mech dac 100000 true
//234ttt Prajyot Pawar prajyot@gmail nashik 2000-08-05 ENTC DBDA 70359 true
//234sss Shubham Suryawanshi shubham@gmail karad 2000-01-16 comp ditiss 56000 true
//234ooo omkar yadav omkar@gmail wai 2000-05-02 elect dai 80000 false

