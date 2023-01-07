import javax.swing.*;
import java.awt.*;

public class Snakebite {
      JFrame frame;
      Snakebite()
      {
          frame=new JFrame("Snake Game");
          frame.setBounds(10,10,905,700);
          MyPanel panel=new MyPanel();
          panel.setBackground(Color.gray);
          frame.add(panel);
          frame.setVisible(true);
      }
    public static void main(String[] args) {
        Snakebite snakebite=new Snakebite();
    }
}
