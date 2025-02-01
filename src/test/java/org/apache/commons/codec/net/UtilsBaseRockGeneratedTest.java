package org.apache.commons.codec.net;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.DecoderException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UtilsBaseRockGeneratedTest {

    //BaseRock generated method id: ${digit16WhenIEqualsMinus1ThrowsDecoderException}, hash: E13F1C758948580D2189E756D02E27A1
    @Test()
    void digit16WhenIEqualsMinus1ThrowsDecoderException() throws DecoderException {
        /* Branches:
         * (i == -1) : true
         */
        //Arrange Statement(s)
        DecoderException decoderException = new DecoderException("Invalid URL encoding: not a valid digit (radix 16): 5");
        //Act Statement(s)
        final DecoderException result = assertThrows(DecoderException.class, () -> {
            Utils.digit16((byte) 5);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(decoderException.getMessage()));
        });
    }

    //BaseRock generated method id: ${digit16WhenINotEqualsMinus1}, hash: AE5843E0403AA9585CC954696A509A62
    @Disabled()
    @Test()
    void digit16WhenINotEqualsMinus1() throws DecoderException {
        /* Branches:
         * (i == -1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = Utils.digit16((byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${hexDigitTest}, hash: F0B35799EE2C67A61E44675F20B40E0B
    @Test()
    void hexDigitTest() {
        //Act Statement(s)
        char result = Utils.hexDigit(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('0')));
    }
}
