package section13;

public class PermitExample {
    private class InClass {
        public void print() {
            System.out.println("접근을 private으로 제한합니다.");
        }
    }

    public InClass getInClass() {
        return new InClass();
    }
    // void exam(){
    // PermitExample pe = new PermitExample();
    // }

    public static void main(String[] args) {
        PermitExample pe = new PermitExample();
        // PermitExample.InClass pein = pe.new InClass();
        // pein.print();

        // PermitExample.InClass pein = pe.getInClass();
        // pein.print();

        pe.getInClass().print();
    }
}
