
import java.awt.*;
import java.util.*;
public class Floor extends Tile{
    private int Xcor;
    private int Ycor;
    private boolean searched;
    public Floor(int x,int y){
        Xcor=x;
        Ycor=y;
    }
    @Override
    public void paintComponent(Graphics g){

        g.setColor(Color.BLACK);
        g.fillRect(Xcor*80+100,Ycor*80+100,10,30);
        g.fillRect(Xcor*80+110,Ycor*80+110,10,20);
        g.fillRect(Xcor*80+120,Ycor*80+120,10,10);
        revalidate();
    }
}
