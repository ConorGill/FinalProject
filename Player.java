import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Date;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
//class for the player which holds their image and tile details
public class Player extends GUI{
    private long last_time;
    private int x,y;
    private boolean BlackorWhite=true;//True is White. False is Black.
    private boolean onCampFire=false;
    private boolean onStairs=false;
    private final TileType type=TileType.Player;
    public Player(int X,int Y){
        long last_time=new Date().getTime();
        x=X;
        y=Y;
    }
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x*100+22,y*100+22,60,60);
        /* Unreliable as shit and I have no clue as to why.
        long time_now,time_then;
        time_now= new Date().getTime();
        if(BlackorWhite){
            g.setColor(Color.WHITE);
            g.fillRect(x*100+22,y*100+22,60,60);
        }else if(!onCampFire&&!onStairs){
            g.setColor(Color.BLACK);
            g.fillRect(x*100+22,y*100+22,60,60);
        }else if(onCampFire){
            new Campfire(x,y).paintComponent(g);
        }else if(onStairs){
            new Stairs(x,y).paintComponent(g);
        }

        time_then=new Date().getTime();
        while(time_then-500<time_now){
            time_then=new Date().getTime();
        }
        changeBlackorWhite(BlackorWhite);
         */

        revalidate();
        repaint();
    }
    //returns color of tile
    public boolean getBlackorWhite(){
        return BlackorWhite;
    }
    //changes color of tile
    public void changeBlackorWhite(Boolean b){
        if(b){
            BlackorWhite=false;
        }else{
            BlackorWhite=true;
        }
    }
    //checks if tile is campfire
    public void isOnCampFire(TileType Type){
        if(Type.equals(TileType.Camp)){
            onCampFire=true;
        }else{
            onCampFire=false;
        }

    }
    //checks if tile is stairs
    public void isOnStairs(TileType Type){
        if(Type.equals(TileType.Camp)){
            onStairs=true;
        }else{
            onStairs=false;
        }
    }
    //returns tile type
    public TileType getTileType(){
        return type;
    }
    //changes position of player
    public void changePosition(int X,int Y){
        x=X;
        y=Y;
    }
}
