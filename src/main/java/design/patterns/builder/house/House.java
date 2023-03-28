package design.patterns.builder.house;

import lombok.Data;

@Data
public class House {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;

    }

    public static class HouseBuilder {

        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }
        public HouseBuilder buildFloors(String floors) {
            this.floors = floors;
            return this;
        }
        public HouseBuilder buildRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }
        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }
        public HouseBuilder buildWindows(String windows) {
            this.windows = windows;
            return this;
        }
        public HouseBuilder buildDoors(String doors) {
            this.doors = doors;
            return this;
        }
        public HouseBuilder buildGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }


}
