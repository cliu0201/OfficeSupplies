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
     * Constructs a VendingMachine with all items stocked at 3 and no money inserted
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
     * The insertMoney method adds money to the vending machine balance if the amount is valid
     *
     * @param  amount  the amount of money the vending machine received
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
     * The selectItem method allows the user to select an item to purchase. If the item exists, 
     * is in stock, and there is enough money inserted, the item is dispensed.
     *
     * @param  item  the name of the snack or drink selected
     */
    
    public void selectItem(String item)
    {
        double price = getPrice(item);
        if (price == -1) //explains in next method
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
     * The getPrice method returns the price of a given item.
     * 
     * @param  item the name of the snack or drink selected
     * @return the price of the item or -1 if item selected does not exist
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
     * The giveChange method returns any remaining balance as change
     * and resets the money balance to zero.
     *
     * @return change the amount of change returned
     */
    
    public double giveChange()
    {
        double change = moneyReceived;
        moneyReceived = 0;
        return change;
    }
    
    /**
     * The restock method restocks all items in the vending machine
     * back to their original quantity.
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
     * The getInventory method prints the current inventory count
     * for each item currently in the vending machine.
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
