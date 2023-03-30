package design.patterns.factory.unit;

public class MechanizedUnitFactory extends MechanizedFactory {

    @Override
    public MechanizedUnit createUnit(MechanizedUnitType mechanizedUnitType) {
        switch (mechanizedUnitType) {
            case TANK: return new Tank(200, 30, 50);
            case PLANE: return new Plane(60, 70, 40);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
