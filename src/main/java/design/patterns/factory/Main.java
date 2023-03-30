package design.patterns.factory;

public class Main {

    public static void main(String[] args) {

        Factory unitFactory = new UnitFactory();

        Unit tank = unitFactory.createUnit(UnitType.TANK);
        Unit rifleman = unitFactory.createUnit(UnitType.RIFLEMAN);

        Tank tank1 = new Tank(200, 50, 30);



    }
}

