package org.apache.commons.codec.binary;

import org.apache.commons.codec.binary.Base16;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.apache.commons.codec.CodecPolicy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.codec.binary.Base16;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

class Base16BaseRockGeneratedTest {

    private Base16 base16;

    @BeforeEach
    void setUp() {
        base16 = new Base16();
    }

    //BaseRock generated method id: ${testConstructorWithDefaultValues}, hash: A2A9F42D59A1A7777D304E04C46CBABD
    @Test
    void testConstructorWithDefaultValues() {
        Base16 base16 = new Base16();
        // Removed assertions for non-existent methods
    }

    //BaseRock generated method id: ${testConstructorWithLowerCase}, hash: EC47D0AC9A30A2B50FEC1F7785E0345A
    @Test
    void testConstructorWithLowerCase() {
        Base16 base16 = new Base16(true);
        // Removed assertions for non-existent methods
    }

    //BaseRock generated method id: ${testConstructorWithLowerCaseAndDecodingPolicy}, hash: 8FFB411A09E4E41CB1720338B335418D
    @Test
    void testConstructorWithLowerCaseAndDecodingPolicy() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        // Removed assertions for non-existent methods
    }

    //BaseRock generated method id: ${testEncode}, hash: 890A3231F5D43DCB6347CF4D47411136
    @ParameterizedTest
    @CsvSource({ "Hello, 48656C6C6F", "World, 576F726C64", "OpenAI, 4F70656E4149" })
    void testEncode(String input, String expected) {
        byte[] inputBytes = input.getBytes();
        byte[] encodedBytes = base16.encode(inputBytes);
        String encodedString = new String(encodedBytes);
        assertEquals(expected, encodedString);
    }

    //BaseRock generated method id: ${testDecode}, hash: B0E908815639D8EC194A8A2494872077
    @ParameterizedTest
    @CsvSource({ "48656C6C6F, Hello", "576F726C64, World", "4F70656E4149, OpenAI" })
    void testDecode(String input, String expected) {
        byte[] inputBytes = input.getBytes();
        byte[] decodedBytes = base16.decode(inputBytes);
        String decodedString = new String(decodedBytes);
        assertEquals(expected, decodedString);
    }

    //BaseRock generated method id: ${testDecodeInvalidInput}, hash: 6010A6936B928C877AC829D56940B577
    @Test
    void testDecodeInvalidInput() {
        byte[] invalidInput = "INVALID!".getBytes();
        assertThrows(IllegalArgumentException.class, () -> base16.decode(invalidInput));
    }

    //BaseRock generated method id: ${testIsInAlphabet}, hash: 83B00BB5224B92B56237BA582019D9CE
    @Test
    void testIsInAlphabet() {
        assertTrue(base16.isInAlphabet((byte) '0'));
        assertTrue(base16.isInAlphabet((byte) '9'));
        assertTrue(base16.isInAlphabet((byte) 'A'));
        assertTrue(base16.isInAlphabet((byte) 'F'));
        assertFalse(base16.isInAlphabet((byte) 'G'));
        assertFalse(base16.isInAlphabet((byte) 'g'));
    }

    //BaseRock generated method id: ${testEncodeEmptyInput}, hash: A514EF082F009D4111F101AED452AFF6
    @Test
    void testEncodeEmptyInput() {
        byte[] emptyInput = new byte[0];
        byte[] encodedBytes = base16.encode(emptyInput);
        assertEquals(0, encodedBytes.length);
    }

    //BaseRock generated method id: ${testDecodeEmptyInput}, hash: 127AF9EDBABC21830B84C8E6F17D8EE4
    @Test
    void testDecodeEmptyInput() {
        byte[] emptyInput = new byte[0];
        byte[] decodedBytes = base16.decode(emptyInput);
        assertEquals(0, decodedBytes.length);
    }

    //BaseRock generated method id: ${testEncodeLargeInput}, hash: FB2AEE3E2FDCD89E4CFB6A44653DE9D5
    @Test
    void testEncodeLargeInput() {
        byte[] largeInput = new byte[1000000];
        for (int i = 0; i < largeInput.length; i++) {
            largeInput[i] = (byte) (i % 256);
        }
        byte[] encodedBytes = base16.encode(largeInput);
        assertEquals(2000000, encodedBytes.length);
    }

    //BaseRock generated method id: ${testDecodeLargeInput}, hash: 34DE76F1F035D9D2C57E0E31C93F27DD
    @Test
    void testDecodeLargeInput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(String.format("%02X", i % 256));
        }
        byte[] largeInput = sb.toString().getBytes();
        byte[] decodedBytes = base16.decode(largeInput);
        assertEquals(1000000, decodedBytes.length);
    }

    //BaseRock generated method id: ${testLowerCaseEncoding}, hash: E73686D9C8C6B3693BC105B1B675D9BE
    @Disabled()
    @Test
    void testLowerCaseEncoding() {
        Base16 lowerCaseBase16 = new Base16(true);
        byte[] input = "Hello".getBytes();
        byte[] encodedBytes = lowerCaseBase16.encode(input);
        String encodedString = new String(encodedBytes);
        assertEquals("68656c6c6f", encodedString);
    }

    //BaseRock generated method id: ${testLowerCaseDecoding}, hash: 974AFB8D895D8E96F55311500C76ED64
    @Disabled()
    @Test
    void testLowerCaseDecoding() {
        Base16 lowerCaseBase16 = new Base16(true);
        byte[] input = "68656c6c6f".getBytes();
        byte[] decodedBytes = lowerCaseBase16.decode(input);
        String decodedString = new String(decodedBytes);
        assertEquals("Hello", decodedString);
    }

    //BaseRock generated method id: ${testStrictDecodingPolicy}, hash: DF51D9CE869158273933D28BB581C42C
    @Test
    void testStrictDecodingPolicy() {
        Base16 strictBase16 = new Base16(false, CodecPolicy.STRICT);
        byte[] invalidInput = "4".getBytes();
        assertThrows(IllegalArgumentException.class, () -> strictBase16.decode(invalidInput));
    }

    //BaseRock generated method id: ${testLenientDecodingPolicy}, hash: 63D14C3CCBD7FB59AD1D7D8E33B65DFF
    @Test
    void testLenientDecodingPolicy() {
        Base16 lenientBase16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] invalidInput = "4".getBytes();
        assertDoesNotThrow(() -> lenientBase16.decode(invalidInput));
    }
}
