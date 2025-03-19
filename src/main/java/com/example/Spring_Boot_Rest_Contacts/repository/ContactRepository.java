package com.example.Spring_Boot_Rest_Contacts.repository;

import com.example.Spring_Boot_Rest_Contacts.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
