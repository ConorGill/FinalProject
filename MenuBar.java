import javax.swing.*;
import java.awt.event.KeyEvent;

public class MenuBar {
    /*
    public static void setUpMenuBar(JFrame frame, Character Poob, GUI goo){
        JMenuBar menubar = new JMenuBar();

        // add the file menu
        JMenu files = new JMenu("Files");
        files.setMnemonic(KeyEvent.VK_F);

        JMenu inventory =new JMenu("Inventory");
        inventory.setMnemonic(KeyEvent.VK_I);

        JMenu dungeon =new JMenu("Dungeon");
        inventory.setMnemonic(KeyEvent.VK_D);
        // add a menu item
        JMenuItem save = new JMenuItem("Save", null);
        save.setMnemonic(KeyEvent.VK_S);
        save.setToolTipText("Save Game");
        JMenuItem load = new JMenuItem("Load", null);
        load.setMnemonic(KeyEvent.VK_L);
        load.setToolTipText("Load Game");
        JMenuItem equipment=new JMenuItem("Equipment",null);
        equipment.addActionListener(new EquipmentListener(frame,Poob,goo));
        equipment.setMnemonic(KeyEvent.VK_E);

        JMenuItem equipWeapon=new JMenuItem("Equip Weapon",null);
        equipWeapon.setMnemonic(KeyEvent.VK_W);
        equipWeapon.addActionListener(new EquipWeaponListener(frame,Poob,goo));

        JMenuItem equipArmor=new JMenuItem("Equip Armor",null);
        equipArmor.setMnemonic(KeyEvent.VK_A);
        equipArmor.addActionListener(new EquipArmorListener(frame,Poob,goo));

        JMenuItem status=new JMenuItem("Status",null);
        status.addActionListener(new StatusListener(frame,Poob));

        JMenuItem dropItem=new JMenuItem("Drop Item",null);
        dropItem.addActionListener(new DropItemListener(frame,Poob,goo));

        JMenuItem goBack=new JMenuItem("Go back to the Dungeon!",null);

        // add the action
        files.add(save);
        inventory.add(equipment);
        inventory.add(equipWeapon);
        inventory.add(equipArmor);
        inventory.add(status);
        inventory.add(dropItem);
        dungeon.add(goBack);
        // add file to the menubar
        menubar.add(files);
        menubar.add(inventory);
        menubar.add(dungeon);

        // add the menubar to the window
        frame.setJMenuBar(menubar);
    }
     */

}
