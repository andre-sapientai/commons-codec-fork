package org.apache.commons.codec.language;

import org.apache.commons.codec.language.Soundex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.apache.commons.codec.EncoderException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

class SoundexBaseRockGeneratedTest {

    private Soundex soundex;

    @BeforeEach
    void setUp() {
        soundex = new Soundex();
    }

    //BaseRock generated method id: ${testConstructorWithDefaultMapping}, hash: 76BE4AC30EAA9227041E3D09A43E22AD
    @Test
    void testConstructorWithDefaultMapping() {
        Soundex soundex = new Soundex();
        assertEquals("W252", soundex.encode("Washington"));
    }

    //BaseRock generated method id: ${testConstructorWithCustomMapping}, hash: 17F63C00CBC710A4D07DC10013DF4F77
    @Test
    void testConstructorWithCustomMapping() {
        Soundex soundex = new Soundex("01230120022455012623010202");
        assertEquals("W252", soundex.encode("Washington"));
    }

    //BaseRock generated method id: ${testConstructorWithCustomMappingAndSpecialCaseHW}, hash: 14FF3FB064EE288F48CB7F441684C048
    @Test
    void testConstructorWithCustomMappingAndSpecialCaseHW() {
        Soundex soundex = new Soundex("01230120022455012623010202", false);
        assertEquals("W252", soundex.encode("Washington"));
    }

    //BaseRock generated method id: ${testDifference}, hash: A573905D8E4BC43A938D95A8CDA22794
    @ParameterizedTest
    @CsvSource({ "Smith, Smythe, 4", "Ann, Andrew, 2", "Margaret, Andrew, 1", "Janet, Margaret, 0" })
    void testDifference(String s1, String s2, int expectedDifference) throws EncoderException {
        assertEquals(expectedDifference, soundex.difference(s1, s2));
    }

    //BaseRock generated method id: ${testEncodeObject}, hash: FF3E8A267E542A64CDBB68C9C5C2C092
    @Test
    void testEncodeObject() throws EncoderException {
        assertEquals("T235", soundex.encode((Object) "testing"));
    }

    //BaseRock generated method id: ${testEncodeObjectWithNonString}, hash: 6CB94914C99A8BA09866CB2EF54AA891
    @Test
    void testEncodeObjectWithNonString() {
        assertThrows(EncoderException.class, () -> soundex.encode(new Object()));
    }

    //BaseRock generated method id: ${testEncodeString}, hash: 80463B72CC821E20559810C47442A681
    @Test
    void testEncodeString() {
        assertEquals("T235", soundex.encode("testing"));
    }

    //BaseRock generated method id: ${testGetMaxLength}, hash: 01D2849B5591A8408D100D5B36E06B16
    @Test
    void testGetMaxLength() {
        assertEquals(4, soundex.getMaxLength());
    }

    //BaseRock generated method id: ${testSetMaxLength}, hash: C4934215DF5B3255ED12659AFD0850FE
    @Test
    void testSetMaxLength() {
        soundex.setMaxLength(5);
        assertEquals(5, soundex.getMaxLength());
    }

    //BaseRock generated method id: ${testSoundexWithNullOrEmpty}, hash: 902C15F8ED61A48C18AC0D0347EA8F83
    @ParameterizedTest
    @NullAndEmptySource
    void testSoundexWithNullOrEmpty(String input) {
        assertEquals(input, soundex.soundex(input));
    }

    //BaseRock generated method id: ${testSoundexWithVariousNames}, hash: CF7EB0ABAAEB3953DF59ECA9BB176A57
    @ParameterizedTest
    @ValueSource(strings = { "Washington", "Lee", "Gutierrez" })
    void testSoundexWithVariousNames(String input) {
        assertNotNull(soundex.soundex(input));
        assertEquals(4, soundex.soundex(input).length());
    }

    //BaseRock generated method id: ${testSoundexWithSpecialCaseHW}, hash: 7AE8116BCEA27062221BA923F49C7865
    @Test
    void testSoundexWithSpecialCaseHW() {
        Soundex soundexWithHW = new Soundex("01230120022455012623010202", true);
        assertEquals("W252", soundexWithHW.soundex("Washington"));
        assertEquals("L000", soundexWithHW.soundex("Lee"));
    }

    //BaseRock generated method id: ${testSoundexWithoutSpecialCaseHW}, hash: 0F5F65149D0A15A7D597830D8468D442
    @Test
    void testSoundexWithoutSpecialCaseHW() {
        Soundex soundexWithoutHW = new Soundex("01230120022455012623010202", false);
        assertEquals("W252", soundexWithoutHW.soundex("Washington"));
        assertEquals("L000", soundexWithoutHW.soundex("Lee"));
    }

    //BaseRock generated method id: ${testSoundexWithSilentMarker}, hash: 918AF731DD0AE67B2B7E43442E40B3C5
    @Test
    void testSoundexWithSilentMarker() {
        Soundex soundexWithSilentMarker = new Soundex("-123-12--22455-12623-1-2-2");
        assertEquals("W252", soundexWithSilentMarker.soundex("Washington"));
    }

    //BaseRock generated method id: ${testMapWithInvalidCharacter}, hash: 4941E0D5E5EA8BE42CFEA749768668A8
    @Disabled()
    @Test
    void testMapWithInvalidCharacter() {
        assertThrows(IllegalArgumentException.class, () -> soundex.soundex("123"));
    }

    //BaseRock generated method id: ${testUS_ENGLISH}, hash: B6D248A2376AD673D80BABC358FA7BB7
    @Test
    void testUS_ENGLISH() {
        assertEquals("R163", Soundex.US_ENGLISH.soundex("Robert"));
    }

    //BaseRock generated method id: ${testUS_ENGLISH_SIMPLIFIED}, hash: 54F440161CB346EC8EB2DF5998E1D364
    @Test
    void testUS_ENGLISH_SIMPLIFIED() {
        assertEquals("R163", Soundex.US_ENGLISH_SIMPLIFIED.soundex("Robert"));
    }

    //BaseRock generated method id: ${testUS_ENGLISH_GENEALOGY}, hash: BD9B3B787C423327489ACC3993BD9746
    @Test
    void testUS_ENGLISH_GENEALOGY() {
        assertEquals("R163", Soundex.US_ENGLISH_GENEALOGY.soundex("Robert"));
    }
}
