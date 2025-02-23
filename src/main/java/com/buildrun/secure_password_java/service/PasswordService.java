package com.buildrun.secure_password_java.service;


import com.buildrun.secure_password_java.controller.BodyRequest;
import com.buildrun.secure_password_java.domain.PasswordSecure;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service

public class PasswordService {
    private static void validateLength(PasswordSecure pass, List<String> failures) {
        if (pass.isLengthGreaterThan8()) {
            failures.add("Password must have at least 8 characters");
        }
    }

    private static void validateUpperCase(PasswordSecure pass, List<String> failures) {
        if (pass.hasUpperCase()) {
            failures.add("Password must have at least one uppercase letter");
        }
    }

    private static void validateLowerCase(PasswordSecure pass, List<String> failures) {
        if (pass.hasLowerCase()) {
            failures.add("Password must have at least one lowercase letter");
        }
    }

    private static void validateNumber(PasswordSecure pass, List<String> failures) {
        if (pass.hasDigit()) {
            failures.add("Password must have at least one number");
        }
    }

    private static void validateSpecialChar(PasswordSecure pass, List<String> failures) {
        if (pass.hasSpecialChar()) {
            failures.add("Password must have at least one special character");
        }
    }

    public PasswordSecure toPass(BodyRequest bodyRequest){
        return new PasswordSecure(bodyRequest.password());
    }


    public List<String> validate(BodyRequest pass) {
        List<String> failures = new ArrayList<String>();
        PasswordSecure passwordSecure=pass.toPasswordSecure();
        validateLength(passwordSecure, failures);
        validateUpperCase(passwordSecure, failures);
        validateLowerCase(passwordSecure, failures);
        validateNumber(passwordSecure, failures);
        validateSpecialChar(passwordSecure, failures);

        return failures;
    }

}
