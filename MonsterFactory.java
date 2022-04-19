
import java.util.Random;

public class MonsterFactory {
    //initial rng gen
    static Random random = new Random();
    //picks a number limited by the level of the dungeon, this limits the pool to weaker monsters at first
    public static Monster create(int level) {
        int monsterLimit = level + 3;
        if (monsterLimit > 8) {
            monsterLimit = 8;
        }
        int tempNum = random.nextInt(monsterLimit);
        if (tempNum == 1) {
            Ghoul tempMonster = new Ghoul();
            tempMonster.ghoul(40, 10);
            return tempMonster;
        }
        if (tempNum == 2) {
            DireWolf tempMonster = new DireWolf();
            tempMonster.direwolf(30, 20);
            return tempMonster;

        }
        if (tempNum == 3) {
            Witch tempMonster = new Witch();
            tempMonster.witch(20, 25);
            return tempMonster;

        }
        if (tempNum == 4) {
            Vampire tempMonster = new Vampire();
            tempMonster.vampire(50, 20);
            return tempMonster;

        }
        if (tempNum == 5) {
            Manticore tempMonster = new Manticore();
            tempMonster.manticore(80, 30);
            return tempMonster;

        }
        if (tempNum == 6) {
            Demon tempMonster = new Demon();
            tempMonster.demon(100, 40);
            return tempMonster;
        }
        if (tempNum == 7) {
            Dragon tempMonster = new Dragon();
            tempMonster.dragon(150, 50);
            return tempMonster;
        } else {
            Rat tempMonster = new Rat();
            tempMonster.rat(10, 5);
            return tempMonster;
        }
    }

}
