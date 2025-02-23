package com.buildrun.secure_password_java.service;


import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service

public class PasswordService {
    private static void validateLength(String pass, List<String> failures) {
        if (StringUtils.isBlank(pass) || pass.length() < 8) {
            failures.add("Password must have at least 8 characters");
        }
    }

    private static void validateUpperCase(String pass, List<String> failures) {
        if (!Pattern.matches(".*[A-Z].*", pass)) {
            failures.add("Password must have at least one uppercase letter");
        }
    }

    private static void validateLowerCase(String pass, List<String> failures) {
        if (!Pattern.matches(".*[a-z].*", pass)) {
            failures.add("Password must have at least one lowercase letter");
        }
    }

    private static void validateNumber(String pass, List<String> failures) {
        if (!Pattern.matches(".*[0-9].*", pass)) {
            failures.add("Password must have at least one number");
        }
    }

    private static void validateSpecialChar(String pass, List<String> failures) {
        if (!Pattern.matches(".*[\\W].*", pass)) {
            failures.add("Password must have at least one special character");
        }
    }

    public List<String> validate(String pass) {
        List<String> failures = new ArrayList<String>();
        validateLength(pass, failures);
        validateUpperCase(pass, failures);
        validateLowerCase(pass, failures);
        validateNumber(pass, failures);
        validateSpecialChar(pass, failures);

        return failures;
    }

}
