package swati4star.createpdf.fragment;


import android.app.Activity;

import org.junit.Test;
import org.mockito.Mockito;

public class FavouritesFragmentTest {

    @Test
    public void setTitleFragment() {
        int title = 0;
        FavouritesFragment x = Mockito.mock(FavouritesFragment.class);
        Activity activity = Mockito.spy(Activity.class);
        Mockito.doCallRealMethod().when(x).setTitleFragment(title);
        Mockito.doNothing().when(activity).setTitle(title);
        x.setTitleFragment(title);
        Mockito.verify(x).setTitleFragment(title);
    }

    @Test
    public void setTitleFragment2() {
        int title = 1;
        FavouritesFragment x = Mockito.mock(FavouritesFragment.class);
        x.mActivity = Mockito.mock(Activity.class);
        Mockito.doCallRealMethod().when(x).setTitleFragment(title);
        Mockito.doNothing().when(x.mActivity).setTitle(title);
        x.setTitleFragment(title);
        Mockito.verify(x).setTitleFragment(title);
    }


}