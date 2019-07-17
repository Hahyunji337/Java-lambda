package staticex;

/**
 * StaticEx
 */
public class StaticEx {
    int a;
    int b;
    static int c;
    public static void main(String[] args) {
        // a = 3; //위에 영역이 힙이라서 접근 불가능. 인스턴스를 생성해주어야 접근이 가능하다
        StaticEx se1 = new StaticEx();
        se1.a = 3; //이렇게 해야 된다
        se1.b = 3; //이렇게 해야 된다
        StaticEx se2 = new StaticEx();
        se2.b = 5;
        StaticEx.c=4;
        c=9;
        System.out.println(se1.b);
        System.out.println(se2.b);
        System.out.println(StaticEx.c);
    }
    
}