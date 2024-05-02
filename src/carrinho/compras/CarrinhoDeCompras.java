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
    public Double calcularValorTotal(){
        Double value = 0.0;
        for (Item x : itemList) {
            value += (x.getPrice() * x.getAmount());
        }
        return value;
    }
    public void exibirItens(){
        itemList.forEach(System.out::println);
    }
}
