package com.mit.book.infrastructure;

import com.mit.book.infrastructure.resource.LoginResource;
import com.mit.book.infrastructure.resource.request.DocsPostLoginRequest;
import com.mit.book.service.model.vo.LoginId;
import com.mit.book.service.model.vo.Password;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LoginClient {
    private RestTemplate restTemplate = new RestTemplate();

    private static final String BFF_LOGIN = "http://localhost:8080/bff/login";

    public LoginResource postLogin(LoginId loginId, Password password) {
        LoginResource loginResource = restTemplate.postForObject(
                BFF_LOGIN ,
                DocsPostLoginRequest.of(loginId,password),
                LoginResource.class
        );
        return loginResource;
    }
}

