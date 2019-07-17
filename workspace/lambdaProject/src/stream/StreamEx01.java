package stream;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * StreamEx01
 */
public class StreamEx01 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("김가네", 85),
            new Student("이가네", 75)
        );
        
        //예전
        // Iterator it = list.iterator();
        // while(it.hasNext()){
        //     System.out.println((Student)it.next());
        // }

        //스튜던트의 기능만 사용 가능 뭔가를 필터링 할 수 x
        // for (Student st : list) {
        //     System.out.println(st.getName()+" "+st.getScore());
        // }

        //발전된 방식
        //필터링 같은것도 적용가능함 forEach는 불가능
        //기능이 탑재되어있는 순회할 수 있는 객체
        // Stream<Student> stream = list.stream();
        // stream.forEach(s -> {
        //     System.out.println(s.getName()+":"+s.getScore());
        // });

        //이렇게 더 단순히 표현가능
        list.forEach(s-> System.out.println(s.getName()+":"+s.getScore()));

    }
    
}