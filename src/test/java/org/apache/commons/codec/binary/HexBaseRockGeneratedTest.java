package org.apache.commons.codec.binary;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.mockito.MockedStatic;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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
class HexBaseRockGeneratedTest {

    //BaseRock generated method id: ${decodeHexTest}, hash: 0BC2E744D847EC8BD546667B9C0189CA
    @Test()
    void decodeHexTest() throws DecoderException {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.decodeHex(charArray, byteArray, 0)).thenReturn(0);
            //Act Statement(s)
            byte[] result = Hex.decodeHex(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                hex.verify(() -> Hex.decodeHex(charArray, byteArray, 0), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decodeHex1WhenLenAnd1NotEquals0ThrowsDecoderException}, hash: 04B18BAD2D80B25127DDEE09758121CF
    @Disabled()
    @Test()
    void decodeHex1WhenLenAnd1NotEquals0ThrowsDecoderException() throws DecoderException {
        /* Branches:
         * ((len & 0x01) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[] {};
        byte[] byteArray = new byte[] {};
        DecoderException decoderException = new DecoderException("Odd number of characters.");
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            Hex.decodeHex(charArray, byteArray, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
        });
    }

    //BaseRock generated method id: ${decodeHex1WhenOutLengthMinusOutOffsetLessThanOutLenThrowsDecoderException}, hash: 0BF89EA1A3C75155F81ECDC68EA66991
    @Test()
    void decodeHex1WhenOutLengthMinusOutOffsetLessThanOutLenThrowsDecoderException() throws DecoderException {
        /* Branches:
         * ((len & 0x01) != 0) : false
         * (out.length - outOffset < outLen) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[] {};
        byte[] byteArray = new byte[] {};
        DecoderException decoderException = new DecoderException("Output array is not large enough to accommodate decoded data.");
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            Hex.decodeHex(charArray, byteArray, 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
        });
    }

    //BaseRock generated method id: ${decodeHex1WhenJLessThanLen}, hash: 40637141AA1662EFFF55D7F2B7F5AB95
    @Disabled()
    @Test()
    void decodeHex1WhenJLessThanLen() throws DecoderException {
        /* Branches:
         * ((len & 0x01) != 0) : false
         * (out.length - outOffset < outLen) : false
         * (j < len) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            hex.when(() -> Hex.toDigit('A', 0)).thenReturn(0);
            hex.when(() -> Hex.toDigit('A', 1)).thenReturn(0);
            char[] charArray = new char[] { 'A', 'A' };
            byte[] byteArray = new byte[] { (byte) 0 };
            //Act Statement(s)
            int result = Hex.decodeHex(charArray, byteArray, 0);
            byte[] byteByteArrayArray = new byte[] { (byte) 0 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                assertThat(byteArray, equalTo(byteByteArrayArray));
                hex.verify(() -> Hex.toDigit('A', 0), atLeast(1));
                hex.verify(() -> Hex.toDigit('A', 1), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decodeHex2Test}, hash: 64E8637EB0C8AAEFB61FDCCC6AB18639
    @Test()
    void decodeHex2Test() throws DecoderException {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] { 'A' };
            hex.when(() -> Hex.decodeHex(charArray)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = Hex.decodeHex("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                hex.verify(() -> Hex.decodeHex(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHexTest}, hash: 5502198C6C7A3543C81BA73A576FDE6B
    @Test()
    void encodeHexTest() {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHex(byteArray, true)).thenReturn(charArray);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray, true), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex1WhenToLowerCase}, hash: 2472989CA88DFB0C064055145FE6234F
    @Test()
    void encodeHex1WhenToLowerCase() {
        /* Branches:
         * (toLowerCase) : true  #  inside toAlphabet method
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            char[] charArray2 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
            hex.when(() -> Hex.encodeHex(byteArray, charArray2)).thenReturn(charArray);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteArray, true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray, charArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex1WhenNotToLowerCase}, hash: A6DFB4AA71F64AEEC89046D35893B23D
    @Test()
    void encodeHex1WhenNotToLowerCase() {
        /* Branches:
         * (toLowerCase) : false  #  inside toAlphabet method
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            char[] charArray2 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
            hex.when(() -> Hex.encodeHex(byteArray, charArray2)).thenReturn(charArray);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray, charArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex2WhenILessThanDataOffsetPlusDataLen}, hash: E5CCF3209A84F5A9BA82C17BCBAD9AE0
    @Test()
    void encodeHex2WhenILessThanDataOffsetPlusDataLen() {
        /* Branches:
         * (i < dataOffset + dataLen) : true  #  inside encodeHex method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        char[] charArray = new char[] { 'A' };
        //Act Statement(s)
        char[] result = Hex.encodeHex(byteArray, charArray);
        char[] charResultArray = new char[] { 'A', 'A' };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //BaseRock generated method id: ${encodeHex3WhenILessThanDataOffsetPlusDataLen}, hash: 2709352919FD939ABEAA2D928E88AD12
    @Test()
    void encodeHex3WhenILessThanDataOffsetPlusDataLen() {
        /* Branches:
         * (toLowerCase) : true  #  inside toAlphabet method
         * (i < dataOffset + dataLen) : true  #  inside encodeHex method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        //Act Statement(s)
        char[] result = Hex.encodeHex(byteArray, 0, 1, true);
        char[] charResultArray = new char[] { '0', '0' };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //BaseRock generated method id: ${encodeHex3WhenNotToLowerCaseAndINotLessThanDataOffsetPlusDataLen}, hash: BCD84509BBB18B1810EBFABD253E3A70
    @Test()
    void encodeHex3WhenNotToLowerCaseAndINotLessThanDataOffsetPlusDataLen() {
        /* Branches:
         * (toLowerCase) : false  #  inside toAlphabet method
         * (i < dataOffset + dataLen) : false  #  inside encodeHex method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        char[] result = Hex.encodeHex(byteArray, 0, 0, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${encodeHex4WhenILessThanDataOffsetPlusDataLen}, hash: 7FBD6AA99124088FCEAE515CD65C4FF7
    @Test()
    void encodeHex4WhenILessThanDataOffsetPlusDataLen() {
        /* Branches:
         * (toLowerCase) : true  #  inside toAlphabet method
         * (i < dataOffset + dataLen) : true  #  inside encodeHex method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0 };
        char[] charArray = new char[] { 'A', 'A' };
        //Act Statement(s)
        Hex.encodeHex(byteArray, 0, 1, true, charArray, 0);
    }

    //BaseRock generated method id: ${encodeHex4WhenNotToLowerCaseAndINotLessThanDataOffsetPlusDataLen}, hash: 9BF7B1D77663574E0D06B36E88856AEB
    @Test()
    void encodeHex4WhenNotToLowerCaseAndINotLessThanDataOffsetPlusDataLen() {
        /* Branches:
         * (toLowerCase) : false  #  inside toAlphabet method
         * (i < dataOffset + dataLen) : false  #  inside encodeHex method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        char[] charArray = new char[] {};
        //Act Statement(s)
        Hex.encodeHex(byteArray, 0, 0, false, charArray, 0);
    }

    //BaseRock generated method id: ${encodeHex6Test}, hash: D3623AB5D3D5F3293D43705DEF14F2F7
    @Test()
    void encodeHex6Test() {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            hex.when(() -> Hex.encodeHex((ByteBuffer) any(), eq(true))).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex((ByteBuffer) any(), eq(true)), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex7WhenToLowerCase}, hash: 258EF0230FF221EA6DF19BBECE21E82B
    @Test()
    void encodeHex7WhenToLowerCase() {
        /* Branches:
         * (toLowerCase) : true  #  inside toAlphabet method
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            char[] charArray2 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
            hex.when(() -> Hex.encodeHex((ByteBuffer) any(), eq(charArray2))).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteBuffer, true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex((ByteBuffer) any(), eq(charArray2)), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex7WhenNotToLowerCase}, hash: B1A864EC98EDF7B375E793BBDFE614BE
    @Test()
    void encodeHex7WhenNotToLowerCase() {
        /* Branches:
         * (toLowerCase) : false  #  inside toAlphabet method
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            char[] charArray2 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
            hex.when(() -> Hex.encodeHex((ByteBuffer) any(), eq(charArray2))).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteBuffer, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex((ByteBuffer) any(), eq(charArray2)), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex8WhenRemainingEqualsByteArrayLength}, hash: B1EE049850861CBE1720CADB755825BF
    @Disabled()
    @Test()
    void encodeHex8WhenRemainingEqualsByteArrayLength() {
        /* Branches:
         * (byteBuffer.hasArray()) : true  #  inside toByteArray method
         * (remaining == byteArray.length) : true  #  inside toByteArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            char[] charArray2 = new char[] {};
            hex.when(() -> Hex.encodeHex(byteArray, charArray2)).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteBuffer, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray, charArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHex8WhenRemainingNotEqualsByteArrayLength}, hash: 7AAA2345E47D4F390BABBBF38FC1C7A3
    @Disabled()
    @Test()
    void encodeHex8WhenRemainingNotEqualsByteArrayLength() {
        /* Branches:
         * (byteBuffer.hasArray()) : true  #  inside toByteArray method
         * (remaining == byteArray.length) : false  #  inside toByteArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] { (byte) 0 };
            char[] charArray2 = new char[] {};
            hex.when(() -> Hex.encodeHex(byteArray, charArray2)).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            char[] result = Hex.encodeHex(byteBuffer, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray, charArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHexStringTest}, hash: BDA52802CA5861BFEAB73DE0D7580D7D
    @Test()
    void encodeHexStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] { 'A' };
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHex(byteArray)).thenReturn(charArray);
            //Act Statement(s)
            String result = Hex.encodeHexString(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                hex.verify(() -> Hex.encodeHex(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHexString1Test}, hash: E60F2AF0DEB0492AF96DB900430DA5E4
    @Test()
    void encodeHexString1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] { 'A' };
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHex(byteArray, false)).thenReturn(charArray);
            //Act Statement(s)
            String result = Hex.encodeHexString(byteArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                hex.verify(() -> Hex.encodeHex(byteArray, false), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHexString2Test}, hash: A7264A5E3A302626C2DCC3A60BC2082A
    @Test()
    void encodeHexString2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] { 'A' };
            hex.when(() -> Hex.encodeHex((ByteBuffer) any())).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            String result = Hex.encodeHexString(byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                hex.verify(() -> Hex.encodeHex((ByteBuffer) any()), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeHexString3Test}, hash: 398D60D6FD22F9F6E217EF0EFC3A17DC
    @Test()
    void encodeHexString3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] { 'A' };
            hex.when(() -> Hex.encodeHex((ByteBuffer) any(), eq(false))).thenReturn(charArray);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            String result = Hex.encodeHexString(byteBuffer, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                hex.verify(() -> Hex.encodeHex((ByteBuffer) any(), eq(false)), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${toDigitWhenDigitEqualsMinus1ThrowsDecoderException}, hash: BFD707B2FD543E049A6DE04B0C6347D7
    @Disabled()
    @Test()
    void toDigitWhenDigitEqualsMinus1ThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (digit == -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DecoderException decoderException = new DecoderException("message1");
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            Hex.toDigit('A', 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
        });
    }

    //BaseRock generated method id: ${toDigitWhenDigitNotEqualsMinus1}, hash: 23AD07A57DD99B125D9C5294E909727B
    @Test()
    void toDigitWhenDigitNotEqualsMinus1() throws DecoderException {
        /* Branches:
         * (digit == -1) : false
         */
        //Act Statement(s)
        int result = Hex.toDigit('A', 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(10)));
    }

