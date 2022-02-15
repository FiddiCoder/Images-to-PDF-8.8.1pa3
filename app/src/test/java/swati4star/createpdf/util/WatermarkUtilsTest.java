package swati4star.createpdf.util;


import com.itextpdf.text.Font;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class WatermarkUtilsTest {

    @Test
    public void getStyleValueFromName() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        String name = "BOLD";
        Assert.assertEquals(Font.BOLD, x.getStyleValueFromName(name));
    }

    @Test
    public void getStyleValueFromName2() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        String name = "ITALIC";
        Assert.assertEquals(Font.ITALIC, x.getStyleValueFromName(name));
    }

    @Test
    public void getStyleValueFromName3() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        String name = "UNDERLINE";
        Assert.assertEquals(Font.UNDERLINE, x.getStyleValueFromName(name));
    }

    @Test
    public void getStyleValueFromName4() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        String name = "STRIKETHRU";
        Assert.assertEquals(Font.STRIKETHRU, x.getStyleValueFromName(name));
    }

    @Test
    public void getStyleValueFromName5() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        String name = "BOLDITALIC";
        Assert.assertEquals(Font.BOLDITALIC, x.getStyleValueFromName(name));
    }

    @Test
    public void getStyleValueFromName6() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        String name = "DITALIC";
        Assert.assertEquals(Font.NORMAL, x.getStyleValueFromName(name));
    }


    @Test
    public void getStyleNameFromFont() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        int font = Font.BOLD;
        Assert.assertEquals("BOLD", x.getStyleNameFromFont(font));
    }

    @Test
    public void getStyleNameFromFont2() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        int font = Font.ITALIC;
        Assert.assertEquals("ITALIC", x.getStyleNameFromFont(font));
    }

    @Test
    public void getStyleNameFromFont3() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        int font = Font.UNDERLINE;
        Assert.assertEquals("UNDERLINE", x.getStyleNameFromFont(font));
    }

    @Test
    public void getStyleNameFromFont4() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        int font = Font.STRIKETHRU;
        Assert.assertEquals("STRIKETHRU", x.getStyleNameFromFont(font));
    }

    @Test
    public void getStyleNameFromFont5() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        int font = Font.BOLDITALIC;
        Assert.assertEquals("BOLDITALIC", x.getStyleNameFromFont(font));
    }

    @Test
    public void getStyleNameFromFont6() {
        WatermarkUtils x = Mockito.mock(WatermarkUtils.class);
        int font = 343453;
        Assert.assertEquals("NORMAL", x.getStyleNameFromFont(font));
    }

}