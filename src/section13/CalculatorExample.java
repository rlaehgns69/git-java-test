package section13;

class Calculator {
    private int val1;
    private int val2;

    public Calculator(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    // 인스턴스 내부 클래스
    public class Calc {
        public int add() {
            return val1 + val2;
        }
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);
        Calculator.Calc calc = cal.new Calc();
        System.out.println(calc.add());
        
    }

}
