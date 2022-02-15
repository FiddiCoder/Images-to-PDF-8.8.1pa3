package swati4star.createpdf.util;

import static swati4star.createpdf.util.Constants.ADD_WATERMARK;
import static swati4star.createpdf.util.Constants.BUNDLE_DATA;
import static swati4star.createpdf.util.Constants.ROTATE_PAGES;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import swati4star.createpdf.fragment.AddImagesFragment;
import swati4star.createpdf.fragment.ExceltoPdfFragment;
import swati4star.createpdf.fragment.ExtractTextFragment;
import swati4star.createpdf.fragment.HistoryFragment;
import swati4star.createpdf.fragment.ImageToPdfFragment;
import swati4star.createpdf.fragment.InvertPdfFragment;
import swati4star.createpdf.fragment.MergeFilesFragment;
import swati4star.createpdf.fragment.PdfToImageFragment;
import swati4star.createpdf.fragment.QrBarcodeScanFragment;
import swati4star.createpdf.fragment.RemoveDuplicatePagesFragment;
import swati4star.createpdf.fragment.RemovePagesFragment;
import swati4star.createpdf.fragment.SplitFilesFragment;
import swati4star.createpdf.fragment.TextToPdfFragment;
import swati4star.createpdf.fragment.ViewFilesFragment;
import swati4star.createpdf.fragment.ZipToPdfFragment;

public class FragmentUtilsTest {

    @Mock
    FragmentUtils x;


    @Test
    public void getFragmentName() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(ImageToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName2() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName3() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(QrBarcodeScanFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName4() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(ExceltoPdfFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName5() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(ViewFilesFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName6() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(HistoryFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName7() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(ExtractTextFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName8() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName9() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(MergeFilesFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName10() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(SplitFilesFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName11() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(InvertPdfFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName12() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName13() {
        MockitoAnnotations.initMocks(this);
        Bundle data = Mockito.mock(Bundle.class);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(RemovePagesFragment.class);
        Mockito.when(fragment.getArguments()).thenReturn(data);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName14() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(RemovePagesFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName15() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(PdfToImageFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName16() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(ZipToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }

    @Test
    public void getFragmentName17() {
        MockitoAnnotations.initMocks(this);
        x.mContext = Mockito.mock(Context.class);
        Fragment fragment = Mockito.mock(Fragment.class);
        Mockito.doCallRealMethod().when(x).getFragmentName(fragment);
        x.getFragmentName(fragment);
        Mockito.verify(x).getFragmentName(fragment);
    }





    @Test
    public void handleFragmentBottomSheetBehavior() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(InvertPdfFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((InvertPdfFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior2() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(InvertPdfFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((InvertPdfFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior3() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(MergeFilesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((MergeFilesFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior4() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(MergeFilesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((MergeFilesFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior5() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((RemoveDuplicatePagesFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior6() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((RemoveDuplicatePagesFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior7() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(RemovePagesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((RemovePagesFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior8() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(RemovePagesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((RemovePagesFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior9() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((AddImagesFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior10() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(AddImagesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((AddImagesFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior11() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(PdfToImageFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((PdfToImageFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior12() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(PdfToImageFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((PdfToImageFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior13() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(SplitFilesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((SplitFilesFragment) fragment).checkSheetBehaviour()).thenReturn(true);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior14() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(SplitFilesFragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        Mockito.when(((SplitFilesFragment) fragment).checkSheetBehaviour()).thenReturn(false);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void handleFragmentBottomSheetBehavior15() {
        MockitoAnnotations.initMocks(this);
        Fragment fragment = Mockito.mock(Fragment.class);
        Mockito.doCallRealMethod().when(x).handleFragmentBottomSheetBehavior(fragment);
        x.handleFragmentBottomSheetBehavior(fragment);
        Mockito.verify(x).handleFragmentBottomSheetBehavior(fragment);
    }

    @Test
    public void checkViewFilesFragmentCode() {
        MockitoAnnotations.initMocks(this);
        Bundle data = Mockito.mock(Bundle.class);
        x.mContext = Mockito.mock(Context.class);
        Mockito.doCallRealMethod().when(x).checkViewFilesFragmentCode(data);
        x.checkViewFilesFragmentCode(data);
        Mockito.verify(x).checkViewFilesFragmentCode(data);
    }

    @Test
    public void checkViewFilesFragmentCode2() {
        MockitoAnnotations.initMocks(this);
        Bundle data = null;
        x.mContext = Mockito.mock(Context.class);
        Mockito.doCallRealMethod().when(x).checkViewFilesFragmentCode(data);
        x.checkViewFilesFragmentCode(data);
        Mockito.verify(x).checkViewFilesFragmentCode(data);
    }

    @Test
    public void checkViewFilesFragmentCode3() {
        MockitoAnnotations.initMocks(this);
        Bundle data = Mockito.mock(Bundle.class);
        x.mContext = Mockito.mock(Context.class);
        Mockito.doCallRealMethod().when(x).checkViewFilesFragmentCode(data);
        Mockito.when(data.getInt(BUNDLE_DATA)).thenReturn(ROTATE_PAGES);
        x.checkViewFilesFragmentCode(data);
        Mockito.verify(x).checkViewFilesFragmentCode(data);
    }

    @Test
    public void checkViewFilesFragmentCode4() {
        MockitoAnnotations.initMocks(this);
        Bundle data = Mockito.mock(Bundle.class);
        x.mContext = Mockito.mock(Context.class);
        Mockito.doCallRealMethod().when(x).checkViewFilesFragmentCode(data);
        Mockito.when(data.getInt(BUNDLE_DATA)).thenReturn(ADD_WATERMARK);
        x.checkViewFilesFragmentCode(data);
        Mockito.verify(x).checkViewFilesFragmentCode(data);
    }
}