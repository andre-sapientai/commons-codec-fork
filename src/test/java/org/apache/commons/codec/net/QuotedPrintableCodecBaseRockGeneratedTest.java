package org.apache.commons.codec.net;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.EncoderException;
import java.util.BitSet;
import org.mockito.MockedStatic;
import java.nio.charset.Charset;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class QuotedPrintableCodecBaseRockGeneratedTest {

    //BaseRock generated method id: ${decodeQuotedPrintableWhenBytesIsNull}, hash: 34417378CD03B82DCB004A0E2A6BA276
    @Test()
    void decodeQuotedPrintableWhenBytesIsNull() throws DecoderException {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decodeQuotedPrintableWhenIIndexOfBytesEqualsCR}, hash: 2ED323AC52730EF7DFEDFA312C4274F4
    @Test()
    void decodeQuotedPrintableWhenIIndexOfBytesEqualsCR() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == ESCAPE_CHAR) : true
         * (bytes[++i] == CR) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 61, (byte) 13 };
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${decodeQuotedPrintableWhenIIndexOfBytesNotEqualsCR}, hash: 7551E5025858A519F8D21AE3464AB832
    @Disabled()
    @Test()
    void decodeQuotedPrintableWhenIIndexOfBytesNotEqualsCR() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == ESCAPE_CHAR) : true
         * (bytes[++i] == CR) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 61, (byte) 1, (byte) 1 };
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 63 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${decodeQuotedPrintableWhenIIndexOfBytesNotEqualsCRAndCaughtArrayIndexOutOfBoundsExceptionThrowsDecoderException}, hash: 03CA1A41C5B29F6D8787DDCFC619D4F5
    @Disabled()
    @Test()
    void decodeQuotedPrintableWhenIIndexOfBytesNotEqualsCRAndCaughtArrayIndexOutOfBoundsExceptionThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == ESCAPE_CHAR) : true
         * (bytes[++i] == CR) : false
         * (catch-exception (ArrayIndexOutOfBoundsException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Utils> utils = mockStatic(Utils.class)) {
            utils.when(() -> Utils.digit16((byte) 1)).thenReturn(0).thenReturn(55358);
            byte[] byteArray = new byte[] { (byte) 61, (byte) 1, (byte) 1 };
            //Act Statement(s)
            final DecoderException result = assertThrows(DecoderException.class, () -> {
                QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
            });
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
            DecoderException decoderException = new DecoderException("Invalid quoted-printable encoding", arrayIndexOutOfBoundsException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(arrayIndexOutOfBoundsException.getClass())));
                utils.verify(() -> Utils.digit16((byte) 1), atLeast(2));
            });
        }
    }

    //BaseRock generated method id: ${decodeQuotedPrintableWhenBNotEqualsLF}, hash: C5A8F2D23E2C7FD7C63059D85358C215
    @Test()
    void decodeQuotedPrintableWhenBNotEqualsLF() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == ESCAPE_CHAR) : false
         * (b != CR) : true
         * (b != LF) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 0 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${encodeQuotedPrintableTest}, hash: 3F32BB4C8A5A47A890D98B154123BAB4
    @Test()
    void encodeQuotedPrintableTest() {
        //Arrange Statement(s)
        try (MockedStatic<QuotedPrintableCodec> quotedPrintableCodec = mockStatic(QuotedPrintableCodec.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            BitSet bitSet = new BitSet();
            byte[] byteArray2 = new byte[] {};
            quotedPrintableCodec.when(() -> QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray2, false)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                quotedPrintableCodec.verify(() -> QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray2, false), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenBytesIsNull}, hash: FC7A83F3E76C1FBB8B0BB3D10C2AB27B
    @Test()
    void encodeQuotedPrintable1WhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, _byte, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenBytesLengthLessThanMIN_BYTES}, hash: E100A5909B0BCB59122F3BE4C0C28753
    @Test()
    void encodeQuotedPrintable1WhenBytesLengthLessThanMIN_BYTES() {
        /* Branches:
         * (bytes == null) : false
         * (printable == null) : true
         * (strict) : true
         * (bytesLength < MIN_BYTES) : true
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray, true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenPrintableGetB}, hash: A9A98CAC8F83CD7F5B7B6BB4C4832E6F
    @Test()
    void encodeQuotedPrintable1WhenPrintableGetB() {
        /* Branches:
         * (bytes == null) : false
         * (printable == null) : true
         * (strict) : false
         * (for-each(bytes)) : true
         * (b < 0) : true
         * (printable.get(b)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenPrintableNotGetB}, hash: 420903FB2156FE6E9FDDEDE0E3D7812B
    @Disabled()
    @Test()
    void encodeQuotedPrintable1WhenPrintableNotGetB() {
        /* Branches:
         * (bytes == null) : false
         * (printable == null) : true
         * (strict) : false
         * (for-each(bytes)) : true
         * (b < 0) : true
         * (printable.get(b)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] { (byte) -1 };
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray, false);
        byte[] byteResultArray = new byte[] { (byte) 61, (byte) 65, (byte) 65 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenPosNotGreaterThanSAFE_LENGTHMinus2AndILessThanBytesLengthAndPrintableNotGetB}, hash: 6EF59310B3EA2DCE3A9825C369F2AD55
    @Disabled()
    @Test()
    void encodeQuotedPrintable1WhenPosNotGreaterThanSAFE_LENGTHMinus2AndILessThanBytesLengthAndPrintableNotGetB() {
        /* Branches:
         * (bytes == null) : false
         * (printable == null) : true
         * (strict) : true
         * (bytesLength < MIN_BYTES) : false
         * (i < bytesLength - 3) : true
         * (b < 0) : true  #  inside getUnsignedOctet method
         * (pos < SAFE_LENGTH) : true
         * (!printable.get(b)) : true
         * (encode) : true  #  inside encodeByte method
         * (!printable.get(b)) : true
         * (pos > SAFE_LENGTH - 2) : false
         * (i < bytesLength) : true
         * (!printable.get(b)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 3 };
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray, true);
        byte[] byteResultArray = new byte[] { (byte) 61, (byte) 65, (byte) 65, (byte) 61, (byte) 65, (byte) 65, (byte) 61, (byte) 65, (byte) 65 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenILessThanBytesLengthAndPrintableGetBAndINotGreaterThanBytesLengthMinus24}, hash: 5BEAF66ACC77A296E229F4A72588EBB1
    @Test()
    void encodeQuotedPrintable1WhenILessThanBytesLengthAndPrintableGetBAndINotGreaterThanBytesLengthMinus24() {
        /* Branches:
         * (bytes == null) : false
         * (printable == null) : true
         * (strict) : true
         * (bytesLength < MIN_BYTES) : false
         * (i < bytesLength - 3) : true
         * (b < 0) : true  #  inside getUnsignedOctet method
         * (pos < SAFE_LENGTH) : true
         * (!printable.get(b)) : true
         * (encode) : true  #  inside encodeByte method
         * (!printable.get(b)) : false
         * (b == SPACE) : false  #  inside isWhitespace method
         * (b == TAB) : false  #  inside isWhitespace method
         * (isWhitespace(b)) : false
         * (pos > SAFE_LENGTH - 2) : false
         * (i < bytesLength) : true
         * (!printable.get(b)) : false
         * (i > bytesLength - 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeQuotedPrintable1WhenILessThanBytesLengthAndPrintableGetBAndINotGreaterThanBytesLengthMinus26}, hash: 25EC06E450D22D6DFE3721871CA8F912
    @Test()
    void encodeQuotedPrintable1WhenILessThanBytesLengthAndPrintableGetBAndINotGreaterThanBytesLengthMinus26() {
        /* Branches:
         * (bytes == null) : false
         * (printable == null) : true
         * (strict) : true
         * (bytesLength < MIN_BYTES) : false
         * (i < bytesLength - 3) : true
         * (b < 0) : true  #  inside getUnsignedOctet method
         * (pos < SAFE_LENGTH) : true
         * (!printable.get(b)) : false
         * (encode) : false  #  inside encodeByte method
         * (!printable.get(b)) : false
         * (b == SPACE) : true  #  inside isWhitespace method
         * (isWhitespace(b)) : true
         * (pos > SAFE_LENGTH - 5) : false
         * (pos > SAFE_LENGTH - 2) : false
         * (i < bytesLength) : true
         * (!printable.get(b)) : false
         * (i > bytesLength - 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, byteArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${decodeTest}, hash: 9AD6A13EA2F6829337BADD258BDAA68E
    @Test()
    void decodeTest() throws DecoderException {
        //Arrange Statement(s)
        try (MockedStatic<QuotedPrintableCodec> quotedPrintableCodec = mockStatic(QuotedPrintableCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            quotedPrintableCodec.when(() -> QuotedPrintableCodec.decodeQuotedPrintable(byteArray2)).thenReturn(byteArray);
            Charset charset = Charset.defaultCharset();
            QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
            //Act Statement(s)
            byte[] result = target.decode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                quotedPrintableCodec.verify(() -> QuotedPrintableCodec.decodeQuotedPrintable(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenObjIsNull}, hash: 7F40A36E98F7399623E6594C29C56E4D
    @Test()
    void decode1WhenObjIsNull() throws DecoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        Object object = null;
        //Act Statement(s)
        Object result = target.decode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode1WhenObjInstanceOfByteArray}, hash: 83D303C3CD3B4D210C9569E2A61721EC
    @Disabled()
    @Test()
    void decode1WhenObjInstanceOfByteArray() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray).when(target).decode(byteArray2);
        //Act Statement(s)
        Object result = target.decode((Object) byteArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray));
            verify(target).decode(byteArray2);
        });
    }

    //BaseRock generated method id: ${decode1WhenObjInstanceOfString}, hash: 636806AA9E8D2E3E31AB50D8A780D26F
    @Test()
    void decode1WhenObjInstanceOfString() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         * (obj instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        //Act Statement(s)
        Object result = target.decode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decode1WhenObjNotInstanceOfStringThrowsDecoderException}, hash: AEC9430C4E1A0D28A5A51339910F38FD
    @Test()
    void decode1WhenObjNotInstanceOfStringThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         * (obj instanceof String) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        Object object = new Object();
        DecoderException decoderException = new DecoderException("Objects of type java.lang.Object cannot be quoted-printable decoded");
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

    //BaseRock generated method id: ${decode2Test}, hash: 6E1D1688688BB3BADBD3C53B2512D5ED
    @Disabled()
    @Test()
    void decode2Test() throws DecoderException {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        doReturn("return_of_decode1").when(target).decode(eq("sourceStr1"), (Charset) any());
        //Act Statement(s)
        String result = target.decode("sourceStr1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_decode1"));
            verify(target).decode(eq("sourceStr1"), (Charset) any());
        });
    }

    //BaseRock generated method id: ${decode3WhenSourceStrIsNull}, hash: D93DD2EEDB3AFDAFFC28DE4405FE016B
    @Test()
    void decode3WhenSourceStrIsNull() throws DecoderException {
        /* Branches:
         * (sourceStr == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        Charset charset2 = Charset.defaultCharset();
        //Act Statement(s)
        String result = target.decode((String) null, charset2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode3WhenSourceStrIsNotNull}, hash: B90D5A82999A5FAB0EA975E7DA61B50B
    @Disabled()
    @Test()
    void decode3WhenSourceStrIsNotNull() throws DecoderException {
        /* Branches:
         * (sourceStr == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 65 };
        doReturn(byteArray).when(target).decode(byteArray2);
        Charset charset2 = Charset.defaultCharset();
        //Act Statement(s)
        String result = target.decode("A", charset2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).decode(byteArray2);
        });
    }

    //BaseRock generated method id: ${decode4WhenSourceStrIsNull}, hash: F2DDC49DAC803F97C5CF329692AAE0F9
    @Test()
    void decode4WhenSourceStrIsNull() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (sourceStr == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        //Act Statement(s)
        String result = target.decode((String) null, "sourceCharset1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode4WhenSourceStrIsNotNull}, hash: A749221EE11CBDC679C0ED70469E8ECB
    @Disabled()
    @Test()
    void decode4WhenSourceStrIsNotNull() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (sourceStr == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 65 };
        doReturn(byteArray).when(target).decode(byteArray2);
        //Act Statement(s)
        String result = target.decode("A", "sourceCharset1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).decode(byteArray2);
        });
    }

    //BaseRock generated method id: ${encodeTest}, hash: 9C1448B78818627B872B17138C629E2A
    @Test()
    void encodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<QuotedPrintableCodec> quotedPrintableCodec = mockStatic(QuotedPrintableCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            quotedPrintableCodec.when(() -> QuotedPrintableCodec.encodeQuotedPrintable((BitSet) any(), eq(byteArray2), eq(false))).thenReturn(byteArray);
            Charset charset = Charset.defaultCharset();
            QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
            //Act Statement(s)
            byte[] result = target.encode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                quotedPrintableCodec.verify(() -> QuotedPrintableCodec.encodeQuotedPrintable((BitSet) any(), eq(byteArray2), eq(false)));
            });
        }
    }

    //BaseRock generated method id: ${encode1WhenObjIsNull}, hash: 1AA27E1AE0AACF34AA67F6CB02F674B5
    @Test()
    void encode1WhenObjIsNull() throws EncoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        Object object = null;
        //Act Statement(s)
        Object result = target.encode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode1WhenObjInstanceOfByteArray}, hash: FA3FE7621042475731BD715DBCD2A7A7
    @Disabled()
    @Test()
    void encode1WhenObjInstanceOfByteArray() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray).when(target).encode(byteArray2);
        //Act Statement(s)
        Object result = target.encode((Object) byteArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray));
            verify(target).encode(byteArray2);
        });
    }

    //BaseRock generated method id: ${encode1WhenObjInstanceOfString}, hash: F97EFDB10A009713F2DFCF3865000C8D
    @Test()
    void encode1WhenObjInstanceOfString() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         * (obj instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        //Act Statement(s)
        Object result = target.encode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encode1WhenObjNotInstanceOfStringThrowsEncoderException}, hash: A37C8C93D551CAAFC22F56CEBFBA99D6
    @Test()
    void encode1WhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         * (obj instanceof String) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Objects of type java.lang.Object cannot be quoted-printable encoded");
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

    //BaseRock generated method id: ${encode2Test}, hash: 9003A4A0B4837F14249C78DBD60E8195
    @Disabled()
    @Test()
    void encode2Test() throws EncoderException {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        doReturn("return_of_encode1").when(target).encode(eq("sourceStr1"), (Charset) any());
        //Act Statement(s)
        String result = target.encode("sourceStr1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_encode1"));
            verify(target).encode(eq("sourceStr1"), (Charset) any());
        });
    }

    //BaseRock generated method id: ${encode3WhenSourceStrIsNull}, hash: D587D0E4ED8CA65CA72F12B239A4AA10
    @Test()
    void encode3WhenSourceStrIsNull() {
        /* Branches:
         * (sourceStr == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        Charset charset2 = Charset.defaultCharset();
        //Act Statement(s)
        String result = target.encode((String) null, charset2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode3WhenSourceStrIsNotNull}, hash: 85080ED805CA503A77B0B3D0E5FAB160
    @Disabled()
    @Test()
    void encode3WhenSourceStrIsNotNull() {
        /* Branches:
         * (sourceStr == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 115, (byte) 111, (byte) 117, (byte) 114, (byte) 99, (byte) 101, (byte) 83, (byte) 116, (byte) 114, (byte) 49 };
        doReturn(byteArray).when(target).encode(byteArray2);
        Charset charset2 = Charset.defaultCharset();
        //Act Statement(s)
        String result = target.encode("sourceStr1", charset2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).encode(byteArray2);
        });
    }

    //BaseRock generated method id: ${encode4WhenSourceStrIsNull}, hash: C57BA5EF7491350788C65B928FE33B9C
    @Test()
    void encode4WhenSourceStrIsNull() throws UnsupportedEncodingException {
        /* Branches:
         * (sourceStr == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        //Act Statement(s)
        String result = target.encode((String) null, "sourceCharset1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode4WhenSourceStrIsNotNull}, hash: 7F720D6ACB27F26FE7A45C9582BF6C87
    @Disabled()
    @Test()
    void encode4WhenSourceStrIsNotNull() throws UnsupportedEncodingException {
        /* Branches:
         * (sourceStr == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = spy(new QuotedPrintableCodec(charset, false));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray).when(target).encode(byteArray2);
        //Act Statement(s)
        String result = target.encode("B", "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).encode(byteArray2);
        });
    }

    //BaseRock generated method id: ${getCharsetTest}, hash: 620C506AEF280B37569B30D64A3FE2DE
    @Test()
    void getCharsetTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        //Act Statement(s)
        Charset result = target.getCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //BaseRock generated method id: ${getDefaultCharsetTest}, hash: 6546EE5C7593DF6848BC5828EB9BFF4A
    @Test()
    void getDefaultCharsetTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QuotedPrintableCodec target = new QuotedPrintableCodec(charset, false);
        //Act Statement(s)
        String result = target.getDefaultCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("UTF-8")));
    }
}
