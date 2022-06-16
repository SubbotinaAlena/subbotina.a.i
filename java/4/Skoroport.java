import Opis;

public class Skoroport extends Opis {

    private double storageTime;

    public Skoroport(long id, int productCode, String name, int wholesalePrice, int retailPrice, String description, double storageTime) {
        super(id, productCode, name, wholesalePrice, retailPrice, description);
        this.storageTime = storageTime;
    }

    public double getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(double storageTime) {
        this.storageTime = storageTime;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\n Максимальное время хранения (часы) - " + storageTime;
    }

}