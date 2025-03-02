package section17.practice;

@FunctionalInterface
interface Compare {
    void compareValue(int num01, int num02);
}

public class Practice17_05 {
    public static void main(String[] args) {
        
        int num01 = 20;
        int num02 = 30;

        Compare compare = (n1, n2) -> {
        if(n1>n2){
                System.out.printf("두 수 %d와 %d중 %d이 더 큽니다.",n1,n2,n1);
            } else if (n1<n2){
                System.out.printf("두 수 %d와 %d중 %d이 더 큽니다.",n1,n2,n2);
            } else {
                System.out.printf("두 수 %d와 %d는 같습니다.",n1,n2);
            }
        };
        compare.compareValue(num01, num02); 
    }
}
