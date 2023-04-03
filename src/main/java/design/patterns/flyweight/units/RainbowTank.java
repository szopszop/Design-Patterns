package design.patterns.flyweight.units;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RainbowTank {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public RainbowTank( int x, int y) {
        this.stats = UnitStatsRepository.getRainbowTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }

}
