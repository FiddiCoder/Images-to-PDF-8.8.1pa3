package swati4star.createpdf.fragment;

import static swati4star.createpdf.fragment.ImageToPdfFragment.INTENT_REQUEST_APPLY_FILTER;
import static swati4star.createpdf.fragment.ImageToPdfFragment.INTENT_REQUEST_PREVIEW_IMAGE;
import static swati4star.createpdf.fragment.ImageToPdfFragment.INTENT_REQUEST_REARRANGE_IMAGE;
import static swati4star.createpdf.fragment.ImageToPdfFragment.mImagesUri;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.activity.ImageEditor;
import swati4star.createpdf.activity.PreviewActivity;
import swati4star.createpdf.activity.RearrangeImages;
import swati4star.createpdf.util.StringUtils;

public class ImageToPdfFragmentTest {

    protected static class SingletonHolder {
        static final StringUtils INSTANCE = Mockito.mock(StringUtils.class);
    }
    @Test
    public void startAddingImages() {
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).startAddingImages();
        Mockito.doNothing().when(x).getRuntimePermissions();
        x.startAddingImages();
        Mockito.verify(x, Mockito.times(1)).startAddingImages();
    }

    @Test
    public void startAddingImages2() {
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        x.mPermissionGranted = true;
        Mockito.doCallRealMethod().when(x).startAddingImages();
        x.startAddingImages();
        Mockito.verify(x, Mockito.times(1)).startAddingImages();
    }

    @Test
    public void onRequestPermissionsResult() {
        int[] grantResults = new int[0];
        String[] permissions = new String[1];
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onRequestPermissionsResult(-1, permissions, grantResults);
        x.onRequestPermissionsResult(-1, permissions, grantResults);
        Mockito.verify(x, Mockito.times(1)).onRequestPermissionsResult(-1, permissions, grantResults);
    }

    @Test
    public void onRequestPermissionsResult2() {
        //nada
    }

    @Test
    public void onItemClick() {
        int position = 0;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).passwordProtectPDF();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick2() {
        int position = 1;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).cropImage();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick3() {
        int position = 2;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).compressImage();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick4() {
        int position = 3;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).startActivityForResult(ImageEditor.getStartIntent(x.mActivity, mImagesUri),
                INTENT_REQUEST_APPLY_FILTER);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick5() {
        int position = 6;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).startActivityForResult(PreviewActivity.getStartIntent(x.mActivity, mImagesUri),
                INTENT_REQUEST_PREVIEW_IMAGE);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick6() {
        int position = 7;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).addBorder();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);

    }

    @Test
    public void onItemClick7() {
        int position = 8;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).startActivityForResult(RearrangeImages.getStartIntent(x.mActivity, mImagesUri),
                INTENT_REQUEST_REARRANGE_IMAGE);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick8() {
        int position = 9;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).createPdf(true);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick9() {
        int position = 10;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).addMargins();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick10() {
        int position = 11;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).addPageNumbers();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick11() {
        int position = 12;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).addWatermark();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick12() {
        int position = 13;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        Mockito.doNothing().when(x).setPageColor();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick13() {
        int position = 14;
        ImageToPdfFragment x = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        mImagesUri.add("ciao");
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }
}