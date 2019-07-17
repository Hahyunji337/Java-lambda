package stream3;

import java.util.Arrays;
import java.util.List;

import stream.Student;

/**
 * MapReduceEx
 */
public class MapReduceEx {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("홍길동", 75),
            new Student("임꺽정", 84),
            new Student("황진이", 91)
        );
        //리스트에서 데이터들의 합계평균을 구하고 싶다.
        //1. 사이즈 구하기, 2. 점수 모두 더함, 3. 합계를 사이즈로 나눈다
        double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println(avg);
    }
}