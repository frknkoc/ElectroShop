import Product.Products;

public class NoteBook extends Products {
    private int price;
    private int discount;
    private int stock;
    private String notebookName;
    private int ram;
    private int storage;
    private int screenSize;

    public NoteBook(int id, String notebookName, int price,  String markName, int discount, int stock,int ram, int storage, int screenSize) {
        super(id, markName);
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.notebookName = notebookName;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getMarkName() {
        return super.getMarkName();
    }

    @Override
    public void setMarkName(String markName) {
        super.setMarkName(markName);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNotebookName() {
        return notebookName;
    }

    public void setNotebookName(String notebookName) {
        this.notebookName = notebookName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
