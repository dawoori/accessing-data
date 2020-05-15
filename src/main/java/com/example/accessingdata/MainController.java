package com.example.accessingdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);

        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUser() {
        return userRepository.findAll();
    }
}
