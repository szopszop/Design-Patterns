package design.patterns.factory.unit;

public abstract class AirUnit {

    protected AirUnit(int hp, int exp, int damageDone) {
        this.hp = hp;
        this.exp = exp;
        this.damageDone = damageDone;
    }

    private int hp;
    private int exp;
    private int damageDone;

}
