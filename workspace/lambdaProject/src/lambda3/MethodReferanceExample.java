package lambda3;

import java.util.function.IntBinaryOperator;

/**
 * MethodReferanceExample
 */
public class MethodReferanceExample {

    public static void main(String[] args) {
        IntBinaryOperator operator;
        
        //예전에 참조한 방식
        // operator = (x,y) -> Calculator.saticMethod(x, y);
        // System.out.println("결과1"+operator.applyAsInt(1, 2));

        //메소드 참조 방식
        operator = Calculator :: saticMethod; //이거으로 끝
        //메소드에 있는 입력값과 출력값이 람다식과 동일해야 한다.
        System.out.println("결과1"+operator.applyAsInt(1, 2));

        //해당 람다식에 있는 매개변수의 타입이 내가 참조하고자 하는 메소드의 리턴타입과 정확히 일치해야 한다
        Calculator cal = new Calculator();
        operator = cal :: instanceMethod;
        System.out.println("결과2"+operator.applyAsInt(3, 5)); 

    }
}