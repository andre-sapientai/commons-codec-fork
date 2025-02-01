package org.apache.commons.codec.language.bm;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LangBaseRockGeneratedTest {

    private final Languages.LanguageSet languagesLanguageSetMock = mock(Languages.LanguageSet.class);

    //BaseRock generated method id: ${instanceTest}, hash: 2C1EA16C89231FE6DB1DFFDECEFE82B1
    @Disabled()
    @Test()
    void instanceTest() {
        //Act Statement(s)
        Lang result = Lang.instance(NameType.ASHKENAZI);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //BaseRock generated method id: ${loadFromResourceWhenPartsLengthEquals3ThrowsIllegalArgumentException}, hash: 32763679EF0AB0D7FE79DB75F186E8D0
    @Disabled()
    @Test()
    void loadFromResourceWhenPartsLengthEquals3ThrowsIllegalArgumentException() {
        /* Branches:
         * (scanner.hasNextLine()) : true
         * (inExtendedComment) : false
         * (line.startsWith(ResourceConstants.EXT_CMT_START)) : true
         * (line.endsWith(ResourceConstants.EXT_CMT_END)) : false
         * (cmtI >= 0) : false
         * (line.isEmpty()) : true
         * (parts.length != 3) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Malformed line '' in language resource '/org/apache/commons/codec/language/bm/ash_lang.txt'");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Lang.loadFromResource("/org/apache/commons/codec/language/bm/ash_lang.txt", languages);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${guessLanguageWhenLsIsSingleton}, hash: 9EE9E7CB8CCBD75A306AAF525D7BF7C3
    @Disabled()
    @Test()
    void guessLanguageWhenLsIsSingleton() {
        /* Branches:
         * (ls.isSingleton()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.util.Scanner
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        Lang target = spy(Lang.loadFromResource("A", languages));
        doReturn(languagesLanguageSetMock).when(target).guessLanguages("text1");
        //Act Statement(s)
        String result = target.guessLanguage("text1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).guessLanguages("text1");
        });
    }

    //BaseRock generated method id: ${guessLanguageWhenLsNotIsSingleton}, hash: 49F0CBC9EA26A1E1D29D49D4AD51D6C2
    @Disabled()
    @Test()
    void guessLanguageWhenLsNotIsSingleton() {
        /* Branches:
         * (ls.isSingleton()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.util.Scanner
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        Lang target = spy(Lang.loadFromResource("A", languages));
        doReturn(languagesLanguageSetMock).when(target).guessLanguages("text1");
        //Act Statement(s)
        String result = target.guessLanguage("text1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("any"));
            verify(target).guessLanguages("text1");
        });
    }

    //BaseRock generated method id: ${guessLanguagesWhenLsEqualsLanguagesNO_LANGUAGES}, hash: 8386DEB90BE14709C7107ABC6CF21F1B
    @Disabled()
    @Test()
    void guessLanguagesWhenLsEqualsLanguagesNO_LANGUAGES() {
        /* Branches:
         * (ls.equals(Languages.NO_LANGUAGES)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.util.Scanner
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        Lang target = Lang.loadFromResource("A", languages);
        //Act Statement(s)
        Languages.LanguageSet result = target.guessLanguages("B");
        //Assert statement(s)
        //TODO: Please implement equals method in LanguageSet for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${guessLanguagesWhenLsNotEqualsLanguagesNO_LANGUAGES}, hash: 07290E0BCBDD3F19CE64C35AF31541C2
    @Disabled()
    @Test()
    void guessLanguagesWhenLsNotEqualsLanguagesNO_LANGUAGES() {
        /* Branches:
         * (ls.equals(Languages.NO_LANGUAGES)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.util.Scanner
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        Lang target = Lang.loadFromResource("A", languages);
        //Act Statement(s)
        Languages.LanguageSet result = target.guessLanguages("B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
