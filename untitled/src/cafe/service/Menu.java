package cafe.service;
import cafe.datamodel.Drink;
import cafe.datamodel.Pizza;
import cafe.datamodel.Product;
import java.util.ArrayList;
import java.util.Collections;
public class Menu{
    public ArrayList<Product> menuList = new ArrayList<>();
    public Menu(){
        Pizza pepperoni = new Pizza(4, "Пепперони");
        Pizza fourCheeses = new Pizza(3, "Четыре сыра");
        Pizza verona = new Pizza(5, "Верона");
        Pizza gavana = new Pizza(6, "Гавана");
        Pizza italian = new Pizza(3, "Итальянская");
        Pizza sea = new Pizza(7, "Морская");
        Drink lemonade = new Drink(1, "Лимонад");
        Drink cola = new Drink(2, "Кола");
        Drink sprite = new Drink(3, "Спрайт");
        Drink pinaColada = new Drink(5, "Пина Колада");
        Collections.addAll(menuList, pepperoni, fourCheeses, verona, gavana, italian, sea, lemonade, cola, sprite ,pinaColada);
    }
}