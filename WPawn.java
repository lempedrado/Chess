import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;

public class WPawn extends Piece
{
    private boolean firstMove;
    private static BufferedImage piece;
    private static Image img;
    private static ImageIcon icon;
    static{
        try
        {
            piece = ImageIO.read(new File("Pieces/WPawn.png"));
            img = piece.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);
        }
        catch (IOException ioe)
        {
            System.out.println("IOException: error reading File('Pieces/WPawn.png')");
        }
    }
    
    public WPawn()
    {
        super(icon);
        firstMove = true;
    }

    public void move()
    {
        //check if empty space in front of pawn
        //if empty space in front, check if first move and next space in front is empty
        //check if capture move is possible; diagonally in front
        if(firstMove)
        {
            //check if can move 
        }
    }
}
