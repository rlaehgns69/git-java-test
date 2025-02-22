package section13.practice;


class MyCar {
    private int price;
    private String myName;

    public MyCar(String myName, int price) {
        this.myName = myName;
        this.price = price;
    }

    public String getInfo() {
        String str = "차량: " + myName + ", 가격:" + price;
        return str;
    }

    public class Promotion {
        public int discount() {
            int discount = 0;
            discount = price / 100;
            return discount;
        }
    }
}

public class MyCarMain {
    public static void main(String[] args) {

        // 빈칸(코드 작성 요망)
        // 1. 욉부 클래스 생성
        // 2. 인스턴스 내부 클래스의 객체 생성
        // myName ='그렌저', price = 50,000,000
        MyCar mycar = new MyCar("쏘렌토", 5000);
        MyCar.Promotion promotion = mycar.new Promotion();

        System.out.println(mycar.getInfo() + ", 할인금액: " + promotion.discount());
        
    }
}
