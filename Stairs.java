//Class that creates stairs that allows for the player move between floors, extends GUI
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Stairs extends GUI {
    private int Xcor,Ycor;
    private final TileType type=TileType.Stairs;
    public Stairs(int x,int y){
        Xcor=x;
        Ycor=y;
    }
    @Override
    public void paintComponent(Graphics g){ //sets the color
        int XC=100;
        int YC=100;
        g.setColor(Color.WHITE);
        g.fillRect(Xcor*XC+30,Ycor*YC+25,10,50);
        g.fillRect(Xcor*XC+40,Ycor*YC+35,10,40);
        g.fillRect(Xcor*XC+50,Ycor*YC+45,10,30);
        g.fillRect(Xcor*XC+60,Ycor*YC+55,10,20);
        g.fillRect(Xcor*XC+70,Ycor*YC+65,10,10);
        revalidate();
    }
    public void changePos(int x,int y){ //sets the position
        Xcor=x;
        Ycor=y;
    }
    public TileType getTileType(){ //gets the tile type
        return type;
    }
}
