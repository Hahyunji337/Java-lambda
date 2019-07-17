package app;

import java.util.function.Consumer;

import app.lambda.FunctionI;

public class FunctionalMainClass {
    public static void main(String[] args) throws Exception {
        //이런식으로 사용.
        //걍 귀찮으니까 정의되엉ㅆ는거 써라는 뜻
        Consumer<String> consumer = t -> System.out.println(t+"world");
        consumer.accept("hello");
    }
}