package staticex2;

import java.util.function.BiFunction;
import java.util.function.Function;

import lambda2.Member;

/**
 * ConstructorRefEx
 */
public class ConstructorRefEx {

    public static void main(String[] args) {
        Function<String, Member> f1 = Member :: new; //입력은 스트링 출력은 멤버로 하겠다는 뜻
        Member m1 = f1.apply("kgh"); //이런식의 생성자 선언도 가능하다

        BiFunction<String,String, Member> f2 = Member :: new;
        Member m2 = f2.apply("하현지", "jk");
    }
}