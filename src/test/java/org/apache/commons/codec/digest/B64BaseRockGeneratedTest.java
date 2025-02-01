package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.security.SecureRandom;
import org.mockito.MockedStatic;
import java.util.Random;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class B64BaseRockGeneratedTest {

    //BaseRock generated method id: ${b64from24bitWhenNGreaterThan0}, hash: 5139B9BEF7FEF4C966385B53E55B0524
    @Test()
    void b64from24bitWhenNGreaterThan0() {
        /* Branches:
         * (n-- > 0) : true
         */
        //Arrange Statement(s)
        StringBuilder stringBuilder = new StringBuilder();
        //Act Statement(s)
        B64.b64from24bit((byte) 0, (byte) 0, (byte) 0, 1, stringBuilder);
    }

    //BaseRock generated method id: ${getRandomSaltTest}, hash: DCADF365AED2732290E35C227A048C6F
    @Test()
    void getRandomSaltTest() {
        //Arrange Statement(s)
        try (MockedStatic<B64> b64 = mockStatic(B64.class, CALLS_REAL_METHODS)) {
            b64.when(() -> B64.getRandomSalt(eq(0), (SecureRandom) any())).thenReturn("return_of_getRandomSalt1");
            //Act Statement(s)
            String result = B64.getRandomSalt(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getRandomSalt1"));
                b64.verify(() -> B64.getRandomSalt(eq(0), (SecureRandom) any()), atLeast(1));
            });
        }
    }

    //BaseRock generated method id: ${getRandomSalt1WhenILessThanOrEqualsToNum}, hash: E62F93C1FB68843B24D551CB8E61F784
    @Disabled()
    @Test()
    void getRandomSalt1WhenILessThanOrEqualsToNum() {
        /* Branches:
         * (i <= num) : true
         */
        //Arrange Statement(s)
        Random randomMock = mock(Random.class);
        doReturn(0).when(randomMock).nextInt(64);
        //Act Statement(s)
        String result = B64.getRandomSalt(1, randomMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("."));
            verify(randomMock).nextInt(64);
        });
    }
}
