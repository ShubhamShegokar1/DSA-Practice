public class Main {

    public static void main(String[] args) {

       Operation operation = b -> {
           return b* Operation.a;
        };
        System.out.println(operation.calculate(3));
    }
}
