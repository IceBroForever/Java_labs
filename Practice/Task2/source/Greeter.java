public class Greeter {
    public static void main(String[] args) {
        StringProvider provider = new StringProvider();
        String helloString = provider.getHelloWorldString();
        System.out.println(helloString);
    }
}