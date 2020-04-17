package com.eventmanager.data;

import java.util.Collection;

public class EventData {

    private Collection<UserData> users;
    private long eventId;
    private String name;
    private String description;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<UserData> getUsers() {
        return users;
    }

    public void setUsers(Collection<UserData> users) {
        this.users = users;
    }
}
