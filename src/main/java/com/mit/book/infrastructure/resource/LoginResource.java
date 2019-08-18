package com.mit.book.infrastructure.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResource {
    private String loginId;

    public LoginResource() {}

    public LoginResource(String str) {
        this.loginId = str;
    }
}
