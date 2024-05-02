package shopping.cart;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private List<Item> itemList;

    public ShoppingCart(){
        itemList = new LinkedList<>();
    }

    public void addItem(String name, Double price, Integer amount){
        itemList.add(new Item(name,price,amount));
    }

    public void removeItem(String name){
        itemList.removeIf(x->x.getName().equals(name));
    }

    public Double calculateTotalValue(){
        return itemList.stream().mapToDouble(x->(x.getPrice()*x.getAmount())).sum();
    }

    public void showItens(){
        itemList.forEach(System.out::println);
    }
}
