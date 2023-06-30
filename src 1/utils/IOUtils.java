package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Student;

public interface IOUtils {

	static void storedStudDetails(String filename, Map<String, Student> map) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(map);
		}
		catch (Exception e) {
			e.printStackTrace();

		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Student> restoredStudDetails(String filename) {
		Map<String, Student> m = new HashMap<String, Student>();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			m = (Map<String, Student>) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}
}
