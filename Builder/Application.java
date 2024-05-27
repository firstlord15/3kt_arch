package Builder;

import Builder.AbstractBuilder.HouseBuilder;
import Builder.Creator.IglooHouseBuilder;
import Builder.Creator.WoodenHouseBuilder;
import Builder.Product.House;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();

        director.setHouseBuilder(iglooBuilder);
        director.constructHouse();
        House house1 = director.getHouse();
        System.out.println(house1);

        director.setHouseBuilder(woodenHouseBuilder);
        director.constructHouse();
        House house2 = director.getHouse();
        System.out.println(house2);
    }
}