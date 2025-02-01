package org.apache.commons.codec;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.codec.language.DaitchMokotoffSoundex;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringEncoderComparatorBaseRockGeneratedTest {

    private final DaitchMokotoffSoundex stringEncoderMock = mock(DaitchMokotoffSoundex.class, "stringEncoder");

    //BaseRock generated method id: ${compareTest}, hash: 16DEB8FB11FF6DE462E35133BBB91F12
    @Disabled()
    @Test()
    void compareTest() throws EncoderException {
        //Arrange Statement(s)
        Comparable comparableMock = mock(Comparable.class);
        Object object = new Object();
        doReturn(comparableMock).when(stringEncoderMock).encode(object);
        Comparable comparableMock2 = mock(Comparable.class);
        doReturn(0).when(comparableMock).compareTo(comparableMock2);
        Object object2 = new Object();
        doReturn(comparableMock2).when(stringEncoderMock).encode(object2);
        StringEncoderComparator target = new StringEncoderComparator(stringEncoderMock);
        //Act Statement(s)
        int result = target.compare(object, object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(stringEncoderMock).encode(object);
            verify(comparableMock).compareTo(comparableMock2);
            verify(stringEncoderMock).encode(object2);
        });
    }

    //BaseRock generated method id: ${compareWhenCaughtEncoderException}, hash: 047268D6F9D9063BE8A813BB5E818902
    @Disabled()
    @Test()
    void compareWhenCaughtEncoderException() {
        /* Branches:
         * (catch-exception (EncoderException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DaitchMokotoffSoundex daitchMokotoffSoundex = new DaitchMokotoffSoundex();
        StringEncoderComparator target = new StringEncoderComparator(daitchMokotoffSoundex);
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        int result = target.compare(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
