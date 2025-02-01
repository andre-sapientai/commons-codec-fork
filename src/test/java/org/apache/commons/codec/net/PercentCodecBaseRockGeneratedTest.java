package org.apache.commons.codec.net;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PercentCodecBaseRockGeneratedTest {

    //BaseRock generated method id: ${decodeWhenBytesIsNull}, hash: 511B19AB551640EFBA99A1D4288A3DAC
    @Test()
    void decodeWhenBytesIsNull() throws DecoderException {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = target.decode(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decodeWhenBEqualsESCAPE_CHAR}, hash: B9EC2BC139BAE6B0790CD31EE783A262
    @Disabled()
    @Test()
    void decodeWhenBEqualsESCAPE_CHAR() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true  #  inside expectedDecodingBytes method
         * (b == ESCAPE_CHAR) : true  #  inside expectedDecodingBytes method
         * (i < bytes.length) : true
         * (b == ESCAPE_CHAR) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] byteArray2 = new byte[] { (byte) 37, (byte) 37, (byte) 37 };
        //Act Statement(s)
        byte[] result = target.decode(byteArray2);
        byte[] byteResultArray = new byte[] { (byte) 0 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${decodeWhenCaughtArrayIndexOutOfBoundsExceptionThrowsDecoderException}, hash: 2C4A117CB5C178C34DAF770C6F1F85A6
    @Disabled()
    @Test()
    void decodeWhenCaughtArrayIndexOutOfBoundsExceptionThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true  #  inside expectedDecodingBytes method
         * (b == ESCAPE_CHAR) : true  #  inside expectedDecodingBytes method
         * (i < bytes.length) : true
         * (b == ESCAPE_CHAR) : true
         * (catch-exception (ArrayIndexOutOfBoundsException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Utils> utils = mockStatic(Utils.class)) {
            utils.when(() -> Utils.digit16((byte) 37)).thenReturn(0).thenReturn(37);
            byte[] byteArray = new byte[] { (byte) 38 };
            PercentCodec target = new PercentCodec(byteArray, false);
            byte[] byteArray2 = new byte[] { (byte) 37, (byte) 37, (byte) 37 };
            //Act Statement(s)
            final DecoderException result = assertThrows(DecoderException.class, () -> {
                target.decode(byteArray2);
            });
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
            DecoderException decoderException = new DecoderException("Invalid percent decoding: ", arrayIndexOutOfBoundsException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(arrayIndexOutOfBoundsException.getClass())));
                utils.verify(() -> Utils.digit16((byte) 37), atLeast(2));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenObjIsNull}, hash: 998938A465F4C3F0612D83762FB655D0
    @Test()
    void decode1WhenObjIsNull() throws DecoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        Object object = null;
        //Act Statement(s)
        Object result = target.decode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode1WhenObjInstanceOfByteArray}, hash: 37A5A48F0757EE7D5C91B51D415ED393
    @Disabled()
    @Test()
    void decode1WhenObjInstanceOfByteArray() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = spy(new PercentCodec(byteArray, false));
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        doReturn(byteArray2).when(target).decode(byteArray3);
        //Act Statement(s)
        Object result = target.decode((Object) byteArray3);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray2));
            verify(target).decode(byteArray3);
        });
    }

    //BaseRock generated method id: ${decode1WhenObjNotInstanceOfByteArrayThrowsDecoderException}, hash: 13AE929C9DD0499E1DAF53B4AD86AD6B
    @Test()
    void decode1WhenObjNotInstanceOfByteArrayThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        Object object = new Object();
        DecoderException decoderException = new DecoderException("Objects of type java.lang.Object cannot be Percent decoded");
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

    //BaseRock generated method id: ${encodeWhenBytesIsNull}, hash: 5D584D96DEF5952764C1E995909A1BD3
    @Test()
    void encodeWhenBytesIsNull() throws EncoderException {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = target.encode(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encodeWhenNotWillEncodeAndNotPlusForSpace}, hash: 6A1BB2828E31028F31CCCA1DD4C37B30
    @Disabled()
    @Test()
    void encodeWhenNotWillEncodeAndNotPlusForSpace() throws EncoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true  #  inside expectedEncodingBytes method
         * (c >= 0) : false  #  inside isAsciiChar method
         * (!isAsciiChar(c)) : true  #  inside canEncode method
         * (canEncode(b)) : true  #  inside expectedEncodingBytes method
         * (expectedEncodingBytes != bytes.length) : false
         * (willEncode) : false
         * (plusForSpace) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1, (byte) 2 };
        //Act Statement(s)
        byte[] result = target.encode(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray2)));
    }

    //BaseRock generated method id: ${encodeWhenCanEncodeNotBAndExpectedEncodingBytesEqualsBytesLengthAndNotWillEncodeAndNotPlusForSpace}, hash: 6903C760665A1A1B9BD271CF8EC9FD37
    @Test()
    void encodeWhenCanEncodeNotBAndExpectedEncodingBytesEqualsBytesLengthAndNotWillEncodeAndNotPlusForSpace() throws EncoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true  #  inside expectedEncodingBytes method
         * (c >= 0) : true  #  inside isAsciiChar method
         * (!isAsciiChar(c)) : false  #  inside canEncode method
         * (c >= alwaysEncodeCharsMin) : true  #  inside inAlwaysEncodeCharsRange method
         * (c <= alwaysEncodeCharsMax) : false  #  inside inAlwaysEncodeCharsRange method
         * (inAlwaysEncodeCharsRange(c)) : false  #  inside canEncode method
         * (canEncode(b)) : false  #  inside expectedEncodingBytes method
         * (expectedEncodingBytes != bytes.length) : false
         * (willEncode) : false
         * (plusForSpace) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] byteArray2 = new byte[] { (byte) 39 };
        //Act Statement(s)
        byte[] result = target.encode(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray2)));
    }

    //BaseRock generated method id: ${encodeWhenBbNotLessThan0}, hash: BFA743B2596C59729411C67B7D1B6EE3
    @Disabled()
    @Test()
    void encodeWhenBbNotLessThan0() throws EncoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true  #  inside expectedEncodingBytes method
         * (c >= 0) : true  #  inside isAsciiChar method
         * (!isAsciiChar(c)) : false  #  inside canEncode method
         * (c >= alwaysEncodeCharsMin) : true  #  inside inAlwaysEncodeCharsRange method
         * (c <= alwaysEncodeCharsMax) : true  #  inside inAlwaysEncodeCharsRange method
         * (inAlwaysEncodeCharsRange(c)) : true  #  inside canEncode method
         * (alwaysEncodeChars.get(c)) : true  #  inside canEncode method
         * (canEncode(b)) : true  #  inside expectedEncodingBytes method
         * (expectedEncodingBytes != bytes.length) : true
         * (willEncode) : true
         * (for-each(bytes)) : true  #  inside doEncode method
         * (willEncode) : true  #  inside doEncode method
         * (canEncode(b)) : true  #  inside doEncode method
         * (bb < 0) : false  #  inside doEncode method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] byteArray2 = new byte[] { (byte) 38 };
        //Act Statement(s)
        byte[] result = target.encode(byteArray2);
        byte[] byteResultArray = new byte[] { (byte) 37, (byte) 0, (byte) 0 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${encodeWhenBNotEquals___AndContainsSpaceNotBytes}, hash: 5F757B33D65D101AB7AF705BFB6EF5DD
    @Disabled()
    @Test()
    void encodeWhenBNotEquals___AndContainsSpaceNotBytes() throws EncoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true  #  inside expectedEncodingBytes method
         * (c >= 0) : true  #  inside isAsciiChar method
         * (!isAsciiChar(c)) : false  #  inside canEncode method
         * (c >= alwaysEncodeCharsMin) : true  #  inside inAlwaysEncodeCharsRange method
         * (c <= alwaysEncodeCharsMax) : true  #  inside inAlwaysEncodeCharsRange method
         * (inAlwaysEncodeCharsRange(c)) : true  #  inside canEncode method
         * (alwaysEncodeChars.get(c)) : true  #  inside canEncode method
         * (canEncode(b)) : true  #  inside expectedEncodingBytes method
         * (expectedEncodingBytes != bytes.length) : false
         * (willEncode) : false
         * (plusForSpace) : true
         * (for-each(bytes)) : true  #  inside containsSpace method
         * (b == ' ') : false  #  inside containsSpace method
         * (containsSpace(bytes)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, true);
        byte[] byteArray2 = new byte[] { (byte) 38, (byte) 1, (byte) 2 };
        //Act Statement(s)
        byte[] result = target.encode(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray2)));
    }

    //BaseRock generated method id: ${encodeWhenBNotEquals___}, hash: D850483CC3F5F095F933A6F5E15D2FAC
    @Test()
    void encodeWhenBNotEquals___() throws EncoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true  #  inside expectedEncodingBytes method
         * (c >= 0) : true  #  inside isAsciiChar method
         * (!isAsciiChar(c)) : false  #  inside canEncode method
         * (c >= alwaysEncodeCharsMin) : true  #  inside inAlwaysEncodeCharsRange method
         * (c <= alwaysEncodeCharsMax) : true  #  inside inAlwaysEncodeCharsRange method
         * (inAlwaysEncodeCharsRange(c)) : true  #  inside canEncode method
         * (alwaysEncodeChars.get(c)) : true  #  inside canEncode method
         * (canEncode(b)) : true  #  inside expectedEncodingBytes method
         * (expectedEncodingBytes != bytes.length) : true
         * (willEncode) : true
         * (for-each(bytes)) : true  #  inside doEncode method
         * (willEncode) : true  #  inside doEncode method
         * (canEncode(b)) : false  #  inside doEncode method
         * (plusForSpace) : true  #  inside doEncode method
         * (b == ' ') : false  #  inside doEncode method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        PercentCodec target = new PercentCodec(byteArray, false);
        byte[] byteArray2 = new byte[] {};
        //Act Statement(s)
        byte[] result = target.encode(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encode1WhenObjIsNull}, hash: 1D6D102E04767E9B9D7341E10FD1C894
    @Test()
    void encode1WhenObjIsNull() throws EncoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        Object object = null;
        //Act Statement(s)
        Object result = target.encode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode1WhenObjInstanceOfByteArray}, hash: 571E6CF430BAC432F121133C2B4DCC36
    @Disabled()
    @Test()
    void encode1WhenObjInstanceOfByteArray() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = spy(new PercentCodec(byteArray, false));
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        doReturn(byteArray2).when(target).encode(byteArray3);
        //Act Statement(s)
        Object result = target.encode((Object) byteArray3);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray2));
            verify(target).encode(byteArray3);
        });
    }

    //BaseRock generated method id: ${encode1WhenObjNotInstanceOfByteArrayThrowsEncoderException}, hash: A739E65CE10E8A4FC925816654A4EFCC
    @Test()
    void encode1WhenObjNotInstanceOfByteArrayThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 38 };
        PercentCodec target = new PercentCodec(byteArray, false);
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Objects of type java.lang.Object cannot be Percent encoded");
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
}
