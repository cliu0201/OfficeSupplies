
/**
 * The TrashCan class represents a trash can with a fixed capacity
 * and tracks the current amount of trash inside it.
 *
 * @author Cici Liu & Hera Yuan
 * @version 06-02-2026
 */
public class TrashCan
{
    private double capacity;
    private double currentAmount;
    /**
     * Constructs a TrashCan with a given capacity and starting amount of trash.
     */
    public TrashCan(double capcity, double currentAmount)
    {
        this.capacity = capcity;
        this.currentAmount = currentAmount;
        
    }

    /**
     * The addTrash method adds trash to the trash can by increasing currentAmount
     *
     * @param amount the amount of trash being added to the trash can
     */
    public void addTrash(double amount)
    {
        currentAmount += amount; 
    }
    
    /**
     * Empties the trash can by setting the current amount to 0
     */
    public void empty()
    {
        currentAmount = 0;
    }
    
    /**
     * The getAmount method is an accessor method that returns the currentAmount
     *
     * @return currentAmount the amount of trash currently in the trash can
     */
    public double getAmount()
    {
        return currentAmount;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isFull()
    {
        return currentAmount >= capacity;
    }

}
