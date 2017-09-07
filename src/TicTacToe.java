import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Font;

public class TicTacToe extends JApplet{
    public void paint(Graphics canvas){
        //Tittle
        Font tittle = new Font (Font.SERIF, Font.ITALIC, 55);
                canvas.setFont(tittle);
                canvas.drawString("Tic - Tac - Toe", 60, 65);

        //vertical lines
        canvas.drawLine(250, 100, 250, 270);
        canvas.drawLine(200, 100, 200, 270);

        //horizontal lines
        canvas.drawLine(130, 160, 320, 160);
        canvas.drawLine(130, 210, 320, 210);

        //Circles
        canvas.drawOval(260,110, 40, 40);
        canvas.drawOval(205,165, 40, 40);
        canvas.drawOval(150,110, 40, 40);

        //X
        Font font = new Font (Font.SANS_SERIF, Font.BOLD, 50);
        canvas.setFont(font);
        canvas.drawString("X", 260, 260 );
        canvas.drawString("X", 205, 260 );
        canvas.drawString("X", 150, 260 );

        //Winner
        canvas.drawLine(110, 240, 340, 240);
    }
}
