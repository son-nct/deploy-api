package com.example.api.api.handleException;

import com.example.api.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class APIHandleException {

   @ExceptionHandler(NoSuchElementException.class)
   @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
   public ErrorMessage message() {
      return new ErrorMessage(500,"Not found User !");
   }
}
