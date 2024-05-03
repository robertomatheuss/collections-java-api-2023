package map.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String,String> words;

    public Dictionary(){
        this.words = new HashMap<>();
    }

    public void addWord(String word,String definition){
        words.put(word,definition);
    }

    public void removeWord(String word){
        words.remove(word);
    }

    public void showDictionary(){
        words.forEach((x,y)-> System.out.println(x + ": " + y));
    }

    public String searchByWord(String word){
        return words.get(word);
    }

}
