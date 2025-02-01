package org.apache.commons.codec.digest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MessageDigestAlgorithmsBaseRockGeneratedTest {

    //BaseRock generated method id: ${valuesTest}, hash: 25D4B9985C31F9CFF098AF5A65680944
    @Test()
    void valuesTest() {
        
        //Act Statement(s)
        String[] result = MessageDigestAlgorithms.values();
        String[] stringResultArray = new String[] { "MD2", "MD5", "SHA-1", "SHA-224", "SHA-256", "SHA-384", "SHA-512", "SHA-512/224", "SHA-512/256", "SHA3-224", "SHA3-256", "SHA3-384", "SHA3-512" };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }
}
