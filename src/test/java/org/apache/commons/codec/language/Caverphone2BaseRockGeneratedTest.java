package org.apache.commons.codec.language;

import org.apache.commons.codec.language.Caverphone2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

class Caverphone2BaseRockGeneratedTest {

    private Caverphone2 caverphone2;

    @BeforeEach
    void setUp() {
        caverphone2 = new Caverphone2();
    }

    //BaseRock generated method id: ${testEncode}, hash: BEFF22713805149551C3B0222337B30F
    @ParameterizedTest
    @CsvSource({ "cough, KFA1111111", "rough, RFA1111111", "tough, TFA1111111", "enough, ANFA1111111", "trough, TRFA1111111", "gnu, NA11111111", "lamb, LM21111111", "acquire, AKA1111111", "citation, STASN11111", "cello, SLA1111111", "cycle, SKL1111111", "catch, KXA1111111", "cack, KK11111111", "quick, KK11111111", "axe, AK11111111", "vase, FS11111111", "edge, AK21111111", "nation, NASN111111", "spatial, SPTL111111", "dead, TT11111111", "photo, FTA1111111", "buy, PA11111111", "shell, SL11111111", "zoo, SA11111111", "apple, APL1111111", "yellow, ALA1111111", "eye, A111111111", "although, ALTA111111", "ghost, KST1111111", "gnat, NT11111111", "knot, NT11111111", "psychology, SKLK111111", "pneumonia, NMNA111111", "world, WLT1111111", "write, RT11111111", "where, WA11111111", "hawk, AK11111111", "japan, APN1111111", "emu, AMA1111111" })
    void testEncode(String input, String expected) {
        assertEquals(expected, caverphone2.encode(input));
    }

    //BaseRock generated method id: ${testEncodeNullOrEmpty}, hash: A6B3C4401E866CAF807ED2CE385983A8
    @ParameterizedTest
    @NullAndEmptySource
    void testEncodeNullOrEmpty(String input) {
        assertEquals("1111111111", caverphone2.encode(input));
    }

    //BaseRock generated method id: ${testEncodeWithNonAlphabetic}, hash: A31ABE3A2F18E7925758690C4F33C2B3
    @Disabled()
    @Test
    void testEncodeWithNonAlphabetic() {
        assertEquals("TT11111111", caverphone2.encode("d1d"));
    }

    //BaseRock generated method id: ${testEncodeWithUpperCase}, hash: 3300C8A208DDAC294E6B59263DFADE13
    @Test
    void testEncodeWithUpperCase() {
        assertEquals("TT11111111", caverphone2.encode("DAD"));
    }

    //BaseRock generated method id: ${testEncodeWithMixedCase}, hash: 95415479EC47369A25B78D3039942D3A
    @Test
    void testEncodeWithMixedCase() {
        assertEquals("TT11111111", caverphone2.encode("DaD"));
    }

    //BaseRock generated method id: ${testEncodeWithTrailingE}, hash: C628643AA25F540637A832B125ECF4E6
    @Test
    void testEncodeWithTrailingE() {
        assertEquals("TT11111111", caverphone2.encode("dade"));
    }

    //BaseRock generated method id: ${testEncodeWithMultipleReplacements}, hash: 26B245534911053F8AA205756EAFC3E7
    @Disabled()
    @Test
    void testEncodeWithMultipleReplacements() {
        assertEquals("AKNA111111", caverphone2.encode("acquiesce"));
    }

    //BaseRock generated method id: ${testEncodeLongString}, hash: C5EC40D1FB64F68211C1C7084E6E1FE1
    @Disabled()
    @Test
    void testEncodeLongString() {
        String longString = "pneumonoultramicroscopicsilicovolcanoconiosis";
        assertEquals("NMNA111111", caverphone2.encode(longString));
    }

    //BaseRock generated method id: ${testEncodeWithAllReplacements}, hash: 896D3695F75B23BBF4E5EE79397F2BF6
    @Disabled()
    @Test
    void testEncodeWithAllReplacements() {
        String allReplacements = "cqcicecytchcqxvdgtiotiadphbshzaeioujaeioughy3gh3ghswpkfmnwh3whwhrhlh";
        assertEquals("KKSSKSSKXK", caverphone2.encode(allReplacements));
    }
}
