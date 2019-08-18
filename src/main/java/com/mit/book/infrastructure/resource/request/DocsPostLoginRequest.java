package com.mit.book.infrastructure.resource.request;

import com.mit.book.service.model.vo.LoginId;
import com.mit.book.service.model.vo.Password;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocsPostLoginRequest {
    private String loginId;
    private String password;

    public DocsPostLoginRequest() {};

    public DocsPostLoginRequest(String aaa , String bbb) {
        this.loginId = aaa;
        this.password = bbb;
    };

    public static DocsPostLoginRequest of(LoginId logind, Password password) {
        return new DocsPostLoginRequest(
                logind.getValue(),
                password.getValue()
        );
    }
}
