import Opis;

import java.util.ArrayList;


public class Tovar {

    private ArrayList<Opis> listOfCommodities;

    public Tovar(ArrayList<Opis> listOfCommodities) {
        this.listOfCommodities = listOfCommodities;
    }

    public void addCommodity(Opis commodity) {
        listOfCommodities.add(commodity);
    }

    public ArrayList<Opis> showCommodities() {
        return listOfCommodities;
    }

}