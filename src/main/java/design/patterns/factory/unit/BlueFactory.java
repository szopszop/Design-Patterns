package design.patterns.factory.unit;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(25, 25, 25);
            case BAZOOKAMAN:
                return new Bazookaman(5, 50, 100);
            default:
                throw new UnsupportedOperationException("Wrong type");

        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(100, 50, 50);
            case PLANE:
                return new Plane(40, 70, 40);
            default:
                throw new UnsupportedOperationException("Wrong type");
        }
    }
}
