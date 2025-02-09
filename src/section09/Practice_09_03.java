package section09;
class Computer{
    String name;
    Computer(String name){
        this.name = name;
    }
    void logo(){
        System.out.println("사랑해요 "+name);
    }
}
public class Practice_09_03{
    public static void main(String[] args) {
        Computer computer1 = new Computer("삼송");
        computer1.logo();
    }
}
