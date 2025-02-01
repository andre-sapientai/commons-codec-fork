package org.apache.commons.codec.digest;

import org.apache.commons.codec.digest.Blake3;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class Blake3BaseRockGeneratedTest {

    private Blake3 blake3;

    @BeforeEach
    void setUp() {
        blake3 = Blake3.initHash();
    }

    //BaseRock generated method id: ${testInitHash}, hash: EE99FD5EC8A2CA6F5E465993343DE305
    @Test
    void testInitHash() {
        assertNotNull(blake3);
    }

    //BaseRock generated method id: ${testHash}, hash: F5D892D012F86589AF8BAD7C9D6BA9FB
    @Test
    void testHash() {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        byte[] hash = Blake3.hash(data);
        assertEquals(32, hash.length);
    }

    //BaseRock generated method id: ${testInitKeyedHash}, hash: 10958E20D8018034195774B5027A8F10
    @Test
    void testInitKeyedHash() {
        byte[] key = new byte[32];
        Arrays.fill(key, (byte) 0x42);
        Blake3 keyedBlake3 = Blake3.initKeyedHash(key);
        assertNotNull(keyedBlake3);
    }

    //BaseRock generated method id: ${testInitKeyedHashInvalidKeyLength}, hash: 835177DD1DF392DD14F83A57B42B9F44
    @Test
    void testInitKeyedHashInvalidKeyLength() {
        byte[] key = new byte[31];
        assertThrows(IllegalArgumentException.class, () -> Blake3.initKeyedHash(key));
    }

    //BaseRock generated method id: ${testKeyedHash}, hash: 8B53BEE19074B075A7E30E1D602AA70E
    @Test
    void testKeyedHash() {
        byte[] key = new byte[32];
        Arrays.fill(key, (byte) 0x42);
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        byte[] hash = Blake3.keyedHash(key, data);
        assertEquals(32, hash.length);
    }

    //BaseRock generated method id: ${testInitKeyDerivationFunction}, hash: A0E6E044B89931CB32EB97EF74833A92
    @Test
    void testInitKeyDerivationFunction() {
        byte[] kdfContext = "KDF Context".getBytes(StandardCharsets.UTF_8);
        Blake3 kdfBlake3 = Blake3.initKeyDerivationFunction(kdfContext);
        assertNotNull(kdfBlake3);
    }

    //BaseRock generated method id: ${testUpdate}, hash: 2FCE1A0FDB8B99D0D20A7626AC61C361
    @Test
    void testUpdate() {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        blake3.update(data);
        byte[] hash = blake3.doFinalize(32);
        assertEquals(32, hash.length);
    }

    //BaseRock generated method id: ${testUpdateWithOffsetAndLength}, hash: BB154EDCE4EF9E231F6212CE717A9D09
    @Test
    void testUpdateWithOffsetAndLength() {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        blake3.update(data, 0, 5);
        byte[] hash = blake3.doFinalize(32);
        assertEquals(32, hash.length);
    }

    //BaseRock generated method id: ${testDoFinalizeWithDifferentLengths}, hash: A359DDC227ABD316C615F61FC7A262D0
    @ParameterizedTest
    @CsvSource({ "16", "32", "64" })
    void testDoFinalizeWithDifferentLengths(int length) {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        blake3.update(data);
        byte[] hash = blake3.doFinalize(length);
        assertEquals(length, hash.length);
    }

    //BaseRock generated method id: ${testDoFinalizeWithByteArray}, hash: F88237793F9572E7B06B1DCD9FDF5CC2
    @Test
    void testDoFinalizeWithByteArray() {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        blake3.update(data);
        byte[] out = new byte[32];
        blake3.doFinalize(out);
        assertEquals(32, out.length);
    }

    //BaseRock generated method id: ${testDoFinalizeWithByteArrayAndOffsetAndLength}, hash: E745455E5533F480DE3832F716139160
    @Test
    void testDoFinalizeWithByteArrayAndOffsetAndLength() {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        blake3.update(data);
        byte[] out = new byte[64];
        blake3.doFinalize(out, 16, 32);
        assertEquals(64, out.length);
    }

    //BaseRock generated method id: ${testReset}, hash: 653A6100B8A0C24632C424FDBC49914D
    @Test
    void testReset() {
        byte[] data1 = "Hello".getBytes(StandardCharsets.UTF_8);
        byte[] data2 = "World".getBytes(StandardCharsets.UTF_8);
        blake3.update(data1);
        byte[] hash1 = blake3.doFinalize(32);
        blake3.reset();
        blake3.update(data2);
        byte[] hash2 = blake3.doFinalize(32);
        assertFalse(Arrays.equals(hash1, hash2));
    }

    //BaseRock generated method id: ${testInvalidBufferArgs}, hash: 6D9E8DBAE3D5C0F3F24B1FB81702AC37
    @Test
    void testInvalidBufferArgs() {
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assertThrows(IndexOutOfBoundsException.class, () -> blake3.update(data, -1, data.length));
        assertThrows(IndexOutOfBoundsException.class, () -> blake3.update(data, 0, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> blake3.update(data, 0, data.length + 1));
    }

    //BaseRock generated method id: ${testDoFinalizeWithNegativeLength}, hash: 20DED194C95C4043E6DEDA21AB1B1450
    @Test
    void testDoFinalizeWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> blake3.doFinalize(-1));
    }
}
