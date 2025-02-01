package org.apache.commons.codec.language;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.EncoderException;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SoundexUtilsBaseRockGeneratedTest {

    //BaseRock generated method id: ${cleanWhenIsEmptyStr}, hash: CBB1037DB181036EABCC519C3DC54660
    @Test()
    void cleanWhenIsEmptyStr() {
        /* Branches:
         * (isEmpty(str)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SoundexUtils> soundexUtils = mockStatic(SoundexUtils.class, CALLS_REAL_METHODS)) {
            soundexUtils.when(() -> SoundexUtils.isEmpty("str1")).thenReturn(true);
            //Act Statement(s)
            String result = SoundexUtils.clean("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("str1"));
                soundexUtils.verify(() -> SoundexUtils.isEmpty("str1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${cleanWhenCharacterIsLetterStrCharAtIAndCountEqualsLen}, hash: FD3C40FFE5F3B8A1161B657993A480B9
    @Test()
    void cleanWhenCharacterIsLetterStrCharAtIAndCountEqualsLen() {
        /* Branches:
         * (isEmpty(str)) : false
         * (i < len) : true
         * (Character.isLetter(str.charAt(i))) : true
         * (count == len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SoundexUtils> soundexUtils = mockStatic(SoundexUtils.class, CALLS_REAL_METHODS)) {
            soundexUtils.when(() -> SoundexUtils.isEmpty("A")).thenReturn(false);
            //Act Statement(s)
            String result = SoundexUtils.clean("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A"));
                soundexUtils.verify(() -> SoundexUtils.isEmpty("A"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${cleanWhenCountNotEqualsLen}, hash: 51E3A8BBB9EA4894F318F63D64C47937
    @Disabled()
    @Test()
    void cleanWhenCountNotEqualsLen() {
        /* Branches:
         * (isEmpty(str)) : false
         * (i < len) : true
         * (Character.isLetter(str.charAt(i))) : true
         * (count == len) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SoundexUtils> soundexUtils = mockStatic(SoundexUtils.class, CALLS_REAL_METHODS)) {
            soundexUtils.when(() -> SoundexUtils.isEmpty("AB")).thenReturn(false);
            //Act Statement(s)
            String result = SoundexUtils.clean("AB");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("C"));
                soundexUtils.verify(() -> SoundexUtils.isEmpty("AB"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${differenceTest}, hash: 7E80968AB9F82554321DC57ECEBED2C9
    @Test()
    void differenceTest() throws EncoderException {
        //Arrange Statement(s)
        try (MockedStatic<SoundexUtils> soundexUtils = mockStatic(SoundexUtils.class, CALLS_REAL_METHODS)) {
            soundexUtils.when(() -> SoundexUtils.differenceEncoded("400000", "400000")).thenReturn(0);
            DaitchMokotoffSoundex daitchMokotoffSoundex = new DaitchMokotoffSoundex();
            //Act Statement(s)
            int result = SoundexUtils.difference(daitchMokotoffSoundex, "s1", "s2");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                soundexUtils.verify(() -> SoundexUtils.differenceEncoded("400000", "400000"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${differenceEncodedWhenEs2IsNull}, hash: CFA05DCC12092555ACAF58BE1CDB2481
    @Test()
    void differenceEncodedWhenEs2IsNull() {
        /* Branches:
         * (es1 == null) : false
         * (es2 == null) : true
         */
        //Act Statement(s)
        int result = SoundexUtils.differenceEncoded("es1", (String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${differenceEncodedWhenEs1CharAtIEqualsEs2CharAtI}, hash: 295B42A02344537F0CECAB763E027628
    @Test()
    void differenceEncodedWhenEs1CharAtIEqualsEs2CharAtI() {
        /* Branches:
         * (es1 == null) : false
         * (es2 == null) : false
         * (i < lengthToMatch) : true
         * (es1.charAt(i) == es2.charAt(i)) : true
         */
        //Act Statement(s)
        int result = SoundexUtils.differenceEncoded("A", "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //BaseRock generated method id: ${isEmptyWhenCsLengthEquals0}, hash: 1506D8D59E4D6FE9A28C846C5898A400
    @Disabled()
    @Test()
    void isEmptyWhenCsLengthEquals0() {
        /* Branches:
         * (cs == null) : false
         * (cs.length() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SoundexUtils.isEmpty("cs1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //BaseRock generated method id: ${isEmptyWhenCsLengthNotEquals0}, hash: ECA52CBDE206F818A448BF5201709EA9
    @Test()
    void isEmptyWhenCsLengthNotEquals0() {
        /* Branches:
         * (cs == null) : false
         * (cs.length() == 0) : false
         */
        //Act Statement(s)
        boolean result = SoundexUtils.isEmpty("cs1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
