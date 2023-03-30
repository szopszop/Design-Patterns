package design.patterns.builder;

import design.patterns.builder.house.BigHouseBuilder;
import design.patterns.builder.house.House;
import design.patterns.builder.house.HouseDirector;
import design.patterns.builder.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();


        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println("--------------");
        System.out.println(bigHouse);

    }

}
