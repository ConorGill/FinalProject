import java.awt.*;
import java.util.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Player extends Tile{
    private long last_time;
    private int x,y;
    private boolean BlackorWhite=true;
    public Player(int X,int Y){
        long last_time=new Date().getTime();
        x=X;
        y=Y;
    }
    @Override
    public void paintComponent(Graphics g){
        Timer Timur=new Timer();
        TimerTask tib=new Helper();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 600);
        if(BlackorWhite){
            g.setColor(Color.WHITE);
            g.fillRect(x*140+100,y*140+100,40,40);
        }else{
            g.setColor(Color.BLACK);
            g.fillRect(x*140+100,y*140+100,40,40);
        }
        Timur.schedule(tib,500);
        changeBlackorWhite(getBlackorWhite());
        revalidate();
        repaint();
    }
    public boolean getBlackorWhite(){
        return BlackorWhite;
    }
    public void changeBlackorWhite(Boolean b){
        if(b){
            BlackorWhite=false;
        }else{
            BlackorWhite=true;
        }
    }
}
class Helper extends TimerTask{
    public void run(){
    }
}