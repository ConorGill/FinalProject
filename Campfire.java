import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
public class Campfire extends GUI{

    private final TileType type=TileType.Camp;
    private int Xcor,Ycor;

    public Campfire(int x, int y){
        Xcor=x;
        Ycor=y;
    }
    public void Save(){ //creates a save

    }
    @Override
    public void paintComponent(Graphics g){
        Image X=null;
            try {
                X = ImageIO.read(new File("./out/Images/Fire.png"));
            } catch (IOException e) {
                System.out.println("Didn't find the file");
            }
            g.drawImage(X,Xcor*100+22,Ycor*100+22,null);

    }
    public TileType getTileType(){
        return type;
    }
}
