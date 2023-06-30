package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.app.core.Course;
import com.app.core.Qualification;
import com.app.core.Student;

import ExceptionHandling.StudExcep;

public class ValidationRule {

//	int rollno, String fname, String lname, String email, String address, LocalDate dob, Qualification q1,
//	Course c1, double fees, boolean docSubmit

	public static Student validateStudents(int rollNo, String fname, String lname, String email, String address,
			String dob, String q1, String c1, double fees, boolean docSubmit, Map<String, Student> map)
			throws StudExcep {
		LocalDate d=dateParse(dob);
		checkForDups(email, map);
		Course c=validCourse(c1);
	Qualification q =	validateQuali(q1);
		return new Student (rollNo, fname, lname, email, address,d, q, c, fees, docSubmit);
	}

	public static LocalDate dateParse(String date) throws StudExcep {

		LocalDate d = LocalDate.parse(date);
		LocalDate d1 = LocalDate.now();
		int a = Period.between(d, d1).getYears();
		if (a > 1 && a < 22) {
			return LocalDate.parse(date);
		}
		throw new StudExcep("Age Not Valiadte !!! ");
	}

	public static Student checkForDups(String email, Map<String, Student> map) throws StudExcep {
		if (map.containsKey(email))
			throw new StudExcep("Stud already exists !!!!!!! ");
		return null;
	}

	public static Course validCourse(String course) {
		return Course.valueOf(course.toUpperCase());
	}

	public static Qualification validateQuali(String qualification) {
		return 	Qualification.valueOf(qualification.toUpperCase());
	}
}
