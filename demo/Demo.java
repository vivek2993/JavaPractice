package demo;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.streamapi.Department;
import com.streamapi.Employee;
import com.streamapi.Student;

public class Demo {

	public static void main(String[] args) {
		 
		String name="hrllo";
		LinkedHashMap<Character, Long> collect = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
	}
}
