import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

/**
 *  GUI
 *
 *  @author Lloyd Empedrado
 */
public class Board extends JFrame
{
    /** Counts the number of consecutive checks for stalemate */
    private int checkCount = 0;

    /** The JFrame's content pane */
    private Container content;
    
    /** The panel to display the chess board */
    protected JPanel chessBoard;

    /** The panel to control user operations for gameplay  */
    protected JPanel operations;

    /** An array of JPanels to represent the chess board */
    protected JPanel[][] board = new JPanel[9][9];

    public static void main(String args[])
    {
        Board b = new Board();
    }

    public Board()
    {
        //set size and location of JFrame
        setSize(950, 700);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //menu bar for new game
        //TODO and timer toggle
        JMenuBar menuBar = new JMenuBar();
        MenuHandler mh = new MenuHandler(this);
        JButton newGame = new JButton("New Game");
        newGame.addActionListener(mh);
        menuBar.add(newGame);
        setJMenuBar(menuBar);

        content = getContentPane();
        //left side is chess board and right side is user operations
        content.setLayout(new GridLayout(1, 2));
        chessBoard = new JPanel();
        operations = new JPanel();
        content.add(chessBoard);
        content.add(operations);

        //9 * 9 for a-h and 1-8 labels and then 8*8 board
        chessBoard.setLayout(new GridLayout(9, 9));
        initialize();

        setVisible(true); 
    }

    /**
     *  Creates the blank chess board of JPanels
     *  with colored squares and position labels
     *  Calls fill() to place chess pieces on board.
     */
    public void initialize()
    {
        //for i to 9*9 row is i / 9 col is i % 9
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                //Add the JPanel to an array to reference the objects
                board[i][j] = new JPanel();
                chessBoard.add(board[i][j]);

                //color board
                //top left corner is color of current player's turn
                if((i % 2 == 1 && j % 2 == 0) || (i % 2 == 0 && j % 2 == 1))
                    board[i][j].setBackground(Color.darkGray);
                else
                    board[i][j].setBackground(Color.white);

                //top row is the number index 0-9
                if(i > 0 && j == 0)
                {
                    board[i][j].add(new JLabel(Character.toString('0' + i)));
                    board[i][j].setBackground(Color.lightGray);
                }
                //leftmost column is the letter index a-h
                else if(i == 0 && j > 0)
                {
                    board[i][j].add(new JLabel(Character.toString('a' + j - 1)));
                    board[i][j].setBackground(Color.lightGray);
                }
                board[i][j].setVisible(true);
            }
        }
        try
        {
            fill();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
        setVisible(true);
    }

    /**
     *  Fills the chess board with pieces
     *
     */
    public void fill() throws IOException
    {

    }
}
