package design.patterns.factory.unit;

import lombok.Getter;

@Getter
public abstract class InfantryUnit {

    protected InfantryUnit(int hp, int exp, int damageDone) {
        this.hp = hp;
        this.exp = exp;
        this.damageDone = damageDone;
    }

    private int hp;
    private int exp;
    private int damageDone;



}
