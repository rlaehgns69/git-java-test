package section13;

class NewPermitExample {
    public interface InClassinterface {
        void print();
    }

    // private로 설정된 내부 클래스
    class InClass implements InClassinterface {
        @Override
        public void print() {
            System.out.println("접근을 private으로 제한합니다.");
        }
    }

    // 내부 클래스에 접근할 수 있는 메서드
    public InClassinterface getInClass() {
        return new InClass();
    }
}

public class PermitExample2 {
    public static void main(String[] args) {
        NewPermitExample pe = new NewPermitExample();
        NewPermitExample.InClassinterface pein = pe.getInClass();
        pein.print();

        // 인스턴스 내부 클래스의 접근 제한자가 private이므로 접근 불가!
        // NewPermitExample.InClass peInClass = pe.new InClass();
        // peInClass.print();
    }
}
