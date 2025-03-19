package com.example.Spring_Boot_Rest_Contacts.dto;

import com.example.Spring_Boot_Rest_Contacts.entity.Contact;
import org.springframework.http.HttpStatus;

public record ContactDtoGetByIdResponse(
        int statusCode,
        String reasonPhrase,
        boolean success,
        String message,
        Contact contact) {

    public static final String SUCCESS_MESSAGE = "Contact with id %s has been fetched successfully.";
    public static final String FAILURE_MESSAGE = "Contact with id %s has not been found!";

    public static ContactDtoGetByIdResponse of(Long id, boolean isContactFound, Contact contact) {
        if (isContactFound)
            return new ContactDtoGetByIdResponse(
                    HttpStatus.OK.value(),
                    HttpStatus.OK.getReasonPhrase(),
                    true, SUCCESS_MESSAGE.formatted(id), contact);
        else
            return new ContactDtoGetByIdResponse(
                    HttpStatus.NOT_FOUND.value(),
                    HttpStatus.NOT_FOUND.getReasonPhrase(),
                    false, FAILURE_MESSAGE.formatted(id), null);
    }
}
