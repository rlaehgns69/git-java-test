package section10._public.access2;

import section10._public.access1.PublicA;

public class PublicB {
    public static void main(String[] args) {
        PublicA publicA = new PublicA(10);
        publicA.printA();
    }
}
