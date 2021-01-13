package com.sherold.store.Controllers;

import com.sherold.store.DTO.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    //testing only
    @GetMapping("/all")
    public void getAll() {
        //TODO: update return type and implement
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") int id) {
        //TODO:
        return new UserDto();
    }

    @PostMapping("/create")
    public UserDto createUser(@RequestBody UserDto newUser) {
        //TODO:
        return new UserDto();
    }

    @PostMapping("/update")
    public UserDto updateUser(@RequestBody UserDto updatedUser) {
        //TODO:
        return new UserDto();
    }

    @PostMapping("/delete")
    public boolean deleteUser(@RequestBody UserDto deletedUser) {
        //TODO:
        return true;
    }
}
