package section12;

public class Ex12_04 {
    public static void main(String[] args) {
        // Recipe recipe = new Recipe() {

        // };
        // Recipe recipe2 = new Recipe("최연석"); 추상클래스는 직접 객체 생성 불가
        // PastaRecipe pastaRecipe = new PastaRecipe("최연석");
        Recipe pastaRecipe = new PastaRecipe("최연석");
        pastaRecipe.info();
        pastaRecipe.makeSource();
        pastaRecipe.grillSteak();

        // SteakRecipe steakRecipe = new SteakRecipe("이현복");
        Recipe steakRecipe = new SteakRecipe("이현복");
        steakRecipe.info();
        steakRecipe.grillSteak();
        steakRecipe.makeSource();
    }
}
