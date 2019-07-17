package lambda2;

import java.util.function.Consumer;

/**
 * CousumerAndThenExample
 */
public class CousumerAndThenExample {

    public static void main(String[] args) {
        Consumer<Member> cousumerA = (m) -> System.out.println("cousumerA"+m.getName());
        Consumer<Member> cousumerB = (m) -> System.out.println("cousumerB"+m.getId());

        // cousumerA.accept(new Member("홍길동", "hong", null));
        //위처럼 안하고 한방에 하는 방법(데이터 체인)
        Consumer<Member> consumerAB = cousumerA.andThen(cousumerB);
        consumerAB.accept(new Member("홍길동", "hong", null));

    }
}