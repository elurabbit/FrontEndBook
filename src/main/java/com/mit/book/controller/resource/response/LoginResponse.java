package com.mit.book.controller.resource.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String loginId;

    public LoginResponse() {};

    public LoginResponse(String loginId) {
        this.loginId = loginId;
    };
}
