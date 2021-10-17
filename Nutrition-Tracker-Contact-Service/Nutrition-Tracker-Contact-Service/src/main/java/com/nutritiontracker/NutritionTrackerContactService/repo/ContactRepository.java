package com.nutritiontracker.NutritionTrackerContactService.repo;

import com.nutritiontracker.NutritionTrackerContactService.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    void deleteContactById(Long id);

    Contact findContactById(Long id);
}
