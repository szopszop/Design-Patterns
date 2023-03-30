package design.patterns.factory;

import design.patterns.factory.unit.*;

public class Main {

    public static void main(String[] args) {

        Factory unitFactory = new UnitFactory();

        Unit tank = unitFactory.createUnit(UnitType.TANK);
        Unit rifleman = unitFactory.createUnit(UnitType.RIFLEMAN);

    }
}

