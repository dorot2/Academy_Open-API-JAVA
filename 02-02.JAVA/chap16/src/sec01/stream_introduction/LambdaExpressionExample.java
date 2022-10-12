package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 90),
			new Student("신용권", 92)
		);

		// 위의 구문을 컬렉션 문법으로 처리.
		/*
		List<Student> list2 = new List<Student>();
		list2.add(new Student("홍길동", 90));
		list2.add(new Student("신용권", 92));
		*/
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
