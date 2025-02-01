package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PureJavaCrc32CBaseRockGeneratedTest {

    //BaseRock generated method id: ${getValueTest}, hash: B548066D99E53368D1E17AABB5AF6D98
    @Test()
    void getValueTest() {
        //Arrange Statement(s)
        PureJavaCrc32C target = new PureJavaCrc32C();
        
        //Act Statement(s)
        long result = target.getValue();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //BaseRock generated method id: ${resetTest}, hash: 76C6660EBF6369091E62A73498084C11
    @Test()
    void resetTest() {
        //Arrange Statement(s)
        PureJavaCrc32C target = new PureJavaCrc32C();
        
        //Act Statement(s)
        target.reset();
    }

    //BaseRock generated method id: ${updateWhenSwitchLenCase7}, hash: C608A7F7156B795DCE879844B3C31656
    @Test()
    void updateWhenSwitchLenCase7() {
        /* Branches:
         * (len > 7) : true
         * (switch(len) = 7) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        PureJavaCrc32C target = new PureJavaCrc32C();
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        target.update(byteArray, 0, 0);
    }

    //BaseRock generated method id: ${updateWhenSwitchLenCase6}, hash: 3DD8AB0C70F16554C866713290303134
    @Test()
    void updateWhenSwitchLenCase6() {
        /* Branches:
         * (len > 7) : false
         * (switch(len) = 6) : true
         */
         //Arrange Statement(s)
        PureJavaCrc32C target = new PureJavaCrc32C();
        byte[] byteArray = new byte[] { (byte) 0, (byte) 1 };
        
        //Act Statement(s)
        target.update(byteArray, 0, 2);
    }

    //BaseRock generated method id: ${update1Test}, hash: E652CCF70D4A3306419C414CE39EE812
    @Test()
    void update1Test() {
        //Arrange Statement(s)
        PureJavaCrc32C target = new PureJavaCrc32C();
        
        //Act Statement(s)
        target.update(0);
    }
}
