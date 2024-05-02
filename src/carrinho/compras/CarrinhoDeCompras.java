package carrinho.compras;

import java.util.LinkedList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        itemList = new LinkedList<>();
    }

    public void addItem(String name, Double price, Integer amount){
        itemList.add(new Item(name,price,amount));
    }

    public void removerItem(String name){
        itemList.removeIf(x->x.getName().equals(name));
    }

    public Double calculateTotalValue(){
        return itemList.stream().mapToDouble(x->(x.getPrice()*x.getAmount())).sum();
    }
    public void exibirItens(){
        itemList.forEach(System.out::println);
    }
}
