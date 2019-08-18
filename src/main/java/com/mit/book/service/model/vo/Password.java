package com.mit.book.service.model.vo;

import lombok.Value;

import java.util.Optional;

@Value
public class Password {
    private String value;

    public static Password of(String value) {
        return Optional.ofNullable(value).map(Password::new)
                .orElseThrow(() -> new IllegalArgumentException("must not be null"));
    }
}
