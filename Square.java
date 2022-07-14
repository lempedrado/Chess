import java.awt.*;
import javax.swing.*;

public class Square extends JPanel
{
    /** Indicates if this Square is occupied by a Piece */
    protected boolean occupied;

    /** The Color of this Square */
    protected Color color;

    /** The Piece occupying this Square, null if none */
    protected Piece p;

    /**
     *  Square constructors
     */
    public Square()
    {
        super();
        setMinimumSize(new Dimension(100, 100));
        occupied = false;
        p = null;
    }

    public Square(Color c)
    {
        super();
        setMinimumSize(new Dimension(100, 100));
        setBackground(c);
        color = c;
        occupied = false;
        p = null;
    }

    /**
     *  Sets the background Color for this Square
     */
    public void background(Color c)
    {
        color = c;
        setBackground(c);
    }

    /**
     *  Selects a Square to be used in an operation
     */
    public void select()
    {
        //if square is already selected
        if(getBackground() != color)
            deselect();

        setBackground(Color.cyan);
    }

    /**
     *  Deselects a Square selected for an operation
     */
    public void deselect()
    {
        if(getBackground() == color)
            select();

        setBackground(color);
    }

    /** Sets the Piece to occupy this Square */
    public void setPiece(Piece p)
    {
        this.p = p;
        occupied = true;
        add(p);
        super.setVisible(true);
    }

    /** Gets the Piece occupying this Square */
    public Piece getPiece()
    {
        return p;
    }

    /** Removes the Piece from this Square */
    public void removePiece()
    {
        p = null;
        occupied = false;
        removeAll();
        super.setVisible(true);
    }
}
