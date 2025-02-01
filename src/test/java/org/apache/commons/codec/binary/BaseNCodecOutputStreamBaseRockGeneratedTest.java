package org.apache.commons.codec.binary;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BaseNCodecOutputStreamBaseRockGeneratedTest {

    private final Base32 baseNCodecMock = mock(Base32.class, "baseNCodec");

    //BaseRock generated method id: ${closeThrowsNullPointerException}, hash: 68519928F867EC41128B81D57643AF7B
    @Disabled()
    @Test()
    void closeThrowsNullPointerException() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = spy(new BaseNCodecOutputStream(byteArrayOutputStream, base32, false));
        doNothing().when(target).eof();
        doNothing().when(target).flush();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.close();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).eof();
            verify(target).flush();
        });
    }

    //BaseRock generated method id: ${eofWhenDoEncode}, hash: F9B499A11697607442373F46BE1F786F
    @Disabled()
    @Test()
    void eofWhenDoEncode() {
        /* Branches:
         * (doEncode) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        doNothing().when(baseNCodecMock).encode(eq(byteArray), eq(0), eq(-1), (BaseNCodec.Context) any());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, baseNCodecMock, true);
        //Act Statement(s)
        target.eof();
        //Assert statement(s)
        assertAll("result", () -> verify(baseNCodecMock).encode(eq(byteArray), eq(0), eq(-1), (BaseNCodec.Context) any()));
    }

    //BaseRock generated method id: ${flushWhenCGreaterThan0ThrowsNullPointerException}, hash: 58F26EE483390E41FA7E4717F00DE783
    @Disabled()
    @Test()
    void flushWhenCGreaterThan0ThrowsNullPointerException() throws IOException {
        /* Branches:
         * (avail > 0) : true  #  inside flush method
         * (c > 0) : true  #  inside flush method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, base32, false);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.flush();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${isStrictDecodingWhenBaseNCodecIsStrictDecoding}, hash: 81C2D4A6CAA7F5697EBA4ED80B189709
    @Disabled()
    @Test()
    void isStrictDecodingWhenBaseNCodecIsStrictDecoding() {
        /* Branches:
         * (baseNCodec.isStrictDecoding()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, base32, false);
        //Act Statement(s)
        boolean result = target.isStrictDecoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isStrictDecodingWhenBaseNCodecNotIsStrictDecoding}, hash: 94955AC1FDDB50BC3EBA3CCB4C692FE3
    @Disabled()
    @Test()
    void isStrictDecodingWhenBaseNCodecNotIsStrictDecoding() {
        /* Branches:
         * (baseNCodec.isStrictDecoding()) : false
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, base32, false);
        //Act Statement(s)
        boolean result = target.isStrictDecoding();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${writeWhenOffsetPlusLenGreaterThanArrayLengthThrowsIndexOutOfBoundsException}, hash: 079AFC230073818F5920E38C65EB4DB8
    @Disabled()
    @Test()
    void writeWhenOffsetPlusLenGreaterThanArrayLengthThrowsIndexOutOfBoundsException() throws IOException {
        /* Branches:
         * (offset < 0) : false
         * (len < 0) : false
         * (offset > array.length) : false
         * (offset + len > array.length) : true
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, base32, false);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            target.write(byteArray, 0, 1);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${writeWhenCGreaterThan0ThrowsNullPointerException}, hash: 618237E225B66F50CD9497E4F3765BB5
    @Disabled()
    @Test()
    void writeWhenCGreaterThan0ThrowsNullPointerException() throws IOException {
        /* Branches:
         * (offset < 0) : false
         * (len < 0) : false
         * (offset > array.length) : false
         * (offset + len > array.length) : false
         * (len > 0) : true
         * (doEncode) : true
         * (avail > 0) : true  #  inside flush method
         * (c > 0) : true  #  inside flush method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, base32, true);
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.write(byteArray, 0, 1);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${writeWhenNotPropagate}, hash: 232E459DA2C1CD6E887B233508C2DF45
    @Disabled()
    @Test()
    void writeWhenNotPropagate() throws IOException {
        /* Branches:
         * (offset < 0) : false
         * (len < 0) : false
         * (offset > array.length) : false
         * (offset + len > array.length) : false
         * (len > 0) : true
         * (doEncode) : false
         * (avail > 0) : false  #  inside flush method
         * (propagate) : false  #  inside flush method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        doNothing().when(baseNCodecMock).decode(eq(byteArray), eq(0), eq(1), (BaseNCodec.Context) any());
        doReturn(-1).when(baseNCodecMock).available((BaseNCodec.Context) any());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BaseNCodecOutputStream target = new BaseNCodecOutputStream(byteArrayOutputStream, baseNCodecMock, false);
        //Act Statement(s)
        target.write(byteArray, 0, 1);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(baseNCodecMock).decode(eq(byteArray), eq(0), eq(1), (BaseNCodec.Context) any());
            verify(baseNCodecMock).available((BaseNCodec.Context) any());
        });
    }

    //BaseRock generated method id: ${write1Test}, hash: 27B4F5812D32AE365088C467902DB2EE
    @Disabled()
    @Test()
    void write1Test() throws IOException {
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base32 base32 = new Base32();
        BaseNCodecOutputStream target = spy(new BaseNCodecOutputStream(byteArrayOutputStream, base32, false));
        byte[] byteArray = new byte[] { (byte) 1 };
        doNothing().when(target).write(byteArray, 0, 1);
        //Act Statement(s)
        target.write(1);
        //Assert statement(s)
        assertAll("result", () -> verify(target).write(byteArray, 0, 1));
    }
}
