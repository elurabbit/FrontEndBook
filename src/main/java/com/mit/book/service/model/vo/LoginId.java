package com.mit.book.service.model.vo;

import lombok.Value;

import java.util.Optional;

@Value
public class LoginId {
    private String value;

    /** of */
    public static LoginId of(String value) {
        return Optional.ofNullable(value).map(LoginId::new)
                .orElseThrow(() -> new IllegalArgumentException("must not be null"));
    }

}
