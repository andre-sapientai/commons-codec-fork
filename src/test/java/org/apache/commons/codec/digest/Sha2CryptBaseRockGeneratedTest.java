package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import java.util.Random;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class Sha2CryptBaseRockGeneratedTest {

    //BaseRock generated method id: ${sha256CryptTest}, hash: EC921B6AF21B1BB49F27FA6E22BECE3C
    @Test()
    void sha256CryptTest() {
        //Arrange Statement(s)
        try (MockedStatic<Sha2Crypt> sha2Crypt = mockStatic(Sha2Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            sha2Crypt.when(() -> Sha2Crypt.sha256Crypt(byteArray, (String) null)).thenReturn("return_of_sha256Crypt1");
            //Act Statement(s)
            String result = Sha2Crypt.sha256Crypt(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_sha256Crypt1"));
                sha2Crypt.verify(() -> Sha2Crypt.sha256Crypt(byteArray, (String) null), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha256Crypt1WhenSaltIsNullThrowsIllegalArgumentException}, hash: FE8D1184563417246C108A1185159884
    @Test()
    void sha256Crypt1WhenSaltIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Salt must not be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha256Crypt(byteArray, (String) null);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha256Crypt1WhenMNotFindThrowsIllegalArgumentException}, hash: 3F77CAC3952B1BB2D6082B5D08459CEF
    @Test()
    void sha256Crypt1WhenMNotFindThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha256Crypt(byteArray, (String) null);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha256Crypt1WhenBlocksizeEquals32}, hash: F8ACEDA338AE22A83DA19F136EEAE62B
    @Test()
    void sha256Crypt1WhenBlocksizeEquals32() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : false  #  inside sha2Crypt method
         * (m.group(3) != null) : true  #  inside sha2Crypt method
         * (cnt > blocksize) : true  #  inside sha2Crypt method
         * (cnt > 0) : true  #  inside sha2Crypt method
         * ((cnt & 1) != 0) : true  #  inside sha2Crypt method
         * (i <= keyLen) : true  #  inside sha2Crypt method
         * (cp < keyLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= 16 + (altResult[0] & 0xff)) : true  #  inside sha2Crypt method
         * (cp < saltLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= rounds - 1) : true  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (i % 3 != 0) : false  #  inside sha2Crypt method
         * (i % 7 != 0) : false  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (roundsCustom) : true  #  inside sha2Crypt method
         * (blocksize == 32) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        String result = Sha2Crypt.sha256Crypt(byteArray, (String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${sha256Crypt2WhenSaltIsNullThrowsIllegalArgumentException}, hash: E5C24A56CE468D040CA41AEE2B223927
    @Test()
    void sha256Crypt2WhenSaltIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Salt must not be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha256Crypt(byteArray, (String) null, random);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha256Crypt2WhenMNotFindThrowsIllegalArgumentException}, hash: EB08B7287FAC12298FA2A956C4238E0A
    @Test()
    void sha256Crypt2WhenMNotFindThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha256Crypt(byteArray, (String) null, random);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha256Crypt2WhenBlocksizeEquals32}, hash: 7E3C4AD84FFC84103918FB152D7D9F32
    @Test()
    void sha256Crypt2WhenBlocksizeEquals32() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : false  #  inside sha2Crypt method
         * (m.group(3) != null) : true  #  inside sha2Crypt method
         * (cnt > blocksize) : true  #  inside sha2Crypt method
         * (cnt > 0) : true  #  inside sha2Crypt method
         * ((cnt & 1) != 0) : true  #  inside sha2Crypt method
         * (i <= keyLen) : true  #  inside sha2Crypt method
         * (cp < keyLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= 16 + (altResult[0] & 0xff)) : true  #  inside sha2Crypt method
         * (cp < saltLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= rounds - 1) : true  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (i % 3 != 0) : false  #  inside sha2Crypt method
         * (i % 7 != 0) : false  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (roundsCustom) : true  #  inside sha2Crypt method
         * (blocksize == 32) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        
        //Act Statement(s)
        String result = Sha2Crypt.sha256Crypt(byteArray, (String) null, random);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${sha512CryptTest}, hash: 12B8306B15C72BBD012D7B76EEA25062
    @Test()
    void sha512CryptTest() {
        //Arrange Statement(s)
        try (MockedStatic<Sha2Crypt> sha2Crypt = mockStatic(Sha2Crypt.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            sha2Crypt.when(() -> Sha2Crypt.sha512Crypt(byteArray, (String) null)).thenReturn("return_of_sha512Crypt1");
            //Act Statement(s)
            String result = Sha2Crypt.sha512Crypt(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_sha512Crypt1"));
                sha2Crypt.verify(() -> Sha2Crypt.sha512Crypt(byteArray, (String) null), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512Crypt1WhenSaltIsNullThrowsIllegalArgumentException}, hash: 787B3C3283500A39C1B22838BB6E687F
    @Test()
    void sha512Crypt1WhenSaltIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Salt must not be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha512Crypt(byteArray, (String) null);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha512Crypt1WhenMNotFindThrowsIllegalArgumentException}, hash: 7630AD1CF86B419349F848B771BFED4A
    @Test()
    void sha512Crypt1WhenMNotFindThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha512Crypt(byteArray, (String) null);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha512Crypt1WhenBlocksizeNotEquals32}, hash: 5B5AD282373AA861E4AE24830B622DF2
    @Test()
    void sha512Crypt1WhenBlocksizeNotEquals32() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : false  #  inside sha2Crypt method
         * (m.group(3) != null) : true  #  inside sha2Crypt method
         * (cnt > blocksize) : true  #  inside sha2Crypt method
         * (cnt > 0) : true  #  inside sha2Crypt method
         * ((cnt & 1) != 0) : true  #  inside sha2Crypt method
         * (i <= keyLen) : true  #  inside sha2Crypt method
         * (cp < keyLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= 16 + (altResult[0] & 0xff)) : true  #  inside sha2Crypt method
         * (cp < saltLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= rounds - 1) : true  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (i % 3 != 0) : false  #  inside sha2Crypt method
         * (i % 7 != 0) : false  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (roundsCustom) : true  #  inside sha2Crypt method
         * (blocksize == 32) : false  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        String result = Sha2Crypt.sha512Crypt(byteArray, (String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${sha512Crypt2WhenSaltIsNullThrowsIllegalArgumentException}, hash: 7737F46D068F0EE212FE3257AEED7621
    @Test()
    void sha512Crypt2WhenSaltIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Salt must not be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha512Crypt(byteArray, (String) null, random);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha512Crypt2WhenMNotFindThrowsIllegalArgumentException}, hash: 74023AB7440F1C9C0DB7E057620D474E
    @Test()
    void sha512Crypt2WhenMNotFindThrowsIllegalArgumentException() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : true  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha512Crypt(byteArray, (String) null, random);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${sha512Crypt2WhenBlocksizeNotEquals32}, hash: 6149E1EDE1B2A88277F85C4612D46554
    @Test()
    void sha512Crypt2WhenBlocksizeNotEquals32() {
        /* Branches:
         * (salt == null) : true
         * (salt == null) : false  #  inside sha2Crypt method
         * (!m.find()) : false  #  inside sha2Crypt method
         * (m.group(3) != null) : true  #  inside sha2Crypt method
         * (cnt > blocksize) : true  #  inside sha2Crypt method
         * (cnt > 0) : true  #  inside sha2Crypt method
         * ((cnt & 1) != 0) : true  #  inside sha2Crypt method
         * (i <= keyLen) : true  #  inside sha2Crypt method
         * (cp < keyLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= 16 + (altResult[0] & 0xff)) : true  #  inside sha2Crypt method
         * (cp < saltLen - blocksize) : true  #  inside sha2Crypt method
         * (i <= rounds - 1) : true  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (i % 3 != 0) : false  #  inside sha2Crypt method
         * (i % 7 != 0) : false  #  inside sha2Crypt method
         * ((i & 1) != 0) : false  #  inside sha2Crypt method
         * (roundsCustom) : true  #  inside sha2Crypt method
         * (blocksize == 32) : false  #  inside sha2Crypt method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Random random = new Random();
        
        //Act Statement(s)
        String result = Sha2Crypt.sha512Crypt(byteArray, (String) null, random);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
