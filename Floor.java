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

    public Floor(int x,int y){
        Xcor=x;
        Ycor=y;
    }
    public Floor(int x,int y,boolean discovered){
        Xcor=x;
        Ycor=y;
        setSearched(discovered);
    }
    @Override
    public void paintComponent(Graphics g){
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

    public TileType getTileType(){
        return type;
    }

    public void setSearched(boolean b){
        this.searched=b;
        if(b){
            type=TileType.Visited;
        }else{
            type=TileType.UnVisited;
        }
    }

    public void changePos(int x,int y){
        Xcor=x;
        Ycor=y;
    }
}
