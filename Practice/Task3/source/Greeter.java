public class Greeter {
    public static void main(String[] args) {
        NameProvider provider = new NameProvider();
        String name = provider.getName();
        System.out.println("Hello, " + name + "!");
    }
}