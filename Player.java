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
        super.paintComponent(g);
        Timer Timur=new Timer();
        TimerTask tib=new Helper();
        if(BlackorWhite){
            g.setColor(Color.WHITE);
            g.fillRect(x*80+100,y*80+100,30,30);
        }else{
            g.setColor(Color.BLACK);
            g.fillRect(x*80+100,y*80+100,30,30);
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