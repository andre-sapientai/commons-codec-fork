package org.apache.commons.codec.language;

import org.apache.commons.codec.language.Metaphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.apache.commons.codec.EncoderException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

class MetaphoneBaseRockGeneratedTest {

    private Metaphone metaphone;

    @BeforeEach
    void setUp() {
        metaphone = new Metaphone();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 5F81B28BAB02AF1E956A0C31BB9DB7BF
    @Test
    void testConstructor() {
        assertNotNull(metaphone);
        assertEquals(4, metaphone.getMaxCodeLen());
    }

    //BaseRock generated method id: ${testMetaphone}, hash: 340C65C852D626131E8369401D70919A
    @ParameterizedTest
    @CsvSource({ "metaphone, MTFN", "METAPHONE, MTFN", "wildcard, WLTK", "WILDCARD, WLTK", "aardvark, ARTH", "AARDVARK, ARTH", "pineapple, PNPL", "PINEAPPLE, PNPL", "hello, HL", "HELLO, HL" })
    void testMetaphone(String input, String expected) {
        assertEquals(expected, metaphone.metaphone(input));
    }

    //BaseRock generated method id: ${testMetaphoneWithNullOrEmpty}, hash: 94608C23EF7AE64C26B2559C2E4A4A4F
    @ParameterizedTest
    @NullAndEmptySource
    void testMetaphoneWithNullOrEmpty(String input) {
        assertEquals("", metaphone.metaphone(input));
    }

    //BaseRock generated method id: ${testMetaphoneSingleCharacter}, hash: 731F59909F0280E2EB4ACEE6E150700B
    @Test
    void testMetaphoneSingleCharacter() {
        assertEquals("A", metaphone.metaphone("a"));
        assertEquals("B", metaphone.metaphone("b"));
    }

    //BaseRock generated method id: ${testMetaphoneSpecialCases}, hash: 0CF92F2EC1B55E3B1CA422AD8E99C04C
    @ParameterizedTest
    @CsvSource({ "Knight, N", "Gnome, NM", "Pneumonia, NMN", "Aero, AR", "Wasp, WSP", "Pterodactyl, TRTK", "Xavier, SFR" })
    void testMetaphoneSpecialCases(String input, String expected) {
        assertEquals(expected, metaphone.metaphone(input));
    }

    //BaseRock generated method id: ${testIsMetaphoneEqual}, hash: 363DBF38C32EB3F914696C2E089B4609
    @Test
    void testIsMetaphoneEqual() {
        assertTrue(metaphone.isMetaphoneEqual("hello", "hallo"));
        assertFalse(metaphone.isMetaphoneEqual("hello", "world"));
    }

    //BaseRock generated method id: ${testSetMaxCodeLen}, hash: 8E7F160B70BE5DE419D4206642CDE193
    @Disabled()
    @Test
    void testSetMaxCodeLen() {
        metaphone.setMaxCodeLen(6);
        assertEquals(6, metaphone.getMaxCodeLen());
        assertEquals("TRTKTL", metaphone.metaphone("pterodactyl"));
    }

    //BaseRock generated method id: ${testEncodeObject}, hash: 8AF0A01F26265964459DFFAEBEFED8FD
    @Test
    void testEncodeObject() throws EncoderException {
        assertEquals("HL", metaphone.encode("hello"));
    }

    //BaseRock generated method id: ${testEncodeObjectWithInvalidType}, hash: CF11831BD40CC34D91A096AA463E98A1
    @Test
    void testEncodeObjectWithInvalidType() {
        assertThrows(EncoderException.class, () -> metaphone.encode(new Object()));
    }

    //BaseRock generated method id: ${testEncodeString}, hash: 87B5C97EBCB242BA051EA10420D7B18D
    @Test
    void testEncodeString() {
        assertEquals("HL", metaphone.encode("hello"));
    }
}
