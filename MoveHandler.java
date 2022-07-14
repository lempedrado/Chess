import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveHandler implements MouseListener
{
    /** The chess board */
    protected Board b;

    public MoveHandler(Board b)
    {
        this.b = b;
    }

    /**
     *  Determines how to handle  Square if it is pressed
     */
    public void mousePressed(MouseEvent e)
    {
        Square square;
        if(e.getComponent() instanceof Square)
            square = (Square)e.getComponent();
        else
            return;

        //select a square to move a piece "from"
        if(b.squareSelected == false)
        {
            b.squareSelected = true;
            square.select();
            b.selectedSquare = square;
        }
        else
        {
            //if the selected square is selected again, deselect square
            if(square == b.selectedSquare)
            {
                b.squareSelected = false;
                square.deselect();
                b.selectedSquare = null;
            }
            //move Piece
            /*FIXME 
                piece gets removed and placed in new square but doesnt
                appear until the square is selected again
            */
            else
            {
                //deselect the selected square
                b.selectedSquare.deselect();
                //move the piece from the selected square to the new square
                square.setPiece(b.selectedSquare.getPiece());
                //remove the piece from the original square
                b.selectedSquare.removePiece();

                //reset flags
                b.selectedSquare = null;
                b.squareSelected = false;
                
            }
        }
        b.setVisible(true);
    }

    public void mouseReleased(MouseEvent e)
    {
        
    }

    public void mouseEntered(MouseEvent e)
    {
        
    }

    public void mouseExited(MouseEvent e)
    {
        
    }

    public void mouseClicked(MouseEvent e)
    {
        
    }
}
