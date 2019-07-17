package lambda2;

/**
 * Member
 */
public class Member {

    private String name;
    private String id;
    private String address;

    public Member(){
        System.out.println("Member() 실행");
    }

    public Member(String id){
        System.out.println("Member(String id) 실행");
        this.id = id;
    }

    public Member(String name, String id){
        System.out.println("Member(String name, String id) 실행");
        this.name = name;
        this.id   = id;
    }

    public Member(String name, String id, String address) {
        this.name    = name;
        this.id      = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
    
}