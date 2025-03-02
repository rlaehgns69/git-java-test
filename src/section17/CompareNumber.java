package section17;

@FunctionalInterface
public interface CompareNumber {
    int compareTo(int num01, int num02);
    // int compareTo2(int num01, int num02); // 추상 메서드 2개 이상 불가!

}
