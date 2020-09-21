import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");

        System.out.println(colors);

        colors.remove("Yellow");
        colors.remove(0);

        System.out.println(colors);
        System.out.println(colors.get(2));

        colors.set(0, "Purple");
        System.out.println(colors);

        System.out.println(colors.size());
    }
}
