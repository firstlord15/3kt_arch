package Builder;

import Builder.AbstractBuilder.HouseBuilder;
import Builder.Product.House;

public class Director {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder hb) { houseBuilder = hb; }

    public House getHouse() { return houseBuilder.getHouse(); }

    public void constructHouse() {
        houseBuilder.createNewHouse();
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }
}
