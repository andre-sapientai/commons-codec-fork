package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.OpenOption;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import org.mockito.MockedStatic;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DigestUtilsBaseRockGeneratedTest {

    private final MessageDigest messageDigestMock = mock(MessageDigest.class);

    private final MessageDigest messageDigestMock2 = mock(MessageDigest.class);

    private final Path pathMock = mock(Path.class);

    //BaseRock generated method id: ${digestTest}, hash: 77AC231E352A21AFAD9248CF8A0F1002
    @Disabled()
    @Test()
    void digestTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray).when(messageDigestMock).digest(byteArray2);
        //Act Statement(s)
        byte[] result = DigestUtils.digest(messageDigestMock, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray));
            verify(messageDigestMock).digest(byteArray2);
        });
    }

    //BaseRock generated method id: ${digest1Test}, hash: 723543661D57395D83CE36AC9088A313
    @Disabled()
    @Test()
    void digest1Test() {
        //Arrange Statement(s)
        doNothing().when(messageDigestMock).update((ByteBuffer) any());
        byte[] byteArray = new byte[] {};
        doReturn(byteArray).when(messageDigestMock).digest();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        byte[] result = DigestUtils.digest(messageDigestMock, byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray));
            verify(messageDigestMock).update((ByteBuffer) any());
            verify(messageDigestMock).digest();
        });
    }

    //BaseRock generated method id: ${digest2Test}, hash: EEC560EA8D264511ED36D1A3A46690A8
    @Disabled()
    @Test()
    void digest2Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            File file = new File("pathname1");
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, file)).thenReturn(messageDigestMock);
            //Act Statement(s)
            byte[] result = DigestUtils.digest(messageDigestMock2, file);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, file), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${digest3Test}, hash: 2D2255DB4A2D0102F4215721BA8F190D
    @Disabled()
    @Test()
    void digest3Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, inputStream)).thenReturn(messageDigestMock);
            //Act Statement(s)
            byte[] result = DigestUtils.digest(messageDigestMock2, inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${digest4Test}, hash: 1884D440185F8138819B1801F22976AA
    @Disabled()
    @Test()
    void digest4Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            OpenOption[] openOptionArray = new OpenOption[] {};
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, pathMock, openOptionArray)).thenReturn(messageDigestMock);
            //Act Statement(s)
            byte[] result = DigestUtils.digest(messageDigestMock2, pathMock, openOptionArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, pathMock, openOptionArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${digest5Test}, hash: 92768618335E087CA4915667B6BF83BE
    @Disabled()
    @Test()
    void digest5Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RandomAccessFile randomAccessFileMock = mock(RandomAccessFile.class);
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, randomAccessFileMock)).thenReturn(messageDigestMock);
            //Act Statement(s)
            byte[] result = DigestUtils.digest(messageDigestMock2, randomAccessFileMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, randomAccessFileMock), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getDigestTest}, hash: 7D0F5A7584DDEE5D2162F2995E73BF44
    @Disabled()
    @Test()
    void getDigestTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        MessageDigest result = DigestUtils.getDigest("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${getDigestWhenCaughtNoSuchAlgorithmExceptionThrowsIllegalArgumentException}, hash: BA1E14B3B136547D3C2A9387CFC97AFE
    @Disabled()
    @Test()
    void getDigestWhenCaughtNoSuchAlgorithmExceptionThrowsIllegalArgumentException() {
        /* Branches:
         * (catch-exception (NoSuchAlgorithmException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            DigestUtils.getDigest("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(noSuchAlgorithmException.getClass())));
        });
    }

    //BaseRock generated method id: ${getDigest1Test}, hash: C12FCD37DD92AC41785ECF30D984EFCE
    @Disabled()
    @Test()
    void getDigest1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        MessageDigest result = DigestUtils.getDigest("A", messageDigestMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //BaseRock generated method id: ${getDigest1WhenCaughtException}, hash: CE26635A9BA759C70E0C8D9E6C76F5DC
    @Disabled()
    @Test()
    void getDigest1WhenCaughtException() {
        /* Branches:
         * (catch-exception (Exception)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        MessageDigest result = DigestUtils.getDigest("A", messageDigestMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(messageDigestMock)));
    }

    //BaseRock generated method id: ${getMd2DigestTest}, hash: C6F7CAF68389ECCCE6F52BA68A91765C
    @Disabled()
    @Test()
    void getMd2DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("MD2")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getMd2Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("MD2"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getMd5DigestTest}, hash: 7AE574A414F3C836E823A75616D2CC26
    @Disabled()
    @Test()
    void getMd5DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("MD5")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getMd5Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("MD5"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha1DigestTest}, hash: FAD86E6660DF286607DBA01A37B96865
    @Disabled()
    @Test()
    void getSha1DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA-1")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha1Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA-1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha256DigestTest}, hash: EFC4E26BBD73603D3D717A38CCB02C0F
    @Disabled()
    @Test()
    void getSha256DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA-256")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha256Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA-256"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha3_224DigestTest}, hash: 39EA02E1F2DE1680758DBE8E47BC1601
    @Disabled()
    @Test()
    void getSha3_224DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA3-224")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha3_224Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA3-224"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha3_256DigestTest}, hash: 6BC1E5338FD1DF41E1944458ECC10478
    @Disabled()
    @Test()
    void getSha3_256DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA3-256")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha3_256Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA3-256"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha3_384DigestTest}, hash: 9BBE7D0133E89DA30006642352133520
    @Disabled()
    @Test()
    void getSha3_384DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA3-384")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha3_384Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA3-384"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha3_512DigestTest}, hash: D0F606919C39C6C49347140C4A22EA33
    @Disabled()
    @Test()
    void getSha3_512DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA3-512")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha3_512Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA3-512"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha384DigestTest}, hash: F48A0777D01E620A0B320327E325C5E9
    @Disabled()
    @Test()
    void getSha384DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA-384")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha384Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA-384"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha512_224DigestTest}, hash: A61A49909A593529B91D368BE59C170B
    @Disabled()
    @Test()
    void getSha512_224DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA-512/224")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha512_224Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA-512/224"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha512_256DigestTest}, hash: AC8F9E077F4A4A219C13682B1794B5CB
    @Disabled()
    @Test()
    void getSha512_256DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA-512/256")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha512_256Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA-512/256"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getSha512DigestTest}, hash: D348825035193E63F25D538A00DD7921
    @Disabled()
    @Test()
    void getSha512DigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("SHA-512")).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getSha512Digest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getDigest("SHA-512"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getShaDigestTest}, hash: 740E6B493ED5A5B5308A6E1DD57D9B67
    @Disabled()
    @Test()
    void getShaDigestTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha1Digest()).thenReturn(messageDigestMock);
            //Act Statement(s)
            MessageDigest result = DigestUtils.getShaDigest();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.getSha1Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isAvailableWhenGetDigestMessageDigestAlgorithmNullIsNotNull}, hash: 0AA9D16FE344F3E89D6603BFA5066A2C
    @Disabled()
    @Test()
    void isAvailableWhenGetDigestMessageDigestAlgorithmNullIsNotNull() {
        /* Branches:
         * (getDigest(messageDigestAlgorithm, null) != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("messageDigestAlgorithm1", (MessageDigest) null)).thenReturn(messageDigestMock);
            //Act Statement(s)
            boolean result = DigestUtils.isAvailable("messageDigestAlgorithm1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                digestUtils.verify(() -> DigestUtils.getDigest("messageDigestAlgorithm1", (MessageDigest) null), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${isAvailableWhenGetDigestMessageDigestAlgorithmNullIsNull}, hash: A94A2DFD40AA30F9F7B96AA4B8864CE7
    @Disabled()
    @Test()
    void isAvailableWhenGetDigestMessageDigestAlgorithmNullIsNull() {
        /* Branches:
         * (getDigest(messageDigestAlgorithm, null) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getDigest("messageDigestAlgorithm1", (MessageDigest) null)).thenReturn(null);
            //Act Statement(s)
            boolean result = DigestUtils.isAvailable("messageDigestAlgorithm1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                digestUtils.verify(() -> DigestUtils.getDigest("messageDigestAlgorithm1", (MessageDigest) null), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md2Test}, hash: 64B6AF4246FBD5DFA0DE0F713EFB22C6
    @Disabled()
    @Test()
    void md2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getMd2Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.md2(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getMd2Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md21Test}, hash: D3824E7E6F01E7338ED00FB606897105
    @Disabled()
    @Test()
    void md21Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getMd2Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.md2(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getMd2Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md22Test}, hash: F292682EDF0B77BDBC0BB03A7DAE4082
    @Disabled()
    @Test()
    void md22Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.md2(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.md2("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.md2(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md2HexTest}, hash: 1BF70C8AA9A3A1A37F89AA627736EDC0
    @Disabled()
    @Test()
    void md2HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.md2(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.md2Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.md2(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md2Hex1Test}, hash: E6860F61DC41AD0FC2ECE4438A179AC9
    @Disabled()
    @Test()
    void md2Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.md2(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.md2Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.md2(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md2Hex2Test}, hash: B8FCF2AEDBC57406102D6F25725B3EAA
    @Disabled()
    @Test()
    void md2Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.md2("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.md2Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.md2("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Test}, hash: 74A30C20052AA48B892CEE5B0DB93943
    @Disabled()
    @Test()
    void md5Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getMd5Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.md5(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getMd5Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md51Test}, hash: B00A012EEC6597EA4AFB38F9027E5790
    @Disabled()
    @Test()
    void md51Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getMd5Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.md5(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getMd5Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md52Test}, hash: 1C08A9DE950F34F0CBE5495275742C37
    @Disabled()
    @Test()
    void md52Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.md5(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.md5("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.md5(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5HexTest}, hash: 204A42F86E7D01A92113B3D4808EDD43
    @Disabled()
    @Test()
    void md5HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.md5(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.md5Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.md5(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Hex1Test}, hash: 36E01EDE3357DC35D62E174F86FC1CC1
    @Disabled()
    @Test()
    void md5Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.md5(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.md5Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.md5(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${md5Hex2Test}, hash: 7423133A7845808E97D4672F6B33ED62
    @Disabled()
    @Test()
    void md5Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.md5("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.md5Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.md5("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${shaTest}, hash: B2C2FA6BDBF8C481F623F7CD7CFE9328
    @Disabled()
    @Test()
    void shaTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha1(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha1(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha1Test}, hash: 5470E759F60CFB7257FE431A278918A7
    @Disabled()
    @Test()
    void sha1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha1(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha1(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha2Test}, hash: 59FF0347662EF6B90D0EFBF88F016E91
    @Disabled()
    @Test()
    void sha2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha1("data1")).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha1("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha1Test2}, hash: B3F1967607ABEE3AD135311E5A6F7152
    @Disabled()
    @Test()
    void sha1Test2() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha1Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha1(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha1Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha11Test}, hash: C21A36313CA455552C8BE2E0BAA383E5
    @Disabled()
    @Test()
    void sha11Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha1Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha1(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha1Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha12Test}, hash: BA2F94C129ED13C18DAD9CE049EF849F
    @Disabled()
    @Test()
    void sha12Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha1(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha1("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha1(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha1HexTest}, hash: D9C3196C689C7C92ABF90003A0839770
    @Disabled()
    @Test()
    void sha1HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha1(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha1Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha1(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha1Hex1Test}, hash: 3F36FB60734CC0AC6111A8AA3E2CA369
    @Disabled()
    @Test()
    void sha1Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha1(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha1Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha1(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha1Hex2Test}, hash: B1A9A940FC998D2E5AA7CD42080FB563
    @Disabled()
    @Test()
    void sha1Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha1("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha1Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha1("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha256Test}, hash: 98450FE1A9A051F32F578D237D5BA73B
    @Disabled()
    @Test()
    void sha256Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha256Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha256(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha256Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha2561Test}, hash: 5CDC94F38EE1BDBBF58F9564F558E26A
    @Disabled()
    @Test()
    void sha2561Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha256Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha256(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha256Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha2562Test}, hash: 99FF7E54072B8A2EFA90A30BF6F1DB79
    @Disabled()
    @Test()
    void sha2562Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha256(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha256("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha256(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha256HexTest}, hash: BE56CFB0F81AD7F4457F06095F304678
    @Disabled()
    @Test()
    void sha256HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha256(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha256Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha256(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha256Hex1Test}, hash: 6263791E75DA34D971B78DF831C173F9
    @Disabled()
    @Test()
    void sha256Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha256(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha256Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha256(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha256Hex2Test}, hash: CDC4F312042D06DBFAC93F9A2290D037
    @Disabled()
    @Test()
    void sha256Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha256("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha256Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha256("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_224Test}, hash: D5BC2A79722A54A70BDA7271D1CBB5BE
    @Disabled()
    @Test()
    void sha3_224Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_224Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_224(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha3_224Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_2241Test}, hash: 2C618EC789950578881603AD69B76664
    @Disabled()
    @Test()
    void sha3_2241Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_224Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_224(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha3_224Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_2242Test}, hash: 0DAD2A20361B70CB00695D40FDFA4B85
    @Disabled()
    @Test()
    void sha3_2242Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha3_224(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_224("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha3_224(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_224HexTest}, hash: 6E8BA47EB78499EBB9BE5EADBF72205A
    @Disabled()
    @Test()
    void sha3_224HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_224(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_224Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_224(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_224Hex1Test}, hash: 946E2A6C0C99A1D0EE1CEAC2243E8E56
    @Disabled()
    @Test()
    void sha3_224Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha3_224(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_224Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_224(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_224Hex2Test}, hash: DBC1DC0441F8A1359864FD1B3A13069E
    @Disabled()
    @Test()
    void sha3_224Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_224("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_224Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_224("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_256Test}, hash: AA4274AB8608F09A7C4E9CD27AD3CF56
    @Disabled()
    @Test()
    void sha3_256Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_256Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_256(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha3_256Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_2561Test}, hash: 147715F18C2D60897537F5F517EA2A66
    @Disabled()
    @Test()
    void sha3_2561Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_256Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_256(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha3_256Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_2562Test}, hash: 505B45480987118269D93F714E214B70
    @Disabled()
    @Test()
    void sha3_2562Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha3_256(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_256("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha3_256(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_256HexTest}, hash: 5F1C0FD20661CBEFAEEE843254FE5208
    @Disabled()
    @Test()
    void sha3_256HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_256(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_256Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_256(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_256Hex1Test}, hash: B3C2A21E41E3070CD4CABF1850FDB103
    @Disabled()
    @Test()
    void sha3_256Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha3_256(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_256Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_256(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_256Hex2Test}, hash: AA4719737062277A40EF54233DED7699
    @Disabled()
    @Test()
    void sha3_256Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_256("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_256Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_256("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_384Test}, hash: 4B93EBFC3BA4EBA53F5865E31C14A9F2
    @Disabled()
    @Test()
    void sha3_384Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_384Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_384(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha3_384Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_3841Test}, hash: 4D44671DFA8DF449D1B90A461387C59F
    @Disabled()
    @Test()
    void sha3_3841Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_384Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_384(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha3_384Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_3842Test}, hash: D6A58726FABA65E683C1EE91F4B36606
    @Disabled()
    @Test()
    void sha3_3842Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha3_384(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_384("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha3_384(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_384HexTest}, hash: E66A11A21BA6518B5392F15B1097109F
    @Disabled()
    @Test()
    void sha3_384HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_384(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_384Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_384(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_384Hex1Test}, hash: 93B7ED2C24B83952945751CDDAA77BF2
    @Disabled()
    @Test()
    void sha3_384Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha3_384(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_384Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_384(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_384Hex2Test}, hash: E77333D3DFC09688A07C2D65D2F7CD8F
    @Disabled()
    @Test()
    void sha3_384Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_384("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_384Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_384("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_512Test}, hash: 953FA5AFD49523331D8C8AC73971FF85
    @Disabled()
    @Test()
    void sha3_512Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_512Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_512(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha3_512Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_5121Test}, hash: 11A50434621E9088CC614D0E883163C0
    @Disabled()
    @Test()
    void sha3_5121Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha3_512Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_512(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha3_512Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_5122Test}, hash: 15B6D081174340C7F2A6583B81CABAB4
    @Disabled()
    @Test()
    void sha3_5122Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha3_512(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha3_512("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha3_512(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_512HexTest}, hash: B9E8C8B5C607A2363B5E9260C56B5321
    @Disabled()
    @Test()
    void sha3_512HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_512(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_512Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_512(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_512Hex1Test}, hash: ED19DFD067A85656A31F6F33A31D4847
    @Disabled()
    @Test()
    void sha3_512Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha3_512(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_512Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_512(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3_512Hex2Test}, hash: AE5BB6BA0F02292FF27F948DFCA9BFC7
    @Disabled()
    @Test()
    void sha3_512Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha3_512("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha3_512Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha3_512("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha384Test}, hash: 7262D488E440A86EBE587011F0FFA2CE
    @Disabled()
    @Test()
    void sha384Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha384Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha384(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha384Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3841Test}, hash: D5B7097B03C80C70AF4DE98E3755851B
    @Disabled()
    @Test()
    void sha3841Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha384Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha384(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha384Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha3842Test}, hash: A23363F42A70A9290B433C97B6E156CB
    @Disabled()
    @Test()
    void sha3842Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha384(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha384("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha384(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha384HexTest}, hash: 4B492A5782688AEF335F988BF1B03BB0
    @Disabled()
    @Test()
    void sha384HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha384(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha384Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha384(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha384Hex1Test}, hash: 67DB1CFBA6BEFAAC884AF02E2B82ED22
    @Disabled()
    @Test()
    void sha384Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha384(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha384Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha384(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha384Hex2Test}, hash: 1E0FD14E43422BC38FEC6AC9950F3383
    @Disabled()
    @Test()
    void sha384Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha384("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha384Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha384("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512Test}, hash: F558E83420CB32A2EBC68EB42266F7C2
    @Disabled()
    @Test()
    void sha512Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha512Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha512(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha512Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha5121Test}, hash: 9287590FFC884FDF4C797D6BA76A0862
    @Disabled()
    @Test()
    void sha5121Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha512Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha512(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha512Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha5122Test}, hash: 8F735243E8B9F3BA792C11BDC4848F5D
    @Disabled()
    @Test()
    void sha5122Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha512(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha512("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha512(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_224Test}, hash: 328D9C0A8D91B19B884439DDDC4F3DE4
    @Disabled()
    @Test()
    void sha512_224Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha512_224Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha512_224(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha512_224Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_2241Test}, hash: 52FE3059A9A7CD44368997A0EA634711
    @Disabled()
    @Test()
    void sha512_2241Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha512_224Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha512_224(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha512_224Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_2242Test}, hash: E224DA9E267F410A66C3821BB8FEEEF8
    @Disabled()
    @Test()
    void sha512_2242Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha512_224(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha512_224("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha512_224(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_224HexTest}, hash: C4ACA299406AA8C4BACB2150A0374301
    @Disabled()
    @Test()
    void sha512_224HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha512_224(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512_224Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512_224(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_224Hex1Test}, hash: FAB8D0CD90A70D773D99E257EC545050
    @Disabled()
    @Test()
    void sha512_224Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha512_224(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512_224Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512_224(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_224Hex2Test}, hash: DD668A66286B3016780FB6AFF57127F5
    @Disabled()
    @Test()
    void sha512_224Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha512_224("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512_224Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512_224("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_256Test}, hash: 7987B5DEE6AA4C89A73D287592884648
    @Disabled()
    @Test()
    void sha512_256Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha512_256Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            //Act Statement(s)
            byte[] result = DigestUtils.sha512_256(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.getSha512_256Digest(), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_2561Test}, hash: 415EB53087125E508B91541F01526D37
    @Disabled()
    @Test()
    void sha512_2561Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.getSha512_256Digest()).thenReturn(messageDigestMock);
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.digest(messageDigestMock, inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha512_256(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.getSha512_256Digest(), atLeast(1));
                digestUtils.verify(() -> DigestUtils.digest(messageDigestMock, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_2562Test}, hash: 39FDBDBEF46EF04D2F67A94B5A66BD65
    @Disabled()
    @Test()
    void sha512_2562Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] { (byte) 65 };
            digestUtils.when(() -> DigestUtils.sha512_256(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = DigestUtils.sha512_256("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                digestUtils.verify(() -> DigestUtils.sha512_256(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_256HexTest}, hash: 6B399DC8944CD87B9E5BA8559E5B756C
    @Disabled()
    @Test()
    void sha512_256HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha512_256(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512_256Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512_256(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_256Hex1Test}, hash: 87F7A769F2299BE3A2ED8B239DB26AA0
    @Disabled()
    @Test()
    void sha512_256Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha512_256(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512_256Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512_256(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512_256Hex2Test}, hash: 2A92520CD1D16BCE281283E934232CAD
    @Disabled()
    @Test()
    void sha512_256Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha512_256("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512_256Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512_256("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512HexTest}, hash: 63C74739689C5D854476A39ED2C417C5
    @Disabled()
    @Test()
    void sha512HexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            byte[] byteArray2 = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha512(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512Hex(byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512(byteArray2), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512Hex1Test}, hash: B6DDC7E837F2449B58D76ADC942FBD35
    @Disabled()
    @Test()
    void sha512Hex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha512(inputStream)).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512Hex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${sha512Hex2Test}, hash: C3C02DAD032041A918F8475FAC91CD3C
    @Disabled()
    @Test()
    void sha512Hex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha512("data1")).thenReturn(byteArray);
            //Act Statement(s)
            String result = DigestUtils.sha512Hex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                digestUtils.verify(() -> DigestUtils.sha512("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${shaHexTest}, hash: DFB3BC82029FEE6B97D60BF8EE6C4328
    @Disabled()
    @Test()
    void shaHexTest() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            digestUtils.when(() -> DigestUtils.sha1Hex(byteArray)).thenReturn("return_of_sha1Hex1");
            //Act Statement(s)
            String result = DigestUtils.shaHex(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_sha1Hex1"));
                digestUtils.verify(() -> DigestUtils.sha1Hex(byteArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${shaHex1Test}, hash: FA4534817659390D6B33760809CF3AAF
    @Disabled()
    @Test()
    void shaHex1Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.sha1Hex(inputStream)).thenReturn("return_of_sha1Hex1");
            //Act Statement(s)
            String result = DigestUtils.shaHex(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_sha1Hex1"));
                digestUtils.verify(() -> DigestUtils.sha1Hex(inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${shaHex2Test}, hash: 56C13F7B14652D6A1D3BFC7F32C2C08D
    @Disabled()
    @Test()
    void shaHex2Test() {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            digestUtils.when(() -> DigestUtils.sha1Hex("data1")).thenReturn("return_of_sha1Hex1");
            //Act Statement(s)
            String result = DigestUtils.shaHex("data1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_sha1Hex1"));
                digestUtils.verify(() -> DigestUtils.sha1Hex("data1"), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${updateDigestTest}, hash: 855351E4A561A27C41A4D6E714FE9A14
    @Disabled()
    @Test()
    void updateDigestTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        doNothing().when(messageDigestMock).update(byteArray);
        //Act Statement(s)
        MessageDigest result = DigestUtils.updateDigest(messageDigestMock, byteArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(messageDigestMock));
            verify(messageDigestMock, atLeast(1)).update(byteArray);
        });
    }

    //BaseRock generated method id: ${updateDigest1Test}, hash: 8AA4BC8C6DBA1EB0F30F7E3A787DA6C6
    @Disabled()
    @Test()
    void updateDigest1Test() {
        //Arrange Statement(s)
        doNothing().when(messageDigestMock).update((ByteBuffer) any());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        MessageDigest result = DigestUtils.updateDigest(messageDigestMock, byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(messageDigestMock));
            verify(messageDigestMock).update((ByteBuffer) any());
        });
    }

    //BaseRock generated method id: ${updateDigest2Test}, hash: BA02B11DC085569CAB2CEE0A0F8F872C
    @Disabled()
    @Test()
    void updateDigest2Test() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            BufferedInputStream bufferedInputStream = mock(BufferedInputStream.class);
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream)).thenReturn(messageDigestMock);
            File file = new File("pathname1");
            //Act Statement(s)
            MessageDigest result = DigestUtils.updateDigest(messageDigestMock2, file);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${updateDigest2WhenDefaultBranchThrowsThrowable}, hash: 4A8BEC523D59B7DB30375E3DB71BC391
    @Disabled()
    @Test()
    void updateDigest2WhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 1279)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            BufferedInputStream bufferedInputStream = mock(BufferedInputStream.class);
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream)).thenReturn(messageDigestMock);
            File file = new File("pathname1");
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                DigestUtils.updateDigest(messageDigestMock2, file);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${updateDigest4WhenReadGreaterThanMinus1}, hash: 795DD643E70A414601797AF5A7BCB24F
    @Disabled()
    @Test()
    void updateDigest4WhenReadGreaterThanMinus1() throws IOException {
        /* Branches:
         * (read > -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        MessageDigest result = DigestUtils.updateDigest(messageDigestMock, inputStream);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(messageDigestMock)));
    }

    //BaseRock generated method id: ${updateDigest5Test}, hash: 2ED06FEDE0FB7057F58EE0D80DC40E71
    @Disabled()
    @Test()
    void updateDigest5Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            BufferedInputStream bufferedInputStream = mock(BufferedInputStream.class);
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream)).thenReturn(messageDigestMock);
            OpenOption[] openOptionArray = new OpenOption[] {};
            //Act Statement(s)
            MessageDigest result = DigestUtils.updateDigest(messageDigestMock2, pathMock, openOptionArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(messageDigestMock));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${updateDigest5WhenDefaultBranchThrowsThrowable}, hash: 36F27FF1D137C7218CCA030EDD65B207
    @Disabled()
    @Test()
    void updateDigest5WhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 1337)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class, CALLS_REAL_METHODS)) {
            BufferedInputStream bufferedInputStream = mock(BufferedInputStream.class);
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream)).thenReturn(messageDigestMock);
            OpenOption[] openOptionArray = new OpenOption[] {};
            files.when(() -> Files.newInputStream(pathMock, openOptionArray)).thenReturn(null);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                DigestUtils.updateDigest(messageDigestMock2, pathMock, openOptionArray);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, bufferedInputStream), atLeast(1));
                files.verify(() -> Files.newInputStream(pathMock, openOptionArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${updateDigest6WhenDataReadBufferGreaterThan0}, hash: 16C70C81C712E45F4A16158F2F13310D
    @Disabled()
    @Test()
    void updateDigest6WhenDataReadBufferGreaterThan0() throws IOException {
        /* Branches:
         * (data.read(buffer) > 0) : true  #  inside updateDigest method
         */
        //Arrange Statement(s)
        MessageDigest digestMock = mock(MessageDigest.class);
        doNothing().when(digestMock).update((ByteBuffer) any());
        RandomAccessFile dataMock = mock(RandomAccessFile.class);
        FileChannel fileChannelMock = mock(FileChannel.class);
        doReturn(fileChannelMock).when(dataMock).getChannel();
        doReturn(1, 0).when(fileChannelMock).read((ByteBuffer) any());
        //Act Statement(s)
        MessageDigest result = DigestUtils.updateDigest(digestMock, dataMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(digestMock));
            verify(digestMock).update((ByteBuffer) any());
            verify(dataMock).getChannel();
            verify(fileChannelMock, atLeast(2)).read((ByteBuffer) any());
        });
    }

    //BaseRock generated method id: ${updateDigest7Test}, hash: C0EF4490D4CBB2A29F9AD81996D2B642
    @Disabled()
    @Test()
    void updateDigest7Test() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 65 };
        doNothing().when(messageDigestMock).update(byteArray);
        //Act Statement(s)
        MessageDigest result = DigestUtils.updateDigest(messageDigestMock, "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(messageDigestMock));
            verify(messageDigestMock, atLeast(1)).update(byteArray);
        });
    }

    //BaseRock generated method id: ${digest6Test}, hash: 8866163E476931AA3C7C94AD02A1222C
    @Disabled()
    @Test()
    void digest6Test() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        doNothing().when(messageDigestMock).update(byteArray);
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray2).when(messageDigestMock).digest();
        DigestUtils target = new DigestUtils(messageDigestMock);
        //Act Statement(s)
        byte[] result = target.digest(byteArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray2));
            verify(messageDigestMock).update(byteArray);
            verify(messageDigestMock).digest();
        });
    }

    //BaseRock generated method id: ${digest7Test}, hash: 910A391D0C7AC27E9C6B7A47CEDEC2B5
    @Disabled()
    @Test()
    void digest7Test() {
        //Arrange Statement(s)
        doNothing().when(messageDigestMock).update((ByteBuffer) any());
        byte[] byteArray = new byte[] {};
        doReturn(byteArray).when(messageDigestMock).digest();
        DigestUtils target = new DigestUtils(messageDigestMock);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        byte[] result = target.digest(byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray));
            verify(messageDigestMock).update((ByteBuffer) any());
            verify(messageDigestMock).digest();
        });
    }

    //BaseRock generated method id: ${digest8Test}, hash: F6AE88B26217C5B0EB3DC51F9CDE4F4A
    @Disabled()
    @Test()
    void digest8Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class)) {
            File file = new File("pathname1");
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, file)).thenReturn(messageDigestMock);
            DigestUtils target = new DigestUtils(messageDigestMock2);
            //Act Statement(s)
            byte[] result = target.digest(file);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, file), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${digest9Test}, hash: 6DF1EC31167F1732B253AE281323043F
    @Disabled()
    @Test()
    void digest9Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, inputStream)).thenReturn(messageDigestMock);
            DigestUtils target = new DigestUtils(messageDigestMock2);
            //Act Statement(s)
            byte[] result = target.digest(inputStream);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, inputStream), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${digest10Test}, hash: A1045B92925B184F1668463778EB9976
    @Disabled()
    @Test()
    void digest10Test() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DigestUtils> digestUtils = mockStatic(DigestUtils.class)) {
            OpenOption[] openOptionArray = new OpenOption[] {};
            digestUtils.when(() -> DigestUtils.updateDigest(messageDigestMock2, pathMock, openOptionArray)).thenReturn(messageDigestMock);
            DigestUtils target = new DigestUtils(messageDigestMock2);
            //Act Statement(s)
            byte[] result = target.digest(pathMock, openOptionArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                digestUtils.verify(() -> DigestUtils.updateDigest(messageDigestMock2, pathMock, openOptionArray), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${digest11Test}, hash: 605217D54D207448F5ED786F1F9CC1B4
    @Disabled()
    @Test()
    void digest11Test() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 65 };
        doNothing().when(messageDigestMock).update(byteArray);
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray2).when(messageDigestMock).digest();
        DigestUtils target = new DigestUtils(messageDigestMock);
        //Act Statement(s)
        byte[] result = target.digest("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(byteArray2));
            verify(messageDigestMock).update(byteArray);
            verify(messageDigestMock).digest();
        });
    }

    //BaseRock generated method id: ${digestAsHexTest}, hash: 0D9350288AE46120BECCDDCB3FB4DA17
    @Disabled()
    @Test()
    void digestAsHexTest() {
        //Arrange Statement(s)
        DigestUtils target = spy(new DigestUtils(messageDigestMock));
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        doReturn(byteArray).when(target).digest(byteArray2);
        //Act Statement(s)
        String result = target.digestAsHex(byteArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).digest(byteArray2);
        });
    }

    //BaseRock generated method id: ${digestAsHex1Test}, hash: C84C942C95F722FE2BE5C500C5976A6C
    @Disabled()
    @Test()
    void digestAsHex1Test() {
        //Arrange Statement(s)
        DigestUtils target = spy(new DigestUtils(messageDigestMock));
        byte[] byteArray = new byte[] {};
        doReturn(byteArray).when(target).digest((ByteBuffer) any());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        //Act Statement(s)
        String result = target.digestAsHex(byteBuffer);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).digest((ByteBuffer) any());
        });
    }

    //BaseRock generated method id: ${digestAsHex2Test}, hash: 5A8AD594F94A81F5F6F4D94D1E992493
    @Disabled()
    @Test()
    void digestAsHex2Test() throws IOException {
        //Arrange Statement(s)
        DigestUtils target = spy(new DigestUtils(messageDigestMock));
        byte[] byteArray = new byte[] {};
        File file = new File("pathname1");
        doReturn(byteArray).when(target).digest(file);
        //Act Statement(s)
        String result = target.digestAsHex(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).digest(file);
        });
    }

    //BaseRock generated method id: ${digestAsHex3Test}, hash: 82FEF3FDB61142B80C661569F2027F6A
    @Disabled()
    @Test()
    void digestAsHex3Test() throws IOException {
        //Arrange Statement(s)
        DigestUtils target = spy(new DigestUtils(messageDigestMock));
        byte[] byteArray = new byte[] {};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        doReturn(byteArray).when(target).digest(inputStream);
        //Act Statement(s)
        String result = target.digestAsHex(inputStream);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).digest(inputStream);
        });
    }

    //BaseRock generated method id: ${digestAsHex4Test}, hash: 182687BC70C351DB000F146B0615C981
    @Disabled()
    @Test()
    void digestAsHex4Test() throws IOException {
        //Arrange Statement(s)
        DigestUtils target = spy(new DigestUtils(messageDigestMock));
        byte[] byteArray = new byte[] {};
        OpenOption[] openOptionArray = new OpenOption[] {};
        doReturn(byteArray).when(target).digest(pathMock, openOptionArray);
        //Act Statement(s)
        String result = target.digestAsHex(pathMock, openOptionArray);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).digest(pathMock, openOptionArray);
        });
    }

    //BaseRock generated method id: ${digestAsHex5Test}, hash: 07668DAC413ECA5D4D517D7F82FAFEEF
    @Disabled()
    @Test()
    void digestAsHex5Test() {
        //Arrange Statement(s)
        DigestUtils target = spy(new DigestUtils(messageDigestMock));
        byte[] byteArray = new byte[] {};
        doReturn(byteArray).when(target).digest("data1");
        //Act Statement(s)
        String result = target.digestAsHex("data1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).digest("data1");
        });
    }

    //BaseRock generated method id: ${getMessageDigest1Test}, hash: 3131320EF6D8655A09E8A1B8AD4943C1
    @Disabled()
    @Test()
    void getMessageDigest1Test() {
        //Arrange Statement(s)
        DigestUtils target = new DigestUtils(messageDigestMock);
        //Act Statement(s)
        MessageDigest result = target.getMessageDigest();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(messageDigestMock)));
    }
}
