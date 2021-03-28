package UTS;

public class Game extends chrctr {
    public static void main(String[] args) {
        playerStar Star = new playerStar();
        playerStar.bonusStar starBonus = Star.new bonusStar();
        Game myWeapon = new Game();
        System.out.println(myWeapon.character);
        myWeapon.intro();


        Player one = new Player();
        one.name = "Lord ";
        one.speed = 80;
        one.healthPoin = 100;
        playerQuality Lord = new p1();
        Lord.quality();
        System.out.println("Star : " + ((int)starBonus.y + (int)Star.x));


        one.run();

        if (one.isDead()) {
            System.out.println("Game Over");
        }
        Player two = new Player();
        two.name = "Ged ";
        two.speed = 81;
        two.healthPoin = 100;
        playerQuality Ged = new p2();
        Ged.quality();
        System.out.println("Star : " + ((int)starBonus.y + (int)Star.x));

        two.run();

        if (two.isDead()){
            System.out.println("Game Over");
        }
    }
}
class playerQuality {
    public void quality(){
        System.out.println("Player Quality");
    }
}
class p1 extends playerQuality{
    public void quality(){
        System.out.println("Lord Quality = Good");
    }
}
class p2 extends playerQuality{
    public void quality(){
        System.out.println("Ged Quality = Best");
    }
}
class playerStar {
    int x = 4;
    class bonusStar{
        int y = 1;
    }
}
class Player {
    String name;
    int speed;
    int healthPoin;

    void run(){
        System.out.println( name + "is running... ");
        System.out.println("Speed : " + speed);
    }
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
class chrctr {
    protected String character = "Game Character Duo";
    public void intro(){
        System.out.println("Lord and Ged");
    }
}
