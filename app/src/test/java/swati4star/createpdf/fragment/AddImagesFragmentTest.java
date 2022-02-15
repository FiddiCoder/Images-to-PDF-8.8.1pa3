package swati4star.createpdf.fragment;


import android.content.Intent;
import android.widget.TextView;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.util.MorphButtonUtility;

public class AddImagesFragmentTest {

    @Test
    public void onActivityResult() {
        // vero vero
        Intent data = null;
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult1() {
        //vero falso
        Intent data = Mockito.mock(Intent.class);
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult2() {
        //falso falso
        Intent data = Mockito.mock(Intent.class);
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult3() {
        //falso vero
        Intent data = null;
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult4() {
        Intent data = Mockito.mock(Intent.class);
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        x.mNoOfImages = Mockito.mock(TextView.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(13, -1, data);
        x.onActivityResult(13, -1, data);
        Mockito.verify(x).onActivityResult(13, -1, data);
    }

    @Test
    public void onRequestPermissionsResult() {
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        String[] permissions = new String[0];
        int[] grantResults = new int[0];
        Mockito.doCallRealMethod().when(x).onRequestPermissionsResult(0, permissions, grantResults);
        x.onRequestPermissionsResult(0, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(0, permissions, grantResults);
    }

    @Test
    public void onRequestPermissionsResult2() {
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        String[] permissions = new String[0];
        int[] grantResults = new int[2];
        Mockito.doCallRealMethod().when(x).onRequestPermissionsResult(0, permissions, grantResults);
        x.onRequestPermissionsResult(0, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(0, permissions, grantResults);
    }

    @Test
    public void startAddingImages() {
        AddImagesFragment x = Mockito.spy(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).startAddingImages();
        x.mPermissionGranted = true;
        x.startAddingImages();
        Mockito.verify(x).startAddingImages();
    }

}
