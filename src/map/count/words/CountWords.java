package map.count.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CountWords {
    private Map<String,Integer> countWords;

    public CountWords() {
        this.countWords = new HashMap<>();
    }

    public void addWord(String word,Integer count){
        countWords.put(word,count);
    }

    public void removeWord(String word){
        countWordsIsEmpty();
        countWords.remove(word);
    }

    public void countWordsIsEmpty(){
        if(countWords.isEmpty()){
            throw new RuntimeException("The map is empty.");
        }
    }

    public void showCountWords(){
        countWords.forEach((key,value)-> System.out.println("The word: " + key +
                " it was repeated " + value+" times"));
    }

    public Map<String,Integer> findWordWithMoreOften(){
       Map<String,Integer> test = new HashMap<>();
       Optional<Integer> biggestNumber = countWords.values().stream().max(Integer::compareTo);
       countWords.keySet().stream()
               .filter(word->countWords.get(word) == biggestNumber.get())
               .forEach(word-> test.put(word,countWords.get(word)));
       return test;
    }
}
