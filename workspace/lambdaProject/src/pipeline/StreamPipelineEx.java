package pipeline;

import java.util.Arrays;
import java.util.List;


/**
 * StreamPipelineEx
 */
public class StreamPipelineEx {

    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
            new Member("김씨", Member.MALE, 30),
            new Member("이씨", Member.FEMALE, 21),
            new Member("박씨", Member.MALE, 45),
            new Member("최씨", Member.FEMALE, 27)
        );

        //필터
        double avg = list.stream().filter(m->m.getGender() == Member.MALE).mapToInt(Member :: getAge).average().getAsDouble();
        System.out.println("남자 평균 나이"+avg);
    }
}