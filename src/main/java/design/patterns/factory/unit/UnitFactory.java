package design.patterns.factory.unit;

public class UnitFactory extends Factory {


    @Override
    public InfantryUnit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK: return new Tank(200, 30, 50);
            case RIFLEMAN: return new Rifleman(30, 15, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
