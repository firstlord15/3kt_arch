package Builder.Creator;

import Builder.AbstractBuilder.HouseBuilder;

public class IglooHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() { house.setFoundation("Ice blocks"); }

    @Override
    public void buildStructure() { house.setStructure("Ice bricks"); }

    @Override
    public void buildRoof() { house.setRoof("Ice dome"); }

    @Override
    public void buildInterior() { house.setInterior("Ice furniture"); }
}