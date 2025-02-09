package section06;

import java.util.Arrays;

public class Ex06_11 {
    // 얕은 복사, 깊은 복사
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 1 };

        int[] arr2 = new int[4]; // stack 메모리의 "주소 값을 복사"하는 얕은 복사
    

        // System.out.println("arr1:"+Arrays.toString(arr1));
        
        // 깊은 복사는 heap 메모리에 새로운 값을 만듦,  stack메모리에는 새로운 값의 주소를 가짐.
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[0];
        }
        arr1[0]=10;

        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));
    }
}
