package Builder.Creator;

import Builder.AbstractBuilder.HouseBuilder;

public class WoodenHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() { house.setFoundation("Wooden poles"); }

    @Override
    public void buildStructure() { house.setStructure("Wooden walls"); }

    @Override
    public void buildRoof() { house.setRoof("Wooden roof"); }

    @Override
    public void buildInterior() { house.setInterior("Wooden furniture"); }
}
