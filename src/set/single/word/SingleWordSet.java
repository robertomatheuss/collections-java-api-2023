package set.single.word;

import java.util.HashSet;
import java.util.Set;

public class SingleWordSet {
    private Set<String> singleWord;

    public SingleWordSet(){
        singleWord = new HashSet<>();
    }

    public void addWord(String word){
        singleWord.add(word);
    }

    public void removeWord(String word){
        singleWord.remove(word);
    }

    public boolean verifyWord(String wordVerify){
        return singleWord.stream().anyMatch(x->x.equalsIgnoreCase(wordVerify));
    }

    public void showAllWords(){
        singleWord.forEach(System.out::println);
    }
}
