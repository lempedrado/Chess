import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
//import java.io.*;

public abstract class Piece extends JLabel
{
    public Piece(ImageIcon img)
    {
        super();
        setSize(60, 60);
        setMinimumSize(new Dimension(60, 60));
        Image scaled = img.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(scaled));
    }

    /**
     *  Moves this Piece to a different Square on the board.
     */
    public abstract void move();

    /** 
     *  Checks if this Piece can move to a different square
     *  on the board without putting their King in check.
     */
    //public abstract boolean canMove();
}
