package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MurmurHash2BaseRockGeneratedTest {

    //BaseRock generated method id: ${hash32Test}, hash: 57CDF7D14B1374BA0C25039A5E4E1C50
    @Test()
    void hash32Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash2> murmurHash2 = mockStatic(MurmurHash2.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash2.when(() -> MurmurHash2.hash32(byteArray, 0, -1756908916)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash2.hash32(byteArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash2.verify(() -> MurmurHash2.hash32(byteArray, 0, -1756908916), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash321WhenSwitchLengthMinusIndexCase1}, hash: 98900B9EC7556BD8CBD59D87897909C2
    @Disabled()
    @Test()
    void hash321WhenSwitchLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true
         * (switch(length - index) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 };
        //Act Statement(s)
        int result = MurmurHash2.hash32(byteArray, 3, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${hash322Test}, hash: D3FDA8FBFC9E29C2FEAE8C4242A86833
    @Disabled()
    @Test()
    void hash322Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash2> murmurHash2 = mockStatic(MurmurHash2.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 0 };
            murmurHash2.when(() -> MurmurHash2.hash32(byteArray, 1)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash2.hash32("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash2.verify(() -> MurmurHash2.hash32(byteArray, 1), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash323Test}, hash: 7482610238EAD71B82BC30AD3315EB47
    @Test()
    void hash323Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash2> murmurHash2 = mockStatic(MurmurHash2.class, CALLS_REAL_METHODS)) {
            murmurHash2.when(() -> MurmurHash2.hash32("")).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash2.hash32("A", 0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash2.verify(() -> MurmurHash2.hash32(""), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash64Test}, hash: 6E19DAB9DF0E2172E99A673B6BEB3665
    @Test()
    void hash64Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash2> murmurHash2 = mockStatic(MurmurHash2.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash2.when(() -> MurmurHash2.hash64(byteArray, 0, -512093083)).thenReturn(0L);
            //Act Statement(s)
            long result = MurmurHash2.hash64(byteArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                murmurHash2.verify(() -> MurmurHash2.hash64(byteArray, 0, -512093083), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash641WhenSwitchLengthMinusIndexCase1}, hash: 2A3331A61FB897B2731F25E05FEB5793
    @Disabled()
    @Test()
    void hash641WhenSwitchLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true
         * (switch(length - index) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        //Act Statement(s)
        long result = MurmurHash2.hash64(byteArray, 7, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //BaseRock generated method id: ${hash642Test}, hash: 1E883E8D6A2BED3A3DCDC2388259DC30
    @Disabled()
    @Test()
    void hash642Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash2> murmurHash2 = mockStatic(MurmurHash2.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 0 };
            murmurHash2.when(() -> MurmurHash2.hash64(byteArray, 1)).thenReturn(0L);
            //Act Statement(s)
            long result = MurmurHash2.hash64("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                murmurHash2.verify(() -> MurmurHash2.hash64(byteArray, 1), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash643Test}, hash: DE3BE553EF6A9ADA7CD7ECD6EE2D338C
    @Test()
    void hash643Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash2> murmurHash2 = mockStatic(MurmurHash2.class, CALLS_REAL_METHODS)) {
            murmurHash2.when(() -> MurmurHash2.hash64("")).thenReturn(0L);
            //Act Statement(s)
            long result = MurmurHash2.hash64("A", 0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                murmurHash2.verify(() -> MurmurHash2.hash64(""), atLeast(1));
            });
        }
    }
}
