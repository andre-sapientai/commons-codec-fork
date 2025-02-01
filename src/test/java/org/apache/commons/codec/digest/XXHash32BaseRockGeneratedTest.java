package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class XXHash32BaseRockGeneratedTest {

    //BaseRock generated method id: ${getValueWhenIdxNotLessThanPos}, hash: 4F9D5B613D67F4B4F5687FEBD53887D7
    @Test()
    void getValueWhenIdxNotLessThanPos() {
        /* Branches:
         * (stateUpdated) : false
         * (idx <= limit) : false
         * (idx < pos) : false
         */
        //Arrange Statement(s)
        XXHash32 target = new XXHash32(1);
        //Act Statement(s)
        long result = target.getValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(187479954L)));
    }

    //BaseRock generated method id: ${resetTest}, hash: 6E43540C41F49112BDAD7EC27974A2C9
    @Test()
    void resetTest() {
        //Arrange Statement(s)
        XXHash32 target = new XXHash32(2048144778);
        //Act Statement(s)
        target.reset();
    }

    //BaseRock generated method id: ${updateWhenLenLessThanOrEqualsTo0}, hash: EAED743B733D2869C76104EF2F28B758
    @Test()
    void updateWhenLenLessThanOrEqualsTo0() {
        /* Branches:
         * (len <= 0) : true
         */
        //Arrange Statement(s)
        XXHash32 target = new XXHash32(-1);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        target.update(byteArray, 0, -1);
    }

    //BaseRock generated method id: ${updateWhenPosPlusLenMinusBUF_SIZELessThan0}, hash: 63384DD10E51B5C96C913BAD333F8EB8
    @Disabled()
    @Test()
    void updateWhenPosPlusLenMinusBUF_SIZELessThan0() {
        /* Branches:
         * (len <= 0) : false
         * (pos + len - BUF_SIZE < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        XXHash32 target = new XXHash32(1);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        target.update(byteArray, 1, 1);
    }

    //BaseRock generated method id: ${updateWhenOffLessThanEnd}, hash: C2EAFDEEC2AA71EB7B69BBC7B341466A
    @Disabled()
    @Test()
    void updateWhenOffLessThanEnd() {
        /* Branches:
         * (len <= 0) : false
         * (pos + len - BUF_SIZE < 0) : false
         * (pos > 0) : false
         * (off <= limit) : true
         * (off < end) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        XXHash32 target = new XXHash32(0);
        byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15 };
        //Act Statement(s)
        target.update(byteArray, 0, 17);
    }

    //BaseRock generated method id: ${updateWhenOffNotLessThanEnd}, hash: E92BFC518D7F095F626585FB6F45D91E
    @Test()
    void updateWhenOffNotLessThanEnd() {
        /* Branches:
         * (len <= 0) : false
         * (pos + len - BUF_SIZE < 0) : false
         * (pos > 0) : false
         * (off <= limit) : true
         * (off < end) : false
         */
        //Arrange Statement(s)
        XXHash32 target = new XXHash32(0);
        byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15 };
        //Act Statement(s)
        target.update(byteArray, 0, 16);
    }

    //BaseRock generated method id: ${update1Test}, hash: BE35E40102969E6EB5450D137CA32B99
    @Disabled()
    @Test()
    void update1Test() {
        //Arrange Statement(s)
        XXHash32 target = spy(new XXHash32(1));
        byte[] byteArray = new byte[] { (byte) 0 };
        doNothing().when(target).update(byteArray, 0, 1);
        //Act Statement(s)
        target.update(0);
        //Assert statement(s)
        assertAll("result", () -> verify(target).update(byteArray, 0, 1));
    }
}
