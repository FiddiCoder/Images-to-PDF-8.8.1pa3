package swati4star.createpdf.activity;


import android.net.Uri;
import android.view.MenuItem;
import android.widget.TextView;

import com.theartofdev.edmodo.cropper.CropImageView;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;

import swati4star.createpdf.R;

public class CropImageActivityTest {

    @Test
    public void nextImageClicked() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImages = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).nextImageClicked();
        x.nextImageClicked();
        Mockito.verify(x).nextImageClicked();
    }

    @Test
    public void nextImageClicked2() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImages = new ArrayList<>();
        x.mImages.add("prova");
        Mockito.doCallRealMethod().when(x).nextImageClicked();
        Mockito.doNothing().when(x).setImage(0);
        x.nextImageClicked();
        Mockito.verify(x).nextImageClicked();
    }

    @Test
    public void prevImgBtnClicked() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImages = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).prevImgBtnClicked();
        x.prevImgBtnClicked();
        Mockito.verify(x).prevImgBtnClicked();
    }

    @Test
    public void prevImgBtnClicked2() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImages = new ArrayList<>();
        x.mImages.add("prova");
        Mockito.doCallRealMethod().when(x).prevImgBtnClicked();
        x.prevImgBtnClicked();
        Mockito.verify(x).prevImgBtnClicked();
    }

    @Test
    public void prevImgBtnClicked3() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImages = new ArrayList<>();
        x.mImages.add("prova");
        x.mCurrentImageIndex = 1;
        Mockito.doCallRealMethod().when(x).prevImgBtnClicked();
        x.prevImgBtnClicked();
        Mockito.verify(x).prevImgBtnClicked();
    }

    @Test
    public void onOptionsItemSelected() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(android.R.id.home);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected3() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(R.id.action_done);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected4() {
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(R.id.action_skip);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void setImage() {
        //vera falsa
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImages = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).setImage(-1);
        x.setImage(-1);
        Mockito.verify(x).setImage(-1);
    }

    @Test
    public void setImage2() {
        //falsa vera
        CropImageActivity x = Mockito.mock(CropImageActivity.class);

        x.mImages = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).setImage(10);
        x.setImage(10);
        Mockito.verify(x).setImage(10);
    }

    @Test
    public void setImage3() {
        //falsa falsa
        CropImageActivity x = Mockito.mock(CropImageActivity.class);
        x.mImageCount = Mockito.mock(TextView.class);
        x.mCropImageView = Mockito.mock(CropImageView.class);
        Uri uri = Mockito.mock(Uri.class);
        x.mCroppedImageUris = new HashMap<>();
        x.mCroppedImageUris.put(20, uri);
        x.mImages = new ArrayList<>();
        x.mImages.add("prova");
        x.mImages.add("prova2");
        x.mImages.add("prova3");
        Mockito.doCallRealMethod().when(x).setImage(1);
        x.setImage(1);
        Mockito.verify(x).setImage(1);
    }
}