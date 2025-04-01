package com.uab.backend.userAuth.controllers;

import com.uab.backend.userAuth.models.ApplicationUser;
import com.uab.backend.userAuth.models.ApplicationUserDTO;
import com.uab.backend.userAuth.models.UpdateUserDAO;
import com.uab.backend.userAuth.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    private final UserRepository userRepository;

    public StudentController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/update")
    public ApplicationUserDTO helloUserController(@RequestBody UpdateUserDAO updateUserDAO) {
        ApplicationUser applicationUser = userRepository.findByUsername(updateUserDAO.getUsername()).get();
        applicationUser.setName(updateUserDAO.getName());
        return ApplicationUserDTO.convertToApplicationUserDTO(userRepository.save(applicationUser));
    }
}
