package section12;

public class PastaRecipe extends Recipe {
    PastaRecipe(String chef) {
        super(chef);
    }

    @Override
    void makeSource() {
        System.out.println("파스타 소스를 직접 만듭니다.");
    }

    @Override
    void grillSteak() {
        System.out.println("스테이크는 굽지 않습니다.");
    }
}
