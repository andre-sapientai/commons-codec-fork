package org.apache.commons.codec.binary;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.CodecPolicy;
import java.math.BigInteger;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class Base64BaseRockGeneratedTest {

    private final BaseNCodec.Context baseNCodecContextMock = mock(BaseNCodec.Context.class);

    //BaseRock generated method id: ${builderTest}, hash: 5F371D259682F25EF8F9321A0E87F396
    @Disabled()
    @Test()
    void builderTest() {
        //Act Statement(s)
        Base64.Builder result = Base64.builder();
        //Assert statement(s)
        //TODO: Please implement equals method in Builder for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decodeBase64WhenNotUrlSafe}, hash: 0B9D1C25DCC45710A2A849C0406D53B6
    @Disabled()
    @Test()
    void decodeBase64WhenNotUrlSafe() {
        /* Branches:
         * (urlSafe) : false  #  inside toUrlSafeEncodeTable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = Base64.decodeBase64(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${decodeBase641WhenNotUrlSafe}, hash: 8326541149B9BFC1234D66FE09B368D8
    @Disabled()
    @Test()
    void decodeBase641WhenNotUrlSafe() {
        /* Branches:
         * (urlSafe) : false  #  inside toUrlSafeEncodeTable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = Base64.decodeBase64("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${decodeIntegerTest}, hash: 5F4B50A194C24AD87054243CD2356081
    @Disabled()
    @Test()
    void decodeIntegerTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.decodeBase64(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            BigInteger result = Base64.decodeInteger(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(new BigInteger("0")));
                base64.verify(() -> Base64.decodeBase64(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase64Test}, hash: DD61DFD1B5F328A68B48B3912F851684
    @Disabled()
    @Test()
    void encodeBase64Test() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, false)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Base64.encodeBase64(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                base64.verify(() -> Base64.encodeBase64(byteArray2, false), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase641Test}, hash: EEB79F5D26A63128D3BBBBA98C2CD0B7
    @Disabled()
    @Test()
    void encodeBase641Test() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, false, false)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Base64.encodeBase64(byteArray2, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                base64.verify(() -> Base64.encodeBase64(byteArray2, false, false), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase642Test}, hash: 33AD7EF34AF1B47BCE6354E66E2BAAB6
    @Disabled()
    @Test()
    void encodeBase642Test() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, false, false, 2147483647)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Base64.encodeBase64(byteArray2, false, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                base64.verify(() -> Base64.encodeBase64(byteArray2, false, false, 2147483647), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase643WhenBinaryCodecIsEmptyBinaryData}, hash: 047F16DD7BC396BA6A5D1B16E9755F70
    @Disabled()
    @Test()
    void encodeBase643WhenBinaryCodecIsEmptyBinaryData() {
        /* Branches:
         * (BinaryCodec.isEmpty(binaryData)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = Base64.encodeBase64(byteArray, false, false, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray)));
    }

    //BaseRock generated method id: ${encodeBase643WhenLenGreaterThanMaxResultSizeThrowsIllegalArgumentException}, hash: EF58FB06ADCA795A7D063BDC50436825
    @Disabled()
    @Test()
    void encodeBase643WhenLenGreaterThanMaxResultSizeThrowsIllegalArgumentException() {
        /* Branches:
         * (BinaryCodec.isEmpty(binaryData)) : false
         * (isChunked) : true
         * (urlSafe) : true  #  inside toUrlSafeEncodeTable method
         * (len > maxResultSize) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Input array too big, the output array would be bigger (8) than the specified maximum size of 2");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Base64.encodeBase64(byteArray, true, true, 2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${encodeBase643WhenNotUrlSafeAndLenNotGreaterThanMaxResultSize}, hash: F6708EBBD2A0F9B7117E2C1560FC2688
    @Disabled()
    @Test()
    void encodeBase643WhenNotUrlSafeAndLenNotGreaterThanMaxResultSize() {
        /* Branches:
         * (BinaryCodec.isEmpty(binaryData)) : false
         * (isChunked) : true
         * (urlSafe) : false  #  inside toUrlSafeEncodeTable method
         * (len > maxResultSize) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = Base64.encodeBase64(byteArray, true, false, 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeBase643WhenUrlSafeAndLenNotGreaterThanMaxResultSize}, hash: F8E8F36BE787D78C1750F5ABDFCD2E95
    @Disabled()
    @Test()
    void encodeBase643WhenUrlSafeAndLenNotGreaterThanMaxResultSize() {
        /* Branches:
         * (BinaryCodec.isEmpty(binaryData)) : false
         * (isChunked) : false
         * (urlSafe) : true  #  inside toUrlSafeEncodeTable method
         * (len > maxResultSize) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = Base64.encodeBase64(byteArray, false, true, 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeBase643WhenNotIsChunkedAndNotUrlSafeAndLenNotGreaterThanMaxResultSize}, hash: 9F136070AD7C6AFE856208D2515D9ECA
    @Disabled()
    @Test()
    void encodeBase643WhenNotIsChunkedAndNotUrlSafeAndLenNotGreaterThanMaxResultSize() {
        /* Branches:
         * (BinaryCodec.isEmpty(binaryData)) : false
         * (isChunked) : false
         * (urlSafe) : false  #  inside toUrlSafeEncodeTable method
         * (len > maxResultSize) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = Base64.encodeBase64(byteArray, false, false, 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeBase64ChunkedTest}, hash: 4ED4211DD7E53C998DD7C2C513DC58C0
    @Disabled()
    @Test()
    void encodeBase64ChunkedTest() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, true)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Base64.encodeBase64Chunked(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                base64.verify(() -> Base64.encodeBase64(byteArray2, true), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase64StringTest}, hash: 1CA10692D64DFDA19F787C23BD6A3D27
    @Disabled()
    @Test()
    void encodeBase64StringTest() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, false)).thenReturn(byteArray);
            //Act Statement(s)
            String result = Base64.encodeBase64String(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                base64.verify(() -> Base64.encodeBase64(byteArray2, false), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase64URLSafeTest}, hash: C1FC294904C58A5CFC440270B7DB7538
    @Disabled()
    @Test()
    void encodeBase64URLSafeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, false, true)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Base64.encodeBase64URLSafe(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                base64.verify(() -> Base64.encodeBase64(byteArray2, false, true), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeBase64URLSafeStringTest}, hash: 1DBDB0D8E84C754B6D8D8D9B825B9457
    @Disabled()
    @Test()
    void encodeBase64URLSafeStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray2, false, true)).thenReturn(byteArray);
            //Act Statement(s)
            String result = Base64.encodeBase64URLSafeString(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                base64.verify(() -> Base64.encodeBase64(byteArray2, false, true), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeIntegerTest}, hash: 97D78F2BBCE5E870FE25A93CD6CA8D25
    @Disabled()
    @Test()
    void encodeIntegerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            base64.when(() -> Base64.toIntegerBytes(new BigInteger("0"))).thenReturn(byteArray);
            byte[] byteArray2 = new byte[] {};
            base64.when(() -> Base64.encodeBase64(byteArray, false)).thenReturn(byteArray2);
            //Act Statement(s)
            byte[] result = Base64.encodeInteger(new BigInteger("0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray2));
                base64.verify(() -> Base64.toIntegerBytes(new BigInteger("0")), atLeast(1));
                base64.verify(() -> Base64.encodeBase64(byteArray, false), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isArrayByteBase64WhenIsBase64ArrayOctet}, hash: E459825A0C5397CD5C7796F71F5291DB
    @Disabled()
    @Test()
    void isArrayByteBase64WhenIsBase64ArrayOctet() {
        /* Branches:
         * (isBase64(arrayOctet)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            base64.when(() -> Base64.isBase64(byteArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = Base64.isArrayByteBase64(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                base64.verify(() -> Base64.isBase64(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isArrayByteBase64WhenIsBase64NotArrayOctet}, hash: 651935812EB66A72B638F3C24D7457E7
    @Disabled()
    @Test()
    void isArrayByteBase64WhenIsBase64NotArrayOctet() {
        /* Branches:
         * (isBase64(arrayOctet)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            base64.when(() -> Base64.isBase64(byteArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = Base64.isArrayByteBase64(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                base64.verify(() -> Base64.isBase64(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isBase64WhenOctetIndexOfDECODE_TABLENotEqualsMinus1}, hash: 618A88B0E10C77FAB34F20B10F9EF10A
    @Disabled()
    @Test()
    void isBase64WhenOctetIndexOfDECODE_TABLENotEqualsMinus1() {
        /* Branches:
         * (octet == PAD_DEFAULT) : false
         * (octet >= 0) : true
         * (octet < DECODE_TABLE.length) : true
         * (DECODE_TABLE[octet] != -1) : true
         */
        //Act Statement(s)
        boolean result = Base64.isBase64((byte) 48);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isBase64WhenOctetIndexOfDECODE_TABLEEqualsMinus1}, hash: D24EDB719F0A70A3D60D6704239D0B1E
    @Disabled()
    @Test()
    void isBase64WhenOctetIndexOfDECODE_TABLEEqualsMinus1() {
        /* Branches:
         * (octet == PAD_DEFAULT) : false
         * (octet >= 0) : true
         * (octet < DECODE_TABLE.length) : true
         * (DECODE_TABLE[octet] != -1) : false
         */
        //Act Statement(s)
        boolean result = Base64.isBase64((byte) 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${isBase641WhenCharacterNotIsWhitespaceElement}, hash: B66C56C1458CC524953EECB053A96523
    @Disabled()
    @Test()
    void isBase641WhenCharacterNotIsWhitespaceElement() {
        /* Branches:
         * (for-each(arrayOctet)) : true
         * (!isBase64(element)) : true
         * (!Character.isWhitespace(element)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            base64.when(() -> Base64.isBase64((byte) 1)).thenReturn(false);
            byte[] byteArray = new byte[] { (byte) 1 };
            //Act Statement(s)
            boolean result = Base64.isBase64(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                base64.verify(() -> Base64.isBase64((byte) 1), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isBase641WhenCharacterIsWhitespaceElement}, hash: E43628BF5B7E974894E5E949173077DE
    @Disabled()
    @Test()
    void isBase641WhenCharacterIsWhitespaceElement() {
        /* Branches:
         * (for-each(arrayOctet)) : true
         * (!isBase64(element)) : true
         * (!Character.isWhitespace(element)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            base64.when(() -> Base64.isBase64((byte) 0)).thenReturn(false);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            boolean result = Base64.isBase64(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                base64.verify(() -> Base64.isBase64((byte) 0), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isBase642WhenIsBase64StringUtilsGetBytesUtf8Base64}, hash: ED4A88E7D7001F5BCDADD75BF30803DA
    @Disabled()
    @Test()
    void isBase642WhenIsBase64StringUtilsGetBytesUtf8Base64() {
        /* Branches:
         * (isBase64(StringUtils.getBytesUtf8(base64))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            base64.when(() -> Base64.isBase64(byteArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = Base64.isBase64("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                base64.verify(() -> Base64.isBase64(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isBase642WhenIsBase64NotStringUtilsGetBytesUtf8Base64}, hash: 616C35E8E59CC94402AB761FD88DA17C
    @Disabled()
    @Test()
    void isBase642WhenIsBase64NotStringUtilsGetBytesUtf8Base64() {
        /* Branches:
         * (isBase64(StringUtils.getBytesUtf8(base64))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Base64> base64 = mockStatic(Base64.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 65 };
            base64.when(() -> Base64.isBase64(byteArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = Base64.isBase64("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                base64.verify(() -> Base64.isBase64(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toIntegerBytesWhenBigIntBitLengthDividedBy8Plus1EqualsBitlenDividedBy8}, hash: CE8C0D6A029E4A9FAE3A6D9E2E88629E
    @Disabled()
    @Test()
    void toIntegerBytesWhenBigIntBitLengthDividedBy8Plus1EqualsBitlenDividedBy8() {
        /* Branches:
         * (bigInt.bitLength() % 8 != 0) : true
         * (bigInt.bitLength() / 8 + 1 == bitlen / 8) : true
         */
        //Act Statement(s)
        byte[] result = Base64.toIntegerBytes(new BigInteger("1"));
        byte[] byteResultArray = new byte[] { (byte) 1 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${toIntegerBytesWhenBigIntBitLengthDividedBy8Plus1NotEqualsBitlenDividedBy8AndBigIntBitLengthModulus8Equals0}, hash: D3F0F96DC4118278BED2CCF623BB410C
    @Disabled()
    @Test()
    void toIntegerBytesWhenBigIntBitLengthDividedBy8Plus1NotEqualsBitlenDividedBy8AndBigIntBitLengthModulus8Equals0() {
        /* Branches:
         * (bigInt.bitLength() % 8 != 0) : true
         * (bigInt.bitLength() / 8 + 1 == bitlen / 8) : false
         * (bigInt.bitLength() % 8 == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = Base64.toIntegerBytes(new BigInteger("0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${decode1WhenContextModulusEquals0}, hash: 1DC678753258C5C26B5FE110D8E2C411
    @Disabled()
    @Test()
    void decode1WhenContextModulusEquals0() {
        /* Branches:
         * (context.eof) : false
         * (inAvail < 0) : true
         * (i < inAvail) : false
         * (context.eof) : true
         * (context.modulus != 0) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = new Base64(0, byteArray, true, CodecPolicy.STRICT);
        byte[] byteArray2 = new byte[] {};
        //Act Statement(s)
        target.decode(byteArray2, 0, -1, baseNCodecContextMock);
    }

    //BaseRock generated method id: ${decode1WhenContextEofAndContextModulusEquals0}, hash: 65C5DF0FA1B765A05633D524A6BAF41F
    @Disabled()
    @Test()
    void decode1WhenContextEofAndContextModulusEquals0() {
        /* Branches:
         * (context.eof) : false
         * (inAvail < 0) : false
         * (i < inAvail) : true
         * (b == pad) : true
         * (context.eof) : true
         * (context.modulus != 0) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = spy(new Base64(0, byteArray, true, CodecPolicy.STRICT));
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray2).when(target).ensureBufferSize(-1, baseNCodecContextMock);
        byte[] byteArray3 = new byte[] { (byte) 0 };
        //Act Statement(s)
        target.decode(byteArray3, 0, 1, baseNCodecContextMock);
        //Assert statement(s)
        assertAll("result", () -> verify(target).ensureBufferSize(-1, baseNCodecContextMock));
    }

    //BaseRock generated method id: ${decode1WhenContextModulusNotEquals0AndContextNotEof}, hash: A5CC77FA92DA77B13933689C2810DCF0
    @Disabled()
    @Test()
    void decode1WhenContextModulusNotEquals0AndContextNotEof() {
        /* Branches:
         * (context.eof) : false
         * (inAvail < 0) : false
         * (i < inAvail) : true
         * (b == pad) : false
         * (b >= 0) : true
         * (b < decodeTable.length) : true
         * (result >= 0) : true
         * (context.modulus == 0) : false
         * (context.eof) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = spy(new Base64(0, byteArray, true, CodecPolicy.STRICT));
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray2).when(target).ensureBufferSize(-1, baseNCodecContextMock);
        byte[] byteArray3 = new byte[] { (byte) 1 };
        //Act Statement(s)
        target.decode(byteArray3, 0, 1, baseNCodecContextMock);
        //Assert statement(s)
        assertAll("result", () -> verify(target).ensureBufferSize(-1, baseNCodecContextMock));
    }

    //BaseRock generated method id: ${encode2WhenLineLengthEquals0}, hash: 2385250C19608A9D7CA16C2A1B16341B
    @Disabled()
    @Test()
    void encode2WhenLineLengthEquals0() {
        /* Branches:
         * (context.eof) : false
         * (inAvail < 0) : true
         * (0 == context.modulus) : true
         * (lineLength == 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = new Base64(0, byteArray, true, CodecPolicy.STRICT);
        byte[] byteArray2 = new byte[] {};
        //Act Statement(s)
        target.encode(byteArray2, 0, -2147483648, baseNCodecContextMock);
    }

    //BaseRock generated method id: ${encode2When0NotEqualsContextModulus}, hash: A897E1AEADE39652A1C1CDACAAE70CB7
    @Disabled()
    @Test()
    void encode2When0NotEqualsContextModulus() {
        /* Branches:
         * (context.eof) : false
         * (inAvail < 0) : false
         * (i < inAvail) : true
         * (b < 0) : true
         * (0 == context.modulus) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = spy(new Base64(0, byteArray, true, CodecPolicy.STRICT));
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray2).when(target).ensureBufferSize(0, baseNCodecContextMock);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        //Act Statement(s)
        target.encode(byteArray3, 0, 1, baseNCodecContextMock);
        //Assert statement(s)
        assertAll("result", () -> verify(target).ensureBufferSize(0, baseNCodecContextMock));
    }

    //BaseRock generated method id: ${getLineSeparatorTest}, hash: 620C5F1F87E52FFBD7B407382227EF04
    @Disabled()
    @Test()
    void getLineSeparatorTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = new Base64(0, byteArray, true, CodecPolicy.STRICT);
        //Act Statement(s)
        byte[] result = target.getLineSeparator();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${isInAlphabetWhenOctetIndexOfDecodeTableNotEqualsMinus1}, hash: 1FB6DA55B515D88C0DAD6F7F65A2E0C2
    @Disabled()
    @Test()
    void isInAlphabetWhenOctetIndexOfDecodeTableNotEqualsMinus1() {
        /* Branches:
         * (octet >= 0) : true
         * (octet < decodeTable.length) : true
         * (decodeTable[octet] != -1) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = new Base64(0, byteArray, true, CodecPolicy.STRICT);
        //Act Statement(s)
        boolean result = target.isInAlphabet((byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isInAlphabetWhenOctetIndexOfDecodeTableEqualsMinus1}, hash: D015078C9C8A07B6E92AB796ECBFC9F9
    @Disabled()
    @Test()
    void isInAlphabetWhenOctetIndexOfDecodeTableEqualsMinus1() {
        /* Branches:
         * (octet >= 0) : true
         * (octet < decodeTable.length) : true
         * (decodeTable[octet] != -1) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = new Base64(0, byteArray, true, CodecPolicy.STRICT);
        //Act Statement(s)
        boolean result = target.isInAlphabet((byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${isUrlSafeTest}, hash: 612435FA6462D3E6D6AC5894BD9E9401
    @Disabled()
    @Test()
    void isUrlSafeTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        Base64 target = new Base64(0, byteArray, true, CodecPolicy.STRICT);
        //Act Statement(s)
        boolean result = target.isUrlSafe();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
