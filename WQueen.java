import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;

public class WQueen extends Piece
{
    private boolean firstMove;
    private static BufferedImage piece;
    private static Image img;
    private static ImageIcon icon;
    static{
        try
        {
            piece = ImageIO.read(new File("Pieces/WQueen.png"));
            img = piece.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);
        }
        catch (IOException ioe)
        {
            System.out.println("IOException: error reading File('Pieces/WQueen.png')");
        }
    }

    public WQueen()
    {
        super(icon);

    }

    public void move()
    {
        
    }

}
