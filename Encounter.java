import javax.swing.*;
import java.util.Random;
public class Encounter {
    private  int level=OnStairsListener.getTotalLevels();
    private  Character Poob;
    private  JFrame frame;
    private TileType newTile;
    public Encounter(JFrame f,Character Ploob,TileType lastTile){
        Poob=Ploob;
        frame=f;
        newTile=lastTile;
    }



    public void foight(){

            Random rng =new Random();
            double chance=rng.nextDouble();
            frame.getContentPane().removeAll();
            Monster Monty=MonsterFactory.create(level);
            int PlayerDefence=Poob.getDefense()-Monty.getAttack();
            while(Monty.getHealth()>0 && Poob.getHealth()>0){
                int result=JOptionPane.showConfirmDialog(frame,"Press yes to attack.No to defend and Cancel to run them for their foams.");
                if(result==0){
                    Monty.setHealth(Monty.getHealth()-Poob.getAttack()*2);
                    if(PlayerDefence>0){
                        PlayerDefence=0;
                    }
                    Poob.setHealth(Poob.getHealth()-PlayerDefence);
                    Poob.setHealth(Poob.getHealth()-Monty.getAttack());
                    JOptionPane.showMessageDialog(frame,"You attack the "+Monty.getName()+" for "+ Poob.getAttack()+" damage and the "
                            +Monty.getName()+" hits back with " + Monty.getAttack()+". Your health is currently "+Poob.getHealth());
                }else if(result==1){
                    Monty.setHealth(Monty.getHealth()-Poob.getAttack());
                    PlayerDefence=Poob.getDefense()*2-Monty.getAttack();
                    if(PlayerDefence>0){
                        PlayerDefence=0;
                    }
                    Poob.setHealth(Poob.getHealth()-PlayerDefence);
                    Poob.setHealth(Poob.getHealth()-Monty.getAttack());
                    JOptionPane.showMessageDialog(frame,"You attack the "+Monty.getName()+" for "+ Poob.getAttack()+" damage and the "
                            +Monty.getName()+" hits back with " + Monty.getAttack()+" damage. Your health is currently "+Poob.getHealth()+" and his is "
                            +Monty.getHealth());
                }else{
                    if(rng.nextDouble()>0.8){
                        Item loot= ItemGenerator.generate();
                        JOptionPane.showMessageDialog(frame,"The foams have been stolen and you have made off with some "+loot.getName());
                        Poob.add(loot);
                    }else{
                        JOptionPane.showMessageDialog(frame,"You tried to pull a fast one and get punched in the head for your troubles.");
                    }
                    JOptionPane.showMessageDialog(frame,"You attack the "+Monty.getName()+" for "+0+" damage and the "
                            +Monty.getName()+" hits back with " + Monty.getAttack()+" damage. Your health is currently "+Poob.getHealth()+" and his is "
                            +Monty.getHealth());
                }
                if(Poob.getHealth()<0){
                    System.exit(0);
                }else{
                    if(Poob.getHealth()<120){
                        Item loot= ItemGenerator.generate();
                        JOptionPane.showMessageDialog(frame,"You are low on health go to a campfire to restore your health. After defeating the" +
                                " "+Monty.getName()+" you are the owner of some "+loot.getName()+" go to the Dungeon tab to return to the Dungeon.");
                        Poob.add(loot);
                        break;
                    }else{
                        Item loot= ItemGenerator.generate();
                        JOptionPane.showMessageDialog(frame," After defeating the"+" "+Monty.getName()+" you are the owner of some "+loot.getName()
                                +" go to the Dungeon tab to return to the Dungeon.");
                        Poob.add(loot);
                        break;
                    }
                }
            }
        Dungeon.getDungeon();



    }
}
