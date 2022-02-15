package swati4star.createpdf.adapter;


import android.view.View;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PreviewAdapterTest {

    @Test
    public void isViewFromObject() {
        PreviewAdapter x = Mockito.mock(PreviewAdapter.class);
        View view = Mockito.mock(View.class);
        Object o = Mockito.mock(Object.class);
        Mockito.doCallRealMethod().when(x).isViewFromObject(view, o);
        x.isViewFromObject(view, o);
        Mockito.verify(x).isViewFromObject(view, o);

        Assert.assertEquals(false, x.isViewFromObject(view, o));
    }
}