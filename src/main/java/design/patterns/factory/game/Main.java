package design.patterns.factory.game;

import design.patterns.factory.game.unit.*;

public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        InfantryUnit redCar = redFactory.createInfantryUnit(UnitType.CAR);

    }
}

