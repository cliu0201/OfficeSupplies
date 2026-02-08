/**
 * The VendingMachine class allows user to dispense and pay for things from the vending machine while keeping track of the inventory.
 *
 * Cici Liu and Hera Yuan
 * 02-07-2026
 */
public class VendingMachine
{
    // instance variables - replace the example below with your own
    private int numberDoritos;
    private int numberPringles;
    private int numberTakis;
    private int numberCoke;
    private int numberSprite;
    private int numberWater;
    private int numberTwix;
    private int numberSnickers;
    private double moneyReceived;
    
    /**
     * Constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        numberDoritos = 3;
        numberPringles = 3;
        numberTakis = 3;
        numberCoke = 3;
        numberSprite = 3;
        numberWater = 3;
        numberTwix = 3;
        numberSnickers = 3;
        moneyReceived = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void insertMoney(double amount)
    {
        if (amount > 0)
        {
            moneyReceived = moneyReceived + amount;
        }
        else
        {
            System.out.println("Invalid amount.");
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void selectItem(String item)
    {
        double price = getPrice(item);
        if (price == -1)
        {
            System.out.println("Invalid item.");
        }
        else if (moneyReceived < price)
        {
            System.out.println("Not enough money.");
        }
        else
        {
            if (item.equals("Doritos") && numberDoritos > 0)
            {
                numberDoritos--;
            }
            else if (item.equals("Pringles") && numberPringles > 0)
            {
                numberPringles--;
            }
            else if (item.equals("Takis") && numberTakis > 0)
            {
                numberTakis--;
            }
            else if (item.equals("Coke") && numberCoke > 0)
            {
                numberCoke--;
            }
            else if (item.equals("Sprite") && numberSprite > 0)
            {
                numberSprite--;
            }
            else if (item.equals("Water") && numberWater > 0)
            {
                numberWater--;
            }
            else if (item.equals("Twix") && numberTwix > 0)
            {
                numberTwix--;
            }
            else if (item.equals("Snickers") && numberSnickers > 0)
            {
                numberSnickers--;
            }
            else
            {
                System.out.println("Item out of stock.");
                return;
            }
            System.out.println(item + " dispensed.");
            moneyReceived = moneyReceived - price;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getPrice(String item)
    {
        if (item.equals("Doritos") || item.equals("Pringles") ||
            item.equals("Takis") || item.equals("Twix") ||
            item.equals("Snickers"))
        {
            return 2.0;
        }
        else if (item.equals("Coke") || item.equals("Sprite"))
        {
            return 2.5;
        }
        else if (item.equals("Water"))
        {
            return 1.50;
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double giveChange()
    {
        double change = moneyReceived;
        moneyReceived = 0;
        return change;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void restock()
    {
        numberDoritos = 3;
        numberPringles = 3;
        numberTakis = 3;
        numberCoke = 3;
        numberSprite = 3;
        numberWater = 3;
        numberTwix = 3;
        numberSnickers = 3;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getInventory()
    {
        System.out.println("Doritos: " + numberDoritos);
        System.out.println("Pringles: " + numberPringles);
        System.out.println("Takis: " + numberTakis);
        System.out.println("Coke: " + numberCoke);
        System.out.println("Sprite: " + numberSprite);
        System.out.println("Water: " + numberWater);
        System.out.println("Twix: " + numberTwix);
        System.out.println("Snickers: " + numberSnickers);
    }
}