    //BaseRock generated method id: ${decodeTest}, hash: A1D34B0A7CD6F9D4652DEC2258A5BABE
    @Disabled()
    @Test()
    void decodeTest() throws DecoderException {
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] { 'A' };
            hex.when(() -> Hex.decodeHex(charArray)).thenReturn(byteArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            byte[] byteArray2 = new byte[] {};
            //Act Statement(s)
            byte[] result = target.decode(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                hex.verify(() -> Hex.decodeHex(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenRemainingEqualsByteArrayLength}, hash: AFF4D466F213B00F23F2FED5B5878F69
    @Disabled()
    @Test()
    void decode1WhenRemainingEqualsByteArrayLength() throws DecoderException {
        /* Branches:
         * (byteBuffer.hasArray()) : true  #  inside toByteArray method
         * (remaining == byteArray.length) : true  #  inside toByteArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] { 'A' };
            hex.when(() -> Hex.decodeHex(charArray)).thenReturn(byteArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            byte[] result = target.decode(byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                hex.verify(() -> Hex.decodeHex(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode1WhenRemainingNotEqualsByteArrayLength}, hash: 15FC59C9BAF7F5ECB89B4669A10ADEFE
    @Disabled()
    @Test()
    void decode1WhenRemainingNotEqualsByteArrayLength() throws DecoderException {
        /* Branches:
         * (byteBuffer.hasArray()) : true  #  inside toByteArray method
         * (remaining == byteArray.length) : false  #  inside toByteArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] { 'A' };
            hex.when(() -> Hex.decodeHex(charArray)).thenReturn(byteArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            byte[] result = target.decode(byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                hex.verify(() -> Hex.decodeHex(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode2WhenObjectInstanceOfString}, hash: 5A9A9CE2CB85FA7418698D95F6FE6D3D
    @Disabled()
    @Test()
    void decode2WhenObjectInstanceOfString() throws DecoderException {
        /* Branches:
         * (object instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = new Hex(charset);
        //Act Statement(s)
        Object result = target.decode((Object) "A");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${decode2WhenObjectInstanceOfByteArray}, hash: B422546F635D6A8DD5471855E4080F5A
    @Disabled()
    @Test()
    void decode2WhenObjectInstanceOfByteArray() throws DecoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof byte[]) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = spy(new Hex(charset));
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

    //BaseRock generated method id: ${decode2WhenObjectInstanceOfByteBuffer}, hash: 9DC98D8840155EFDF21DB09D9D470F61
    @Disabled()
    @Test()
    void decode2WhenObjectInstanceOfByteBuffer() throws DecoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof byte[]) : false
         * (object instanceof ByteBuffer) : true
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = spy(new Hex(charset));
        byte[] byteArray = new byte[] {};
        doReturn(byteArray).when(target).decode((ByteBuffer) any());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        Object result = target.decode((Object) byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray));
            verify(target).decode((ByteBuffer) any());
        });
    }

    //BaseRock generated method id: ${decode2WhenObjectNotInstanceOfByteBuffer}, hash: 802891EBDA16CF7A8035877E20ECF19B
    @Test()
    void decode2WhenObjectNotInstanceOfByteBuffer() throws DecoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof byte[]) : false
         * (object instanceof ByteBuffer) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            byte[] byteArray = new byte[] {};
            char[] charArray = new char[] {};
            hex.when(() -> Hex.decodeHex(charArray)).thenReturn(byteArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            //Act Statement(s)
            Object result = target.decode((Object) charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                hex.verify(() -> Hex.decodeHex(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${decode2WhenCaughtClassCastExceptionThrowsDecoderException}, hash: E58956E426D2687ACA47F0CFF68420F0
    @Test()
    void decode2WhenCaughtClassCastExceptionThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof byte[]) : false
         * (object instanceof ByteBuffer) : false
         * (catch-exception (ClassCastException)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            ClassCastException classCastException = new ClassCastException("s1");
            char[] charArray = new char[] {};
            hex.when(() -> Hex.decodeHex(charArray)).thenThrow(classCastException);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            //Act Statement(s)
            final DecoderException result = assertThrows(DecoderException.class, () -> {
                target.decode((Object) charArray);
            });
            DecoderException decoderException = new DecoderException("s1", classCastException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(classCastException.getClass())));
                hex.verify(() -> Hex.decodeHex(charArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encodeTest}, hash: D20B320C08ACBD8212EC356F8A325303
    @Disabled()
    @Test()
    void encodeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHexString(byteArray)).thenReturn("return_of_encodeHexString1");
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            //Act Statement(s)
            byte[] result = target.encode(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hex.verify(() -> Hex.encodeHexString(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encode1Test}, hash: 014F772271DB54FFD093E976F08EE5F4
    @Disabled()
    @Test()
    void encode1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            hex.when(() -> Hex.encodeHexString((ByteBuffer) any())).thenReturn("return_of_encodeHexString1");
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            byte[] result = target.encode(byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                hex.verify(() -> Hex.encodeHexString((ByteBuffer) any()));
            });
        }
    }

    //BaseRock generated method id: ${encode2WhenObjectInstanceOfString}, hash: 08F056EDFA0279E35260BA71620EAFD0
    @Disabled()
    @Test()
    void encode2WhenObjectInstanceOfString() throws EncoderException {
        /* Branches:
         * (object instanceof String) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHex(byteArray)).thenReturn(charArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            //Act Statement(s)
            Object result = target.encode((Object) "object1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encode2WhenObjectNotInstanceOfByteBuffer}, hash: 66CCB1581EF9451F3D4EC2721E9E75FE
    @Test()
    void encode2WhenObjectNotInstanceOfByteBuffer() throws EncoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof ByteBuffer) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHex(byteArray)).thenReturn(charArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            //Act Statement(s)
            Object result = target.encode((Object) byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encode2WhenCaughtClassCastExceptionThrowsEncoderException}, hash: 0CF4E5F0944DA40DC8E23A04D68E7DEC
    @Disabled()
    @Test()
    void encode2WhenCaughtClassCastExceptionThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof ByteBuffer) : false
         * (catch-exception (ClassCastException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = new Hex(charset);
        byte[] byteArray = new byte[] {};
        ClassCastException classCastException = new ClassCastException("message1");
        EncoderException encoderException = new EncoderException("message1", classCastException);
        //Act Statement(s)
        final EncoderException result = assertThrows(EncoderException.class, () -> {
            target.encode((Object) byteArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(encoderException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(classCastException.getClass())));
        });
    }

    //BaseRock generated method id: ${encode2WhenRemainingEqualsByteArrayLength}, hash: C3C9A4AB98C7DA282660560589D82347
    @Disabled()
    @Test()
    void encode2WhenRemainingEqualsByteArrayLength() throws EncoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof ByteBuffer) : true
         * (byteBuffer.hasArray()) : true  #  inside toByteArray method
         * (remaining == byteArray.length) : true  #  inside toByteArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] {};
            hex.when(() -> Hex.encodeHex(byteArray)).thenReturn(charArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Object result = target.encode((Object) byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${encode2WhenRemainingNotEqualsByteArrayLength}, hash: 81F1FC7CF3FF091CD3BD7EB778B3D435
    @Disabled()
    @Test()
    void encode2WhenRemainingNotEqualsByteArrayLength() throws EncoderException {
        /* Branches:
         * (object instanceof String) : false
         * (object instanceof ByteBuffer) : true
         * (byteBuffer.hasArray()) : true  #  inside toByteArray method
         * (remaining == byteArray.length) : false  #  inside toByteArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Hex> hex = mockStatic(Hex.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            byte[] byteArray = new byte[] { (byte) 0 };
            hex.when(() -> Hex.encodeHex(byteArray)).thenReturn(charArray);
            Charset charset = Charset.defaultCharset();
            Hex target = new Hex(charset);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
            //Act Statement(s)
            Object result = target.encode((Object) byteBuffer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                hex.verify(() -> Hex.encodeHex(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getCharsetTest}, hash: 03B8A2B1950510862A9869595FD150E8
    @Test()
    void getCharsetTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = new Hex(charset);
        //Act Statement(s)
        Charset result = target.getCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //BaseRock generated method id: ${getCharsetNameTest}, hash: A73EE892B5E02026423A015F2AA71BE2
    @Test()
    void getCharsetNameTest() {
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = new Hex(charset);
        //Act Statement(s)
        String result = target.getCharsetName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("UTF-8")));
    }

    //BaseRock generated method id: ${toStringTest}, hash: B13697674936D21ED5FBFAC1B0924396
    @Disabled()
    @Test()
    void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        Hex target = new Hex(charset);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A[charsetName=charset2]")));
    }
}
