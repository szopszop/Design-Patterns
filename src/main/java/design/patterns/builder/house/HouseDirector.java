package design.patterns.builder.house;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HouseDirector {

    private HouseBuilder houseBuilder;


    public void buildHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }


}
