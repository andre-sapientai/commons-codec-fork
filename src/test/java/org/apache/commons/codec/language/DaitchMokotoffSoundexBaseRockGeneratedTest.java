package org.apache.commons.codec.language;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.EncoderException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DaitchMokotoffSoundexBaseRockGeneratedTest {

    //BaseRock generated method id: ${encodeWhenObjNotInstanceOfStringThrowsEncoderException}, hash: 11F19A3A33724191450B9C0D7D70CF24
    @Test()
    void encodeWhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : true
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
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

    //BaseRock generated method id: ${encodeWhenObjInstanceOfString}, hash: 7D82C310313F07EFC5AD108CFEB971AC
    @Test()
    void encodeWhenObjInstanceOfString() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        Object result = target.encode((Object) "obj1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encode1WhenSourceIsNull}, hash: EABA1215C958A454CFE011DB5D987C42
    @Test()
    void encode1WhenSourceIsNull() {
        /* Branches:
         * (source == null) : true
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        String result = target.encode((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${encode1WhenCurrentBranchesIsNotEmpty}, hash: 883971ABF20813AA2733F3674088191F
    @Disabled()
    @Test()
    void encode1WhenCurrentBranchesIsNotEmpty() {
        /* Branches:
         * (source == null) : false
         * (source == null) : false  #  inside soundex method
         * (for-each(input.toCharArray())) : true  #  inside cleanup method
         * (Character.isWhitespace(ch)) : true  #  inside cleanup method
         * (index < input.length()) : false  #  inside soundex method
         * (for-each(currentBranches)) : true  #  inside soundex method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: branch - Method: finish
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        String result = target.encode("source1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${encode1WhenCharacterIsWhitespaceChAndCurrentBranchesIsNotEmpty}, hash: 298D14DEAFD10423914C5EA120F7E95A
    @Disabled()
    @Test()
    void encode1WhenCharacterIsWhitespaceChAndCurrentBranchesIsNotEmpty() {
        /* Branches:
         * (source == null) : false
         * (source == null) : false  #  inside soundex method
         * (for-each(input.toCharArray())) : true  #  inside cleanup method
         * (Character.isWhitespace(ch)) : false  #  inside cleanup method
         * (folding) : true  #  inside cleanup method
         * (character != null) : false  #  inside cleanup method
         * (index < input.length()) : true  #  inside soundex method
         * (Character.isWhitespace(ch)) : true  #  inside soundex method
         * (for-each(currentBranches)) : true  #  inside soundex method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: branch - Method: finish
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        String result = target.encode("source1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${encode1WhenRulesIsNullAndCurrentBranchesIsNotEmpty}, hash: 78A99F61E3E26B01FD0BE4719D6E0D46
    @Disabled()
    @Test()
    void encode1WhenRulesIsNullAndCurrentBranchesIsNotEmpty() {
        /* Branches:
         * (source == null) : false
         * (source == null) : false  #  inside soundex method
         * (for-each(input.toCharArray())) : true  #  inside cleanup method
         * (Character.isWhitespace(ch)) : false  #  inside cleanup method
         * (folding) : true  #  inside cleanup method
         * (character != null) : false  #  inside cleanup method
         * (index < input.length()) : true  #  inside soundex method
         * (Character.isWhitespace(ch)) : false  #  inside soundex method
         * (rules == null) : true  #  inside soundex method
         * (for-each(currentBranches)) : true  #  inside soundex method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: branch - Method: finish
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(true);
        //Act Statement(s)
        String result = target.encode("\u0086");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //BaseRock generated method id: ${soundexWhenSourceIsNull}, hash: 429884C96A67D95BF29F2643069F19E1
    @Disabled()
    @Test()
    void soundexWhenSourceIsNull() {
        /* Branches:
         * (source == null) : true  #  inside soundex method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        String result = target.soundex((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${soundexWhenCurrentBranchesIsNotEmpty}, hash: DF169D92E48931AA98094C97FB83F126
    @Disabled()
    @Test()
    void soundexWhenCurrentBranchesIsNotEmpty() {
        /* Branches:
         * (source == null) : false  #  inside soundex method
         * (for-each(input.toCharArray())) : true  #  inside cleanup method
         * (Character.isWhitespace(ch)) : true  #  inside cleanup method
         * (index < input.length()) : false  #  inside soundex method
         * (for-each(currentBranches)) : true  #  inside soundex method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: branch - Method: finish
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        String result = target.soundex("source1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${soundexWhenCharacterIsWhitespaceChAndCurrentBranchesIsNotEmpty}, hash: 0DAA1763D073370D30ABD3CEC59E2247
    @Disabled()
    @Test()
    void soundexWhenCharacterIsWhitespaceChAndCurrentBranchesIsNotEmpty() {
        /* Branches:
         * (source == null) : false  #  inside soundex method
         * (for-each(input.toCharArray())) : true  #  inside cleanup method
         * (Character.isWhitespace(ch)) : false  #  inside cleanup method
         * (folding) : true  #  inside cleanup method
         * (character != null) : false  #  inside cleanup method
         * (index < input.length()) : true  #  inside soundex method
         * (Character.isWhitespace(ch)) : true  #  inside soundex method
         * (for-each(currentBranches)) : true  #  inside soundex method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: branch - Method: finish
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(false);
        //Act Statement(s)
        String result = target.soundex("source1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //BaseRock generated method id: ${soundexWhenRulesIsNullAndCurrentBranchesIsNotEmpty}, hash: 3FAA5647D9C235A2D79879331F4E4AAC
    @Disabled()
    @Test()
    void soundexWhenRulesIsNullAndCurrentBranchesIsNotEmpty() {
        /* Branches:
         * (source == null) : false  #  inside soundex method
         * (for-each(input.toCharArray())) : true  #  inside cleanup method
         * (Character.isWhitespace(ch)) : false  #  inside cleanup method
         * (folding) : true  #  inside cleanup method
         * (character != null) : false  #  inside cleanup method
         * (index < input.length()) : true  #  inside soundex method
         * (Character.isWhitespace(ch)) : false  #  inside soundex method
         * (rules == null) : true  #  inside soundex method
         * (for-each(currentBranches)) : true  #  inside soundex method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: branch - Method: finish
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex target = new DaitchMokotoffSoundex(true);
        //Act Statement(s)
        String result = target.soundex("\u0086");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }
}
