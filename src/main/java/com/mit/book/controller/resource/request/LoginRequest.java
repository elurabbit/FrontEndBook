package com.mit.book.controller.resource.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String loginId;
    private String password;

    public LoginRequest() {};

    public LoginRequest(String loginId, String Password) {
        this.loginId = loginId;
        this.password = Password;
    };

}
