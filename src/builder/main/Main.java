package builder.main;

import builder.builders.CatalogBuilder;
import builder.builders.HouseBuilder;
import builder.buildings.Catalog;
import builder.buildings.House;
import builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.buildCastle(houseBuilder);

        House house = houseBuilder.getResult();

        System.out.println("House generated: "+house.getHouseType());

        CatalogBuilder catalogBuilder = new CatalogBuilder();
        director.buildCastle(catalogBuilder);
        Catalog catalog = catalogBuilder.getResult();

        System.out.println(catalog.print());
    }
}
