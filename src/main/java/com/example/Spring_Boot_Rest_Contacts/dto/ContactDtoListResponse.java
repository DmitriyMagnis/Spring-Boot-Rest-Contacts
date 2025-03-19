package com.example.Spring_Boot_Rest_Contacts.dto;

import com.example.Spring_Boot_Rest_Contacts.entity.Contact;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

public record ContactDtoListResponse(
        int statusCode,
        String reasonPhrase,
        boolean success,
        String message,
        List<Contact> contactList) {

    public static final String SUCCESS_MESSAGE = "Contact list has been fetched successfully.";
    public static final String FAILURE_MESSAGE = "Contact list has not been found!";

    public static ContactDtoListResponse of(boolean isContactListEmpty, List<Contact> contactList) {
        if (isContactListEmpty)
            return new ContactDtoListResponse(
                    HttpStatus.NOT_FOUND.value(),
                    HttpStatus.NOT_FOUND.getReasonPhrase(),
                    false, FAILURE_MESSAGE, Collections.emptyList());
        else
            return new ContactDtoListResponse(
                    HttpStatus.OK.value(),
                    HttpStatus.OK.getReasonPhrase(),
                    true, SUCCESS_MESSAGE, contactList);
    }
}
