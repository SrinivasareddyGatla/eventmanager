package com.eventmanager.data;

import java.util.List;

public class UserData {
    private String name;
    private String email;
    private List<EventData> events;

    public List<EventData> getEvents() {
        return events;
    }

    public void setEvents(List<EventData> events) {
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
