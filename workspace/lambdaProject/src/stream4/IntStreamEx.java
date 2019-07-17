package stream4;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * IntStreamEx
 */
public class IntStreamEx {

    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        IntStream is = Arrays.stream(intArr);
        is.forEach(a -> System.out.println(a+ ","));
        System.out.println();

        //순차적 수 넣어서 접근가능
        //1 100까지 넣어줌
        IntStream is2 = IntStream.rangeClosed(1, 100);
        is2.forEach(a->System.out.println(a + ","));
    }
    

}