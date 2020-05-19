package com.example.accessingdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
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

    @GetMapping("id/{id}")
    public @ResponseBody Optional<User> getUserById(@PathVariable Integer id) {
        return userRepository.findById(id);
    }

    @GetMapping("name/{name}")
    public @ResponseBody List<User> getUserByName(@PathVariable String name) {
        return userRepository.findByNameStartsWithIgnoreCase(name);
    }
}
