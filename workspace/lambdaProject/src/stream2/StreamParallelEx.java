package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * StreamParallelEx
 */
public class StreamParallelEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
            "짜장면","규동","짬뽕","칼국수","비빔밥","파스타","피자"
        );

        //기존 - 순차적 처리
        Stream<String> stream = list.stream();
        stream.forEach(StreamParallelEx::print);
        System.out.println();

        //패러랠 - 병렬처리
        Stream<String> stream2 = list.parallelStream();
        stream2.forEach(StreamParallelEx::print);
        System.out.println();
    }
    public static void print(String str){
        //currentThread() 해당 동작을 실행시킨 애가 누군지 찍어보는 것임
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}

