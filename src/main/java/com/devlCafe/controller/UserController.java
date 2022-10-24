package com.devlCafe.controller;

import com.devlCafe.dto.UserDto;
import com.devlCafe.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

	private UserService userService;

    @GetMapping("/")
    public String index() {
        return "user/login";
    }

    @GetMapping("/user/signup")
    public String signupForm(Model model) {
        model.addAttribute("user",new UserDto());

        return "user/register";
    }

    @PostMapping("/user/signup")
    public String signup(UserDto userDto) {
        userService.signUp(userDto);

        return "redirect:/";
    }



}
