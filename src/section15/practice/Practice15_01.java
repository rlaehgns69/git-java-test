package section15.practice;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //
    @Override
    public String toString() {
        
        return "이름: "+this.name+", 이름: "+this.age;
    }
}

public class Practice15_01 {
    public static void main(String[] args) {
        User user = new User("김일남", 99);
        System.out.println(user);
    }
}
