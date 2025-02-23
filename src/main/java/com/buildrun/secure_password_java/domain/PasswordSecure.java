package com.buildrun.secure_password_java.domain;

import io.micrometer.common.util.StringUtils;

import java.util.regex.Pattern;

public class PasswordSecure {
    private String password;

    public PasswordSecure(String password) {
        this.password = password;
    }

   public boolean isLengthGreaterThan8() {
        if (StringUtils.isBlank(password) || password.length() < 8) {
            return false;
        }
        return true;
    }
    public boolean hasUpperCase() {
       if (Pattern.matches(".*[A-Z].*", password)) {
          return true;
       }
       return false;
   }
    public  boolean hasLowerCase() {
       if (Pattern.matches(".*[a-z].*", password)) {
           return true;
       }
       return false;
   }
    public  boolean hasDigit() {
       if (Pattern.matches(".*[0-9].*", password)) {
           return true;
       }
       return false;
   }
    public   boolean hasSpecialChar() {
       if (Pattern.matches(".*[\\W].*", password)) {
           return true;
       }
        return false;
   }
}
