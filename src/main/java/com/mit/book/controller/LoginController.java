package com.mit.book.controller;

import com.mit.book.controller.resource.request.LoginRequest;
import com.mit.book.service.LoginService;
import com.mit.book.service.model.vo.LoginId;
import com.mit.book.service.model.vo.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class LoginController {
    @Autowired
    private LoginService service;

    @GetMapping(value = "/login")
    public String getLogin() {
        return "login/login";
    }

    @PostMapping(value = "/menu")
    public String postLogin(@ModelAttribute LoginRequest request, Model model) {
        String loginId = service.postLogin(
                LoginId.of(request.getLoginId()),
                Password.of(request.getPassword())).getValue();

        model.addAttribute(
                "loginId",
                loginId);
        return "login/menu";
    }
}