package design.patterns.factory.unit;

public class InfantryUnitFactory extends InfantryFactory {


    @Override
    public InfantryUnit createUnit(InfantryUnitType infantryUnitType) {
        switch (infantryUnitType) {
            case RIFLEMAN: return new Rifleman(30, 15, 10);
            case BAZOOKAMAN: return new Bazookaman(5, 40, 55);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
