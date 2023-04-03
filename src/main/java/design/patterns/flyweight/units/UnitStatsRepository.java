package design.patterns.flyweight.units;

public class UnitStatsRepository {

    private UnitStatsRepository() {
    }

    private static final UnitStats magicTankStats = new UnitStats("Magic Tank", 200, 100, 50);
    private static final UnitStats teslaTankStats = new UnitStats("Tesla Tank", 300, 400, 10);
    private static final UnitStats rainbowTankStats = new UnitStats("Rainbow Tank", 350, 300, 20);

    public static UnitStats getMagicTankUnitStats() {
        return magicTankStats;
    }

    public static UnitStats getTeslaTankUnitStats() {
        return teslaTankStats;
    }

    public static UnitStats getRainbowTankUnitStats() {
        return rainbowTankStats;
    }
}
