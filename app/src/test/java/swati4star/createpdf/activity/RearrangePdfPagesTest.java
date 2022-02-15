package swati4star.createpdf.activity;


import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.MenuItem;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import swati4star.createpdf.adapter.RearrangePdfAdapter;
import swati4star.createpdf.util.Constants;

public class RearrangePdfPagesTest {

    @Test
    public void swap() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        x.mSequence = Mockito.mock(ArrayList.class);
        Mockito.doCallRealMethod().when(x).swap(100, 0);
        x.swap(100, 0);
        Mockito.verify(x).swap(100, 0);
    }

    @Test
    public void swap2() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        x.mSequence = new ArrayList<>();
        x.mSequence.add(2);
        x.mSequence.add(3);
        x.mSequence.add(4);
        Mockito.doCallRealMethod().when(x).swap(1, 0);
        x.swap(1, 0);
        Mockito.verify(x).swap(1, 0);
    }

    @Test
    public void onOptionsItemSelected() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(android.R.id.home);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        Mockito.doNothing().when(x).passUris();
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void passUris() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        x.mSequence = new ArrayList<Integer>();
        x.mSequence.add(2);
        x.mSequence.add(2);
        x.mSequence.add(2);
        x.mInitialSequence = new ArrayList<Integer>();
        x.mInitialSequence.add(2);
        x.mInitialSequence.add(2);
        x.mInitialSequence.add(2);
        Mockito.doCallRealMethod().when(x).passUris();
        x.passUris();
        Mockito.verify(x).passUris();
    }

    @Test
    public void passUris2() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        x.mSequence = new ArrayList<Integer>();
        x.mInitialSequence = new ArrayList<Integer>();
        Mockito.doCallRealMethod().when(x).passUris();
        x.passUris();
        Mockito.verify(x).passUris();
    }

    @Test
    public void onRemoveClick() {
        RearrangePdfPages x = Mockito.mock(RearrangePdfPages.class);
        x.mSharedPreferences = Mockito.mock(SharedPreferences.class);
        x.mImages = new ArrayList<Bitmap>();
        Bitmap e = Mockito.mock(Bitmap.class);
        x.mImages.add(e);
        x.mRearrangeImagesAdapter = Mockito.mock(RearrangePdfAdapter.class);
        x.mSequence = new ArrayList<>();
        x.mSequence.add(1);
        Mockito.doCallRealMethod().when(x).onRemoveClick(0);
        Mockito.when(x.mSharedPreferences.getBoolean(Constants.CHOICE_REMOVE_IMAGE, false))
                .thenReturn(true);
        x.onRemoveClick(0);
        Mockito.verify(x).onRemoveClick(0);
    }

}