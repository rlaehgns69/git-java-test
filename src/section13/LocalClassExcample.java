package section13;

public class LocalClassExcample {
    private int speed = 10;

    public void exam() {
        String name = "메딕";
        name = name + "님";
        System.out.println(name);
        // System.out.println(newUnitname); //getUnit() 메서드의 지역변수에 접근 불가
    }

    public void getUnit(String unitName) {// 매개변수의 값은 변경 불가(final, effective final)
        String newUnitName = unitName + "님";// 지역변수
        class Unit {
            int number = 100;

            public void move() {

                System.out.println(newUnitName + "이 " + speed + " 속도로 이동합니다.");
            }
        }
        Unit unit = new Unit();
        unit.move();
    }

    // Unit unit = new Unit();
    // LocalClassExcample.Unit unit = new LocalClassExcample();
    public static void main(String[] args) {
        LocalClassExcample local = new LocalClassExcample();
        local.getUnit("마린");

        // local.exam();
    }
}
