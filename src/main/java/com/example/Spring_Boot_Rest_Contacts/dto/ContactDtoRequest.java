package com.example.Spring_Boot_Rest_Contacts.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ContactDtoRequest(Long id, String firstName,
                             String lastName, String email) {
}
