public class ReturnExample {
    public static void main(String[] args) {
        ReturnExample example = new ReturnExample();

        int result = example.add(5, 3);
        System.out.println("The result of add(5, 3) is: " + result);

        example.printMessage();
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum; // Returns the value of 'sum' to the caller
    }

    public void printMessage() {
        System.out.println("Hello, World!");
        return; // This is optional in void methods, as it exits the method without returning any value
    }
}
