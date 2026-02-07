/**
 * The Whiteboard class writes and erases a whiteboard and manages the ink level of the marker.
 *
 * Cici Liu and Hera Yuan
 * 02-06-2026
 */
public class Whiteboard
{
    // instance variables - replace the example below with your own
    private String text;
    private int inkLevel;
    private boolean isClean;

    /**
     * Constructor for objects of class Whiteboard
     */
    public Whiteboard(String text, int inkLevel)
    {
        this.text = text;
        this.inkLevel = inkLevel;
        isClean = true;
    }

    /**
     * The write method writes text on the whiteboard or tells user to replace marker if there is no more ink left.
     *
     * @param  text the text to be written on the whiteboard
     */
    public void write(String text)
    {
        if (inkLevel > 0)
        {
            this.text = text;
            isClean = false;
            inkLevel = inkLevel - 1;
        }
        else
        {
            System.out.println("Marker is dry. Replace marker.");
        }
    }
    
    /**
     * The erase method erases the text on the whiteboard.
     *
     */
    public void erase()
    {
        this.text = "";
        isClean = true;
    }
    
    /**
     * The erase method erases the text on the whiteboard.
     *
     * @return  the status of the whiteboard
     */
    public String getWhiteboardStatus()
    {
        if (isClean == true)
        {
            return "clean";
        }
        else
        {
            return "not clean";
        }
    }
    
    /**
     * The getText method displays the text written on the whiteboard.
     *
     * @return  text the text written on the whiteboard
     */
    public String getText()
    {
        return text;
    }
    
    /**
     * The newMarker class replaces the dry marker with a new marker with full ink level.
     *
     */
    public void newMarker()
    {
        inkLevel = 3;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return  inkLevel the level of ink the marker is at.
     */
    public int displayInkLevel()
    {
        return inkLevel;
    }
}
