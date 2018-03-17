package abc;



public class ConstructorTest1 {
    private static int a;
    private static String name;

    static {
        a = 10;
        name = "Asad";
        System.out.println("Roll number is:" + a);
        System.out.println("Name is is:" + name);

    }

    static {
        a = 20;
        name = "Osama";
        System.out.println("Roll number is:" + a);
        System.out.println("Name is is:" + name);
    }

    static {
        a = 21;
        name = "haidar";
        System.out.println("Roll number is:" + a);
        System.out.println("Name is is:" + name);
    }

    public static void main(String[] args) {

    }
}
