package com.buildrun.secure_password_java.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordSecureTest {

    @Nested
    class isLengthGreaterThan8{
        @Test
        void shouldBeTrueWhenLengthGreaterThan8(){
            var pass= new PasswordSecure("Abcdefgh");
            assertTrue(pass.isLengthGreaterThan8());
        }

        @Test
        void shouldBeFalseWhenLengthLessThan8(){
            var pass= new PasswordSecure("Abcdefg");
            assertFalse(pass.isLengthGreaterThan8());
        }

    }
    @Nested
    class hasUpperCase{
        @Test
        void shouldBeTrueWhenUpperCase(){
            var pass= new PasswordSecure("Abcd1234");
            assertTrue(pass.hasUpperCase());
        }
        @Test
        void shouldBeFalseWhenLowerCase(){
            var pass= new PasswordSecure("abcd1234");
            assertFalse(pass.hasUpperCase());
        }

    }
    @Nested
    class hasLowerCase{
        @Test
        void shouldBeTrueWhenLowerCase(){
            var pass= new PasswordSecure("Abcd1234");
            assertTrue(pass.hasLowerCase());
        }
        @Test
        void shouldBeFalseWhenUpperCase(){
            var pass= new PasswordSecure("ABCD1234");
            assertFalse(pass.hasLowerCase());
        }

    }
    @Nested
    class hasDigit{
        @Test
        void shouldBeTrueWhenHasDigit(){
            var pass= new PasswordSecure("1aaaaaa");
            assertTrue(pass.hasDigit());
        }
        @Test
        void shouldBeFalseWhenHasNoDigit(){
            var pass= new PasswordSecure("aaaaaa");
            assertFalse(pass.hasDigit());
        }

    }
    @Nested
    class hasSpecialChar{
        @Test
        void shouldBeTrueWhenHasSpecialChar(){
            var pass= new PasswordSecure("@aaaaaa");
            assertTrue(pass.hasSpecialChar());
        }
        @Test
        void shouldBeFalseWhenHasSpecialChar(){
            var pass= new PasswordSecure("aaaaaa");
            assertFalse(pass.hasSpecialChar());
        }

    }

}