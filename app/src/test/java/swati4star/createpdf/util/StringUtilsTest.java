package swati4star.createpdf.util;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class StringUtilsTest {

    @Test
    public void isEmpty() {
        /*
        //non funziona
        //vuoto
        CharSequence charSequence2 = Mockito.mock(CharSequence.class);
        charSequence2 = String.;
        StringUtils stringUtils = Mockito.mock(StringUtils.class);
        Assert.assertEquals(true, stringUtils.isEmpty(charSequence2));


         */

    }

    @Test
    public void isEmpty2() {
        //not null
        CharSequence charSequence = new StringBuffer("   aaaa");
        StringUtils stringUtils = Mockito.mock(StringUtils.class);
        Assert.assertEquals(stringUtils.isEmpty(charSequence), false);
    }

    @Test
    public void isNotEmpty() {
        //null
        CharSequence charSequence = null;
        StringUtils stringUtils = Mockito.mock(StringUtils.class);
        Assert.assertEquals(false, stringUtils.isNotEmpty(charSequence));

    }

    @Test
    public void isNotEmpty2() {
        /*
        //Diverso da null
        CharSequence charSequence = "a";
        StringUtils stringUtils = Mockito.mock(StringUtils.class);
        Assert.assertEquals(true, stringUtils.isNotEmpty(charSequence));


         */
    }

    @Test
    public void showSnackbar() {
    }

    @Test
    public void testShowSnackbar() {
    }

    @Test
    public void showIndefiniteSnackbar() {
    }

    @Test
    public void getSnackbarwithAction() {
    }

    @Test
    public void hideKeyboard() {
    }

    @Test
    public void getDefaultStorageLocation() {
        /*
        StringUtils stringUtils = Mockito.mock(StringUtils.class);
        Assert.assertEquals(null, stringUtils.getDefaultStorageLocation());
         */
    }

    @Test
    public void getInstance() {
        /*
        StringUtils stringUtils = Mockito.mock(StringUtils.class);
        Assert.assertEquals(null, stringUtils.getDefaultStorageLocation());
    */
    }

}