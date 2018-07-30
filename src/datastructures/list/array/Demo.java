package datastructures.list.array;

public class Demo {
    public static void main(String[] args) {
        System.out.println("null elements are unset values that are outputed to show the total length of the array");
        System.out.println("-----");
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Initial: " + arr);
        arr.add(0, 5);
        System.out.println("Added 5 at index 0: " + arr);
        arr.add(1, 13);
        System.out.println("Added 13 at index 1: " + arr);
        arr.add(1, 21);
        System.out.println("Added 21 at index 1: " + arr);
        arr.add(0, 99);
        System.out.println("Added 99 at index 0: " + arr);
        arr.add(3, 50);
        System.out.println("Added 50 at index 3: " + arr);
        arr.set(0, 8);
        System.out.println("Set to 8 at index 0: " + arr);
        int x = arr.get(1);
        System.out.println("Read " + x + " at index 1: " + arr);
        x = arr.remove(1);
        System.out.println("Removed " + x + " at index 1: " + arr);
        x = arr.remove(0);
        System.out.println("Removed " + x + " at index 0: " + arr);
        x = arr.remove(2);
        System.out.println("Removed " + x + " at index 2: " + arr);
        x = arr.remove(0);
        System.out.println("Removed " + x + " at index 0: " + arr);
        x = arr.remove(0);
        System.out.println("Removed " + x + " at index 0: " + arr);
    }
}
