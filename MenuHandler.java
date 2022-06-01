import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class MenuHandler implements ActionListener
{
    protected Board b;

    public MenuHandler(Board b)
    {
        this.b = b;
    }

    public void actionPerformed(ActionEvent event)
    {
        String actionName = event.getActionCommand();
    }
}
