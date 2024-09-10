public class typesOfVariables {

    int instanceVar = 10;
    static int staticVar = 20;

    public void demonstrateLocalVariable() {
        int localVar = 30;
        System.out.println("Local variable:+ " " + localVar);
    }

    public void demonstrateInstanceAndStaticVariables() {
        System.out.println("Instance variable:+ " " + instanceVar);
        System.out.println("Static variable:+ " " + staticVar);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        VariableDemo obj = new VariableDemo();

        // Calling methods to display the values
        obj.demonstrateLocalVariable();
        obj.demonstrateInstanceAndStaticVariables();
    }
}
