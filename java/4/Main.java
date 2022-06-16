import Opis;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Opis> listOfCommodities = new ArrayList<>();
        Tovar commodityList = new Tovar(listOfCommodities);

        long cupId = 1;
        int cupProductCode = 34377;
        String cupName = "Cтакан";
        int cupWholesalePrice = 250;
        int cupRetailPrice = 425;
        String cupDescription = "Стакан гранёный с позолотой";
        double cupFragilityFactor = 0.38;

        Hrupki glass = new Hrupki(cupId, cupProductCode, cupName, cupWholesalePrice, cupRetailPrice, cupDescription, cupFragilityFactor);

        commodityList.addCommodity(glass);

        long kvassId = 2;
        int kvassProductCode = 3487;
        String kvassName = "Пряники";
        int kvassWholesalePrice = 22;
        int kvassRetailPrice = 57;
        String kvassDescription = "Шоколадные с мятой";
        double kvassStorageTime = 36;
        Skoroport kvass = new Skoroport(kvassId, kvassProductCode, kvassName, kvassWholesalePrice, kvassRetailPrice, kvassDescription, kvassStorageTime);

        commodityList.addCommodity(kvass);

        long boxId = 3;
        int boxProductCode = 16_412;
        String boxName = "Ящик для хранения вещей ";
        int boxWholesalePrice = 1200;
        int boxRetailPrice = 2000;
        String boxDescription = "Пластиковый, вместительный";
        double boxHeight = 1;
        double boxWidth = 0.9;
        double boxLength = 0.5;
        Gaboriti box = new Gaboriti(boxId, boxProductCode, boxName, boxWholesalePrice, boxRetailPrice, boxDescription, boxHeight, boxLength, boxWidth);

        commodityList.addCommodity(box);

        System.out.println(commodityList.showCommodities());

    }

}