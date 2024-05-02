package set.task.list;

import java.util.Objects;

public class Task {
    private String description;
    private Boolean finished;

    public Task(String description, Boolean finish) {
        this.description = description;
        this.finished = finish;
    }

    public String getDescription() {
        return description;
    }

    public Boolean isFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task: " +
                "description='" + description + '\'' +
                ", finished=" + finished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }
}
