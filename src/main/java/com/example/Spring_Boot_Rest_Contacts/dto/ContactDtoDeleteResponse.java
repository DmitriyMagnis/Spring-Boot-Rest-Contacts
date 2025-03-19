package com.example.Spring_Boot_Rest_Contacts.dto;

import org.springframework.http.HttpStatus;

public record ContactDtoDeleteResponse(
        int statusCode,
        String reasonPhrase,
        boolean success,
        String message) {

    public static final String SUCCESS_MESSAGE = "Contact with id %s has been deleted successfully.";
    public static final String FAILURE_MESSAGE = "Contact with id %s has not been found!";

    public static ContactDtoDeleteResponse of(Long id, boolean isContactFound) {
        if (isContactFound)
            return new ContactDtoDeleteResponse(
                    HttpStatus.OK.value(),
                    HttpStatus.OK.getReasonPhrase(),
                    true, SUCCESS_MESSAGE.formatted(id));
        else
            return new ContactDtoDeleteResponse(
                    HttpStatus.NOT_FOUND.value(),
                    HttpStatus.NOT_FOUND.getReasonPhrase(),
                    false, FAILURE_MESSAGE.formatted(id));
    }
}
