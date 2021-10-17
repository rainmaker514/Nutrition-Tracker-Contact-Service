package com.nutritiontracker.NutritionTrackerContactService.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {
    private final ContactService contactService;

    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping("/all")
    public List<User> getUsers(){ return (List<User>) userService.findAllUsers(); }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){ return userService.updateUser(user); }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){ return userService.findUserById(id); }

    @ResponseBody
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){ userService.deleteUser(id); }

}
