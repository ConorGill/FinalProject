import java.awt.*;
import java.util.*;
public class Stairs extends Tile{
    private int Xcor;
    private int Ycor;
    public Stairs(int x,int y){
        Xcor=x;
        Ycor=y;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(Xcor*80+100,Ycor*80+100,10,30);
        g.fillRect(Xcor*80+110,Ycor*80+110,10,20);
        g.fillRect(Xcor*80+120,Ycor*80+120,10,10);
        revalidate();
    }
}
