package section13.anonymous_button;

interface ButtonClickListener {
    void click();
}

public class AnonymousExample {
    // Button 클래스 == 인스턴스 내부 클래스
    public class Button {
        private ButtonClickListener listener;

        public void setButtonListener(ButtonClickListener listener) {
            this.listener = listener;
        }

        public void click() {
            if (listener != null) {
                this.listener.click();
            }
        }
    }

    public static void main(String[] args) {
        AnonymousExample example = new AnonymousExample();
        AnonymousExample.Button button = example.new Button();

        ButtonClickListener btn1 = new ButtonClickListener() {
            @Override
            public void click() {
                System.out.println("버튼을 클릭했습니다.");
            }
        };

        button.setButtonListener(btn1);
        button.click();
        System.out.println();
        button.setButtonListener(new ButtonClickListener() {
            @Override
            public void click() {
                System.out.println("버튼을 클릭했습니다.");
            }
        });
        button.click();
    }
}
