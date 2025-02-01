package org.apache.commons.codec;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.nio.charset.Charset;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharsetsBaseRockGeneratedTest {

    //BaseRock generated method id: ${toCharsetWhenCharsetIsNull}, hash: 252C1A41CF2243B2BEEAC487701B66FE
    @Test()
    void toCharsetWhenCharsetIsNull() {
        /* Branches:
         * (charset == null) : true
         */
        //Arrange Statement(s)
        Charset charset = null;
        //Act Statement(s)
        Charset result = Charsets.toCharset(charset);
        Charset charset2 = Charset.defaultCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset2)));
    }

    //BaseRock generated method id: ${toCharsetWhenCharsetIsNotNull}, hash: 13DB22E13D1F45EEB651E95D032FE616
    @Test()
    void toCharsetWhenCharsetIsNotNull() {
        /* Branches:
         * (charset == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();
        //Act Statement(s)
        Charset result = Charsets.toCharset(charset);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //BaseRock generated method id: ${toCharset1WhenCharsetIsNull}, hash: 60853960D4B567558106ED35AE53FD95
    @Test()
    void toCharset1WhenCharsetIsNull() {
        /* Branches:
         * (charset == null) : true
         */
        //Act Statement(s)
        Charset result = Charsets.toCharset((String) null);
        Charset charset = Charset.defaultCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //BaseRock generated method id: ${toCharset1WhenCharsetIsNotNull}, hash: E9527E76093FF5C8689E944428B5EDAC
    @Disabled()
    @Test()
    void toCharset1WhenCharsetIsNotNull() {
        /* Branches:
         * (charset == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Charset result = Charsets.toCharset("A");
        Charset charset = Charset.defaultCharset();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }
}
