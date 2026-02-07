
/**
 * This is a Tester for the TrashCan class
 *
 * @author Cici Liu & Hera Yuan
 * @version 07-02-2026
 */
public class TrashCanTester
{
    public static void main(String[] args)
    {
        // Create a TrashCan with capacity 10 and starting amount 3.4
        TrashCan can = new TrashCan(10, 3.4);

        // Test getAmount
        System.out.println("Initial amount (expected 3.4): " + can.getAmount());

        // Test isFull (should be false)
        System.out.println("Is full? (expected false): " + can.isFull());

        // Add trash
        can.addTrash(2.6);
        System.out.println("Amount after adding 2.5 (expected 6): " + can.getAmount());
        System.out.println("Is full? (expected false): " + can.isFull());

        // Add more trash to reach capacity
        can.addTrash(4);
        System.out.println("Amount after adding 4 (expected 10): " + can.getAmount());
        System.out.println("Is full? (expected true): " + can.isFull());

        // Empty the trash can
        can.empty();
        System.out.println("Amount after emptying (expected 0): " + can.getAmount());
        System.out.println("Is full? (expected false): " + can.isFull());
    }
}
