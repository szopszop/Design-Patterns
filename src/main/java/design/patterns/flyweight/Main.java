package design.patterns.flyweight;

import design.patterns.flyweight.units.MagicTank;
import design.patterns.flyweight.units.RainbowTank;
import design.patterns.flyweight.units.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            activeUnits.add(new TeslaTank("Tesla Tank", 200, 100, 50, 50, 50));
            activeUnits.add(new MagicTank("Magic Tank", 200, 100, 50, 50, 50));
            activeUnits.add(new RainbowTank("Rainbow Tank", 200, 100, 50, 50, 50));
        }
    }
}
