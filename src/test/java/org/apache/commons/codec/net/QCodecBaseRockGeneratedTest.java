package org.apache.commons.codec.net;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.EncoderException;
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
import static org.mockito.Mockito.doThrow;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class QCodecBaseRockGeneratedTest {

    //BaseRock generated method id: ${decodeWhenObjIsNull}, hash: 20B0F73C008F69310BC4C6EC6B5AA97C
    @Test()
    void decodeWhenObjIsNull() throws DecoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        Object object = null;
        //Act Statement(s)
        Object result = target.decode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decodeWhenObjInstanceOfString}, hash: 4878C62CA42FC2CB6B5DFA2A5812F4CA
    @Disabled()
    @Test()
    void decodeWhenObjInstanceOfString() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        //Act Statement(s)
        Object result = target.decode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decodeWhenObjNotInstanceOfStringThrowsDecoderException}, hash: 33ADC81758AFE988B9034659FF124C79
    @Test()
    void decodeWhenObjNotInstanceOfStringThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof String) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        Object object = new Object();
        DecoderException decoderException = new DecoderException("Objects of type java.lang.Object cannot be decoded using Q codec");
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

    //BaseRock generated method id: ${decode1Test}, hash: FAC205FF24006B9C16D61E5F529BFE03
    @Disabled()
    @Test()
    void decode1Test() throws DecoderException, UnsupportedEncodingException {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = spy(new QCodec(charset));
        doReturn("return_of_decodeText1").when(target).decodeText("str1");
        //Act Statement(s)
        String result = target.decode("str1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_decodeText1"));
            verify(target).decodeText("str1");
        });
    }

    //BaseRock generated method id: ${decode1WhenCaughtUnsupportedEncodingExceptionThrowsDecoderException}, hash: 0B43CC94E97F6F23778A327F33191A02
    @Disabled()
    @Test()
    void decode1WhenCaughtUnsupportedEncodingExceptionThrowsDecoderException() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (catch-exception (UnsupportedEncodingException)) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = spy(new QCodec(charset));
        UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException("s1");
        doThrow(unsupportedEncodingException).when(target).decodeText("str1");
        DecoderException decoderException = new DecoderException("s1", unsupportedEncodingException);
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            target.decode("str1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(unsupportedEncodingException.getClass())));
            verify(target).decodeText("str1");
        });
    }

    //BaseRock generated method id: ${doDecodingWhenBytesIsNull}, hash: 908DC617E0C5C7018EE2A63666CEB48F
    @Test()
    void doDecodingWhenBytesIsNull() throws DecoderException {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = target.doDecoding(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${doDecodingWhenBNotEqualsUNDERSCOREAndNotHasUnderscores}, hash: 57CE1B92B644A4DFF13DAB43F42469D2
    @Test()
    void doDecodingWhenBNotEqualsUNDERSCOREAndNotHasUnderscores() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true
         * (b == UNDERSCORE) : false
         * (hasUnderscores) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        byte[] result = target.doDecoding(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 0 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${doDecodingWhenBEqualsUNDERSCORE}, hash: FC387709EE3145D09A352D880873287E
    @Test()
    void doDecodingWhenBEqualsUNDERSCORE() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (for-each(bytes)) : true
         * (b == UNDERSCORE) : true
         * (hasUnderscores) : true
         * (i < bytes.length) : true
         * (b != UNDERSCORE) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        byte[] byteArray = new byte[] { (byte) 95 };
        //Act Statement(s)
        byte[] result = target.doDecoding(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 32 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${doEncodingWhenBytesIsNull}, hash: 78A16BC3A4F1B51C8AD5D9B3F9F369A3
    @Test()
    void doEncodingWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = target.doEncoding(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${doEncodingWhenThisNotEncodeBlanks}, hash: 7C5D327B00EEF8862E8D5370222EEB13
    @Test()
    void doEncodingWhenThisNotEncodeBlanks() {
        /* Branches:
         * (bytes == null) : false
         * (this.encodeBlanks) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = target.doEncoding(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeWhenObjIsNull}, hash: 76C6FE7F10E259F617FA14F8C7FAF3D7
    @Test()
    void encodeWhenObjIsNull() throws EncoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        Object object = null;
        //Act Statement(s)
        Object result = target.encode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encodeWhenObjInstanceOfString}, hash: EA8A1E3CC6E3CDBE9D206EB66CBC8A6D
    @Test()
    void encodeWhenObjInstanceOfString() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        //Act Statement(s)
        Object result = target.encode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encodeWhenObjNotInstanceOfStringThrowsEncoderException}, hash: BC28A0A685AEA0D3F908B0304F9E2CD3
    @Test()
    void encodeWhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof String) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Objects of type java.lang.Object cannot be encoded using Q codec");
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

    //BaseRock generated method id: ${encode1Test}, hash: 189A62A876867FE47BDD6D2B822543DB
    @Disabled()
    @Test()
    void encode1Test() throws EncoderException {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = spy(new QCodec(charset));
        doReturn("return_of_encode1").when(target).encode(eq("sourceStr1"), (Charset) any());
        //Act Statement(s)
        String result = target.encode("sourceStr1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_encode1"));
            verify(target).encode(eq("sourceStr1"), (Charset) any());
        });
    }

    //BaseRock generated method id: ${encode2Test}, hash: 2391DEBB542A77B4FF96B23005D1496E
    @Disabled()
    @Test()
    void encode2Test() throws EncoderException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        Charset charset2 = Charset.defaultCharset();
        //Act Statement(s)
        String result = target.encode("sourceStr1", charset2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${encode3Test}, hash: A51F05BE24CCB7309A24943A430DD139
    @Disabled()
    @Test()
    void encode3Test() throws EncoderException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        //Act Statement(s)
        String result = target.encode("sourceStr1", "sourceCharset1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${encode3WhenCaughtUnsupportedCharsetExceptionThrowsEncoderException}, hash: 987AAC6EAF341A21F5F8A4C7E55A082E
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
        QCodec target = new QCodec(charset);
        UnsupportedCharsetException unsupportedCharsetException = new UnsupportedCharsetException("message1");
        EncoderException encoderException = new EncoderException("message1", unsupportedCharsetException);
        //Act Statement(s)
        final EncoderException result = assertThrows(EncoderException.class, () -> {
            target.encode("sourceStr1", "sourceCharset1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(encoderException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(unsupportedCharsetException.getClass())));
        });
    }

    //BaseRock generated method id: ${getEncodingTest}, hash: DC376E59D767D3F757FB35869FB39BB5
    @Test()
    void getEncodingTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        //Act Statement(s)
        String result = target.getEncoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Q")));
    }

    //BaseRock generated method id: ${isEncodeBlanksTest}, hash: D7C1D6E9227F5907FEA43CCC56D0E377
    @Test()
    void isEncodeBlanksTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        //Act Statement(s)
        boolean result = target.isEncodeBlanks();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${setEncodeBlanksTest}, hash: A6B88DB67487CC458BA4813E953ED9C9
    @Test()
    void setEncodeBlanksTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        QCodec target = new QCodec(charset);
        //Act Statement(s)
        target.setEncodeBlanks(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.isEncodeBlanks(), equalTo(Boolean.FALSE)));
    }
}
