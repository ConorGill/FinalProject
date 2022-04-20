public class Dungeon {
    private static GUI goo;
    public static void storeDungeon(GUI goober){
        goo=goober;
    }
    public static GUI getDungeon(){
        return goo;
    }
}
