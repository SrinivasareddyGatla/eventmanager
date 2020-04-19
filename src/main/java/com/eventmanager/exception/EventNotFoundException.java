package com.eventmanager.exception;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(final long eventId) {
        super("Event not found with Id: "+ eventId);
    }
}
