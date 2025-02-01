package org.apache.commons.codec.binary;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.nio.ByteBuffer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringUtilsBaseRockGeneratedTest {

    //BaseRock generated method id: ${equalsWhenCs1EqualsCs2}, hash: 68E092AF1BA610EF8C1330E9EDF4F88E
    @Test()
    void equalsWhenCs1EqualsCs2() {
        /* Branches:
         * (cs1 == cs2) : true
         */
        //Act Statement(s)
        boolean result = StringUtils.equals("cs1", "cs1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${equalsWhenCs2IsNull}, hash: B33596BEF4892D4F60BBB3204BF92733
    @Test()
    void equalsWhenCs2IsNull() {
        /* Branches:
         * (cs1 == cs2) : false
         * (cs1 == null) : false
         * (cs2 == null) : true
         */
        //Arrange Statement(s)
        CharSequence charSequence = null;
        //Act Statement(s)
        boolean result = StringUtils.equals("cs1", charSequence);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${equalsWhenCs2InstanceOfStringAndCs1EqualsCs2}, hash: AF0CA0D837551197ED6CC117BA7D41CC
    @Test()
    void equalsWhenCs2InstanceOfStringAndCs1EqualsCs2() {
        /* Branches:
         * (cs1 == cs2) : false
         * (cs1 == null) : false
         * (cs2 == null) : false
         * (cs1 instanceof String) : true
         * (cs2 instanceof String) : true
         * (cs1.equals(cs2)) : true
         */
        //Act Statement(s)
        boolean result = StringUtils.equals("A", "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${equalsWhenCs1NotEqualsCs2}, hash: 9DAC3D9E7AAD39166A607D4729AA6D54
    @Test()
    void equalsWhenCs1NotEqualsCs2() {
        /* Branches:
         * (cs1 == cs2) : false
         * (cs1 == null) : false
         * (cs2 == null) : false
         * (cs1 instanceof String) : true
         * (cs2 instanceof String) : true
         * (cs1.equals(cs2)) : false
         */
        //Act Statement(s)
        boolean result = StringUtils.equals("A", "B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${equalsWhenCs1LengthEqualsCs2LengthAndCharSequenceUtilsRegionMatchesCs1False0Cs20Cs1Length}, hash: 4470D77AF8B5ABBC5D235F2C0EFEE553
    @Disabled()
    @Test()
    void equalsWhenCs1LengthEqualsCs2LengthAndCharSequenceUtilsRegionMatchesCs1False0Cs20Cs1Length() {
        /* Branches:
         * (cs1 == cs2) : false
         * (cs1 == null) : false
         * (cs2 == null) : false
         * (cs1 instanceof String) : true
         * (cs2 instanceof String) : false
         * (cs1.length() == cs2.length()) : true
         * (CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, cs1.length())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = StringUtils.equals("A", "cs2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${equalsWhenCs1LengthEqualsCs2LengthAndCharSequenceUtilsNotRegionMatchesCs1False0Cs20Cs1Length}, hash: 179CBF91F9D2E1607CE26E911CCBB691
    @Test()
    void equalsWhenCs1LengthEqualsCs2LengthAndCharSequenceUtilsNotRegionMatchesCs1False0Cs20Cs1Length() {
        /* Branches:
         * (cs1 == cs2) : false
         * (cs1 == null) : false
         * (cs2 == null) : false
         * (cs1 instanceof String) : true
         * (cs2 instanceof String) : false
         * (cs1.length() == cs2.length()) : true
         * (CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, cs1.length())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = StringUtils.equals("A", "cs2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${getByteBufferUtf8WhenStringIsNull}, hash: 12D8E7601E379D90FD53CF32F3F0C3BF
    @Test()
    void getByteBufferUtf8WhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getByteBuffer method
         */
        //Act Statement(s)
        ByteBuffer result = StringUtils.getByteBufferUtf8((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getByteBufferUtf8WhenStringIsNotNull}, hash: 7DA7B1DAE29A11E0D823D06016615E71
    @Test()
    void getByteBufferUtf8WhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getByteBuffer method
         */
        //Act Statement(s)
        ByteBuffer result = StringUtils.getByteBufferUtf8("string1");
        byte[] byteArray = new byte[] { (byte) 115, (byte) 116, (byte) 114, (byte) 105, (byte) 110, (byte) 103, (byte) 49 };
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteBuffer)));
    }

    //BaseRock generated method id: ${getBytesIso8859_1WhenStringIsNull}, hash: 57C7841BAE110B634EE265D13C72BECE
    @Test()
    void getBytesIso8859_1WhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesIso8859_1((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesIso8859_1WhenStringIsNotNull}, hash: B7C475573C07CE1227C45CBC7A135677
    @Test()
    void getBytesIso8859_1WhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesIso8859_1("string1");
        byte[] byteResultArray = new byte[] { (byte) 115, (byte) 116, (byte) 114, (byte) 105, (byte) 110, (byte) 103, (byte) 49 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${getBytesUncheckedWhenStringIsNull}, hash: B7E424072F82E91DFBA1F44BEFC11788
    @Test()
    void getBytesUncheckedWhenStringIsNull() {
        /* Branches:
         * (string == null) : true
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUnchecked((String) null, "charsetName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesUncheckedWhenStringIsNotNull}, hash: 7EDB5F09A636EED169F1154FF05868A4
    @Disabled()
    @Test()
    void getBytesUncheckedWhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUnchecked("B", "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //BaseRock generated method id: ${getBytesUncheckedWhenCaughtUnsupportedEncodingExceptionThrowsIllegalStateException}, hash: EA249B0A598F3A503D3126BEA432C81D
    @Disabled()
    @Test()
    void getBytesUncheckedWhenCaughtUnsupportedEncodingExceptionThrowsIllegalStateException() {
        /* Branches:
         * (string == null) : false
         * (catch-exception (UnsupportedEncodingException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("A: unsupportedEncodingException");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            StringUtils.getBytesUnchecked("B", "A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //BaseRock generated method id: ${getBytesUsAsciiWhenStringIsNull}, hash: CD1F08CE788C9F9F4C2FA4B35B74F1F8
    @Test()
    void getBytesUsAsciiWhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUsAscii((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesUsAsciiWhenStringIsNotNull}, hash: 33F13C94E0CFBA9647A288787B4B0ACE
    @Test()
    void getBytesUsAsciiWhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUsAscii("string1");
        byte[] byteResultArray = new byte[] { (byte) 115, (byte) 116, (byte) 114, (byte) 105, (byte) 110, (byte) 103, (byte) 49 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${getBytesUtf16WhenStringIsNull}, hash: CA70D86CB7C91FF52796DD252C10AB60
    @Test()
    void getBytesUtf16WhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf16((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesUtf16WhenStringIsNotNull}, hash: F731C0CA2F1F07DB76F298AB70061A77
    @Test()
    void getBytesUtf16WhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf16("string1");
        byte[] byteResultArray = new byte[] { (byte) -2, (byte) -1, (byte) 0, (byte) 115, (byte) 0, (byte) 116, (byte) 0, (byte) 114, (byte) 0, (byte) 105, (byte) 0, (byte) 110, (byte) 0, (byte) 103, (byte) 0, (byte) 49 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${getBytesUtf16BeWhenStringIsNull}, hash: B1D31CEB92533B45A5B37106E1096CB4
    @Test()
    void getBytesUtf16BeWhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf16Be((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesUtf16BeWhenStringIsNotNull}, hash: 68466275CECEB424EDE2228061E2C154
    @Test()
    void getBytesUtf16BeWhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf16Be("string1");
        byte[] byteResultArray = new byte[] { (byte) 0, (byte) 115, (byte) 0, (byte) 116, (byte) 0, (byte) 114, (byte) 0, (byte) 105, (byte) 0, (byte) 110, (byte) 0, (byte) 103, (byte) 0, (byte) 49 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${getBytesUtf16LeWhenStringIsNull}, hash: 254F6740A3585B2DF422E5DD48059259
    @Test()
    void getBytesUtf16LeWhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf16Le((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesUtf16LeWhenStringIsNotNull}, hash: ABDA68F12B30A9128382571A906D3A4C
    @Test()
    void getBytesUtf16LeWhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf16Le("string1");
        byte[] byteResultArray = new byte[] { (byte) 115, (byte) 0, (byte) 116, (byte) 0, (byte) 114, (byte) 0, (byte) 105, (byte) 0, (byte) 110, (byte) 0, (byte) 103, (byte) 0, (byte) 49, (byte) 0 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${getBytesUtf8WhenStringIsNull}, hash: 0725950A5C485C2C160ADCBA056329C5
    @Test()
    void getBytesUtf8WhenStringIsNull() {
        /* Branches:
         * (string == null) : true  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf8((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${getBytesUtf8WhenStringIsNotNull}, hash: 5A9DB13A53638D3D37A9EECD4CCFCE91
    @Test()
    void getBytesUtf8WhenStringIsNotNull() {
        /* Branches:
         * (string == null) : false  #  inside getBytes method
         */
        //Act Statement(s)
        byte[] result = StringUtils.getBytesUtf8("string1");
        byte[] byteResultArray = new byte[] { (byte) 115, (byte) 116, (byte) 114, (byte) 105, (byte) 110, (byte) 103, (byte) 49 };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //BaseRock generated method id: ${newString1WhenBytesIsNull}, hash: 8588B50413E30E9D6E61651686823991
    @Test()
    void newString1WhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newString(_byte, "charsetName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newString1WhenBytesIsNotNull}, hash: ADA33C30B55F795B1B8C441A9D604ECC
    @Disabled()
    @Test()
    void newString1WhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newString(byteArray, "charsetName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${newString1WhenCaughtUnsupportedEncodingExceptionThrowsIllegalStateException}, hash: E14190A50D90FEA5167F65C5BDCD42EA
    @Disabled()
    @Test()
    void newString1WhenCaughtUnsupportedEncodingExceptionThrowsIllegalStateException() {
        /* Branches:
         * (bytes == null) : false
         * (catch-exception (UnsupportedEncodingException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        IllegalStateException illegalStateException = new IllegalStateException("A: unsupportedEncodingException");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            StringUtils.newString(byteArray, "A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //BaseRock generated method id: ${newStringIso8859_1WhenBytesIsNull}, hash: 1C46EAB650642D861D6DC4C11766DA52
    @Test()
    void newStringIso8859_1WhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newStringIso8859_1(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newStringIso8859_1WhenBytesIsNotNull}, hash: 2B0D708BD64FEAE3A2C2BB701C2BF461
    @Disabled()
    @Test()
    void newStringIso8859_1WhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newStringIso8859_1(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${newStringUsAsciiWhenBytesIsNull}, hash: 68634133354917C8447622462C799A7F
    @Test()
    void newStringUsAsciiWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newStringUsAscii(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newStringUsAsciiWhenBytesIsNotNull}, hash: 3F692B9C69FA92472B6C748F2B3677CE
    @Disabled()
    @Test()
    void newStringUsAsciiWhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newStringUsAscii(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${newStringUtf16WhenBytesIsNull}, hash: BFC8D66F2366B8E034C6517E60870781
    @Test()
    void newStringUtf16WhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newStringUtf16(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newStringUtf16WhenBytesIsNotNull}, hash: 056C8487AF6A2B3ECF94B35C5BD2EED9
    @Disabled()
    @Test()
    void newStringUtf16WhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newStringUtf16(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${newStringUtf16BeWhenBytesIsNull}, hash: 2636ACF678CD46ABEAAD015F1F751A87
    @Test()
    void newStringUtf16BeWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newStringUtf16Be(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newStringUtf16BeWhenBytesIsNotNull}, hash: 4C9E52A16A63FF8B16C61554FFEC512D
    @Disabled()
    @Test()
    void newStringUtf16BeWhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newStringUtf16Be(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${newStringUtf16LeWhenBytesIsNull}, hash: 4ED9670D1C4DF9C11E248BF0BD79BC8B
    @Test()
    void newStringUtf16LeWhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newStringUtf16Le(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newStringUtf16LeWhenBytesIsNotNull}, hash: 12A3C655B74A56F3D79BF99CED318F0A
    @Disabled()
    @Test()
    void newStringUtf16LeWhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newStringUtf16Le(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${newStringUtf8WhenBytesIsNull}, hash: 16E159DCCA034A2547DC09C279BCF45A
    @Test()
    void newStringUtf8WhenBytesIsNull() {
        /* Branches:
         * (bytes == null) : true  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        //Act Statement(s)
        String result = StringUtils.newStringUtf8(_byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${newStringUtf8WhenBytesIsNotNull}, hash: AB733B2C489B25016E9CC38F40241E5D
    @Disabled()
    @Test()
    void newStringUtf8WhenBytesIsNotNull() {
        /* Branches:
         * (bytes == null) : false  #  inside newString method
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        String result = StringUtils.newStringUtf8(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
