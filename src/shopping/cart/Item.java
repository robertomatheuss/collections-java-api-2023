package shopping.cart;

public class Item  {
    private String name;
    private Double price;
    private Integer amount;

    public Item(String name, Double price, Integer amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Name: " +name+
                ", Price: "+price+
                ", Amount:"+amount;
    }
}