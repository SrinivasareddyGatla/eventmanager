package com.eventmanager.exception;

import com.eventmanager.data.ErrorData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ErrorData handleUserNotFoundExcpetion(final UserNotFoundException ex, final HttpServletResponse response) {
        final ErrorData errorData = new ErrorData();
        errorData.setCode(response.getStatus());
        errorData.setMessage(ex.getMessage());
        return errorData;
    }

    @ExceptionHandler(EventNotFoundException.class)
    public ErrorData handleEventNotFoundException(final UserNotFoundException ex, final HttpServletResponse response){
        final ErrorData errorData = new ErrorData();
        errorData.setCode(response.getStatus());
        errorData.setMessage(ex.getMessage());
        return errorData;
    }
}
