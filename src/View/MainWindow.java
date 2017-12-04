package View;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    //1. Create the frame.
    JFrame frame = new JFrame("FrameDemo");
    Label emptyLabel;

    public MainWindow()
    {
        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        emptyLabel = new Label();
        emptyLabel.setText("Hello World!");
        System.out.println(emptyLabel.getText());
//3. Create components and put them in the frame.
//...create emptyLabel...
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

//4. Size the frame.
        frame.pack();

//5. Show it.
        frame.setVisible(true);
    }
}
