package org.apache.commons.codec.binary;

import org.apache.commons.codec.binary.CharSequenceUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

class CharSequenceUtilsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testRegionMatches}, hash: 946F99CDCC336C4BF8BA5588EBCF4C4E
    @ParameterizedTest
    @CsvSource({ "Hello World, false, 0, Hello, 0, 5, true", "Hello World, false, 6, World, 0, 5, true", "Hello World, false, 0, hello, 0, 5, false", "Hello World, true, 0, hello, 0, 5, true", "Hello World, false, 0, Hello World, 0, 11, true", "Hello World, false, 0, Hello World!, 0, 11, true", "Hello World, false, 0, Hello World!, 0, 12, false", "Hello World, false, 11, !, 0, 1, false" })
    void testRegionMatches(String cs, boolean ignoreCase, int thisStart, String substring, int start, int length, boolean expected) {
        assertEquals(expected, CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    //BaseRock generated method id: ${testRegionMatchesWithStringBuilder}, hash: D875D6F8D30F1EA3C075FA53580AF17C
    @Test
    void testRegionMatchesWithStringBuilder() {
        StringBuilder sb1 = new StringBuilder("Hello World");
        StringBuilder sb2 = new StringBuilder("hello");
        assertTrue(CharSequenceUtils.regionMatches(sb1, true, 0, sb2, 0, 5));
        assertFalse(CharSequenceUtils.regionMatches(sb1, false, 0, sb2, 0, 5));
    }

    //BaseRock generated method id: ${testRegionMatchesWithStringBuffer}, hash: 66BD6C0DC5BBB2F298F70C24CB92CF59
    @Test
    void testRegionMatchesWithStringBuffer() {
        StringBuffer sb1 = new StringBuffer("Hello World");
        StringBuffer sb2 = new StringBuffer("world");
        assertTrue(CharSequenceUtils.regionMatches(sb1, true, 6, sb2, 0, 5));
        assertFalse(CharSequenceUtils.regionMatches(sb1, false, 6, sb2, 0, 5));
    }

    //BaseRock generated method id: ${testRegionMatchesWithMixedTypes}, hash: 998CFDC51D87B4A2A5C2B8F3D92D9A99
    @Test
    void testRegionMatchesWithMixedTypes() {
        String s = "Hello World";
        StringBuilder sb = new StringBuilder("hello");
        assertTrue(CharSequenceUtils.regionMatches(s, true, 0, sb, 0, 5));
        assertFalse(CharSequenceUtils.regionMatches(sb, false, 0, s, 0, 5));
    }

    //BaseRock generated method id: ${testRegionMatchesWithEmptyStrings}, hash: DABE7EE383B6D0F1520F92C6F503CAC9
    @Test
    void testRegionMatchesWithEmptyStrings() {
        assertTrue(CharSequenceUtils.regionMatches("", false, 0, "", 0, 0));
        assertTrue(CharSequenceUtils.regionMatches("Hello", false, 5, "", 0, 0));
    }

    //BaseRock generated method id: ${testRegionMatchesWithOutOfBoundsIndex}, hash: AFF0FF922BC77D2F08B0B35099D918DD
    @Disabled()
    @Test
    void testRegionMatchesWithOutOfBoundsIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> CharSequenceUtils.regionMatches("Hello", false, 10, "World", 0, 5));
        assertThrows(IndexOutOfBoundsException.class, () -> CharSequenceUtils.regionMatches("Hello", false, 0, "World", 10, 5));
    }

    //BaseRock generated method id: ${testDeprecatedConstructor}, hash: 376862E21BC95B7A12B72D0BCBD0D834
    @Test
    void testDeprecatedConstructor() {
        assertDoesNotThrow(() -> new CharSequenceUtils());
    }
}
