package com.example.Spring_Boot_Rest_Contacts.dto;

import com.example.Spring_Boot_Rest_Contacts.entity.Contact;
import org.springframework.http.HttpStatus;

public record ContactDtoCreateResponse(
        int statusCode,
        String reasonPhrase,
        boolean success,
        String message,
        Contact contact) {

    public static final String SUCCESS_MESSAGE = "Contact has been created successfully.";
    public static final String FAILURE_MESSAGE = "Contact has not been created!";

    public static ContactDtoCreateResponse of(boolean isContactCreated, Contact contact) {
        return (isContactCreated) ?
                new ContactDtoCreateResponse(
                        HttpStatus.OK.value(),
                        HttpStatus.OK.getReasonPhrase(),
                        true, SUCCESS_MESSAGE, contact) :
                new ContactDtoCreateResponse(
                        HttpStatus.NO_CONTENT.value(),
                        HttpStatus.NO_CONTENT.getReasonPhrase(),
                        false, FAILURE_MESSAGE, null);
    }
}
