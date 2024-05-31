package com.nasri.DSA.DSAindividualAssignment.Todelist;

public class Task {
    String title, description;
    boolean completed;
    Task(String title, String description){ // initialise title and description with the given data from the user
        this.title = title;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    boolean isCompleted(){
        return completed;
    }
    void markCompleted(){
        completed = true;
    } //mark the task as complete
}
