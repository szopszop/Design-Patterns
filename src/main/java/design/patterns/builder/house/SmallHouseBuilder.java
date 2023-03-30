package design.patterns.builder.house;


public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("SmallFloors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Small Rooms");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Small Roof");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Small Windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Small Doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Small garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
