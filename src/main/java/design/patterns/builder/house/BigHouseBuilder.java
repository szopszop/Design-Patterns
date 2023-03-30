package design.patterns.builder.house;


public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("Big Floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Big Rooms");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Big Roof");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Big Windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Big Doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Big garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
