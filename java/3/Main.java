public class Main {
    public static void main(String[] args) {
        long id = 7;
        int productCode = 7843;
        String name = "Свитшот";
        int wholesalePrice = 950;
        int retailPrice = 1980;
        String description = "Свитшот черного цвета, на флисовой подкладке, размера М";
        Dabl exampleObject = new Dabl(id, productCode, name, wholesalePrice, retailPrice, description);
        System.out.println(exampleObject);
    }

}