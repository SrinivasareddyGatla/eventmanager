package com.eventmanager.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(final String userId) {
      super("No user found with userId: " + userId);
    }
}
