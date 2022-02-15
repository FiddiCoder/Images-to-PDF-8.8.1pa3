package swati4star.createpdf.util;

import android.content.Intent;

import org.junit.Assert;
import org.junit.Test;

public class ResultUtilsTest {

    @Test
    public void checkResultValidity() {
        // given
        int resultCode = 0;
        Intent data = new Intent();
        //then
        Assert.assertEquals(false, ResultUtils.checkResultValidity(resultCode, data));
    }

    @Test
    public void checkResultValidity2() {
        // given
        int resultCode = -1;
        Intent data = new Intent();
        //then
        Assert.assertEquals(false, ResultUtils.checkResultValidity(resultCode, data));
    }
}