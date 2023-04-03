package design.patterns.flyweight.units;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UnitStats {

    private String name;
    private int hp;
    private int armour;
    private int damageDealt;

}
