package org.apache.commons.codec.language;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.EncoderException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CaverphoneBaseRockGeneratedTest {

    //BaseRock generated method id: ${caverphoneTest}, hash: D54CBDAE0BCFC36A72F6F15112878BF8
    @Test()
    void caverphoneTest() {
        //Arrange Statement(s)
        Caverphone target = new Caverphone();
        
        //Act Statement(s)
        String result = target.caverphone("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A111111111")));
    }

    //BaseRock generated method id: ${encodeWhenObjNotInstanceOfStringThrowsEncoderException}, hash: 8E4EEF79F0B808D66CE51413DF50EC22
    @Test()
    void encodeWhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : true
         */
         //Arrange Statement(s)
        Caverphone target = new Caverphone();
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
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

    //BaseRock generated method id: ${encodeWhenObjInstanceOfString}, hash: DD7AB3D3DBA84F5E7D4069A24B58512F
    @Test()
    void encodeWhenObjInstanceOfString() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : false
         */
         //Arrange Statement(s)
        Caverphone target = new Caverphone();
        
        //Act Statement(s)
        Object result = target.encode((Object) "A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A111111111")));
    }

    //BaseRock generated method id: ${encode1Test}, hash: EDA1AF47F8F939136B042FABA5C1FD71
    @Test()
    void encode1Test() {
        //Arrange Statement(s)
        Caverphone target = new Caverphone();
        
        //Act Statement(s)
        String result = target.encode("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A111111111")));
    }

    //BaseRock generated method id: ${isCaverphoneEqualWhenCaverphoneStr1EqualsCaverphoneStr2}, hash: A1572EDFB1B0AD57C0D90B17E06F40C1
    @Test()
    void isCaverphoneEqualWhenCaverphoneStr1EqualsCaverphoneStr2() {
        /* Branches:
         * (caverphone(str1).equals(caverphone(str2))) : true
         */
         //Arrange Statement(s)
        Caverphone target = new Caverphone();
        
        //Act Statement(s)
        boolean result = target.isCaverphoneEqual("str1", "str2");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isCaverphoneEqualWhenCaverphoneStr1NotEqualsCaverphoneStr2}, hash: 61835D1F7A2F072FB659DB13BA1CF389
    @Test()
    void isCaverphoneEqualWhenCaverphoneStr1NotEqualsCaverphoneStr2() {
        /* Branches:
         * (caverphone(str1).equals(caverphone(str2))) : false
         */
         //Arrange Statement(s)
        Caverphone target = new Caverphone();
        
        //Act Statement(s)
        boolean result = target.isCaverphoneEqual("A", "CFH");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
