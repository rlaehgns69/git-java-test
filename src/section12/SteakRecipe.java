package section12;

public class SteakRecipe extends Recipe {
    SteakRecipe(String chef) {
        super(chef);
    }

    @Override
    void makeSource() {
        System.out.println("파스타 소스는 만들지 않습니다.");
    }

    @Override
    void grillSteak() {
        System.out.println("스테이크를 맛있게 굽습니다.");
    }
}
