package section14;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        
        System.out.println(arr[0]);

        try{
            System.out.println(arr[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열범위 벗어남.");
        }
    }

}
