package com.nutritiontracker.NutritionTrackerContactService.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String message;

    public Contact(){}

    public Contact(Long id, String name, String email, String message){
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString(){
        return "Contact{ id = " + this.id + ", name = " + this.name + ", email = " + this.email + ", message = " +
                this.message + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
