package day34_practices.car;

public class Test {
    private static String name;

    static {
        name = "heyo";
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.name = "yoyo";

        System.out.println(obj1.name);
    }
}
