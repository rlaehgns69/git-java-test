package section14;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String[] strArray = null;

        try{
            System.out.println(strArray[2]);
        } catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
