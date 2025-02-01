package org.apache.commons.codec.binary;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.mockito.MockedStatic;
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
class BinaryCodecBaseRockGeneratedTest {

    //BaseRock generated method id: ${fromAsciiWhenIsEmptyAscii}, hash: 3D4CF0AF1711D947FD9B508D0EF980C2
    @Test()
    void fromAsciiWhenIsEmptyAscii() {
        /* Branches:
         * (isEmpty(ascii)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.isEmpty(byteArray)).thenReturn(true);
            //Act Statement(s)
            byte[] result = BinaryCodec.fromAscii(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                binaryCodec.verify(() -> BinaryCodec.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${fromAsciiWhenJjMinusBitsIndexOfAsciiEquals_1_}, hash: 0EC31CE92D34D834E5F8105963A9EA91
    @Disabled()
    @Test()
    void fromAsciiWhenJjMinusBitsIndexOfAsciiEquals_1_() {
        /* Branches:
         * (isEmpty(ascii)) : false
         * (ii < raw.length) : true
         * (bits < BITS.length) : true
         * (ascii[jj - bits] == '1') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 49, (byte) 49, (byte) 49, (byte) 49, (byte) 49, (byte) 49 };
            binaryCodec.when(() -> BinaryCodec.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            byte[] result = BinaryCodec.fromAscii(byteArray);
            byte[] byteResultArray = new byte[] { (byte) 33 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                binaryCodec.verify(() -> BinaryCodec.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${fromAscii1WhenAsciiLengthEquals0}, hash: 179369B91A9A7CCA5F69F714552D4A34
    @Test()
    void fromAscii1WhenAsciiLengthEquals0() {
        /* Branches:
         * (ascii == null) : false
         * (ascii.length == 0) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[] {};
        //Act Statement(s)
        byte[] result = BinaryCodec.fromAscii(charArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${fromAscii1WhenJjMinusBitsIndexOfAsciiEquals_1_}, hash: AE2DA575D212DF7812224325AF4D58DD
    @Disabled()
    @Test()
    void fromAscii1WhenJjMinusBitsIndexOfAsciiEquals_1_() {
        /* Branches:
         * (ascii == null) : false
         * (ascii.length == 0) : false
         * (ii < raw.length) : true
         * (bits < BITS.length) : true
         * (ascii[jj - bits] == '1') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[] { '1', '1', '1', '1', '1', '1' };
        //Act Statement(s)
        byte[] result = BinaryCodec.fromAscii(charArray);
        byte[] byteResultArray = new byte[] { (byte) 33 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${isEmptyWhenArrayLengthEquals0}, hash: 4353CB0787476F80F8F43435BA0DCA33
    @Test()
    void isEmptyWhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        boolean result = BinaryCodec.isEmpty(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isEmptyWhenArrayLengthNotEquals0}, hash: 6C280005BA6F3835810113A0EED8367F
    @Test()
    void isEmptyWhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        boolean result = BinaryCodec.isEmpty(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${toAsciiBytesWhenIsEmptyRaw}, hash: 543B9B1D84C820572A2A7BBF74FE874A
    @Test()
    void toAsciiBytesWhenIsEmptyRaw() {
        /* Branches:
         * (isEmpty(raw)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.isEmpty(byteArray)).thenReturn(true);
            //Act Statement(s)
            byte[] result = BinaryCodec.toAsciiBytes(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                binaryCodec.verify(() -> BinaryCodec.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toAsciiBytesWhenIiIndexOfRawAndBitsIndexOfBITSEquals0}, hash: 48313D743E7629A29D8B82954003B6FB
    @Test()
    void toAsciiBytesWhenIiIndexOfRawAndBitsIndexOfBITSEquals0() {
        /* Branches:
         * (isEmpty(raw)) : false
         * (ii < rawLength) : true
         * (bits < BITS.length) : true
         * ((raw[ii] & BITS[bits]) == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 0 };
            binaryCodec.when(() -> BinaryCodec.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            byte[] result = BinaryCodec.toAsciiBytes(byteArray);
            byte[] byteResultArray = new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 48, (byte) 48, (byte) 48, (byte) 48, (byte) 48 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                binaryCodec.verify(() -> BinaryCodec.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toAsciiCharsWhenIsEmptyRaw}, hash: 8498FECDD058F67854F47D2D5B9BD0B2
    @Test()
    void toAsciiCharsWhenIsEmptyRaw() {
        /* Branches:
         * (isEmpty(raw)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.isEmpty(byteArray)).thenReturn(true);
            //Act Statement(s)
            char[] result = BinaryCodec.toAsciiChars(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                binaryCodec.verify(() -> BinaryCodec.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toAsciiCharsWhenIiIndexOfRawAndBitsIndexOfBITSEquals0}, hash: 5680D5F0A8EA24A1F92E04C991D51533
    @Test()
    void toAsciiCharsWhenIiIndexOfRawAndBitsIndexOfBITSEquals0() {
        /* Branches:
         * (isEmpty(raw)) : false
         * (ii < rawLength) : true
         * (bits < BITS.length) : true
         * ((raw[ii] & BITS[bits]) == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 0 };
            binaryCodec.when(() -> BinaryCodec.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            char[] result = BinaryCodec.toAsciiChars(byteArray);
            char[] charResultArray = new char[] { '0', '0', '0', '0', '0', '0', '0', '0' };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charResultArray));
                binaryCodec.verify(() -> BinaryCodec.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toAsciiStringTest}, hash: F6B159B5FE82F30001DC2AA85BAB68CC
    @Test()
    void toAsciiStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] { 'A' };
            byte[] byteArray = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.toAsciiChars(byteArray)).thenReturn(charArray);
            //Act Statement(s)
            String result = BinaryCodec.toAsciiString(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                binaryCodec.verify(() -> BinaryCodec.toAsciiChars(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decodeTest}, hash: 4D1F5104A8F85B432C4B629EEF44E564
    @Test()
    void decodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.fromAscii(byteArray2)).thenReturn(byteArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            byte[] result = target.decode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                binaryCodec.verify(() -> BinaryCodec.fromAscii(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenAsciiIsNull}, hash: 4B83608892EDA9279946DD5185A14551
    @Test()
    void decode1WhenAsciiIsNull() throws DecoderException {
        /* Branches:
         * (ascii == null) : true
         */
        //Arrange Statement(s)
        BinaryCodec target = new BinaryCodec();
        Object object = null;
        //Act Statement(s)
        Object result = target.decode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decode1WhenAsciiInstanceOfByteArray}, hash: 7AB1634F0918607BC3D5AA31E5751AEC
    @Test()
    void decode1WhenAsciiInstanceOfByteArray() throws DecoderException {
        /* Branches:
         * (ascii == null) : false
         * (ascii instanceof byte[]) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.fromAscii(byteArray2)).thenReturn(byteArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            Object result = target.decode((Object) byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                binaryCodec.verify(() -> BinaryCodec.fromAscii(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenAsciiInstanceOfCharArray}, hash: F2C1AFD0E85109535AA3BC9E241ED237
    @Test()
    void decode1WhenAsciiInstanceOfCharArray() throws DecoderException {
        /* Branches:
         * (ascii == null) : false
         * (ascii instanceof byte[]) : false
         * (ascii instanceof char[]) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] {};
            binaryCodec.when(() -> BinaryCodec.fromAscii(charArray)).thenReturn(byteArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            Object result = target.decode((Object) charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                binaryCodec.verify(() -> BinaryCodec.fromAscii(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenAsciiInstanceOfString}, hash: 68531F3A92B2FC00AE8D7B3D957DE50E
    @Test()
    void decode1WhenAsciiInstanceOfString() throws DecoderException {
        /* Branches:
         * (ascii == null) : false
         * (ascii instanceof byte[]) : false
         * (ascii instanceof char[]) : false
         * (ascii instanceof String) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] { 'A' };
            binaryCodec.when(() -> BinaryCodec.fromAscii(charArray)).thenReturn(byteArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            Object result = target.decode((Object) "A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                binaryCodec.verify(() -> BinaryCodec.fromAscii(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenAsciiNotInstanceOfStringThrowsDecoderException}, hash: C29789C3876F43521525B24B698A5B88
    @Test()
    void decode1WhenAsciiNotInstanceOfStringThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (ascii == null) : false
         * (ascii instanceof byte[]) : false
         * (ascii instanceof char[]) : false
         * (ascii instanceof String) : false
         */
        //Arrange Statement(s)
        BinaryCodec target = new BinaryCodec();
        Object object = new Object();
        DecoderException decoderException = new DecoderException("argument not a byte array");
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            target.decode(object);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
        });
    }

    //BaseRock generated method id: ${encodeTest}, hash: 7C98F8ABED1846E8A1279988C2AC5840
    @Test()
    void encodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.toAsciiBytes(byteArray2)).thenReturn(byteArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            byte[] result = target.encode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                binaryCodec.verify(() -> BinaryCodec.toAsciiBytes(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encode1WhenRawNotInstanceOfByteArrayThrowsEncoderException}, hash: 027DEEE4AC062CE6688EC568168296E9
    @Test()
    void encode1WhenRawNotInstanceOfByteArrayThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(raw instanceof byte[])) : true
         */
        //Arrange Statement(s)
        BinaryCodec target = new BinaryCodec();
        Object object = new Object();
        EncoderException encoderException = new EncoderException("argument not a byte array");
        //Act Statement(s)
        final EncoderException result = assertThrows(EncoderException.class, () -> {
            target.encode(object);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(encoderException.getMessage()));
        });
    }

    //BaseRock generated method id: ${encode1WhenRawInstanceOfByteArray}, hash: ABB801EC4B02AF3DDD9DAD90C6124741
    @Test()
    void encode1WhenRawInstanceOfByteArray() throws EncoderException {
        /* Branches:
         * (!(raw instanceof byte[])) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            binaryCodec.when(() -> BinaryCodec.toAsciiChars(byteArray)).thenReturn(charArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            Object result = target.encode((Object) byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                binaryCodec.verify(() -> BinaryCodec.toAsciiChars(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toByteArrayWhenAsciiIsNull}, hash: A5ECCBBE49759977D3EE36356CF01116
    @Test()
    void toByteArrayWhenAsciiIsNull() {
        /* Branches:
         * (ascii == null) : true
         */
        //Arrange Statement(s)
        BinaryCodec target = new BinaryCodec();
        //Act Statement(s)
        byte[] result = target.toByteArray((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${toByteArrayWhenAsciiIsNotNull}, hash: 3BB7348B42FEC6F3648F8F062EA14911
    @Test()
    void toByteArrayWhenAsciiIsNotNull() {
        /* Branches:
         * (ascii == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BinaryCodec> binaryCodec = mockStatic(BinaryCodec.class)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] { 'A' };
            binaryCodec.when(() -> BinaryCodec.fromAscii(charArray)).thenReturn(byteArray);
            BinaryCodec target = new BinaryCodec();
            //Act Statement(s)
            byte[] result = target.toByteArray("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                binaryCodec.verify(() -> BinaryCodec.fromAscii(charArray), atLeast(1));
            });
        }
    }
}
