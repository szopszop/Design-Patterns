package design.patterns.builder;

import design.patterns.builder.house.House;

public class Main {

    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRooms("rooms")
                .build();
        System.out.println(house);
    }

}
