package org.saddy.todo;

public class Task {
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    private String taskName;
    private boolean isCompleted;
    public Task(String name) {
        this.taskName = name;
        this.isCompleted = false;
    }
}
