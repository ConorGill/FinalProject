import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class GUI extends JComponent {
    private GUI[] tiles;
    private Campfire tempCamp;
    private Stairs tempStairs;
    private Player tempPlayer;
    private Floor searchedFloor;
    private int playerPos,campPos,stairPos,previousPos;
    private int level=0;
    private TileType lastTile=null;
    public GUI(){
    Random rng=new Random();
    playerPos=rng.nextInt(36);
    campPos=rng.nextInt(36);
    stairPos=rng.nextInt(36);
        while(campPos==playerPos || campPos==stairPos){
            campPos=rng.nextInt(36);
        }
        while(playerPos==stairPos || playerPos==campPos){
           playerPos=rng.nextInt(36);
        }

    }
    //Alright this is some spaghetti bullshit.
    //For whoever is reading this for whatever reason this can't be written in the constructor
    //I don't know why and I'm too tired to research it so here you go.
    //Also for whatever reason Player stops flashing on and off again for some reason.
    //I've tested it and it still works without it but for some reason not in this
    //I've tested Player inside GUI's paintComponent to so this is just this method
    //For whatever reason.
    //Perhaps it has something to do with threads or some other shit I don't know about.
    public void setUpTiles(){
        tiles=new GUI[36];
        for(int c=0;c<36;c++){
            tiles[c]=new Floor(c%6,c/6);
            //System.out.println("Boo"+c);
        }
        tiles[playerPos]=new Player(playerPos%6,playerPos/6);
        tiles[campPos]=new Campfire(campPos%6,campPos/6);
        tiles[stairPos]=new Stairs(stairPos%6,stairPos/6);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,650,800);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,5,600);
        for(int c=0;c<6;c++){
            g.fillRect(100*c+100,0,5,605);
            g.fillRect(0,100*c+100,600,5);
        }
        for(GUI goo:tiles){
            goo.paintComponent(g);
        }
        revalidate();
        repaint();
    }
    public void movePlayer(int modifier){
        previousPos=playerPos;

        if(playerPos+modifier>35){
            tempPlayer= (Player) tiles[playerPos];
            playerPos=playerPos+modifier-36;
        }else if(playerPos+modifier<0){
            tempPlayer= (Player) tiles[playerPos];
            playerPos=playerPos+modifier+36;
        }else{
            tempPlayer= (Player) tiles[playerPos];
            playerPos=playerPos+modifier;
        }
        TileType currentTile=tiles[playerPos].getTileType();
        tempPlayer.changePosition(playerPos%6,playerPos/6);
        tempPlayer.isOnCampFire(currentTile);
        tempPlayer.isOnStairs(currentTile);
        if(lastTile==null){
            tiles[playerPos]=new Floor(playerPos%6,playerPos/6,true);
        }else if(lastTile.equals(TileType.Camp)){
            tiles[previousPos]=tempCamp;
        }else if(lastTile.equals(TileType.Stairs)){
            tiles[previousPos]=tempStairs;
        }else{
            tiles[previousPos]=searchedFloor;
        }


        if(tiles[playerPos].getTileType().equals(TileType.Camp)){
            lastTile=tiles[playerPos].getTileType();
            tempCamp= (Campfire) tiles[playerPos];
            tiles[playerPos]=tempPlayer;
        }else if(tiles[playerPos].getTileType().equals(TileType.Stairs)){
            lastTile=tiles[playerPos].getTileType();
            tempStairs= (Stairs) tiles[playerPos];
            tiles[playerPos]=tempPlayer;
        }else{
            lastTile=TileType.Visited;
            searchedFloor= new Floor(playerPos%6,playerPos/6,true);
            tiles[playerPos]=tempPlayer;
        }


    }
    public GUI getTile(){
        return tiles[playerPos];
    }
    public void setLevel(int x){
        level=x;
    }
    public TileType getTileType(){
        return TileType.Visited;
    }
    public TileType getLastTile(){
        return lastTile;
    }
}
