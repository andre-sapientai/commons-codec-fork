package org.apache.commons.codec.language.bm;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.EncoderException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BeiderMorseEncoderBaseRockGeneratedTest {

    //BaseRock generated method id: ${encodeWhenSourceNotInstanceOfStringThrowsEncoderException}, hash: 24022DFDB9B7D5A063BA716E2A2BDB0B
    @Test()
    void encodeWhenSourceNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(source instanceof String)) : true
         */
         //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        Object object = new Object();
        EncoderException encoderException = new EncoderException("BeiderMorseEncoder encode parameter is not of type String");
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

    //BaseRock generated method id: ${encodeWhenSourceInstanceOfString}, hash: D39A9A9AA085215F9E56BE9762ACFF4D
    @Test()
    void encodeWhenSourceInstanceOfString() throws EncoderException {
        /* Branches:
         * (!(source instanceof String)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        Object result = target.encode((Object) "source1");
        
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encode1WhenSourceIsNull}, hash: 54AF5BD5A208925443865EE49F13FB15
    @Test()
    void encode1WhenSourceIsNull() throws EncoderException {
        /* Branches:
         * (source == null) : true
         */
         //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        String result = target.encode((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode1WhenSourceIsNotNull}, hash: 4B0EFD9F7D7EB39D1F4AA2EC799D916B
    @Test()
    void encode1WhenSourceIsNotNull() throws EncoderException {
        /* Branches:
         * (source == null) : false
         */
         //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        String result = target.encode("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("a|i|o")));
    }

    //BaseRock generated method id: ${getNameTypeTest}, hash: FB4259A197608849349AA324315A46A7
    @Test()
    void getNameTypeTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        NameType result = target.getNameType();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(NameType.GENERIC)));
    }

    //BaseRock generated method id: ${getRuleTypeTest}, hash: 4B4995C9BC5E8155F35F35D82EBD4217
    @Test()
    void getRuleTypeTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        RuleType result = target.getRuleType();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(RuleType.APPROX)));
    }

    //BaseRock generated method id: ${isConcatTest}, hash: 520086029B8674AC661F96199845F274
    @Test()
    void isConcatTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        boolean result = target.isConcat();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${setConcatTest}, hash: 7F0123BB9226667D1400B4C2E9575FFD
    @Test()
    void setConcatTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        target.setConcat(false);
    }

    //BaseRock generated method id: ${setMaxPhonemesTest}, hash: 84ABDE48091AB7341C6F948B5ACD5994
    @Test()
    void setMaxPhonemesTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        target.setMaxPhonemes(0);
    }

    //BaseRock generated method id: ${setNameTypeTest}, hash: 330D035E3E6739F534569BE1878C4FEB
    @Test()
    void setNameTypeTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        target.setNameType(NameType.ASHKENAZI);
    }

    //BaseRock generated method id: ${setRuleTypeTest}, hash: 6C1F252EF7521E74A38016B4E486024E
    @Test()
    void setRuleTypeTest() {
        //Arrange Statement(s)
        BeiderMorseEncoder target = new BeiderMorseEncoder();
        
        //Act Statement(s)
        target.setRuleType(RuleType.APPROX);
    }
}
