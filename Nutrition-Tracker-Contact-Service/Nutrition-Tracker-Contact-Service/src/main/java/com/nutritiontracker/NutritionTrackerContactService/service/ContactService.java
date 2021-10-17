package com.nutritiontracker.NutritionTrackerContactService.service;

import com.nutritiontracker.NutritionTrackerContactService.model.Contact;
import com.nutritiontracker.NutritionTrackerContactService.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
@Transactional
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) { this.contactRepository = contactRepository; }

    public Contact addContact(Contact contact){ return contactRepository.save(contact); }

    public List<Contact> findAllContacts(){ return contactRepository.findAll(); }

    public void deleteContact(Long id){ contactRepository.deleteContactById(id); }

    public Contact findContactById(Long id){ return contactRepository.findContactById(id); }
    //.orElseThrow(()-> new UserNotFoundException("User " + "by id " + " was not found")); }



}
