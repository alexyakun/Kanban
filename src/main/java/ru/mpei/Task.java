package ru.mpei;

public class Task {
    private int id;
    private String description;
    private Status status;
    private String time;
    private int duration;

    public Task(int id, String description, Status status, String time, int duration) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.time = time;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
