package design.patterns.flyweight.units;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MagicTank {
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;


    public MagicTank(int x, int y) {
        this.stats = UnitStatsRepository.getMagicTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp ();
    }
}