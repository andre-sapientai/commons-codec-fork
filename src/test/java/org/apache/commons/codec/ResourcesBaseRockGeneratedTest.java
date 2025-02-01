package org.apache.commons.codec;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ResourcesBaseRockGeneratedTest {

    //BaseRock generated method id: ${getInputStreamWhenInputStreamIsNullThrowsIllegalArgumentException}, hash: DC67FA3988C67FF927897B62727BC0C0
    @Test()
    void getInputStreamWhenInputStreamIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (inputStream == null) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to resolve required resource: A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Resources.getInputStream("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //BaseRock generated method id: ${getInputStreamWhenInputStreamIsNotNull}, hash: 6BA6A36B4120606FD20C2CD264491655
    @Disabled()
    @Test()
    void getInputStreamWhenInputStreamIsNotNull() {
        /* Branches:
         * (inputStream == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        InputStream result = Resources.getInputStream("name1");
        //Assert statement(s)
        //TODO: Please implement equals method in InputStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
