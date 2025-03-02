package section18;

// class WhiteFlag implements Runnable {
//     @Override
//     public void run() {
//         while (true) {
//             System.out.println("□ 백기 올려");// ■
//         }
//     }
// }

public class RunnableExample {
    public static void main(String[] args) {

        // main 메서드 이름 출력
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName); // main
        // Thread white = new Thread(new WhiteFlag());
        // Runnable white = new Runnable() {
        // @Override
        // public void run() {
        // while (true) {
        // System.out.println("□ 백기 올려");// ■
        // }
        // }
        // };

        // 람다식
        Runnable white = () -> {
            int count = 0;

            String whitethreadName = Thread.currentThread().getName();

            System.out.println(whitethreadName); // main

            while (count < 10) {

                // 스레드가 1초가 쉬도록 함.
                try {
                    Thread.sleep(1000); // 1초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(whitethreadName + "올려");// ■
                count++;
            }
        };
        Runnable blue = () -> {
            int count = 0;

            String bluethreadName = Thread.currentThread().getName();
            System.out.println(bluethreadName); // main
            while (count < 10) {

                // 스레드가 1초가 쉬도록 함.
                try {
                    Thread.sleep(1000); // 1초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(bluethreadName + "올려");// ■
                count++;
            }
        };
        Thread whiteFlag = new Thread(white);
        whiteFlag.setName("□");

        Thread blueFlag = new Thread(blue);
        blueFlag.setName("■");

        whiteFlag.start();
        blueFlag.start();
    }

}
