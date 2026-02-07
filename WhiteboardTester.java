/**
 * The WhiteboardTester tests the Whiteboard class.
 *
 * Cici Liu and Hera Yuan
 * 02-06-2026
 */
public class WhiteboardTester
{
    public static void main(String[] args)
    {
        Whiteboard board = new Whiteboard (3);
        System.out.println("Blank whiteboard");
        System.out.println("Current Ink Level: " + board.displayInkLevel());
        System.out.println("Writing...");
        board.write("Today's Homework");
        System.out.println("Currently written on whiteboard: " + board.getText());
        System.out.println("Ink level: " + board.displayInkLevel());
        System.out.println("Writing...");
        board.write("Study for math test");
        System.out.println("Currently written on whiteboard: " + board.getText());
        System.out.println("Writing...");
        board.write("Finish English essay");
        System.out.println("Currently written on whiteboard: " + board.getText());
        System.out.println("Writing...");
        board.write("Do science homework");
        System.out.println("Getting new marker...");
        board.newMarker();
        System.out.println("Retrieved new marker.");
        System.out.println("Ink level: " + board.displayInkLevel());
        System.out.println("Writing...");
        board.write("Do science homework");
        System.out.println("Currently written on whiteboard: " + board.getText());
        System.out.println("Whiteboard status: " + board.getWhiteboardStatus());
        System.out.println("Erasing...");
        board.erase();
        System.out.println("Whiteboard status: " + board.getWhiteboardStatus());
        System.out.println("Currently written on whiteboard: " + board.getText());
    }
}
