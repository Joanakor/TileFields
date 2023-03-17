import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainWindow extends JPanel {
    Random rand = new Random();

    public int tilesInRow = 10;
    public int tilesInColumn = 10;

    public int tileHeight = 50;
    public int tileWidth = 50;

    public int windowWidth = tileWidth * tilesInRow;
    public int windowHeight = tileHeight * tilesInColumn;

    public MainWindow()
    {
        this.setPreferredSize(new Dimension(windowWidth, windowHeight));
        this.setBackground(Color.blue);
        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < tilesInColumn; i++)
        {
            for (int j = 0; j < tilesInRow; j++)
            {
                int tileX = tileWidth * i;
                int tileY = tileHeight * j;
                g2.setColor(new Color(rand.nextInt(16777215)));
                g2.fillRect(tileX, tileY, tileWidth, tileHeight);
            }
        }
    }

}
