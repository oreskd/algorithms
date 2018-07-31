package datastructures.queue.array;

public class Demo {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();

        queue.add(5);
        System.out.println("Added to the queue: 5");

        int x = queue.remove();
        System.out.println("Taken from queue: " + x);

        queue.add(13);
        System.out.println("Added to the queue: 13");

        queue.add(40);
        System.out.println("Added to the queue: 40");

        queue.add(10);
        System.out.println("Added to the queue: 10");

        x = queue.remove();
        System.out.println("Taken from queue: " + x);

        x = queue.remove();
        System.out.println("Taken from queue: " + x);

        x = queue.remove();
        System.out.println("Taken from queue: " + x);
    }
}
