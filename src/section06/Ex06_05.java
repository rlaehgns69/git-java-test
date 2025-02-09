package section06;

public class Ex06_05 {
    public static void main(String[] args) {
        char[] cards = { '1', 'L', '2', 'O', '3', 'V', '4', 'E' }; // "LOVE"
        String myWord = "";

        // 아스키코드 코드포인트
        // 0~9는 48~57
        // A~Z는 65~90
        for (int i = 0; i < cards.length; i++) {
            // if (cards[i] >= 65 && cards[i] <= 90) {
            if(cards[i]>57){
                myWord += cards[i];
            }
        }
        System.out.println(myWord);
    }
}
