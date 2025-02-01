package org.apache.commons.codec.language;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.EncoderException;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DoubleMetaphoneBaseRockGeneratedTest {

    //BaseRock generated method id: ${containsWhenTargetEqualsElement}, hash: 1EAEBBCE2B8F0CB3CD43C8850CB545B5
    @Test()
    void containsWhenTargetEqualsElement() {
        /* Branches:
         * (start >= 0) : true
         * (start + length <= value.length()) : true
         * (for-each(criteria)) : true
         * (target.equals(element)) : true
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "A" };
        //Act Statement(s)
        boolean result = DoubleMetaphone.contains("A", 0, 1, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${containsWhenTargetNotEqualsElement}, hash: E48F24EFEA226A724F4C581E6DAEA1CC
    @Test()
    void containsWhenTargetNotEqualsElement() {
        /* Branches:
         * (start >= 0) : true
         * (start + length <= value.length()) : true
         * (for-each(criteria)) : true
         * (target.equals(element)) : false
         */
        //Arrange Statement(s)
        String[] stringArray = new String[] { "B" };
        //Act Statement(s)
        boolean result = DoubleMetaphone.contains("A", 0, 1, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //BaseRock generated method id: ${charAtWhenIndexGreaterThanOrEqualsToValueLength}, hash: 0A564CC48915499BDF12A0E24971D142
    @Test()
    void charAtWhenIndexGreaterThanOrEqualsToValueLength() {
        /* Branches:
         * (index < 0) : false
         * (index >= value.length()) : true
         */
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        //Act Statement(s)
        char result = target.charAt("A", 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('\u0000')));
    }

    //BaseRock generated method id: ${charAtWhenIndexLessThanValueLength}, hash: AB87CCC2477D2864CD38623A918CDF40
    @Test()
    void charAtWhenIndexLessThanValueLength() {
        /* Branches:
         * (index < 0) : false
         * (index >= value.length()) : false
         */
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        //Act Statement(s)
        char result = target.charAt("A", 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('A')));
    }

    //BaseRock generated method id: ${doubleMetaphoneTest}, hash: 5306CD52223BAF2985B9F5A10FC698FB
    @Disabled()
    @Test()
    void doubleMetaphoneTest() {
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn("return_of_doubleMetaphone1").when(target).doubleMetaphone("value1", false);
        //Act Statement(s)
        String result = target.doubleMetaphone("value1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_doubleMetaphone1"));
            verify(target).doubleMetaphone("value1", false);
        });
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenValueIsNull}, hash: 70D1426734DFF3A66110880A312F10A4
    @Test()
    void doubleMetaphone1WhenValueIsNull() {
        /* Branches:
         * (input == null) : true  #  inside cleanInput method
         * (value == null) : true
         */
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        //Act Statement(s)
        String result = target.doubleMetaphone((String) null, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenInputIsEmptyAndValueIsNull}, hash: 0863C4AFFE9533585213A7EEF1E37571
    @Test()
    void doubleMetaphone1WhenInputIsEmptyAndValueIsNull() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : true  #  inside cleanInput method
         * (value == null) : true
         */
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        //Act Statement(s)
        String result = target.doubleMetaphone(" ", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenAlternate}, hash: C11336FAFF6074CFCFB13C01F460803F
    @Disabled()
    @Test()
    void doubleMetaphone1WhenAlternate() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : true
         * (contains(value, index, 2, "WR")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : false  #  inside handleX method
         * (contains(value, index - 3, 3, "IAU", "EAU")) : false  #  inside handleX method
         * (contains(value, index - 2, 2, "AU", "OU")) : false  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : true  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : true  #  inside handleZ method
         * (alternate) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "IAU", "EAU" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 3, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "AU", "OU" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray17)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 37);
            doReturn('A').when(target).charAt("string2", 43);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 3, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray17), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 37);
                verify(target).charAt("string2", 43);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate5}, hash: E92C5FB986A06CDF5F239D409E1A1444
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate5() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : true
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : true  #  inside handleW method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray16)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 37);
            doReturn('A').when(target).charAt("string2", 41);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray16), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target, times(2)).charAt("string2", 37);
                verify(target, times(2)).charAt("string2", 41);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenNotSlavoGermanicAndCharAtValueIndexPlus1Equals_Z_AndNotAlternate}, hash: 422FD57A63EEA7C17108EA8A02059A29
    @Disabled()
    @Test()
    void doubleMetaphone1WhenNotSlavoGermanicAndCharAtValueIndexPlus1Equals_Z_AndNotAlternate() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : true
         * (contains(value, index, 2, "WR")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : false  #  inside handleX method
         * (contains(value, index - 3, 3, "IAU", "EAU")) : false  #  inside handleX method
         * (contains(value, index - 2, 2, "AU", "OU")) : false  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : true  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : false  #  inside handleZ method
         * (slavoGermanic) : true  #  inside handleZ method
         * (index > 0) : true  #  inside handleZ method
         * (slavoGermanic) : false  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : true  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "IAU", "EAU" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 3, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "AU", "OU" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 43, 2, stringArray18)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 37);
            doReturn('A').when(target).charAt("string2", 43);
            doReturn('A').when(target).charAt("string2", 41);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 3, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 43, 2, stringArray18), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 37);
                verify(target, times(2)).charAt("string2", 43);
                verify(target).charAt("string2", 41);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate13}, hash: B247BCB1FBE17ED64457826506F91A55
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate13() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : true  #  inside handleS method
         * (contains(value, index + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "HEIM", "HOEK", "HOLM", "HOLZ" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 34, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray18)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 38);
            doReturn('A').when(target).charAt("string2", 41);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 34, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray18), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 38);
                verify(target, times(2)).charAt("string2", 41);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate14}, hash: 4EF594557650C02E522DD93EAFF5A271
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate14() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : true
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : true  #  inside handleW method
         * (isVowel(charAt(value, index - 1))) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : false  #  inside handleW method
         * (contains(value, 0, 3, "SCH")) : false  #  inside handleW method
         * (contains(value, index, 4, "WICZ", "WITZ")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "SCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 3, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "WICZ", "WITZ" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 4, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 43, 1, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 44, 2, stringArray19)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 37);
            doReturn('A').when(target).charAt("string2", 44);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 3, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 4, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 43, 1, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 44, 2, stringArray19), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target, times(2)).charAt("string2", 37);
                verify(target, times(2)).charAt("string2", 44);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate15}, hash: D62BFE04E9F6E74623EAE55DBE0E20B7
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate15() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : true
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : true  #  inside handleW method
         * (isVowel(charAt(value, index - 1))) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : false  #  inside handleW method
         * (contains(value, 0, 3, "SCH")) : false  #  inside handleW method
         * (contains(value, index, 4, "WICZ", "WITZ")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "SCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 3, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "WICZ", "WITZ" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 4, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray19)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 37);
            doReturn('A').when(target).charAt("string2", 41);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 3, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 4, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray19), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target, times(2)).charAt("string2", 37);
                verify(target, times(2)).charAt("string2", 41);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate18}, hash: F20207FE9A4E24706A11AAE6C3DE2E73
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate18() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : false  #  inside handleT method
         * (contains(value, index, 2, "TH")) : false  #  inside handleT method
         * (contains(value, index, 3, "TTH")) : false  #  inside handleT method
         * (contains(value, index + 1, 1, "T", "D")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "TH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "TTH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "T", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 34, 1, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 36, 2, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 5, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 1, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray20)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 36);
            doReturn('A').when(target).charAt("string2", 39);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 34, 1, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 36, 2, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 5, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 1, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray20), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 36);
                verify(target, times(2)).charAt("string2", 39);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate19}, hash: 5CCDC196C646A0BB4060C3E9EF975519
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate19() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : false  #  inside handleT method
         * (contains(value, index, 2, "TH")) : false  #  inside handleT method
         * (contains(value, index, 3, "TTH")) : false  #  inside handleT method
         * (contains(value, index + 1, 1, "T", "D")) : false  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "TH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "TTH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "T", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 34, 1, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 34, 5, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 1, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray20)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 35);
            doReturn('A').when(target).charAt("string2", 38);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 34, 1, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 34, 5, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 1, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray20), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 35);
                verify(target, times(2)).charAt("string2", 38);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate22}, hash: A49B5108A29DE0C06946879615B99873
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate22() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : false  #  inside handleS method
         * (contains(value, index, 3, "SIO", "SIA")) : false  #  inside handleS method
         * (contains(value, index, 4, "SIAN")) : true  #  inside handleS method
         * (slavoGermanic) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "SIO", "SIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "SIAN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray19)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 39);
            doReturn('A').when(target).charAt("string2", 42);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray19), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 39);
                verify(target, times(2)).charAt("string2", 42);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate23}, hash: 74FFFE056C3C8D5A5793130DD7C2BB5C
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate23() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : false  #  inside handleT method
         * (contains(value, index, 3, "TIA", "TCH")) : false  #  inside handleT method
         * (contains(value, index, 2, "TH")) : false  #  inside handleT method
         * (contains(value, index, 3, "TTH")) : true  #  inside handleT method
         * (contains(value, index + 2, 2, "OM", "AM")) : false  #  inside handleT method
         * (contains(value, 0, 4, "VAN ", "VON ")) : false  #  inside handleT method
         * (contains(value, 0, 3, "SCH")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "TIA", "TCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "TH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 2, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "TTH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "OM", "AM" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "VAN ", "VON " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "SCH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 3, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 36, 2, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 5, stringArray20)).thenReturn(false);
            String[] stringArray21 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 1, stringArray21)).thenReturn(false);
            String[] stringArray22 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray22)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 36);
            doReturn('A').when(target).charAt("string2", 39);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 2, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 3, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 3, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 36, 2, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 5, stringArray20), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 1, stringArray21), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray22), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 36);
                verify(target, times(2)).charAt("string2", 39);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate24}, hash: 92572AF4A0FBC519AD1D57DF16CB02D1
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate24() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : false  #  inside handleS method
         * (contains(value, index, 3, "SIO", "SIA")) : false  #  inside handleS method
         * (contains(value, index, 4, "SIAN")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : true  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : true  #  inside handleS method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "SIO", "SIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "SIAN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 34, 4, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray20)).thenReturn(false);
            String[] stringArray21 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray21)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 38);
            doReturn('A').when(target).charAt("string2", 41);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 34, 4, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 2, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 5, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 40, 1, stringArray20), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 2, stringArray21), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 38);
                verify(target, times(2)).charAt("string2", 41);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate25}, hash: 3A0340B7771E7130C15A01CC161A8BC9
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate25() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : false  #  inside handleS method
         * (contains(value, index, 3, "SIO", "SIA")) : false  #  inside handleS method
         * (contains(value, index, 4, "SIAN")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : true  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : false  #  inside handleS method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "SIO", "SIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "SIAN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 37, 2, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 36, 5, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 1, stringArray20)).thenReturn(false);
            String[] stringArray21 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 40, 2, stringArray21)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 37);
            doReturn('A').when(target).charAt("string2", 40);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 4, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 37, 2, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 36, 5, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 1, stringArray20), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 40, 2, stringArray21), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 37);
                verify(target, times(2)).charAt("string2", 40);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate26}, hash: D1766C43E47AF317F59D74440B201A41
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate26() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : false  #  inside handleS method
         * (contains(value, index, 3, "SIO", "SIA")) : false  #  inside handleS method
         * (contains(value, index, 4, "SIAN")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : false  #  inside handleS method
         * (contains(value, index, 2, "SC")) : true  #  inside handleS method
         * (charAt(value, index + 2) == 'H') : false  #  inside handleSC method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleSC method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "SIO", "SIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "SIAN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "SC" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 34, 1, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray20)).thenReturn(false);
            String[] stringArray21 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray21)).thenReturn(false);
            String[] stringArray22 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray22)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 34);
            doReturn('A').when(target).charAt("string2", 39);
            doReturn('A').when(target).charAt("string2", 42);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 34, 1, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray20), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray21), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray22), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 34);
                verify(target).charAt("string2", 39);
                verify(target, times(2)).charAt("string2", 42);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate27}, hash: 579D22DCFDE9006D03B2057DC11F087E
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate27() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : false  #  inside handleS method
         * (contains(value, index, 3, "SIO", "SIA")) : false  #  inside handleS method
         * (contains(value, index, 4, "SIAN")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : false  #  inside handleS method
         * (contains(value, index, 2, "SC")) : true  #  inside handleS method
         * (charAt(value, index + 2) == 'H') : true  #  inside handleSC method
         * (contains(value, index + 3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) : true  #  inside handleSC method
         * (contains(value, index + 3, 2, "ER", "EN")) : true  #  inside handleSC method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "SIO", "SIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "SIAN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "SC" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "OO", "ER", "EN", "UY", "ED", "EM" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "ER", "EN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray20)).thenReturn(false);
            String[] stringArray21 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray21)).thenReturn(false);
            String[] stringArray22 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray22)).thenReturn(false);
            String[] stringArray23 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray23)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 34);
            doReturn('A').when(target).charAt("string2", 39);
            doReturn('A').when(target).charAt("string2", 42);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray20), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray21), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray22), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray23), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 34);
                verify(target).charAt("string2", 39);
                verify(target, times(2)).charAt("string2", 42);
            });
        }
    }

    //BaseRock generated method id: ${doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate28}, hash: F89A9443B433817F561A1D9C325BFEB3
    @Disabled()
    @Test()
    void doubleMetaphone1WhenContainsValueIndexPlus12ZOZIZAAndCharAtValueIndexPlus1NotEquals_Z_AndNotAlternate28() {
        /* Branches:
         * (input == null) : false  #  inside cleanInput method
         * (input.isEmpty()) : false  #  inside cleanInput method
         * (value == null) : false
         * (value.indexOf('W') > -1) : false  #  inside isSlavoGermanic method
         * (value.indexOf('K') > -1) : false  #  inside isSlavoGermanic method
         * (value.contains("CZ")) : false  #  inside isSlavoGermanic method
         * (value.contains("WITZ")) : true  #  inside isSlavoGermanic method
         * (for-each(SILENT_START)) : true  #  inside isSilentStart method
         * (value.startsWith(element)) : true  #  inside isSilentStart method
         * (isSilentStart(value)) : true
         * (!result.isComplete()) : true
         * (index <= value.length() - 1) : true
         * (switch(value.charAt(index)) = 'A' or switch(value.charAt(index)) = 'E' or switch(value.charAt(index)) = 'I' or switch(value.charAt(index)) = 'O' or switch(value.charAt(index)) = 'U' or switch(value.charAt(index)) = 'Y') : true
         * (index == 0) : false  #  inside handleAEIOUY method
         * (charAt(value, index + 1) == 'B') : true
         * (contains(value, index, 4, "CHIA")) : true  #  inside conditionC0 method
         * (conditionC0(value, index)) : true  #  inside handleC method
         * (contains(value, index, 2, "DG")) : true  #  inside handleD method
         * (contains(value, index + 2, 1, "I", "E", "Y")) : true  #  inside handleD method
         * (charAt(value, index + 1) == 'F') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleG method
         * (index > 0) : true  #  inside handleGH method
         * (VOWELS.indexOf(ch) != -1) : true  #  inside isVowel method
         * (!isVowel(charAt(value, index - 1))) : false  #  inside handleGH method
         * (index == 0) : false  #  inside handleGH method
         * (index > 1) : true  #  inside handleGH method
         * (contains(value, index - 2, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (index > 2) : true  #  inside handleGH method
         * (contains(value, index - 3, 1, "B", "H", "D")) : false  #  inside handleGH method
         * (contains(value, index - 4, 1, "B", "H")) : true  #  inside handleGH method
         * (index == 0) : false  #  inside handleH method
         * (isVowel(charAt(value, index - 1))) : true  #  inside handleH method
         * (isVowel(charAt(value, index + 1))) : true  #  inside handleH method
         * (contains(value, index, 4, "JOSE")) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : true  #  inside handleJ method
         * (index == 0) : false  #  inside handleJ method
         * (contains(value, 0, 4, "SAN ")) : false  #  inside handleJ method
         * (charAt(value, index + 1) == 'K') : true
         * (charAt(value, index + 1) == 'L') : true  #  inside handleL method
         * (index == value.length() - 3) : true  #  inside conditionL0 method
         * (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")) : true  #  inside conditionL0 method
         * (conditionL0(value, index)) : true  #  inside handleL method
         * (charAt(value, index + 1) == 'M') : true  #  inside conditionM0 method
         * (conditionM0(value, index)) : true
         * (charAt(value, index + 1) == 'N') : true
         * (charAt(value, index + 1) == 'H') : true  #  inside handleP method
         * (charAt(value, index + 1) == 'Q') : true
         * (index == value.length() - 1) : true  #  inside handleR method
         * (!slavoGermanic) : false  #  inside handleR method
         * (charAt(value, index + 1) == 'R') : true  #  inside handleR method
         * (contains(value, index - 1, 3, "ISL", "YSL")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index, 2, "SH")) : false  #  inside handleS method
         * (contains(value, index, 3, "SIO", "SIA")) : false  #  inside handleS method
         * (contains(value, index, 4, "SIAN")) : false  #  inside handleS method
         * (index == 0) : false  #  inside handleS method
         * (contains(value, index + 1, 1, "Z")) : false  #  inside handleS method
         * (contains(value, index, 2, "SC")) : true  #  inside handleS method
         * (charAt(value, index + 2) == 'H') : true  #  inside handleSC method
         * (contains(value, index + 3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) : false  #  inside handleSC method
         * (index == 0) : false  #  inside handleSC method
         * (contains(value, index, 4, "TION")) : true  #  inside handleT method
         * (charAt(value, index + 1) == 'V') : false
         * (contains(value, index, 2, "WR")) : false  #  inside handleW method
         * (index == 0) : false  #  inside handleW method
         * (index == value.length() - 1) : false  #  inside handleW method
         * (contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")) : true  #  inside handleW method
         * (index == 0) : false  #  inside handleX method
         * (!(index == value.length() - 1 && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))) : true  #  inside handleX method
         * (contains(value, index + 1, 1, "C", "X")) : false  #  inside handleX method
         * (charAt(value, index + 1) == 'H') : false  #  inside handleZ method
         * (contains(value, index + 1, 2, "ZO", "ZI", "ZA")) : true  #  inside handleZ method
         * (charAt(value, index + 1) == 'Z') : false  #  inside handleZ method
         * (alternate) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: result - Method: isComplete
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DoubleMetaphone> doubleMetaphone = mockStatic(DoubleMetaphone.class)) {
            String[] stringArray = new String[] { "CHIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray)).thenReturn(false);
            String[] stringArray2 = new String[] { "DG" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2)).thenReturn(false);
            String[] stringArray3 = new String[] { "I", "E", "Y" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3)).thenReturn(false);
            String[] stringArray4 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4)).thenReturn(false);
            String[] stringArray5 = new String[] { "B", "H", "D" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5)).thenReturn(false);
            String[] stringArray6 = new String[] { "B", "H" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6)).thenReturn(false);
            String[] stringArray7 = new String[] { "JOSE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7)).thenReturn(false);
            String[] stringArray8 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8)).thenReturn(false);
            String[] stringArray9 = new String[] { "SAN " };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9)).thenReturn(false);
            String[] stringArray10 = new String[] { "ILLO", "ILLA", "ALLE" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10)).thenReturn(false);
            String[] stringArray11 = new String[] { "ISL", "YSL" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11)).thenReturn(false);
            String[] stringArray12 = new String[] { "SH" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12)).thenReturn(false);
            String[] stringArray13 = new String[] { "SIO", "SIA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13)).thenReturn(false);
            String[] stringArray14 = new String[] { "SIAN" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14)).thenReturn(false);
            String[] stringArray15 = new String[] { "Z" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15)).thenReturn(false);
            String[] stringArray16 = new String[] { "SC" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray16)).thenReturn(false);
            String[] stringArray17 = new String[] { "OO", "ER", "EN", "UY", "ED", "EM" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray17)).thenReturn(false);
            String[] stringArray18 = new String[] { "TION" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray18)).thenReturn(false);
            String[] stringArray19 = new String[] { "WR" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray19)).thenReturn(false);
            String[] stringArray20 = new String[] { "EWSKI", "EWSKY", "OWSKI", "OWSKY" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray20)).thenReturn(false);
            String[] stringArray21 = new String[] { "C", "X" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray21)).thenReturn(false);
            String[] stringArray22 = new String[] { "ZO", "ZI", "ZA" };
            doubleMetaphone.when(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray22)).thenReturn(false);
            DoubleMetaphone target = spy(new DoubleMetaphone());
            doReturn('A').when(target).charAt("string2", 3);
            doReturn('A').when(target).charAt("string2", 11);
            doReturn('A').when(target).charAt("string2", 13);
            doReturn('A').when(target).charAt("string2", 15);
            doReturn('A').when(target).charAt("string2", 18);
            doReturn('A').when(target).charAt("string2", 20);
            doReturn('A').when(target).charAt("string2", 22);
            doReturn('A').when(target).charAt("string2", 24);
            doReturn('A').when(target).charAt("string2", 27);
            doReturn('A').when(target).charAt("string2", 29);
            doReturn('A').when(target).charAt("string2", 31);
            doReturn('A').when(target).charAt("string2", 34);
            doReturn('A').when(target).charAt("string2", 39);
            doReturn('A').when(target).charAt("string2", 42);
            //Act Statement(s)
            String result = target.doubleMetaphone("value1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 5, 4, stringArray), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 7, 2, stringArray2), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray3), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 10, 1, stringArray4), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 9, 1, stringArray5), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 8, 1, stringArray6), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 16, 4, stringArray7), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray8), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 0, 4, stringArray9), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 18, 4, stringArray10), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 31, 3, stringArray11), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray12), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 3, stringArray13), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 4, stringArray14), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 33, 1, stringArray15), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 32, 2, stringArray16), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 2, stringArray17), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 35, 4, stringArray18), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 39, 2, stringArray19), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 38, 5, stringArray20), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 41, 1, stringArray21), atLeast(1));
                doubleMetaphone.verify(() -> DoubleMetaphone.contains("string2", 42, 2, stringArray22), atLeast(1));
                verify(target).charAt("string2", 3);
                verify(target, times(2)).charAt("string2", 11);
                verify(target, times(2)).charAt("string2", 13);
                verify(target).charAt("string2", 15);
                verify(target).charAt("string2", 18);
                verify(target).charAt("string2", 20);
                verify(target).charAt("string2", 22);
                verify(target).charAt("string2", 24);
                verify(target).charAt("string2", 27);
                verify(target).charAt("string2", 29);
                verify(target).charAt("string2", 31);
                verify(target).charAt("string2", 34);
                verify(target).charAt("string2", 39);
                verify(target, times(2)).charAt("string2", 42);
            });
        }
    }

    //BaseRock generated method id: ${encodeWhenObjNotInstanceOfStringThrowsEncoderException}, hash: F3BFFC8021355C3B3FDB94F488F3F95D
    @Test()
    void encodeWhenObjNotInstanceOfStringThrowsEncoderException() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : true
         */
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        Object object = new Object();
        EncoderException encoderException = new EncoderException("DoubleMetaphone encode parameter is not of type String");
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

    //BaseRock generated method id: ${encodeWhenObjInstanceOfString}, hash: C6C564B87A66E3B972A5918638F6177C
    @Disabled()
    @Test()
    void encodeWhenObjInstanceOfString() throws EncoderException {
        /* Branches:
         * (!(obj instanceof String)) : false
         */
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn("return_of_doubleMetaphone1").when(target).doubleMetaphone("obj1");
        //Act Statement(s)
        Object result = target.encode((Object) "obj1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_doubleMetaphone1"));
            verify(target).doubleMetaphone("obj1");
        });
    }

    //BaseRock generated method id: ${encode1Test}, hash: 6D4A1840E5E94C5B93355EB582200D32
    @Disabled()
    @Test()
    void encode1Test() {
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn("return_of_doubleMetaphone1").when(target).doubleMetaphone("value1");
        //Act Statement(s)
        String result = target.encode("value1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_doubleMetaphone1"));
            verify(target).doubleMetaphone("value1");
        });
    }

    //BaseRock generated method id: ${getMaxCodeLenTest}, hash: 95BBFDFE21D526E351D9E90D85F3A686
    @Test()
    void getMaxCodeLenTest() {
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        //Act Statement(s)
        int result = target.getMaxCodeLen();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(4)));
    }

    //BaseRock generated method id: ${isDoubleMetaphoneEqualWhenIsDoubleMetaphoneEqualValue1Value2False}, hash: D19DE89292BE2F9E1C0728558DA67AD2
    @Disabled()
    @Test()
    void isDoubleMetaphoneEqualWhenIsDoubleMetaphoneEqualValue1Value2False() {
        /* Branches:
         * (isDoubleMetaphoneEqual(value1, value2, false)) : true
         */
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn(true).when(target).isDoubleMetaphoneEqual("value1", "value2", false);
        //Act Statement(s)
        boolean result = target.isDoubleMetaphoneEqual("value1", "value2");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isDoubleMetaphoneEqual("value1", "value2", false);
        });
    }

    //BaseRock generated method id: ${isDoubleMetaphoneEqualWhenIsDoubleMetaphoneEqualNotValue1Value2False}, hash: 36FCFFF52002960ECC677254EBA3166B
    @Disabled()
    @Test()
    void isDoubleMetaphoneEqualWhenIsDoubleMetaphoneEqualNotValue1Value2False() {
        /* Branches:
         * (isDoubleMetaphoneEqual(value1, value2, false)) : false
         */
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn(false).when(target).isDoubleMetaphoneEqual("value1", "value2", false);
        //Act Statement(s)
        boolean result = target.isDoubleMetaphoneEqual("value1", "value2");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isDoubleMetaphoneEqual("value1", "value2", false);
        });
    }

    //BaseRock generated method id: ${isDoubleMetaphoneEqual1WhenStringUtilsEqualsDoubleMetaphoneValue1AlternateDoubleMetaphoneValue2Alternate}, hash: 0EE277625A736F21287E07B0D363FC6A
    @Disabled()
    @Test()
    void isDoubleMetaphoneEqual1WhenStringUtilsEqualsDoubleMetaphoneValue1AlternateDoubleMetaphoneValue2Alternate() {
        /* Branches:
         * (StringUtils.equals(doubleMetaphone(value1, alternate), doubleMetaphone(value2, alternate))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn("return_of_doubleMetaphone1").when(target).doubleMetaphone("value1", false);
        doReturn("return_of_doubleMetaphone1").when(target).doubleMetaphone("value2", false);
        //Act Statement(s)
        boolean result = target.isDoubleMetaphoneEqual("value1", "value2", false);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).doubleMetaphone("value1", false);
            verify(target).doubleMetaphone("value2", false);
        });
    }

    //BaseRock generated method id: ${isDoubleMetaphoneEqual1WhenStringUtilsNotEqualsDoubleMetaphoneValue1AlternateDoubleMetaphoneValue2Alternate}, hash: 5E27905F6462EE3ACBA3417D8D88026A
    @Disabled()
    @Test()
    void isDoubleMetaphoneEqual1WhenStringUtilsNotEqualsDoubleMetaphoneValue1AlternateDoubleMetaphoneValue2Alternate() {
        /* Branches:
         * (StringUtils.equals(doubleMetaphone(value1, alternate), doubleMetaphone(value2, alternate))) : false
         */
        //Arrange Statement(s)
        DoubleMetaphone target = spy(new DoubleMetaphone());
        doReturn("A").when(target).doubleMetaphone("value1", false);
        doReturn("B").when(target).doubleMetaphone("value2", false);
        //Act Statement(s)
        boolean result = target.isDoubleMetaphoneEqual("value1", "value2", false);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).doubleMetaphone("value1", false);
            verify(target).doubleMetaphone("value2", false);
        });
    }

    //BaseRock generated method id: ${setMaxCodeLenTest}, hash: 0E4598549EC9C4926BB090CF039E0F69
    @Test()
    void setMaxCodeLenTest() {
        //Arrange Statement(s)
        DoubleMetaphone target = new DoubleMetaphone();
        //Act Statement(s)
        target.setMaxCodeLen(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getMaxCodeLen(), equalTo(0)));
    }
}
