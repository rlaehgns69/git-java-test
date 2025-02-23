package section15._string;

public class Ex15_12 {
    public static void main(String[] args) {
        String str = "Hello";
        str += " ";
        str += "World";

        // System.out.println(str);

        // StringBuilder strBuild = new StringBuilder("Hello");
        StringBuffer strBuild = new StringBuffer("Hello");
        strBuild.append(" ");
        strBuild.append("World");
        System.out.println(strBuild);
        System.out.println(strBuild.length());
        strBuild.delete(0, 5);
        System.out.println(strBuild);
        strBuild.insert(0, "Hi");
        System.out.println(strBuild);
        strBuild.reverse();
        System.out.println(strBuild);

    }
}
