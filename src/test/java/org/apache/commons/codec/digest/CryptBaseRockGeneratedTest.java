package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CryptBaseRockGeneratedTest {

    //BaseRock generated method id: ${cryptTest}, hash: DAF40DD27696E1725EB31F606F237570
    @Test()
    void cryptTest() {
        //Arrange Statement(s)
        try (MockedStatic<Crypt> crypt = mockStatic(Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            crypt.when(() -> Crypt.crypt(byteArray, (String) null)).thenReturn("return_of_crypt1");
            //Act Statement(s)
            String result = Crypt.crypt(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_crypt1"));
                crypt.verify(() -> Crypt.crypt(byteArray, (String) null), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${crypt1WhenSaltIsNull}, hash: 55080DC57DADD73D7C3FA3D2EFE1B464
    @Disabled()
    @Test()
    void crypt1WhenSaltIsNull() {
        /* Branches:
         * (salt == null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = Crypt.crypt(byteArray, (String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("$6$R7tjFBwx$D6LstYdFCgsXtpWP.ydf4g6sMelmTmwaDf4HrLBvErNaVegZ/dbxCK6H3KWBuTOxY38S4V9qZQgHIZZ0N/7Kc0")));
    }

    //BaseRock generated method id: ${crypt1WhenSaltStartsWithSha2CryptSHA512_PREFIX}, hash: 3CDA6E3978691EF39CC65367D622A44D
    @Disabled()
    @Test()
    void crypt1WhenSaltStartsWithSha2CryptSHA512_PREFIX() {
        /* Branches:
         * (salt == null) : false
         * (salt.startsWith(Sha2Crypt.SHA512_PREFIX)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = Crypt.crypt(byteArray, "$6$");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${crypt1WhenSaltStartsWithSha2CryptSHA256_PREFIX}, hash: F40CA2CD39DF863C00A0B7A34185E8BA
    @Disabled()
    @Test()
    void crypt1WhenSaltStartsWithSha2CryptSHA256_PREFIX() {
        /* Branches:
         * (salt == null) : false
         * (salt.startsWith(Sha2Crypt.SHA512_PREFIX)) : false
         * (salt.startsWith(Sha2Crypt.SHA256_PREFIX)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = Crypt.crypt(byteArray, "$5$");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${crypt1WhenSaltStartsWithMd5CryptMD5_PREFIX}, hash: 9269038C0557E2219EDC4905CB114606
    @Disabled()
    @Test()
    void crypt1WhenSaltStartsWithMd5CryptMD5_PREFIX() {
        /* Branches:
         * (salt == null) : false
         * (salt.startsWith(Sha2Crypt.SHA512_PREFIX)) : false
         * (salt.startsWith(Sha2Crypt.SHA256_PREFIX)) : false
         * (salt.startsWith(Md5Crypt.MD5_PREFIX)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = Crypt.crypt(byteArray, "$1$");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${crypt1WhenSaltNotStartsWithMd5CryptMD5_PREFIX}, hash: DF0EC08CB4C7FC681BF242A42B1F89B1
    @Disabled()
    @Test()
    void crypt1WhenSaltNotStartsWithMd5CryptMD5_PREFIX() {
        /* Branches:
         * (salt == null) : false
         * (salt.startsWith(Sha2Crypt.SHA512_PREFIX)) : false
         * (salt.startsWith(Sha2Crypt.SHA256_PREFIX)) : false
         * (salt.startsWith(Md5Crypt.MD5_PREFIX)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = Crypt.crypt(byteArray, "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${crypt2Test}, hash: 7EF44363EBC7D2E6EC6C9BD98A425EF7
    @Test()
    void crypt2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Crypt> crypt = mockStatic(Crypt.class, CALLS_REAL_METHODS)) {
            crypt.when(() -> Crypt.crypt("key1", (String) null)).thenReturn("return_of_crypt1");
            //Act Statement(s)
            String result = Crypt.crypt("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_crypt1"));
                crypt.verify(() -> Crypt.crypt("key1", (String) null), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${crypt3Test}, hash: 0C0B6D083FBC1B4C58891C9D26C97D76
    @Test()
    void crypt3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Crypt> crypt = mockStatic(Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 107, (byte) 101, (byte) 121, (byte) 49 };
            crypt.when(() -> Crypt.crypt(byteArray, "salt1")).thenReturn("return_of_crypt1");
            //Act Statement(s)
            String result = Crypt.crypt("key1", "salt1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_crypt1"));
                crypt.verify(() -> Crypt.crypt(byteArray, "salt1"), atLeast(1));
            });
        }
    }
}
