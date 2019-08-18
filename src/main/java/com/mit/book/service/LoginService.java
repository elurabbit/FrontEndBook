package com.mit.book.service;

import com.mit.book.infrastructure.LoginClient;
import com.mit.book.service.model.vo.LoginId;
import com.mit.book.service.model.vo.Password;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginClient client;

    public LoginId postLogin(LoginId loginId, Password password) {
        return LoginId.of(client.postLogin(loginId, password).getLoginId());
    }
}
