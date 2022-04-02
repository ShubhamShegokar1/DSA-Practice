public interface Operation {
    int a=3;
    int calculate(int d);
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
