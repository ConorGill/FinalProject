//decides x and y values and if the floor tile has been searched
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;
import java.io.*;
import java.util.*;
public class Floor extends GUI{
    private int Xcor;
    private int Ycor;
    private boolean searched=false;
    private TileType type=TileType.UnVisited;

    public Floor(int x,int y){ //floor constructor
        Xcor=x;
        Ycor=y;
    }
    public Floor(int x,int y,boolean discovered){ //floor constructor
        Xcor=x;
        Ycor=y;
        setSearched(discovered);
    }
    @Override
    public void paintComponent(Graphics g){ //marks searched tiles
        Image X=null;
        if(searched){
            try {
                X = ImageIO.read(new File("./out/Images/XPixel.png"));
            } catch (IOException e) {
                System.out.println("Didn't find the file");
            }
            g.drawImage(X,Xcor*100+22,Ycor*100+22,null);
        }
    }

    public TileType getTileType(){ //getter method that returns the file type
        return type;
    }

    public void setSearched(boolean b){ //sets the tile as visited or not
        this.searched=b;
        if(b){
            type=TileType.Visited;
        }else{
            type=TileType.UnVisited;
        }
    }

    public void changePos(int x,int y){ //changes the current position
        Xcor=x;
        Ycor=y;
    }
}
