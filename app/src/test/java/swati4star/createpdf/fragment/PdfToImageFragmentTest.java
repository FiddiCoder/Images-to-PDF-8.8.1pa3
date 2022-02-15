package swati4star.createpdf.fragment;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static swati4star.createpdf.util.Constants.PDF_TO_IMAGES;

import org.junit.Test;

import java.util.ArrayList;

import swati4star.createpdf.util.FileUtils;

public class PdfToImageFragmentTest {

    @Test
    public void onShareFilesClick() {
        PdfToImageFragment x = mock(PdfToImageFragment.class);
        x.mOutputFilePaths = null;
        x.mFileUtils = mock(FileUtils.class);
        doCallRealMethod().when(x).onShareFilesClick();
        x.onShareFilesClick();
        verify(x).onShareFilesClick();
    }

    @Test
    public void onShareFilesClick2() {
        PdfToImageFragment x = mock(PdfToImageFragment.class);
        x.mOutputFilePaths = new ArrayList<>();
        x.mFileUtils = mock(FileUtils.class);
        doCallRealMethod().when(x).onShareFilesClick();
        x.onShareFilesClick();
        verify(x).onShareFilesClick();
    }

    @Test
    public void onShareFilesClick3() {
        PdfToImageFragment x = mock(PdfToImageFragment.class);
        x.mOutputFilePaths = new ArrayList<>();
        x.mOutputFilePaths.add("prova");
        x.mFileUtils = mock(FileUtils.class);
        doCallRealMethod().when(x).onShareFilesClick();
        x.onShareFilesClick();
        verify(x).onShareFilesClick();
    }

    @Test
    public void pdfToImage() {
        String[] mInputPassword = new String[1];
        mInputPassword[0] = "a";
        PdfToImageFragment x = mock(PdfToImageFragment.class);
        x.mOperation = PDF_TO_IMAGES;
        doCallRealMethod().when(x).pdfToImage(mInputPassword);
        x.pdfToImage(mInputPassword);
        verify(x).pdfToImage(mInputPassword);
    }

    @Test
    public void pdfToImage2() {
        String[] mInputPassword = new String[1];
        mInputPassword[0] = "a";
        PdfToImageFragment x = mock(PdfToImageFragment.class);
        x.mOperation = "prova";
        doCallRealMethod().when(x).pdfToImage(mInputPassword);
        x.pdfToImage(mInputPassword);
        verify(x).pdfToImage(mInputPassword);
    }
}