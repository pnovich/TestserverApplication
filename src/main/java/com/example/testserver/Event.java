package com.example.testserver;

public class Event {
    public String title;
    public Event(String title){this.title = title;}
    public Event(){this.title = "title";}

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                '}';
    }
}
