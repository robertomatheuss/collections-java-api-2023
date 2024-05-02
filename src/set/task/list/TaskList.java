package set.task.list;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskList {

    private Set<Task>  tasks;

    public TaskList(){
        tasks = new HashSet<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(String description){
        if(!tasks.isEmpty()){
            tasks.removeIf(x->x.getDescription().equalsIgnoreCase(description));
        }else {
            throw new RuntimeException("List is empty.");
        }
    }
    public void showTask(){
        tasks.forEach(System.out::println);
    }
    public int countTask(){
        return tasks.size();
    }
    public Set<Task> getTasksFinished(){
        return tasks.stream().filter(x-> x.isFinished()==true).collect(Collectors.toSet());
    }

    public Set<Task> getTasksUnfinished(){
        return tasks.stream().filter(x-> x.isFinished()==false).collect(Collectors.toSet());
    }
    public void markTaskFinished(String description){
        tasks.stream().filter(x->x.getDescription().equalsIgnoreCase(description))
                .forEach(x-> x.setFinished(true));
    }
    public void markTaskUnfinished(String description){
        tasks.stream().filter(x->x.getDescription().equalsIgnoreCase(description))
                .forEach(x-> x.setFinished(false));
    }
    public void clearAllTask(){
        tasks.clear();
    }
}
