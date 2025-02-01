package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.security.SecureRandom;
import org.mockito.MockedStatic;
import java.util.Random;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class Md5CryptBaseRockGeneratedTest {

    //BaseRock generated method id: ${apr1CryptTest}, hash: 3194165B58891203BF7DFFB9C7564C26
    @Disabled()
    @Test()
    void apr1CryptTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.apr1Crypt(byteArray, "$apr1$A")).thenReturn("return_of_apr1Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.apr1Crypt(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_apr1Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.apr1Crypt(byteArray, "$apr1$A"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${apr1Crypt1Test}, hash: B3D41B0CF74D99097DD4F84102279126
    @Disabled()
    @Test()
    void apr1Crypt1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.apr1Crypt(byteArray, "$apr1$A")).thenReturn("return_of_apr1Crypt1");
            Random random = new Random();
            //Act Statement(s)
            String result = Md5Crypt.apr1Crypt(byteArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_apr1Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.apr1Crypt(byteArray, "$apr1$A"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${apr1Crypt2WhenSaltNotStartsWithAPR1_PREFIX}, hash: 2E3A06535D4D27281969527CACBE7ADB
    @Test()
    void apr1Crypt2WhenSaltNotStartsWithAPR1_PREFIX() {
        /* Branches:
         * (salt != null) : true
         * (!salt.startsWith(APR1_PREFIX)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.md5Crypt(byteArray, "$apr1$A", "$apr1$")).thenReturn("return_of_md5Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.apr1Crypt(byteArray, "A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_md5Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.md5Crypt(byteArray, "$apr1$A", "$apr1$"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${apr1Crypt3Test}, hash: FA1DFAEC0A9B8348FE95F0FA1F46ED9B
    @Disabled()
    @Test()
    void apr1Crypt3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 107, (byte) 101, (byte) 121, (byte) 66, (byte) 121, (byte) 116, (byte) 101, (byte) 115, (byte) 49 };
            md5Crypt.when(() -> Md5Crypt.apr1Crypt(byteArray)).thenReturn("return_of_apr1Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.apr1Crypt("keyBytes1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_apr1Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.apr1Crypt(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${apr1Crypt4Test}, hash: A0CAE2474755BAEA81C342CEE28A7C44
    @Disabled()
    @Test()
    void apr1Crypt4Test() {
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 107, (byte) 101, (byte) 121, (byte) 66, (byte) 121, (byte) 116, (byte) 101, (byte) 115, (byte) 49 };
            md5Crypt.when(() -> Md5Crypt.apr1Crypt(byteArray, "salt1")).thenReturn("return_of_apr1Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.apr1Crypt("keyBytes1", "salt1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_apr1Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.apr1Crypt(byteArray, "salt1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5CryptTest}, hash: C1EC0CFBFA23E85E5F59707EAB2854C0
    @Disabled()
    @Test()
    void md5CryptTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.md5Crypt(byteArray, "$1$A")).thenReturn("return_of_md5Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.md5Crypt(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_md5Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.md5Crypt(byteArray, "$1$A"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Crypt1Test}, hash: 8794B8698C492F5A721857E542ECF03B
    @Disabled()
    @Test()
    void md5Crypt1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.md5Crypt(byteArray, "$1$A")).thenReturn("return_of_md5Crypt1");
            Random random = new Random();
            //Act Statement(s)
            String result = Md5Crypt.md5Crypt(byteArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_md5Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.md5Crypt(byteArray, "$1$A"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Crypt2Test}, hash: 442B209AF9D0E91B1EB50CF07C094A5C
    @Test()
    void md5Crypt2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.md5Crypt(byteArray, "salt1", "$1$")).thenReturn("return_of_md5Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.md5Crypt(byteArray, "salt1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_md5Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.md5Crypt(byteArray, "salt1", "$1$"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Crypt3Test}, hash: E67E2B731BA2B9F481D29222AA21825A
    @Test()
    void md5Crypt3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Md5Crypt> md5Crypt = mockStatic(Md5Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            md5Crypt.when(() -> Md5Crypt.md5Crypt(eq(byteArray), eq("salt1"), eq("prefix1"), (SecureRandom) any())).thenReturn("return_of_md5Crypt1");
            //Act Statement(s)
            String result = Md5Crypt.md5Crypt(byteArray, "salt1", "prefix1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_md5Crypt1"));
                md5Crypt.verify(() -> Md5Crypt.md5Crypt(eq(byteArray), eq("salt1"), eq("prefix1"), (SecureRandom) any()), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Crypt4WhenPrefixLengthLessThan3ThrowsIllegalArgumentException}, hash: 649DE6D6B9E7198F937F7989BA07F96D
    @Test()
    void md5Crypt4WhenPrefixLengthLessThan3ThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : false
         * (prefix.length() < 3) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid prefix value: A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Md5Crypt.md5Crypt(byteArray, "salt1", "A", random);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${md5Crypt4WhenPrefixCharAtPrefixLengthMinus1NotEquals___ThrowsIllegalArgumentException}, hash: 5DD39D015E081E7A22879995E4E5395B
    @Test()
    void md5Crypt4WhenPrefixCharAtPrefixLengthMinus1NotEquals___ThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : false
         * (prefix.length() < 3) : false
         * (prefix.charAt(0) != '$') : true
         * (prefix.charAt(prefix.length() - 1) != '$') : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid prefix value: BED");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Md5Crypt.md5Crypt(byteArray, "salt1", "BED", random);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${md5Crypt4WhenPrefixCharAtPrefixLengthMinus1Equals___AndMNotFindThrowsIllegalArgumentException}, hash: 3B3AD9C404E8C53E3D04BE57D4ABA339
    @Test()
    void md5Crypt4WhenPrefixCharAtPrefixLengthMinus1Equals___AndMNotFindThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : false
         * (prefix.length() < 3) : false
         * (prefix.charAt(0) != '$') : true
         * (prefix.charAt(prefix.length() - 1) != '$') : false
         * (!m.find()) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid salt value: ");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Md5Crypt.md5Crypt(byteArray, "", "D$E$", random);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${md5Crypt4WhenIAnd1Equals0}, hash: 708F36E60AD1BE54FE5D9144835FE048
    @Disabled()
    @Test()
    void md5Crypt4WhenIAnd1Equals0() {
        /* Branches:
         * (salt == null) : true
         * (ii > 0) : false
         * (ii > 0) : false
         * (i < ROUNDS) : true
         * ((i & 1) != 0) : false
         * (i % 3 != 0) : false
         * (i % 7 != 0) : false
         * ((i & 1) != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        //Act Statement(s)
        String result = Md5Crypt.md5Crypt(byteArray, (String) null, "B", random);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("BC$")));
    }

    //BaseRock generated method id: ${md5Crypt4WhenIModulus3Equals0AndIModulus7Equals0AndIAnd1Equals0}, hash: 64F0ECBF95BEF54A185D450B79F675A6
    @Disabled()
    @Test()
    void md5Crypt4WhenIModulus3Equals0AndIModulus7Equals0AndIAnd1Equals0() {
        /* Branches:
         * (salt == null) : true
         * (ii > 0) : true
         * (ii > 0) : true
         * ((ii & 1) == 1) : false
         * (i < ROUNDS) : true
         * ((i & 1) != 0) : false
         * (i % 3 != 0) : false
         * (i % 7 != 0) : false
         * ((i & 1) != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 1 };
        Random random = new Random();
        //Act Statement(s)
        String result = Md5Crypt.md5Crypt(byteArray, (String) null, "C", random);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("CB$")));
    }

    //BaseRock generated method id: ${md5Crypt4WhenIAnd1Equals0AndIModulus3Equals0AndIModulus7Equals0AndIAnd1Equals0}, hash: 3ABFE143C1EC0AC7A7201177DECEB249
    @Disabled()
    @Test()
    void md5Crypt4WhenIAnd1Equals0AndIModulus3Equals0AndIModulus7Equals0AndIAnd1Equals0() {
        /* Branches:
         * (salt == null) : false
         * (prefix.length() < 3) : false
         * (prefix.charAt(0) != '$') : true
         * (prefix.charAt(prefix.length() - 1) != '$') : false
         * (!m.find()) : false
         * (ii > 0) : true
         * (ii > 0) : true
         * ((ii & 1) == 1) : true
         * (i < ROUNDS) : true
         * ((i & 1) != 0) : false
         * (i % 3 != 0) : false
         * (i % 7 != 0) : false
         * ((i & 1) != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        //Act Statement(s)
        String result = Md5Crypt.md5Crypt(byteArray, "salt1", "prefix1", random);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
