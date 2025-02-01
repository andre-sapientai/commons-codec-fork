package org.apache.commons.codec.language;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class Caverphone1BaseRockGeneratedTest {

    //BaseRock generated method id: ${encode1WhenTxtIsEmpty}, hash: A36160A03B57FAF3766843A44C0D1933
    @Test()
    void encode1WhenTxtIsEmpty() {
        /* Branches:
         * (txt == null) : false
         * (txt.isEmpty()) : true
         */
         //Arrange Statement(s)
        Caverphone1 target = new Caverphone1();
        
        //Act Statement(s)
        String result = target.encode("");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("111111")));
    }

    //BaseRock generated method id: ${encode1WhenTxtNotIsEmpty}, hash: CB69277EDCB4416F88D260B02914E168
    @Test()
    void encode1WhenTxtNotIsEmpty() {
        /* Branches:
         * (txt == null) : false
         * (txt.isEmpty()) : false
         */
         //Arrange Statement(s)
        Caverphone1 target = new Caverphone1();
        
        //Act Statement(s)
        String result = target.encode("source1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("SS1111")));
    }
}
