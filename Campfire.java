import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
//class for a specific tile to rest on, also adds player health
public class Campfire extends GUI{

    //image for the campfire tile
    private final TileType type=TileType.Camp;
    private int Xcor,Ycor;

    public Campfire(int x, int y){
        Xcor=x;
        Ycor=y;
    }
    //creates a save file for the current game
    public void Save(){ //creates a save

    }
    //catches if the file for the the campfire cannot be found (ex. has been deleted)
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
