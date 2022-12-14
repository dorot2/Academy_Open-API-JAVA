package sec06.stream_sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		
		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted() // 오름차순
			.forEach(n -> System.out.println(n + ","));
		
		System.out.println();
		
		// 객체 요소일 경우
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 30),
			new Student("신용권", 20),
			new Student("유미선", 10)
		);
		
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getScore() + ","));
		System.out.println();
	}
}
