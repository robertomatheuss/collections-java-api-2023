package sum.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class SumNumbers {
    private List<Integer> intList;

    public SumNumbers(){ intList = new ArrayList<>(); }

    public void addNumber(Integer number){ intList.add(number); }

    public Integer calculateSum(){ return intList.stream().mapToInt(x->x).sum(); }

    public Integer findBiggestNumber(){
        Optional<Integer> number= intList.stream().max(Integer::compareTo);
        if (number.isPresent())
            return number.get();
        else
            throw new NoSuchElementException();
    }

    public Integer findSmallestNumber(){
        Optional<Integer> number= intList.stream().min(Integer::compareTo);
        if (number.isPresent())
            return number.get();
        else
            throw new NoSuchElementException();
    }

    public List<Integer> getIntList() { return intList; }
}
