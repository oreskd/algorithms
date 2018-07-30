package datastructures.stack.array;

public class Demo {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(5);
        System.out.println("Added to the stack: 5");

        int x = stack.pop();
        System.out.println("Taken from stack: " + x);

        stack.push(13);
        System.out.println("Added to the stack: 13");

        stack.push(40);
        System.out.println("Added to the stack: 40");

        stack.push(10);
        System.out.println("Added to the stack: 10");

        x = stack.pop();
        System.out.println("Taken from stack: " + x);

        x = stack.pop();
        System.out.println("Taken from stack: " + x);

        x = stack.pop();
        System.out.println("Taken from stack: " + x);
    }
}
