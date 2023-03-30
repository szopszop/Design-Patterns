package design.patterns.factory.unit;

public class RedFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(35, 35, 25);
            case BAZOOKAMAN:
                return new Bazookaman(10, 45, 110);
            default:
                throw new UnsupportedOperationException("Wrong type");

        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(80, 60, 50);
            case PLANE:
                return new Plane(40, 80, 40);
            default:
                throw new UnsupportedOperationException("Wrong type");
        }
    }
}
