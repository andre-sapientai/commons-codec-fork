package org.apache.commons.codec.net;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.EncoderException;
import java.util.BitSet;
import org.mockito.MockedStatic;
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
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class URLCodecBaseRockGeneratedTest {

    //BaseRock generated method id: ${decodeUrlWhenBytesIsNull}, hash: 0F8AB73AD711B016563AC7B89A94A98B
    @Test()
    void decodeUrlWhenBytesIsNull() throws DecoderException {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = URLCodec.decodeUrl(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decodeUrlWhenBEquals___}, hash: 4FCF9A9107C3CFA1CA60FEC2136E9EEA
    @Test()
    void decodeUrlWhenBEquals___() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == '+') : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 43 };
        //Act Statement(s)
        byte[] result = URLCodec.decodeUrl(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 32 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${decodeUrlWhenBEqualsESCAPE_CHAR}, hash: 76E00B2EE335FA65ADC4254E9A303E51
    @Disabled()
    @Test()
    void decodeUrlWhenBEqualsESCAPE_CHAR() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == '+') : false
         * (b == ESCAPE_CHAR) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 37, (byte) 37, (byte) 37 };
        //Act Statement(s)
        byte[] result = URLCodec.decodeUrl(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 127 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${decodeUrlWhenBNotEqualsESCAPE_CHAR}, hash: 69E2D5CB1EB473DAD667FAAA5AEC4017
    @Test()
    void decodeUrlWhenBNotEqualsESCAPE_CHAR() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == '+') : false
         * (b == ESCAPE_CHAR) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        byte[] result = URLCodec.decodeUrl(byteArray);
        byte[] byteResultArray = new byte[] { (byte) 0 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${decodeUrlWhenCaughtArrayIndexOutOfBoundsExceptionThrowsDecoderException}, hash: C0408810F832B4FB00A348BA9A3B415F
    @Disabled()
    @Test()
    void decodeUrlWhenCaughtArrayIndexOutOfBoundsExceptionThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (bytes == null) : false
         * (i < bytes.length) : true
         * (b == '+') : false
         * (b == ESCAPE_CHAR) : true
         * (catch-exception (ArrayIndexOutOfBoundsException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Utils> utils = mockStatic(Utils.class)) {
            utils.when(() -> Utils.digit16((byte) 37)).thenReturn(0).thenReturn(37);
            byte[] byteArray = new byte[] { (byte) 37, (byte) 37, (byte) 37 };
            //Act Statement(s)
            final DecoderException result = assertThrows(DecoderException.class, () -> {
                URLCodec.decodeUrl(byteArray);
            });
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
            DecoderException decoderException = new DecoderException("Invalid URL encoding: ", arrayIndexOutOfBoundsException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(arrayIndexOutOfBoundsException.getClass())));
                utils.verify(() -> Utils.digit16((byte) 37), atLeast(2));
            });
        }
    }

    //BaseRock generated method id: ${encodeUrlWhenBytesIsNull}, hash: A089ADE9942FD332CA015095BE2A60C9
    @Test()
    void encodeUrlWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        byte[] _byte = null;
        //Act Statement(s)
        byte[] result = URLCodec.encodeUrl(bitSet, _byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encodeUrlWhenUrlsafeNotGetB}, hash: 366E8490AA16F06206D6E4B2F0669312
    @Disabled()
    @Test()
    void encodeUrlWhenUrlsafeNotGetB() {
        /* Branches:
         * (bytes == null) : false
         * (urlsafe == null) : true
         * (for-each(bytes)) : true
         * (b < 0) : true
         * (urlsafe.get(b)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] { (byte) -1 };
        //Act Statement(s)
        byte[] result = URLCodec.encodeUrl(bitSet, byteArray);
        byte[] byteResultArray = new byte[] { (byte) 37, (byte) 65, (byte) 65 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${encodeUrlWhenBEquals___}, hash: 89E6A7D2C83013C4EF91627AEB348617
    @Disabled()
    @Test()
    void encodeUrlWhenBEquals___() {
        /* Branches:
         * (bytes == null) : false
         * (urlsafe == null) : true
         * (for-each(bytes)) : true
         * (b < 0) : true
         * (urlsafe.get(b)) : true
         * (b == ' ') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = null;
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        byte[] result = URLCodec.encodeUrl(bitSet, byteArray);
        byte[] byteResultArray = new byte[] { (byte) 43 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${decodeTest}, hash: 5C05D7DEDC37AE68CB49B90F83D1EDEB
    @Test()
    void decodeTest() throws DecoderException {
        //Arrange Statement(s)
        try (MockedStatic<URLCodec> uRLCodec = mockStatic(URLCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            uRLCodec.when(() -> URLCodec.decodeUrl(byteArray2)).thenReturn(byteArray);
            URLCodec target = new URLCodec("charset1");
            //Act Statement(s)
            byte[] result = target.decode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                uRLCodec.verify(() -> URLCodec.decodeUrl(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenObjIsNull}, hash: 2AE40E294E360DF6A0CC942E50EFDA6C
    @Test()
    void decode1WhenObjIsNull() throws DecoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        Object object = null;
        //Act Statement(s)
        Object result = target.decode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode1WhenObjInstanceOfByteArray}, hash: BF9DC9D79A9D1627EF9C32D9713C5B68
    @Disabled()
    @Test()
    void decode1WhenObjInstanceOfByteArray() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : true
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
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

    //BaseRock generated method id: ${decode1WhenObjInstanceOfString}, hash: 18AC81ACA3E40D3CEB27B66AB18FE087
    @Disabled()
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
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        Object result = target.decode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decode1WhenObjNotInstanceOfStringThrowsDecoderException}, hash: BF80B09889D1403153DCB187821D2922
    @Test()
    void decode1WhenObjNotInstanceOfStringThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         * (obj instanceof String) : false
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        Object object = new Object();
        DecoderException decoderException = new DecoderException("Objects of type java.lang.Object cannot be URL decoded");
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

    //BaseRock generated method id: ${decode2WhenStrIsNull}, hash: 5B6BC44285CCC73D705D542490889579
    @Test()
    void decode2WhenStrIsNull() throws DecoderException {
        /* Branches:
         * (str == null) : true
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        String result = target.decode((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode2WhenStrIsNotNull}, hash: 3F4D38AAC0DB29258658011055D14F22
    @Disabled()
    @Test()
    void decode2WhenStrIsNotNull() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (str == null) : false
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
        doReturn("return_of_decode1").when(target).decode("str1", "charset1");
        //Act Statement(s)
        String result = target.decode("str1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_decode1"));
            verify(target).decode("str1", "charset1");
        });
    }

    //BaseRock generated method id: ${decode2WhenCaughtUnsupportedEncodingExceptionThrowsDecoderException}, hash: 69C7D13962AAAF311FFF594B650B50DE
    @Disabled()
    @Test()
    void decode2WhenCaughtUnsupportedEncodingExceptionThrowsDecoderException() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (str == null) : false
         * (catch-exception (UnsupportedEncodingException)) : true
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
        UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException("s1");
        doThrow(unsupportedEncodingException).when(target).decode("str1", "charset1");
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
            verify(target).decode("str1", "charset1");
        });
    }

    //BaseRock generated method id: ${decode3WhenStrIsNull}, hash: AF22A1C717868AFF2513C0464B3DA0AE
    @Test()
    void decode3WhenStrIsNull() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (str == null) : true
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        String result = target.decode((String) null, "charsetName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${decode3WhenStrIsNotNull}, hash: 78059771EBAE04273A26CF6CD5F661F7
    @Disabled()
    @Test()
    void decode3WhenStrIsNotNull() throws DecoderException, UnsupportedEncodingException {
        /* Branches:
         * (str == null) : false
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 65 };
        doReturn(byteArray).when(target).decode(byteArray2);
        //Act Statement(s)
        String result = target.decode("A", "charsetName1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).decode(byteArray2);
        });
    }

    //BaseRock generated method id: ${encodeTest}, hash: C74973BFBFBFE1D2795AAE0B1EAA5C01
    @Test()
    void encodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<URLCodec> uRLCodec = mockStatic(URLCodec.class)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            uRLCodec.when(() -> URLCodec.encodeUrl((BitSet) any(), eq(byteArray2))).thenReturn(byteArray);
            URLCodec target = new URLCodec("charset1");
            //Act Statement(s)
            byte[] result = target.encode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                uRLCodec.verify(() -> URLCodec.encodeUrl((BitSet) any(), eq(byteArray2)));
            });
        }
    }

    //BaseRock generated method id: ${encode1WhenObjIsNull}, hash: A48E6A646491BD716B9D369297D67810
    @Test()
    void encode1WhenObjIsNull() throws EncoderException {
        /* Branches:
         * (obj == null) : true
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        Object object = null;
        //Act Statement(s)
        Object result = target.encode(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode1WhenObjInstanceOfByteArray}, hash: 0C764C8EFC61BF5901B0A7CD5EEF9A30
    @Disabled()
    @Test()
    void encode1WhenObjInstanceOfByteArray() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : true
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
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

    //BaseRock generated method id: ${encode1WhenObjInstanceOfString}, hash: A6842591050DADF2CCDF28BA7E1D07CC
    @Disabled()
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
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        Object result = target.encode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encode1WhenObjNotInstanceOfStringThrowsEncoderException}, hash: EFE2B1676E5EE3AA958AA5C23963BCE0
    @Test()
    void encode1WhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (obj == null) : false
         * (obj instanceof byte[]) : false
         * (obj instanceof String) : false
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Objects of type java.lang.Object cannot be URL encoded");
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

    //BaseRock generated method id: ${encode2WhenStrIsNull}, hash: 60845E2442078176A2993086D4796C4B
    @Test()
    void encode2WhenStrIsNull() throws EncoderException {
        /* Branches:
         * (str == null) : true
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        String result = target.encode((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode2WhenStrIsNotNull}, hash: 3F78705188B0F985C8A024897EDE11CD
    @Disabled()
    @Test()
    void encode2WhenStrIsNotNull() throws EncoderException, UnsupportedEncodingException {
        /* Branches:
         * (str == null) : false
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
        doReturn("return_of_encode1").when(target).encode("str1", "charset1");
        //Act Statement(s)
        String result = target.encode("str1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_encode1"));
            verify(target).encode("str1", "charset1");
        });
    }

    //BaseRock generated method id: ${encode2WhenCaughtUnsupportedEncodingExceptionThrowsEncoderException}, hash: 85B93B4A21CA1D53BAC44BE33071CFB2
    @Disabled()
    @Test()
    void encode2WhenCaughtUnsupportedEncodingExceptionThrowsEncoderException() throws EncoderException, UnsupportedEncodingException {
        /* Branches:
         * (str == null) : false
         * (catch-exception (UnsupportedEncodingException)) : true
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
        UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException("s1");
        doThrow(unsupportedEncodingException).when(target).encode("str1", "charset1");
        EncoderException encoderException = new EncoderException("s1", unsupportedEncodingException);
        //Act Statement(s)
        final EncoderException result = assertThrows(EncoderException.class, () -> {
            target.encode("str1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(encoderException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(unsupportedEncodingException.getClass())));
            verify(target).encode("str1", "charset1");
        });
    }

    //BaseRock generated method id: ${encode3WhenStrIsNull}, hash: A67766E1B4F35853A224C1771849A194
    @Test()
    void encode3WhenStrIsNull() throws UnsupportedEncodingException {
        /* Branches:
         * (str == null) : true
         */
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        String result = target.encode((String) null, "charsetName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode3WhenStrIsNotNull}, hash: EE6597B8C0E9E16547150679231284E6
    @Disabled()
    @Test()
    void encode3WhenStrIsNotNull() throws UnsupportedEncodingException {
        /* Branches:
         * (str == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        URLCodec target = spy(new URLCodec("charset1"));
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

    //BaseRock generated method id: ${getDefaultCharsetTest}, hash: 1366E75B228395AA295563AC24B58B79
    @Test()
    void getDefaultCharsetTest() {
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        String result = target.getDefaultCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("charset1")));
    }

    //BaseRock generated method id: ${getEncodingTest}, hash: E8FC49B84A9F51F8BDAD4F91FDF9AC0F
    @Test()
    void getEncodingTest() {
        //Arrange Statement(s)
        URLCodec target = new URLCodec("charset1");
        //Act Statement(s)
        String result = target.getEncoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("charset1")));
    }
}
