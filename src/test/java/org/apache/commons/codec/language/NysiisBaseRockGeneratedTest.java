package org.apache.commons.codec.language;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.EncoderException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NysiisBaseRockGeneratedTest {

    //BaseRock generated method id: ${encodeWhenObjNotInstanceOfStringThrowsEncoderException}, hash: 83AB14D12960E48AA3006E8A337E4611
    @Test()
    void encodeWhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : true
         */
        //Arrange Statement(s)
        Nysiis target = new Nysiis(false);
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
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

    //BaseRock generated method id: ${encodeWhenObjInstanceOfString}, hash: 35E067CAAF92EDA0B3513FF1E23FB287
    @Disabled()
    @Test()
    void encodeWhenObjInstanceOfString() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : false
         */
        //Arrange Statement(s)
        Nysiis target = spy(new Nysiis(false));
        doReturn("return_of_nysiis1").when(target).nysiis("obj1");
        //Act Statement(s)
        Object result = target.encode((Object) "obj1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_nysiis1"));
            verify(target).nysiis("obj1");
        });
    }

    //BaseRock generated method id: ${encode1Test}, hash: FB626C6EA94E5433C19E9AC0D72A0289
    @Disabled()
    @Test()
    void encode1Test() {
        //Arrange Statement(s)
        Nysiis target = spy(new Nysiis(false));
        doReturn("return_of_nysiis1").when(target).nysiis("str1");
        //Act Statement(s)
        String result = target.encode("str1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_nysiis1"));
            verify(target).nysiis("str1");
        });
    }

    //BaseRock generated method id: ${isStrictWhenThisStrict}, hash: 836C6BEF184FB807C9A3299FA61B4CDD
    @Test()
    void isStrictWhenThisStrict() {
        /* Branches:
         * (this.strict) : true
         */
        //Arrange Statement(s)
        Nysiis target = new Nysiis(true);
        //Act Statement(s)
        boolean result = target.isStrict();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isStrictWhenThisNotStrict}, hash: 0BCD1519AC61AF37DCA32D7B266E1EA6
    @Test()
    void isStrictWhenThisNotStrict() {
        /* Branches:
         * (this.strict) : false
         */
        //Arrange Statement(s)
        Nysiis target = new Nysiis(false);
        //Act Statement(s)
        boolean result = target.isStrict();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${nysiisWhenStrIsNull}, hash: F732B22E2E62743C65272F6080116754
    @Test()
    void nysiisWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
        //Arrange Statement(s)
        Nysiis target = new Nysiis(false);
        //Act Statement(s)
        String result = target.nysiis((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${nysiisWhenStrIsEmpty}, hash: 6763329E7137E4103AC54849A813D2CF
    @Test()
    void nysiisWhenStrIsEmpty() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Nysiis target = new Nysiis(false);
        //Act Statement(s)
        String result = target.nysiis("");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //BaseRock generated method id: ${nysiisWhenIsStrictNot}, hash: 3A3922849C13C12683076BDECF405AAE
    @Disabled()
    @Test()
    void nysiisWhenIsStrictNot() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (i < len) : true
         * (i < len - 1) : true
         * (i < len - 2) : true
         * (curr == 'E') : true  #  inside transcodeRemaining method
         * (next == 'V') : false  #  inside transcodeRemaining method
         * (c == 'A') : false  #  inside isVowel method
         * (c == 'E') : true  #  inside isVowel method
         * (isVowel(curr)) : true  #  inside transcodeRemaining method
         * (chars[i] != chars[i - 1]) : false
         * (key.length() > 1) : false
         * (isStrict()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Nysiis target = spy(new Nysiis(false));
        doReturn(false).when(target).isStrict();
        //Act Statement(s)
        String result = target.nysiis("str1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).isStrict();
        });
    }

    //BaseRock generated method id: ${nysiisWhenIsStrict}, hash: 6F31FBCFAC5DD4D63DE3C92B17B115C4
    @Disabled()
    @Test()
    void nysiisWhenIsStrict() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (i < len) : true
         * (i < len - 1) : true
         * (i < len - 2) : true
         * (curr == 'E') : true  #  inside transcodeRemaining method
         * (next == 'V') : true  #  inside transcodeRemaining method
         * (chars[i] != chars[i - 1]) : true
         * (key.length() > 1) : true
         * (lastChar == 'S') : true
         * (key.length() > 2) : true
         * (last2Char == 'A') : true
         * (lastChar == 'Y') : true
         * (lastChar == 'A') : true
         * (isStrict()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Nysiis target = spy(new Nysiis(false));
        doReturn(false).when(target).isStrict();
        //Act Statement(s)
        String result = target.nysiis("str1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).isStrict();
        });
    }
}
