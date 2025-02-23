package com.buildrun.secure_password_java.controller;

import com.buildrun.secure_password_java.domain.PasswordSecure;

public record BodyRequest(String password) {

public PasswordSecure toPasswordSecure() {
    return new PasswordSecure(password);
}

}
