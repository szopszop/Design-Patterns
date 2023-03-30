package design.patterns.factory;

import design.patterns.factory.unit.*;

public class Main {

    public static void main(String[] args) {

        BlueFactory blueFactory = new BlueFactory();
        RedFactory redFactory = new RedFactory();

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit redTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);



    }
}

