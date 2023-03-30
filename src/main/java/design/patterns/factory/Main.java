package design.patterns.factory;

import design.patterns.factory.unit.*;

public class Main {

    public static void main(String[] args) {

        Factory unitFactory = new UnitFactory();

        InfantryUnit tank = unitFactory.createUnit(UnitType.TANK);
        InfantryUnit rifleman = unitFactory.createUnit(UnitType.RIFLEMAN);

    }
}

