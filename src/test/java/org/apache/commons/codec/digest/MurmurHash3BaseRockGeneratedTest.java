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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MurmurHash3BaseRockGeneratedTest {

    //BaseRock generated method id: ${hash128Test}, hash: 1A123F43215FA1BEEE38E2C97861C036
    @Test()
    void hash128Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[] {};
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash128(byteArray, 0, 0, 104729)).thenReturn(longArray);
            //Act Statement(s)
            long[] result = MurmurHash3.hash128(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                murmurHash3.verify(() -> MurmurHash3.hash128(byteArray, 0, 0, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash1281WhenSwitchOffsetPlusLengthMinusIndexCase1}, hash: 3FD061942C475BF14E8A7A281066C624
    @Test()
    void hash1281WhenSwitchOffsetPlusLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true  #  inside hash128x64Internal method
         * (switch(offset + length - index) = 1) : true  #  inside hash128x64Internal method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        
        //Act Statement(s)
        long[] result = MurmurHash3.hash128(byteArray, 0, 15, 0);
        long[] longResultArray = new long[] { 0L, 0L };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //BaseRock generated method id: ${hash1282Test}, hash: D1B9F4A4A55981E5C82B65461E36CB97
    @Test()
    void hash1282Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[] {};
            byte[] byteArray = new byte[] { (byte) 0 };
            murmurHash3.when(() -> MurmurHash3.hash128(byteArray, 0, 1, 104729)).thenReturn(longArray);
            //Act Statement(s)
            long[] result = MurmurHash3.hash128("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                murmurHash3.verify(() -> MurmurHash3.hash128(byteArray, 0, 1, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash128x64Test}, hash: 9B68E067B4D529A57B06F34B5E6F7F4F
    @Test()
    void hash128x64Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[] {};
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash128x64(byteArray, 0, 0, 0)).thenReturn(longArray);
            //Act Statement(s)
            long[] result = MurmurHash3.hash128x64(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                murmurHash3.verify(() -> MurmurHash3.hash128x64(byteArray, 0, 0, 0), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash128x641WhenSwitchOffsetPlusLengthMinusIndexCase1}, hash: 011F38490702600AFBF648AA509A09FD
    @Test()
    void hash128x641WhenSwitchOffsetPlusLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true  #  inside hash128x64Internal method
         * (switch(offset + length - index) = 1) : true  #  inside hash128x64Internal method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        
        //Act Statement(s)
        long[] result = MurmurHash3.hash128x64(byteArray, 0, 15, 0);
        long[] longResultArray = new long[] { 0L, 0L };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //BaseRock generated method id: ${hash32Test}, hash: 175B211EB6F2B81E47FB9E90AD0D21E7
    @Test()
    void hash32Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash32(byteArray, 0, 0, 104729)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32(byteArray, 0, 0, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash321Test}, hash: BDD0CF2CAE7DB7E605CE15EA66D8B264
    @Test()
    void hash321Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash32(byteArray, 0, 104729)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32(byteArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32(byteArray, 0, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash322Test}, hash: 594BC832608ED53A0E2BB6B68693F9B9
    @Test()
    void hash322Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash32(byteArray, 0, 0, 0)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32(byteArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32(byteArray, 0, 0, 0), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash323WhenSwitchOffsetPlusLengthMinusIndexCase1}, hash: A38D0E163CBB814AD4338C500470A2B6
    @Test()
    void hash323WhenSwitchOffsetPlusLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true
         * (switch(offset + length - index) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 };
        
        //Act Statement(s)
        int result = MurmurHash3.hash32(byteArray, 0, 3, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${hash324Test}, hash: 09E83CEFAA1A327A3C97B6327B283310
    @Test()
    void hash324Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            murmurHash3.when(() -> MurmurHash3.hash32(0L, 104729)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32(0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32(0L, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash325Test}, hash: 241D1DDA24531A85C519739C0F8AD9C1
    @Test()
    void hash325Test() {
        
        //Act Statement(s)
        int result = MurmurHash3.hash32(1L, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1543604646)));
    }

    //BaseRock generated method id: ${hash326Test}, hash: 80D50ECB8C6DBA1F50142B8D8EF2EE56
    @Test()
    void hash326Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            murmurHash3.when(() -> MurmurHash3.hash32(0L, 0L, 104729)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32(0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32(0L, 0L, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash327Test}, hash: E98AB405DB7FFB74C3931C935BB336B7
    @Test()
    void hash327Test() {
        
        //Act Statement(s)
        int result = MurmurHash3.hash32(1L, 1L, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(122275636)));
    }

    //BaseRock generated method id: ${hash328Test}, hash: 6DF1019619A22E69C1C9F7FCC48C39C1
    @Test()
    void hash328Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { (byte) 0 };
            murmurHash3.when(() -> MurmurHash3.hash32(byteArray, 0, 1, 104729)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32(byteArray, 0, 1, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash32x86Test}, hash: 99C94EF3A7D2ABD67101FCFF0EE06C74
    @Test()
    void hash32x86Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash32x86(byteArray, 0, 0, 0)).thenReturn(0);
            //Act Statement(s)
            int result = MurmurHash3.hash32x86(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                murmurHash3.verify(() -> MurmurHash3.hash32x86(byteArray, 0, 0, 0), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash32x861WhenSwitchOffsetPlusLengthMinusIndexCase1}, hash: 388E43CD3C4807481283B05A163EA894
    @Test()
    void hash32x861WhenSwitchOffsetPlusLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true
         * (switch(offset + length - index) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 };
        
        //Act Statement(s)
        int result = MurmurHash3.hash32x86(byteArray, 0, 3, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //BaseRock generated method id: ${hash64Test}, hash: 5DCE66C507E044A87F27B56FFB25BEFF
    @Test()
    void hash64Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash64(byteArray, 0, 0, 104729)).thenReturn(0L);
            //Act Statement(s)
            long result = MurmurHash3.hash64(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                murmurHash3.verify(() -> MurmurHash3.hash64(byteArray, 0, 0, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash641Test}, hash: B51D494B3B8E8CD7F70903C9922CB12B
    @Test()
    void hash641Test() {
        //Arrange Statement(s)
        try (MockedStatic<MurmurHash3> murmurHash3 = mockStatic(MurmurHash3.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] {};
            murmurHash3.when(() -> MurmurHash3.hash64(byteArray, 0, 0, 104729)).thenReturn(0L);
            //Act Statement(s)
            long result = MurmurHash3.hash64(byteArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                murmurHash3.verify(() -> MurmurHash3.hash64(byteArray, 0, 0, 104729), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${hash642WhenSwitchOffsetPlusLengthMinusIndexCase1}, hash: AA0A8E922806A67C7C5D32C329E6C943
    @Test()
    void hash642WhenSwitchOffsetPlusLengthMinusIndexCase1() {
        /* Branches:
         * (i < nblocks) : true
         * (switch(offset + length - index) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        
        //Act Statement(s)
        long result = MurmurHash3.hash64(byteArray, 0, 7, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //BaseRock generated method id: ${hash643Test}, hash: 4EF7B9182037C81C2723DDE223B2E2E5
    @Test()
    void hash643Test() {
        
        //Act Statement(s)
        long result = MurmurHash3.hash64(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(501179666091440628L)));
    }

    //BaseRock generated method id: ${hash644Test}, hash: 25D8F8015C665DF1F236AAA8AC30168E
    @Test()
    void hash644Test() {
        
        //Act Statement(s)
        long result = MurmurHash3.hash64(1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(6840239832827182823L)));
    }

    //BaseRock generated method id: ${hash645Test}, hash: 24A75D11C17835344DBF4CF901840AE7
    @Test()
    void hash645Test() {
        //Act Statement(s)
        //long result = MurmurHash3.hash64((short) -8601547725015499320);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(7910691593646214214L)));
    }
}