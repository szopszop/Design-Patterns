package design.patterns.factory.unit;

public abstract class Factory {

    public abstract InfantryUnit createInfantryUnit(UnitType unitType);
    public abstract MechanizedUnit createMechanizedUnit(UnitType unitType);

}
