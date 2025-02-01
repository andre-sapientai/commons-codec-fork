package org.apache.commons.codec.net;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.CodecPolicy;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BCodecBaseRockGeneratedTest {

    //BaseRock generated method id: ${decodeWhenValueIsNull}, hash: 7419C2F5EB88075F05D193FD76442CA9
    @Test()
    void decodeWhenValueIsNull() throws DecoderException {
        /* Branches:
         * (value == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        Object object = null;
        //Act Statement(s)
        Object result = target.decode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decodeWhenValueInstanceOfString}, hash: 8F8054A91E8229803EED26F5A1C8D3C0
    @Disabled()
    @Test()
    void decodeWhenValueInstanceOfString() throws DecoderException {
        /* Branches:
         * (value == null) : false
         * (value instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        //Act Statement(s)
        Object result = target.decode((Object) "value1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decodeWhenValueNotInstanceOfStringThrowsDecoderException}, hash: 308CE18A6CFD6DF1E265953ECD21780D
    @Test()
    void decodeWhenValueNotInstanceOfStringThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (value == null) : false
         * (value instanceof String) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        Object object = new Object();
        DecoderException decoderException = new DecoderException("Objects of type java.lang.Object cannot be decoded using BCodec");
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

    //BaseRock generated method id: ${decode1Test}, hash: E8F1783DF6EE06FE3FDE56A0BF16272C
    @Disabled()
    @Test()
    void decode1Test() throws DecoderException, UnsupportedEncodingException {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = spy(new BCodec(charset, CodecPolicy.STRICT));
        doReturn("return_of_decodeText1").when(target).decodeText("value1");
        //Act Statement(s)
        String result = target.decode("value1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_decodeText1"));
            verify(target).decodeText("value1");
        });
    }

    //BaseRock generated method id: ${decode1WhenCaughtUnsupportedEncodingExceptionOrIllegalArgumentExceptionThrowsDecoderException}, hash: BE0560409FBD27227C729BB4D249469A
    @Disabled()
    @Test()
    void decode1WhenCaughtUnsupportedEncodingExceptionOrIllegalArgumentExceptionThrowsDecoderException() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (catch-exception (UnsupportedEncodingException | IllegalArgumentException)) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = spy(new BCodec(charset, CodecPolicy.STRICT));
        UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException("s1");
        doThrow(unsupportedEncodingException).when(target).decodeText("value1");
        DecoderException decoderException = new DecoderException("s1", unsupportedEncodingException);
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            target.decode("value1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(unsupportedEncodingException.getClass())));
            verify(target).decodeText("value1");
        });
    }

    //BaseRock generated method id: ${doDecodingWhenBytesIsNull}, hash: 649E095A9DFE2B0616113CC7A9687817
    @Test()
    void doDecodingWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = target.doDecoding(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${doDecodingWhenBytesIsNotNull}, hash: 4CE0AA7FA7CBFA97313BE06401BA4510
    @Test()
    void doDecodingWhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = target.doDecoding(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${doEncodingWhenBytesIsNull}, hash: 16BD7E6C8AA6A927BF63B86FE3721C64
    @Test()
    void doEncodingWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = target.doEncoding(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${doEncodingWhenBytesIsNotNull}, hash: FA9B4C226CBF33344CBE888A7B74ECB3
    @Test()
    void doEncodingWhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = target.doEncoding(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeWhenValueIsNull}, hash: DEC6D9EB04B01723C09A418B8A1B77F4
    @Test()
    void encodeWhenValueIsNull() throws EncoderException {
        /* Branches:
         * (value == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        Object object = null;
        //Act Statement(s)
        Object result = target.encode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encodeWhenValueInstanceOfString}, hash: 88FB424ED5A6EB7ED4B21BB2D677F438
    @Test()
    void encodeWhenValueInstanceOfString() throws EncoderException {
        /* Branches:
         * (value == null) : false
         * (value instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        //Act Statement(s)
        Object result = target.encode((Object) "value1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encodeWhenValueNotInstanceOfStringThrowsEncoderException}, hash: 30420D555289EF4A8E1E17E182114CC2
    @Test()
    void encodeWhenValueNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (value == null) : false
         * (value instanceof String) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Objects of type java.lang.Object cannot be encoded using BCodec");
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

    //BaseRock generated method id: ${encode1Test}, hash: 056A3844B830696A6882085E41B36085
    @Disabled()
    @Test()
    void encode1Test() throws EncoderException {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = spy(new BCodec(charset, CodecPolicy.STRICT));
        doReturn("return_of_encode1").when(target).encode(eq("strSource1"), (Charset) any());
        //Act Statement(s)
        String result = target.encode("strSource1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_encode1"));
            verify(target).encode(eq("strSource1"), (Charset) any());
        });
    }

    //BaseRock generated method id: ${encode2Test}, hash: 6DD39F5A2FDB4690E023A69265D66C7D
    @Disabled()
    @Test()
    void encode2Test() throws EncoderException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        Charset charset2 = Charset.defaultCharset();
        //Act Statement(s)
        String result = target.encode("strSource1", charset2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${encode3Test}, hash: CD0F8CBA2E5A5DC345B037F98A74BE6A
    @Disabled()
    @Test()
    void encode3Test() throws EncoderException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        //Act Statement(s)
        String result = target.encode("strSource1", "sourceCharset1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${encode3WhenCaughtUnsupportedCharsetExceptionThrowsEncoderException}, hash: 1F0281C3BCCF99066D4AA8914A010655
    @Disabled()
    @Test()
    void encode3WhenCaughtUnsupportedCharsetExceptionThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (catch-exception (UnsupportedCharsetException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        UnsupportedCharsetException unsupportedCharsetException = new UnsupportedCharsetException("message1");
        EncoderException encoderException = new EncoderException("message1", unsupportedCharsetException);
        //Act Statement(s)
        final EncoderException result = assertThrows(EncoderException.class, () -> {
            target.encode("strSource1", "sourceCharset1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(encoderException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(unsupportedCharsetException.getClass())));
        });
    }

    //BaseRock generated method id: ${getEncodingTest}, hash: 6BB1449DAD6B6E7C4A534B5FC44BBE85
    @Test()
    void getEncodingTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        //Act Statement(s)
        String result = target.getEncoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("B")));
    }

    //BaseRock generated method id: ${isStrictDecodingWhenDecodingPolicyEqualsCodecPolicySTRICT}, hash: 2F36AD05AD9F63835D44CE1B4F7F1C37
    @Test()
    void isStrictDecodingWhenDecodingPolicyEqualsCodecPolicySTRICT() {
        /* Branches:
         * (decodingPolicy == CodecPolicy.STRICT) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.STRICT);
        //Act Statement(s)
        boolean result = target.isStrictDecoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isStrictDecodingWhenDecodingPolicyNotEqualsCodecPolicySTRICT}, hash: D98B57ED80A77C80B32965427E91E808
    @Test()
    void isStrictDecodingWhenDecodingPolicyNotEqualsCodecPolicySTRICT() {
        /* Branches:
         * (decodingPolicy == CodecPolicy.STRICT) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        BCodec target = new BCodec(charset, CodecPolicy.LENIENT);
        //Act Statement(s)
        boolean result = target.isStrictDecoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
