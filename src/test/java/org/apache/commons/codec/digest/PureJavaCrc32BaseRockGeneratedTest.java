package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PureJavaCrc32BaseRockGeneratedTest {

    //BaseRock generated method id: ${getValueTest}, hash: 433DA20EC87F6526DB6712ED0D9714D8
    @Test()
    void getValueTest() {
        //Arrange Statement(s)
        PureJavaCrc32 target = new PureJavaCrc32();
        //Act Statement(s)
        long result = target.getValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //BaseRock generated method id: ${resetTest}, hash: 7511F4F6663F2FC98CFCE01CFFAB267F
    @Test()
    void resetTest() {
        //Arrange Statement(s)
        PureJavaCrc32 target = new PureJavaCrc32();
        //Act Statement(s)
        target.reset();
    }

    //BaseRock generated method id: ${updateWhenSwitchRemainderCase7}, hash: A0F4D1F6898100A2F2FF003944AD3D50
    @Test()
    void updateWhenSwitchRemainderCase7() {
        /* Branches:
         * (i < end) : true
         * (switch(remainder) = 7) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PureJavaCrc32 target = new PureJavaCrc32();
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        target.update(byteArray, 0, 0);
    }

    //BaseRock generated method id: ${update1Test}, hash: D382B2959FD3024440E9C167240159F0
    @Disabled()
    @Test()
    void update1Test() {
        //Arrange Statement(s)
        PureJavaCrc32 target = new PureJavaCrc32();
        //Act Statement(s)
        final ArrayIndexOutOfBoundsException result = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            target.update(0);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
