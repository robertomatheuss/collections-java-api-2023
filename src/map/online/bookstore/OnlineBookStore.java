package map.online.bookstore;

import java.util.*;
import java.util.stream.Collectors;

public class OnlineBookStore {

    private Map<String,Book> bookStore;

    public OnlineBookStore() {
        this.bookStore = new HashMap<>();
    }

    public void addBook(String link,Book book){
        bookStore.put(link,book);
    }

    public void removeBookWithTitle(String title){
        bookStore.entrySet().stream()
                .filter(x->x.getValue().getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toSet())
                .forEach(x-> bookStore.remove(x.getKey()));
    }

    public void showBookSortedByPrice(){
        bookStore.entrySet().stream()
                .sorted(Comparator.comparing(x -> x.getValue().getPrice()))
                .forEach(System.out::println);
    }

    public Set<Map.Entry<String, Book>> searchBookByAuthor(String author){
        return bookStore.entrySet().stream()
                .filter(x->x.getValue().getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toSet());
    }

    public Book getMoreExpensiveBook(){
        return bookStore.entrySet().stream()
                .max(Comparator.comparing(x->x.getValue().getPrice()))
                .get().getValue();
    }

    public Book getMoreCheaperBook(){
        return bookStore.entrySet().stream()
                .min(Comparator.comparing(x->x.getValue().getPrice()))
                .get().getValue();
    }
    @Override
    public String toString() {
        return "bookStore=" + bookStore;
    }
}
