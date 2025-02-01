package org.apache.commons.codec.language.bm;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LanguagesBaseRockGeneratedTest {

    //BaseRock generated method id: ${getInstanceTest}, hash: D8037DC25218D4B0D4819E05740C6961
    @Test()
    void getInstanceTest() {
        //Act Statement(s)
        Languages result = Languages.getInstance(NameType.ASHKENAZI);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${getInstance1WhenLineIsEmpty}, hash: 3D8B1673BE15B75BBE321B7868E7817B
    @Test()
    void getInstance1WhenLineIsEmpty() {
        /* Branches:
         * (lsScanner.hasNextLine()) : true
         * (inExtendedComment) : false
         * (line.startsWith(ResourceConstants.EXT_CMT_START)) : true
         * (line.endsWith(ResourceConstants.EXT_CMT_END)) : false
         * (!line.isEmpty()) : false
         */
        //Act Statement(s)
        Languages result = Languages.getInstance("/org/apache/commons/codec/language/bm/sep_languages.txt");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${getInstance1WhenDefaultBranchThrowsThrowable}, hash: 76B4043FE46C1DED9B5286E76A6B7734
    @Disabled()
    @Test()
    void getInstance1WhenDefaultBranchThrowsThrowable() {
        /* Branches:
         * (lsScanner.hasNextLine()) : true
         * (inExtendedComment) : false
         * (line.startsWith(ResourceConstants.EXT_CMT_START)) : true
         * (line.endsWith(ResourceConstants.EXT_CMT_END)) : false
         * (!line.isEmpty()) : false
         * (branch expression (line 316)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            Languages.getInstance("/org/apache/commons/codec/language/bm/sep_languages.txt");
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${getLanguagesTest}, hash: C15365EB6FD09C30CDAB80791185BDA1
    @Disabled()
    @Test()
    void getLanguagesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Languages target = Languages.getInstance(NameType.ASHKENAZI);
        //Act Statement(s)
        Set<String> result = target.getLanguages();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
