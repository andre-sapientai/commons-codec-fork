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
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MatchRatingApproachEncoderBaseRockGeneratedTest {

    //BaseRock generated method id: ${cleanNameWhenCharsToTrimIsNotEmpty}, hash: C43A3E7FA0CDA09D2AE25D0E60824D4C
    @Disabled()
    @Test()
    void cleanNameWhenCharsToTrimIsNotEmpty() {
        /* Branches:
         * (for-each(charsToTrim)) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("B").when(target).removeAccents("A");
        //Act Statement(s)
        String result = target.cleanName("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("B"));
            verify(target).removeAccents("A");
        });
    }

    //BaseRock generated method id: ${encodeWhenPObjectNotInstanceOfStringThrowsEncoderException}, hash: 0A358D7505A2C34611B90094BD715752
    @Test()
    void encodeWhenPObjectNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(pObject instanceof String)) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        Object object = new Object();
        EncoderException encoderException = new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
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

    //BaseRock generated method id: ${encodeWhenPObjectInstanceOfString}, hash: 93C7F0FD6F028F4A08E0E76495F19E21
    @Test()
    void encodeWhenPObjectInstanceOfString() throws EncoderException {
        /* Branches:
         * (!(pObject instanceof String)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        Object result = target.encode((Object) "pObject1");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${encode1WhenNameLengthEquals1}, hash: 7E1B6079C2DD00DEF9915CCBFFA1D763
    @Test()
    void encode1WhenNameLengthEquals1() {
        /* Branches:
         * (name == null) : false
         * (EMPTY.equalsIgnoreCase(name)) : false
         * (SPACE.equalsIgnoreCase(name)) : false
         * (name.length() == 1) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.encode("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //BaseRock generated method id: ${encode1WhenNameIsEmpty}, hash: 3A5F5F24B8DF546404860E86F9F68BF3
    @Disabled()
    @Test()
    void encode1WhenNameIsEmpty() {
        /* Branches:
         * (name == null) : false
         * (EMPTY.equalsIgnoreCase(name)) : false
         * (SPACE.equalsIgnoreCase(name)) : false
         * (name.length() == 1) : false
         * (SPACE.equals(name)) : false
         * (name.isEmpty()) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("").when(target).cleanName("DE");
        //Act Statement(s)
        String result = target.encode("DE");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).cleanName("DE");
        });
    }

    //BaseRock generated method id: ${encode1WhenSPACENotEqualsNameAndNameIsEmpty}, hash: 89D225249422FC6CA8BB0D9ACC4E3056
    @Disabled()
    @Test()
    void encode1WhenSPACENotEqualsNameAndNameIsEmpty() {
        /* Branches:
         * (name == null) : false
         * (EMPTY.equalsIgnoreCase(name)) : false
         * (SPACE.equalsIgnoreCase(name)) : false
         * (name.length() == 1) : false
         * (SPACE.equals(name)) : false
         * (name.isEmpty()) : false
         * (SPACE.equals(name)) : false
         * (name.isEmpty()) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("AC").when(target).cleanName("DE");
        doReturn("").when(target).removeVowels("AC");
        //Act Statement(s)
        String result = target.encode("DE");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).cleanName("DE");
            verify(target).removeVowels("AC");
        });
    }

    //BaseRock generated method id: ${encode1WhenNameNotIsEmpty}, hash: 33AED3199874B7381B3BF6AA64FC5B57
    @Disabled()
    @Test()
    void encode1WhenNameNotIsEmpty() {
        /* Branches:
         * (name == null) : false
         * (EMPTY.equalsIgnoreCase(name)) : false
         * (SPACE.equalsIgnoreCase(name)) : false
         * (name.length() == 1) : false
         * (SPACE.equals(name)) : false
         * (name.isEmpty()) : false
         * (SPACE.equals(name)) : false
         * (name.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("return_of_cleanName1").when(target).cleanName("name1");
        doReturn("return_of_removeVowels1").when(target).removeVowels("return_of_cleanName1");
        doReturn("return_of_removeDoubleConsonants1").when(target).removeDoubleConsonants("return_of_removeVowels1");
        doReturn("return_of_getFirst3Last3").when(target).getFirst3Last3("return_of_removeDoubleConsonants1");
        //Act Statement(s)
        String result = target.encode("name1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getFirst3Last3"));
            verify(target).cleanName("name1");
            verify(target).removeVowels("return_of_cleanName1");
            verify(target).removeDoubleConsonants("return_of_removeVowels1");
            verify(target).getFirst3Last3("return_of_removeDoubleConsonants1");
        });
    }

    //BaseRock generated method id: ${getFirst3Last3WhenNameLengthGreaterThan6}, hash: 2F3D8B4F1C08924346061085F4662035
    @Test()
    void getFirst3Last3WhenNameLengthGreaterThan6() {
        /* Branches:
         * (nameLength > 6) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.getFirst3Last3("ABCDEFG");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("ABCEFG")));
    }

    //BaseRock generated method id: ${getFirst3Last3WhenNameLengthNotGreaterThan6}, hash: A9739799720F218B8AE92314F79E3A59
    @Test()
    void getFirst3Last3WhenNameLengthNotGreaterThan6() {
        /* Branches:
         * (nameLength > 6) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.getFirst3Last3("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    //BaseRock generated method id: ${getMinRatingWhenSumLengthLessThanOrEqualsTo4}, hash: 62A6F2F88E5895CB85FB0312878398DE
    @Test()
    void getMinRatingWhenSumLengthLessThanOrEqualsTo4() {
        /* Branches:
         * (sumLength <= 4) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.getMinRating(1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(5)));
    }

    //BaseRock generated method id: ${getMinRatingWhenSumLengthLessThanOrEqualsTo7}, hash: BD02CA756684700B9B980471BBB9E7AC
    @Test()
    void getMinRatingWhenSumLengthLessThanOrEqualsTo7() {
        /* Branches:
         * (sumLength <= 4) : false
         * (sumLength <= 7) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.getMinRating(5);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(4)));
    }

    //BaseRock generated method id: ${getMinRatingWhenSumLengthLessThanOrEqualsTo11}, hash: B43D34A71FF09F8B92F9BD60533A9C2D
    @Test()
    void getMinRatingWhenSumLengthLessThanOrEqualsTo11() {
        /* Branches:
         * (sumLength <= 4) : false
         * (sumLength <= 7) : false
         * (sumLength <= 11) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.getMinRating(8);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(3)));
    }

    //BaseRock generated method id: ${getMinRatingWhenSumLengthEquals12}, hash: AC1B77CAC9493C3CDA0C99F1F3603AF5
    @Test()
    void getMinRatingWhenSumLengthEquals12() {
        /* Branches:
         * (sumLength <= 4) : false
         * (sumLength <= 7) : false
         * (sumLength <= 11) : false
         * (sumLength == 12) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.getMinRating(12);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2)));
    }

    //BaseRock generated method id: ${getMinRatingWhenSumLengthNotEquals12}, hash: 7836F5EEE9B35BBF765AF0367D2C0192
    @Test()
    void getMinRatingWhenSumLengthNotEquals12() {
        /* Branches:
         * (sumLength <= 4) : false
         * (sumLength <= 7) : false
         * (sumLength <= 11) : false
         * (sumLength == 12) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.getMinRating(13);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenSPACEEqualsIgnoreCaseName1}, hash: CF4DF797C693CCCB04AF8EBA7BE29CD6
    @Test()
    void isEncodeEqualsWhenSPACEEqualsIgnoreCaseName1() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        boolean result = target.isEncodeEquals(" ", "name2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenSPACEEqualsIgnoreCaseName2}, hash: 3D8BF127D25AD34EFF02278BB4BB8832
    @Test()
    void isEncodeEqualsWhenSPACEEqualsIgnoreCaseName2() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : false
         * (name2 == null) : false
         * (EMPTY.equalsIgnoreCase(name2)) : false
         * (SPACE.equalsIgnoreCase(name2)) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        boolean result = target.isEncodeEquals("B", " ");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenName2LengthEquals1}, hash: 706E6F28D96C2FFBF01DBFCE1887EB2D
    @Test()
    void isEncodeEqualsWhenName2LengthEquals1() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : false
         * (name2 == null) : false
         * (EMPTY.equalsIgnoreCase(name2)) : false
         * (SPACE.equalsIgnoreCase(name2)) : false
         * (name1.length() == 1) : false
         * (name2.length() == 1) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        boolean result = target.isEncodeEquals("BC", "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenName1EqualsIgnoreCaseName2}, hash: 7BD268BA1CE8ACA09C844825433C3D58
    @Test()
    void isEncodeEqualsWhenName1EqualsIgnoreCaseName2() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : false
         * (name2 == null) : false
         * (EMPTY.equalsIgnoreCase(name2)) : false
         * (SPACE.equalsIgnoreCase(name2)) : false
         * (name1.length() == 1) : false
         * (name2.length() == 1) : false
         * (name1.equalsIgnoreCase(name2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        boolean result = target.isEncodeEquals("name1", "name2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenMathAbsName1LengthMinusName2LengthGreaterThanOrEqualsTo3}, hash: 2B31AC4AEE1E6AF0BCF5E598F5EBA33A
    @Disabled()
    @Test()
    void isEncodeEqualsWhenMathAbsName1LengthMinusName2LengthGreaterThanOrEqualsTo3() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : false
         * (name2 == null) : false
         * (EMPTY.equalsIgnoreCase(name2)) : false
         * (SPACE.equalsIgnoreCase(name2)) : false
         * (name1.length() == 1) : false
         * (name2.length() == 1) : false
         * (name1.equalsIgnoreCase(name2)) : false
         * (Math.abs(name1.length() - name2.length()) >= 3) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("return_of_cleanName1").when(target).cleanName("EG");
        doReturn("return_of_cleanName1").when(target).cleanName("DI");
        doReturn("return_of_removeVowels1").when(target).removeVowels("return_of_cleanName1");
        doReturn("return_of_removeDoubleConsonants1").when(target).removeDoubleConsonants("return_of_removeVowels1");
        doReturn("", "ABC").when(target).getFirst3Last3("return_of_removeDoubleConsonants1");
        //Act Statement(s)
        boolean result = target.isEncodeEquals("EG", "DI");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).cleanName("EG");
            verify(target).cleanName("DI");
            verify(target, times(2)).removeVowels("return_of_cleanName1");
            verify(target, times(2)).removeDoubleConsonants("return_of_removeVowels1");
            verify(target, times(2)).getFirst3Last3("return_of_removeDoubleConsonants1");
        });
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenCountGreaterThanOrEqualsToMinRating}, hash: 9374F94ED45BE423CB8A2D43CBB7FC95
    @Disabled()
    @Test()
    void isEncodeEqualsWhenCountGreaterThanOrEqualsToMinRating() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : false
         * (name2 == null) : false
         * (EMPTY.equalsIgnoreCase(name2)) : false
         * (SPACE.equalsIgnoreCase(name2)) : false
         * (name1.length() == 1) : false
         * (name2.length() == 1) : false
         * (name1.equalsIgnoreCase(name2)) : false
         * (Math.abs(name1.length() - name2.length()) >= 3) : false
         * (count >= minRating) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("return_of_cleanName1").when(target).cleanName("AB");
        doReturn("return_of_cleanName1").when(target).cleanName("GH");
        doReturn("return_of_removeVowels1").when(target).removeVowels("return_of_cleanName1");
        doReturn("return_of_removeDoubleConsonants1").when(target).removeDoubleConsonants("return_of_removeVowels1");
        doReturn("").when(target).getFirst3Last3("return_of_removeDoubleConsonants1");
        doReturn(0).when(target).getMinRating(0);
        doReturn(0).when(target).leftToRightThenRightToLeftProcessing("", "");
        //Act Statement(s)
        boolean result = target.isEncodeEquals("AB", "GH");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).cleanName("AB");
            verify(target).cleanName("GH");
            verify(target, times(2)).removeVowels("return_of_cleanName1");
            verify(target, times(2)).removeDoubleConsonants("return_of_removeVowels1");
            verify(target, times(2)).getFirst3Last3("return_of_removeDoubleConsonants1");
            verify(target).getMinRating(0);
            verify(target).leftToRightThenRightToLeftProcessing("", "");
        });
    }

    //BaseRock generated method id: ${isEncodeEqualsWhenCountLessThanMinRating}, hash: F0B44D489C1D38AD3AD73536305307AB
    @Disabled()
    @Test()
    void isEncodeEqualsWhenCountLessThanMinRating() {
        /* Branches:
         * (name1 == null) : false
         * (EMPTY.equalsIgnoreCase(name1)) : false
         * (SPACE.equalsIgnoreCase(name1)) : false
         * (name2 == null) : false
         * (EMPTY.equalsIgnoreCase(name2)) : false
         * (SPACE.equalsIgnoreCase(name2)) : false
         * (name1.length() == 1) : false
         * (name2.length() == 1) : false
         * (name1.equalsIgnoreCase(name2)) : false
         * (Math.abs(name1.length() - name2.length()) >= 3) : false
         * (count >= minRating) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn("return_of_cleanName1").when(target).cleanName("AB");
        doReturn("return_of_cleanName1").when(target).cleanName("GH");
        doReturn("return_of_removeVowels1").when(target).removeVowels("return_of_cleanName1");
        doReturn("return_of_removeDoubleConsonants1").when(target).removeDoubleConsonants("return_of_removeVowels1");
        doReturn("").when(target).getFirst3Last3("return_of_removeDoubleConsonants1");
        doReturn(1).when(target).getMinRating(0);
        doReturn(0).when(target).leftToRightThenRightToLeftProcessing("", "");
        //Act Statement(s)
        boolean result = target.isEncodeEquals("AB", "GH");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).cleanName("AB");
            verify(target).cleanName("GH");
            verify(target, times(2)).removeVowels("return_of_cleanName1");
            verify(target, times(2)).removeDoubleConsonants("return_of_removeVowels1");
            verify(target, times(2)).getFirst3Last3("return_of_removeDoubleConsonants1");
            verify(target).getMinRating(0);
            verify(target).leftToRightThenRightToLeftProcessing("", "");
        });
    }

    //BaseRock generated method id: ${isVowelWhenLetterEqualsIgnoreCaseU}, hash: 6AAC090EEE21DDF1AE9DEEE986958FAE
    @Test()
    void isVowelWhenLetterEqualsIgnoreCaseU() {
        /* Branches:
         * (letter.equalsIgnoreCase("E")) : false
         * (letter.equalsIgnoreCase("A")) : false
         * (letter.equalsIgnoreCase("O")) : false
         * (letter.equalsIgnoreCase("I")) : false
         * (letter.equalsIgnoreCase("U")) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        boolean result = target.isVowel("U");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isVowelWhenLetterNotEqualsIgnoreCaseU}, hash: 509F1B9EC12BCA4EACEED50035B6966A
    @Test()
    void isVowelWhenLetterNotEqualsIgnoreCaseU() {
        /* Branches:
         * (letter.equalsIgnoreCase("E")) : false
         * (letter.equalsIgnoreCase("A")) : false
         * (letter.equalsIgnoreCase("O")) : false
         * (letter.equalsIgnoreCase("I")) : false
         * (letter.equalsIgnoreCase("U")) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        boolean result = target.isVowel("B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${leftToRightThenRightToLeftProcessingWhenStrALengthGreaterThanStrBLength}, hash: 8C666AFF01DA6C04B6B72A357937D61B
    @Disabled()
    @Test()
    void leftToRightThenRightToLeftProcessingWhenStrALengthGreaterThanStrBLength() {
        /* Branches:
         * (i < name1Char.length) : true
         * (i > name2Size) : true
         * (strA.length() > strB.length()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.leftToRightThenRightToLeftProcessing("name1", "name2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${leftToRightThenRightToLeftProcessingWhenName1LtREndEqualsName2RtLEndAndStrALengthGreaterThanStrBLength}, hash: 889D4F06482A5DCA9310A03EE11BEAA0
    @Disabled()
    @Test()
    void leftToRightThenRightToLeftProcessingWhenName1LtREndEqualsName2RtLEndAndStrALengthGreaterThanStrBLength() {
        /* Branches:
         * (i < name1Char.length) : true
         * (i > name2Size) : false
         * (name1LtRStart.equals(name2RtLStart)) : true
         * (name1LtREnd.equals(name2RtLEnd)) : true
         * (strA.length() > strB.length()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.leftToRightThenRightToLeftProcessing("name1", "name2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${leftToRightThenRightToLeftProcessingWhenName1LtREndEqualsName2RtLEndAndStrALengthNotGreaterThanStrBLength}, hash: 5D8E6239FDA0CC6E2C85780AD9687953
    @Test()
    void leftToRightThenRightToLeftProcessingWhenName1LtREndEqualsName2RtLEndAndStrALengthNotGreaterThanStrBLength() {
        /* Branches:
         * (i < name1Char.length) : true
         * (i > name2Size) : false
         * (name1LtRStart.equals(name2RtLStart)) : true
         * (name1LtREnd.equals(name2RtLEnd)) : true
         * (strA.length() > strB.length()) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        int result = target.leftToRightThenRightToLeftProcessing("A", "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(6)));
    }

    //BaseRock generated method id: ${removeAccentsWhenAccentedWordIsNull}, hash: C5AA4D8D47C7C33CB415174FCB1A1EB9
    @Test()
    void removeAccentsWhenAccentedWordIsNull() {
        /* Branches:
         * (accentedWord == null) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.removeAccents((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${removeAccentsWhenPosGreaterThanMinus1}, hash: 17F3E6E44C549B7FB21E41524911B290
    @Test()
    void removeAccentsWhenPosGreaterThanMinus1() {
        /* Branches:
         * (accentedWord == null) : false
         * (i < n) : true
         * (pos > -1) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.removeAccents("\u00E9");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("e")));
    }

    //BaseRock generated method id: ${removeAccentsWhenPosNotGreaterThanMinus1}, hash: 7CE5F0187BE07844991AD23BC45A5153
    @Test()
    void removeAccentsWhenPosNotGreaterThanMinus1() {
        /* Branches:
         * (accentedWord == null) : false
         * (i < n) : true
         * (pos > -1) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.removeAccents("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    //BaseRock generated method id: ${removeDoubleConsonantsWhenReplacedNameContainsDc}, hash: BDE1B358C936DBBD2A988C4C87E32FE8
    @Test()
    void removeDoubleConsonantsWhenReplacedNameContainsDc() {
        /* Branches:
         * (for-each(DOUBLE_CONSONANT)) : true
         * (replacedName.contains(dc)) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = new MatchRatingApproachEncoder();
        //Act Statement(s)
        String result = target.removeDoubleConsonants("bb");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("B")));
    }

    //BaseRock generated method id: ${removeVowelsWhenIsVowelFirstLetter}, hash: 33A83E60D0260E24BB6FC7A5F64254FC
    @Disabled()
    @Test()
    void removeVowelsWhenIsVowelFirstLetter() {
        /* Branches:
         * (isVowel(firstLetter)) : true
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn(true).when(target).isVowel("A");
        //Act Statement(s)
        String result = target.removeVowels("AE");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("A"));
            verify(target).isVowel("A");
        });
    }

    //BaseRock generated method id: ${removeVowelsWhenIsVowelNotFirstLetter}, hash: 4986FD22E66A4A3162E45B8D701AEB56
    @Disabled()
    @Test()
    void removeVowelsWhenIsVowelNotFirstLetter() {
        /* Branches:
         * (isVowel(firstLetter)) : false
         */
        //Arrange Statement(s)
        MatchRatingApproachEncoder target = spy(new MatchRatingApproachEncoder());
        doReturn(false).when(target).isVowel("A");
        //Act Statement(s)
        String result = target.removeVowels("AE");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).isVowel("A");
        });
    }
}
