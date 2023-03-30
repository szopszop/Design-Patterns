package design.patterns.factory.unit;

import design.patterns.factory.unit.MechanizedUnit;

public class Plane extends MechanizedUnit {


    protected Plane(int hp, int exp, int damageDone) {
        super(hp, exp, damageDone);
    }
}
