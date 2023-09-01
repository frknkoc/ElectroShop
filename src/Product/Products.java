package Product;

public class Products {
    private int id;
    private String markName;

    public Products(int id, String markName) {
        this.id = id;
        this.markName = markName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }
}
