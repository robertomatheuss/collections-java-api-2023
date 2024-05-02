package ordering.numbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderingNumbers {
    private List<Integer> intList;

    public OrderingNumbers(){ intList = new ArrayList<>(); }

    private void addNumber(int numero){ intList.add(numero); }

    private void sortAscending(){ intList.sort(Integer::compareTo); }

    private void sortDescending(){ intList.sort(Comparator.reverseOrder()); }
}
