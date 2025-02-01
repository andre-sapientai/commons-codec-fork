package org.apache.commons.codec.binary;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base32;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.startsWith;
import org.apache.commons.codec.CodecPolicy;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

class Base32BaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithDefaultParameters}, hash: 1CCC518AE32953F37248065F2B9F0769
    @Test
    void testConstructorWithDefaultParameters() {
        Base32 base32 = new Base32();
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithUseHex}, hash: 3F1CFFBF06BE72940EC6776947DD2560
    @Test
    void testConstructorWithUseHex() {
        Base32 base32 = new Base32(true);
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithUseHexAndPadding}, hash: 00CFBA0E3C23B4044A4D65FEB3FAE018
    @Test
    void testConstructorWithUseHexAndPadding() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithPadding}, hash: ABADACF4431C0C437A5DD580CBE03F19
    @Test
    void testConstructorWithPadding() {
        Base32 base32 = new Base32((byte) '=');
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithLineLength}, hash: 55FB6B5012DFE757408C711E75F81203
    @Test
    void testConstructorWithLineLength() {
        Base32 base32 = new Base32(76);
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithLineLengthAndLineSeparator}, hash: 0DD20F168C76524FE4C58D9066D873AF
    @Test
    void testConstructorWithLineLengthAndLineSeparator() {
        Base32 base32 = new Base32(76, new byte[] { '\r', '\n' });
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithLineLengthLineSeparatorAndUseHex}, hash: 68CD7C5352C475A1807C8F4DA4D16476
    @Test
    void testConstructorWithLineLengthLineSeparatorAndUseHex() {
        Base32 base32 = new Base32(76, new byte[] { '\r', '\n' }, true);
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testConstructorWithAllParameters}, hash: C1EE94AB1F3BA47A89CD1883CE978D26
    @Test
    void testConstructorWithAllParameters() {
        Base32 base32 = new Base32(76, new byte[] { '\r', '\n' }, true, (byte) '=', CodecPolicy.STRICT);
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testBuilderConstruction}, hash: 5A3A3B4E84CA28B94DFAD300771693B0
    @Test
    void testBuilderConstruction() {
        Base32 base32 = Base32.builder().get();
        assertNotNull(base32);
    }

    //BaseRock generated method id: ${testEncodeAndDecode}, hash: E8089E2848206B5EE11F3A17321FF47F
    @ParameterizedTest
    @CsvSource({ "Hello World,JBSWY3DPEBLW64TMMQQQ====", "Base32 Test,IJQXGZJTGIQHIZLTOQ======", "OpenAI,J5XWQZLOORQXG===", ",", "12345,GEZDGNBV" })
    void testEncodeAndDecode(String input, String expectedEncoded) {
        Base32 base32 = new Base32();
        if (input == null) {
            input = "";
        }
        byte[] inputBytes = input.getBytes();
        String encoded = new String(base32.encode(inputBytes));
        assertEquals(expectedEncoded, encoded);
        byte[] decodedBytes = base32.decode(encoded);
        String decoded = new String(decodedBytes);
        assertEquals(input, decoded);
    }

    //BaseRock generated method id: ${testIsInAlphabet}, hash: 3172396E80F9C6CFA3DB0CF84AAEEA34
    @Disabled()
    @Test
    void testIsInAlphabet() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) 'Z'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertTrue(base32.isInAlphabet((byte) '7'));
        assertFalse(base32.isInAlphabet((byte) '1'));
        assertFalse(base32.isInAlphabet((byte) '8'));
        assertFalse(base32.isInAlphabet((byte) 'a'));
    }

    //BaseRock generated method id: ${testGetLineSeparator}, hash: EE7B850ED191B3668F9600B1A70BC272
    @Test
    void testGetLineSeparator() {
        byte[] lineSeparator = { '\r', '\n' };
        Base32 base32 = new Base32(76, lineSeparator);
        assertArrayEquals(lineSeparator, base32.getLineSeparator());
    }

    //BaseRock generated method id: ${testEncodeWithLineLength}, hash: 1887E560122B6F43761A1088950E3377
    @Disabled()
    @Test
    void testEncodeWithLineLength() {
        Base32 base32 = new Base32(8, new byte[] { '\n' });
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expectedOutput = "IFBEGRCF\nIVEMUQT5\nDNNMQ===\n";
        assertEquals(expectedOutput, new String(base32.encode(input.getBytes())));
    }

    //BaseRock generated method id: ${testDecodeInvalidInput}, hash: F0F675286A1F04035EE219F5F17D6A82
    @Test
    void testDecodeInvalidInput() {
        Base32 base32 = new Base32(0, null, false, Base32.PAD_DEFAULT, CodecPolicy.STRICT);
        assertThrows(IllegalArgumentException.class, () -> base32.decode("Invalid!Input"));
    }

    //BaseRock generated method id: ${testEncodeNullInput}, hash: DB7A49B6C05C064F75FE3FB02184A84F
    @Test
    void testEncodeNullInput() {
        Base32 base32 = new Base32();
        assertNull(base32.encode((byte[]) null));
    }

    //BaseRock generated method id: ${testDecodeEmptyInput}, hash: 6B4EEE821256E4B8F55DC7A723F0AA19
    @Test
    void testDecodeEmptyInput() {
        Base32 base32 = new Base32();
        assertArrayEquals(new byte[0], base32.decode(""));
    }
}
