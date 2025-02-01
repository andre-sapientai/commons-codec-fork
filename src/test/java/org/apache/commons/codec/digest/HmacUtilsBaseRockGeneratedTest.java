package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import javax.crypto.Mac;
import java.security.GeneralSecurityException;
import org.mockito.MockedStatic;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import javax.crypto.spec.SecretKeySpec;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HmacUtilsBaseRockGeneratedTest {

    private final Mac macMock = mock(Mac.class);

    //BaseRock generated method id: ${getHmacMd5Test}, hash: C5A802542CA824F8DCCC0A204BDF2C2F
    @Disabled()
    @Test()
    void getHmacMd5Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_MD5, byteArray)).thenReturn(macMock);
            //Act Statement(s)
            Mac result = HmacUtils.getHmacMd5(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(macMock));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_MD5, byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getHmacSha1Test}, hash: 73374D73A11A68397E530C54E8BFF2EA
    @Disabled()
    @Test()
    void getHmacSha1Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_1, byteArray)).thenReturn(macMock);
            //Act Statement(s)
            Mac result = HmacUtils.getHmacSha1(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(macMock));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_1, byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getHmacSha256Test}, hash: E86C72E742C171608FBFBE3C288A7E94
    @Disabled()
    @Test()
    void getHmacSha256Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_256, byteArray)).thenReturn(macMock);
            //Act Statement(s)
            Mac result = HmacUtils.getHmacSha256(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(macMock));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_256, byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getHmacSha384Test}, hash: 96E3BA34167A7CD533C6225557BE62D2
    @Disabled()
    @Test()
    void getHmacSha384Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_384, byteArray)).thenReturn(macMock);
            //Act Statement(s)
            Mac result = HmacUtils.getHmacSha384(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(macMock));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_384, byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getHmacSha512Test}, hash: 7BC0874D5E5BBC959BE785C87CBA720F
    @Disabled()
    @Test()
    void getHmacSha512Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_512, byteArray)).thenReturn(macMock);
            //Act Statement(s)
            Mac result = HmacUtils.getHmacSha512(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(macMock));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_512, byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getInitializedMacTest}, hash: A19F924130A6868D5A56C00555E95AFE
    @Disabled()
    @Test()
    void getInitializedMacTest() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            Mac result = HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_1, byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(macMock));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getInitializedMac1WhenKeyIsNullThrowsIllegalArgumentException}, hash: F393E35967ED7D6CF9220AC377520BEC
    @Disabled()
    @Test()
    void getInitializedMac1WhenKeyIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (key == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Null key");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            HmacUtils.getInitializedMac("algorithm1", _byte);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${getInitializedMac1WhenKeyIsNotNull}, hash: 33EA250A7CD978E02CE81DB84AFF0CEA
    @Disabled()
    @Test()
    void getInitializedMac1WhenKeyIsNotNull() {
        /* Branches:
         * (key == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        Mac result = HmacUtils.getInitializedMac("A", byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${getInitializedMac1WhenCaughtNoSuchAlgorithmExceptionOrInvalidKeyExceptionThrowsIllegalArgumentException}, hash: 7F96C5F4C3BE09918467791C2BF79A27
    @Disabled()
    @Test()
    void getInitializedMac1WhenCaughtNoSuchAlgorithmExceptionOrInvalidKeyExceptionThrowsIllegalArgumentException() throws InvalidKeyException, NoSuchAlgorithmException {
        /* Branches:
         * (key == null) : false
         * (catch-exception (NoSuchAlgorithmException | InvalidKeyException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Mac> mac = mockStatic(Mac.class)) {
            mac.when(() -> Mac.getInstance("A")).thenReturn(macMock);
            doNothing().when(macMock).init((SecretKeySpec) any());
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                HmacUtils.getInitializedMac("A", byteArray);
            });
            GeneralSecurityException generalSecurityException = new GeneralSecurityException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(generalSecurityException.getClass())));
                mac.verify(() -> Mac.getInstance("A"), atLeast(1));
                verify(macMock).init((SecretKeySpec) any());
            });
        }
    }

    //BaseRock generated method id: ${hmacMd5Test}, hash: 5E671C1DC6C268059A3557D29604ACC8
    @Disabled()
    @Test()
    void hmacMd5Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            byte[] result = HmacUtils.hmacMd5(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacMd51Test}, hash: 1DF780ABB52FE6BC5127856E0BB117C6
    @Disabled()
    @Test()
    void hmacMd51Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            byte[] result = HmacUtils.hmacMd5(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacMd52Test}, hash: 483A4DE727BABB7C543F67A4C8BCEB81
    @Disabled()
    @Test()
    void hmacMd52Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            byte[] result = HmacUtils.hmacMd5("A", "valueToDigest1");
            byte[] byteResultArray = new byte[] { (byte) -104, (byte) 107, (byte) 43, (byte) 98, (byte) 68, (byte) 107, (byte) -59, (byte) 6, (byte) -64, (byte) -18, (byte) 78, (byte) 49, (byte) 98, (byte) 65, (byte) 22, (byte) -19 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacMd5HexTest}, hash: A5A2D8F8F1F618E1E8A527A796D07542
    @Disabled()
    @Test()
    void hmacMd5HexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            String result = HmacUtils.hmacMd5Hex(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacMd5Hex1Test}, hash: 326B7E715633F24E8AF7F29975C8090A
    @Disabled()
    @Test()
    void hmacMd5Hex1Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            String result = HmacUtils.hmacMd5Hex(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacMd5Hex2Test}, hash: A679C42E0CE2800CDF16C6744B1CC8C6
    @Disabled()
    @Test()
    void hmacMd5Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            String result = HmacUtils.hmacMd5Hex("A", "valueToDigest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("986b2b62446bc506c0ee4e31624116ed"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacMD5", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha1Test}, hash: F19B70AF65935661DDB682AB5DB52A8E
    @Disabled()
    @Test()
    void hmacSha1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha1(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha11Test}, hash: C9EEA6425C41DC3C06893AED7AC278DB
    @Disabled()
    @Test()
    void hmacSha11Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha1(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha12Test}, hash: 035A84415428DC7E5BCD790D355F53A8
    @Disabled()
    @Test()
    void hmacSha12Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha1("A", "valueToDigest1");
            byte[] byteResultArray = new byte[] { (byte) -91, (byte) 71, (byte) 110, (byte) -81, (byte) 26, (byte) 80, (byte) 28, (byte) -54, (byte) 120, (byte) 19, (byte) -2, (byte) -120, (byte) 37, (byte) -55, (byte) 106, (byte) 109, (byte) -74, (byte) 27, (byte) 38, (byte) -88 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha1HexTest}, hash: 63E429CC9387EAE8D67D839B47FBC85E
    @Disabled()
    @Test()
    void hmacSha1HexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            String result = HmacUtils.hmacSha1Hex(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha1Hex1Test}, hash: 1D5BE33AEF496C6EE072D63F108202F7
    @Disabled()
    @Test()
    void hmacSha1Hex1Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            String result = HmacUtils.hmacSha1Hex(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha1Hex2Test}, hash: 0ADC0E51E47FDCE224F29FA515ECD0B5
    @Disabled()
    @Test()
    void hmacSha1Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            String result = HmacUtils.hmacSha1Hex("A", "valueToDigest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("a5476eaf1a501cca7813fe8825c96a6db61b26a8"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA1", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha256Test}, hash: 225A4C1C5002A0F78AFC14A2C60DBCF6
    @Disabled()
    @Test()
    void hmacSha256Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha256(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha2561Test}, hash: 604022A72DC15B080C40D6C7D5C8CF98
    @Disabled()
    @Test()
    void hmacSha2561Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha256(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha2562Test}, hash: 4A50CE6BAE248252F4555086B237332B
    @Disabled()
    @Test()
    void hmacSha2562Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha256("A", "valueToDigest1");
            byte[] byteResultArray = new byte[] { (byte) 73, (byte) 26, (byte) 65, (byte) -112, (byte) 109, (byte) 121, (byte) 109, (byte) 16, (byte) -106, (byte) -28, (byte) -37, (byte) 79, (byte) 96, (byte) -38, (byte) 86, (byte) -90, (byte) -48, (byte) -51, (byte) 53, (byte) 103, (byte) 87, (byte) 70, (byte) 27, (byte) 85, (byte) 62, (byte) 12, (byte) -50, (byte) 101, (byte) -94, (byte) 15, (byte) 50, (byte) -27 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha256HexTest}, hash: 9E7C46BC1A51C9C00A73732E526E9DA5
    @Disabled()
    @Test()
    void hmacSha256HexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            String result = HmacUtils.hmacSha256Hex(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha256Hex1Test}, hash: FF8988DFF99305F8590824DD4A7AF77B
    @Disabled()
    @Test()
    void hmacSha256Hex1Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            String result = HmacUtils.hmacSha256Hex(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha256Hex2Test}, hash: 04865A4A7DDB9BD60F6AADDCF48C9F0F
    @Disabled()
    @Test()
    void hmacSha256Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            String result = HmacUtils.hmacSha256Hex("A", "valueToDigest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("491a41906d796d1096e4db4f60da56a6d0cd356757461b553e0cce65a20f32e5"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA256", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha384Test}, hash: 9C7E9E241DD7AA6912131353C46DDDA7
    @Disabled()
    @Test()
    void hmacSha384Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha384(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha3841Test}, hash: 0FC4B2117B25BFC06C9B9D8842AABE82
    @Disabled()
    @Test()
    void hmacSha3841Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha384(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha3842Test}, hash: 3F7761DCD5600AF1D87107E7EE42C776
    @Disabled()
    @Test()
    void hmacSha3842Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha384("A", "valueToDigest1");
            byte[] byteResultArray = new byte[] { (byte) 72, (byte) 50, (byte) -118, (byte) -23, (byte) 64, (byte) 106, (byte) 29, (byte) 110, (byte) -97, (byte) 89, (byte) 71, (byte) -72, (byte) -62, (byte) -112, (byte) 114, (byte) 20, (byte) -11, (byte) 33, (byte) 54, (byte) -5, (byte) -6, (byte) 75, (byte) 125, (byte) 94, (byte) -127, (byte) 89, (byte) 108, (byte) -75, (byte) 113, (byte) -7, (byte) 103, (byte) 18, (byte) 94, (byte) 62, (byte) 35, (byte) 103, (byte) 83, (byte) 29, (byte) 90, (byte) 115, (byte) 118, (byte) 61, (byte) 79, (byte) 48, (byte) -47, (byte) 11, (byte) 67, (byte) 50 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha384HexTest}, hash: E45F8786DFCA6035B0CED4384E418897
    @Disabled()
    @Test()
    void hmacSha384HexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            String result = HmacUtils.hmacSha384Hex(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha384Hex1Test}, hash: B3A2B358A5735570036D68A10E40CF38
    @Disabled()
    @Test()
    void hmacSha384Hex1Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            String result = HmacUtils.hmacSha384Hex(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha384Hex2Test}, hash: 1818D0D481D2776A733BF4892B12A97A
    @Disabled()
    @Test()
    void hmacSha384Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            String result = HmacUtils.hmacSha384Hex("A", "valueToDigest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("48328ae9406a1d6e9f5947b8c2907214f52136fbfa4b7d5e81596cb571f967125e3e2367531d5a73763d4f30d10b4332"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA384", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha512Test}, hash: 9C1548050A179591E998567C7D5EF630
    @Disabled()
    @Test()
    void hmacSha512Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha512(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha5121Test}, hash: D2340F437FB05F0467B707A72852AC4B
    @Disabled()
    @Test()
    void hmacSha5121Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmac
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha512(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha5122Test}, hash: 6DC6DFC41B3A0C53A6075A1528F31213
    @Disabled()
    @Test()
    void hmacSha5122Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            byte[] result = HmacUtils.hmacSha512("A", "valueToDigest1");
            byte[] byteResultArray = new byte[] { (byte) 9, (byte) 103, (byte) -49, (byte) 47, (byte) -99, (byte) 85, (byte) 118, (byte) -32, (byte) -67, (byte) -42, (byte) -96, (byte) 87, (byte) -85, (byte) -42, (byte) 55, (byte) -104, (byte) 32, (byte) -33, (byte) -102, (byte) 76, (byte) 3, (byte) 108, (byte) -98, (byte) 5, (byte) 72, (byte) 15, (byte) 43, (byte) 38, (byte) -57, (byte) 110, (byte) -109, (byte) 91, (byte) 120, (byte) 13, (byte) 124, (byte) -20, (byte) -37, (byte) 18, (byte) -90, (byte) 22, (byte) 64, (byte) 28, (byte) -116, (byte) -51, (byte) -15, (byte) 46, (byte) -51, (byte) -70, (byte) 83, (byte) 84, (byte) 30, (byte) 51, (byte) 65, (byte) -113, (byte) -75, (byte) 91, (byte) 9, (byte) 79, (byte) -95, (byte) 26, (byte) -110, (byte) 69, (byte) -65, (byte) -124 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha512HexTest}, hash: 6D33AAE46340EA1EE646F964BB095384
    @Disabled()
    @Test()
    void hmacSha512HexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray)).thenReturn(macMock);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            String result = HmacUtils.hmacSha512Hex(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha512Hex1Test}, hash: 2A8470DD44EAE3B083E6C45AE1B5CF53
    @Disabled()
    @Test()
    void hmacSha512Hex1Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type HmacUtils - Method: hmacHex
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray)).thenReturn(macMock);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //Act Statement(s)
            String result = HmacUtils.hmacSha512Hex(byteArray, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hmacSha512Hex2Test}, hash: 3283AE7809681BCD9ED4592543AC8459
    @Disabled()
    @Test()
    void hmacSha512Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<HmacUtils> hmacUtils = mockStatic(HmacUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            hmacUtils.when(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray)).thenReturn(macMock);
            //Act Statement(s)
            String result = HmacUtils.hmacSha512Hex("A", "valueToDigest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("0967cf2f9d5576e0bdd6a057abd6379820df9a4c036c9e05480f2b26c76e935b780d7cecdb12a616401c8ccdf12ecdba53541e33418fb55b094fa11a9245bf84"));
                hmacUtils.verify(() -> HmacUtils.getInitializedMac("HmacSHA512", byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isAvailableTest}, hash: 520E4D1EA79E155AA44CE9842B022A2C
    @Disabled()
    @Test()
    void isAvailableTest() {
        //Act Statement(s)
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isAvailableWhenCaughtNoSuchAlgorithmException}, hash: 49FA58978B1438A0E75942DAAE68DFA1
    @Disabled()
    @Test()
    void isAvailableWhenCaughtNoSuchAlgorithmException() throws NoSuchAlgorithmException {
        /* Branches:
         * (catch-exception (NoSuchAlgorithmException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Mac> mac = mockStatic(Mac.class)) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
            mac.when(() -> Mac.getInstance("HmacSHA1")).thenThrow(noSuchAlgorithmException);
            //Act Statement(s)
            boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                mac.verify(() -> Mac.getInstance("HmacSHA1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isAvailable1Test}, hash: 5B8C2C3B19FB50430C4B4C1C9212A7F2
    @Disabled()
    @Test()
    void isAvailable1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = HmacUtils.isAvailable("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isAvailable1WhenCaughtNoSuchAlgorithmException}, hash: 292AFBD4699F8785C795F44467F4BBB0
    @Disabled()
    @Test()
    void isAvailable1WhenCaughtNoSuchAlgorithmException() throws NoSuchAlgorithmException {
        /* Branches:
         * (catch-exception (NoSuchAlgorithmException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Mac> mac = mockStatic(Mac.class)) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
            mac.when(() -> Mac.getInstance("name1")).thenThrow(noSuchAlgorithmException);
            //Act Statement(s)
            boolean result = HmacUtils.isAvailable("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                mac.verify(() -> Mac.getInstance("name1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${updateHmacTest}, hash: 30819891D3D12B35B66247ACDF7CD458
    @Disabled()
    @Test()
    void updateHmacTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        Mac result = HmacUtils.updateHmac(macMock, byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(macMock)));
    }

    //BaseRock generated method id: ${updateHmac1WhenReadGreaterThanMinus1}, hash: 70843BE555A0A38CC38B8A62DBFF18CE
    @Disabled()
    @Test()
    void updateHmac1WhenReadGreaterThanMinus1() throws IOException {
        /* Branches:
         * (read > -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        Mac result = HmacUtils.updateHmac(macMock, inputStream);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(macMock)));
    }

    //BaseRock generated method id: ${updateHmac2Test}, hash: B8CB97D71236409C5CFEFC3DF1823181
    @Disabled()
    @Test()
    void updateHmac2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Mac result = HmacUtils.updateHmac(macMock, "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(macMock)));
    }

    //BaseRock generated method id: ${hmacTest}, hash: B86C28B8339D257915DC89AB45081B85
    @Disabled()
    @Test()
    void hmacTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        byte[] byteArray2 = new byte[] {};
        //Act Statement(s)
        byte[] result = target.hmac(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${hmac1Test}, hash: B31B3375EF60BFF8A2F93377B82F8F06
    @Disabled()
    @Test()
    void hmac1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        byte[] result = target.hmac(byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${hmac2Test}, hash: 94A746591913E5F93560916B6E0EA444
    @Disabled()
    @Test()
    void hmac2Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = spy(new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray));
        byte[] byteArray2 = new byte[] {};
        BufferedInputStream bufferedInputStream = mock(BufferedInputStream.class);
        doReturn(byteArray2).when(target).hmac(bufferedInputStream);
        File file = new File("pathname1");
        //Act Statement(s)
        byte[] result = target.hmac(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray2));
            verify(target).hmac(bufferedInputStream);
        });
    }

    //BaseRock generated method id: ${hmac2WhenDefaultBranchThrowsThrowable}, hash: 8D9AC98EE16C77DC66E4181B99808D55
    @Disabled()
    @Test()
    void hmac2WhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 974)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = spy(new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray));
        byte[] byteArray2 = new byte[] {};
        BufferedInputStream bufferedInputStream = mock(BufferedInputStream.class);
        doReturn(byteArray2).when(target).hmac(bufferedInputStream);
        File file = new File("pathname1");
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.hmac(file);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).hmac(bufferedInputStream);
        });
    }

    //BaseRock generated method id: ${hmac3WhenReadAssignedValueToDigestReadBuffer0STREAM_BUFFER_LENGTHGreaterThanMinus1}, hash: CD54F133F91850FD699DD307A4D4711E
    @Disabled()
    @Test()
    void hmac3WhenReadAssignedValueToDigestReadBuffer0STREAM_BUFFER_LENGTHGreaterThanMinus1() throws IOException {
        /* Branches:
         * ((read = valueToDigest.read(buffer, 0, STREAM_BUFFER_LENGTH)) > -1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        byte[] result = target.hmac(inputStream);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${hmac4Test}, hash: 13CC5BC9560CED41BB9DB3BF5E3FD781
    @Disabled()
    @Test()
    void hmac4Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        //Act Statement(s)
        byte[] result = target.hmac("B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${hmacHexTest}, hash: 916DEC60652C24C9F7AD3B7525BDA110
    @Disabled()
    @Test()
    void hmacHexTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        byte[] byteArray2 = new byte[] {};
        //Act Statement(s)
        String result = target.hmacHex(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //BaseRock generated method id: ${hmacHex1Test}, hash: 2166ACAF756F2A9B287B5E5F9BFFE27E
    @Disabled()
    @Test()
    void hmacHex1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        String result = target.hmacHex(byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //BaseRock generated method id: ${hmacHex2Test}, hash: 31B7F2E383BA7BE5B693170A63DC2D1B
    @Disabled()
    @Test()
    void hmacHex2Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = spy(new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray));
        byte[] byteArray2 = new byte[] {};
        File file = new File("pathname1");
        doReturn(byteArray2).when(target).hmac(file);
        //Act Statement(s)
        String result = target.hmacHex(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).hmac(file);
        });
    }

    //BaseRock generated method id: ${hmacHex3Test}, hash: D34DF959570E76EACCEA05D55A69CFDD
    @Disabled()
    @Test()
    void hmacHex3Test() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = spy(new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray));
        byte[] byteArray2 = new byte[] {};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        doReturn(byteArray2).when(target).hmac(inputStream);
        //Act Statement(s)
        String result = target.hmacHex(inputStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).hmac(inputStream);
        });
    }

    //BaseRock generated method id: ${hmacHex4Test}, hash: 150801BF51AF12EAF8CD662A1BED22F7
    @Disabled()
    @Test()
    void hmacHex4Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class javax.crypto.spec.SecretKeySpec
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        HmacUtils target = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, byteArray);
        //Act Statement(s)
        String result = target.hmacHex("B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }
}
