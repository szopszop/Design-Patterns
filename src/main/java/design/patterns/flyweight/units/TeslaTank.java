package design.patterns.flyweight.units;


public class TeslaTank {

    private String name;
    private int hp;
    private int hpLeft;
    private int armour;
    private int damageDealt;
    private int x;
    private int y;

    public TeslaTank(String name, int hp, int armour, int damageDealt, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.x = x;
        this.y = y;
        this.hpLeft = hp;
    }
}
