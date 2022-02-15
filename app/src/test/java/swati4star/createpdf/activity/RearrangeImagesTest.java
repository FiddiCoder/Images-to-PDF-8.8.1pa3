package swati4star.createpdf.activity;

import android.content.SharedPreferences;
import android.view.MenuItem;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import swati4star.createpdf.adapter.RearrangeImagesAdapter;
import swati4star.createpdf.util.Constants;

public class RearrangeImagesTest {

    @Test
    public void onOptionsItemSelected() {
        RearrangeImages x = Mockito.mock(RearrangeImages.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        RearrangeImages x = Mockito.mock(RearrangeImages.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(android.R.id.home);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onRemoveClick() {
        RearrangeImages x = Mockito.mock(RearrangeImages.class);
        x.mSharedPreferences = Mockito.mock(SharedPreferences.class);
        x.mImages = Mockito.mock(ArrayList.class);
        x.mRearrangeImagesAdapter = Mockito.mock(RearrangeImagesAdapter.class);
        Mockito.doCallRealMethod().when(x).onRemoveClick(0);
        Mockito.when(x.mSharedPreferences.getBoolean(Constants.CHOICE_REMOVE_IMAGE, false))
                .thenReturn(true);
        x.onRemoveClick(0);
        Mockito.verify(x).onRemoveClick(0);
    }
}