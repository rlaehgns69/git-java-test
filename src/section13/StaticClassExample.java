package section13;

class PrintOut {
    // static 내부 클래스
    public static class Out {
        public void println(String str) {
            System.out.println(str);
        }

    }
    // PrintOut.out(){

    // }
}

public class StaticClassExample {
    public static void main(String[] args) {
        PrintOut.Out out = new PrintOut.Out();
        out.println("정적 내부 클래스 테스트!");
    }
}
