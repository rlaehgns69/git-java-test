package section12;

abstract public class Recipe {
    String chef;

    Recipe(String chef) {
        this.chef = chef;
    }

    void info() {
        System.out.printf("이 레시피는 %s 셰프님의 레시피입니다.\n", chef);
    }

    abstract void makeSource();

    abstract void grillSteak();

}
