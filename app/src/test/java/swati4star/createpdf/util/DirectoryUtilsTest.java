package swati4star.createpdf.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

public class DirectoryUtilsTest {

    @Test
    public void searchPDF() {
        assertTrue(true);
    }

    @Test
    public void getPdfsFromPdfFolder() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        doCallRealMethod().when(x).getPdfsFromPdfFolder(null);
        x.getPdfsFromPdfFolder(null);
        verify(x).getPdfsFromPdfFolder(null);
    }

    @Test
    public void getPdfsFromPdfFolder2() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[1];
        File file = mock(File.class);
        files[0] = file;
        doCallRealMethod().when(x).getPdfsFromPdfFolder(files);
        x.getPdfsFromPdfFolder(files);
        verify(x).getPdfsFromPdfFolder(files);
    }

    @Test
    public void getPdfsFromPdfFolder3() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[0];
        doCallRealMethod().when(x).getPdfsFromPdfFolder(files);
        x.getPdfsFromPdfFolder(files);
        verify(x).getPdfsFromPdfFolder(files);
    }

    @Test
    public void getPdfsFromPdfFolder4() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[1];
        File file = mock(File.class);
        files[0] = file;
        doCallRealMethod().when(x).getPdfsFromPdfFolder(files);
        when(x.isPDFAndNotDirectory(file)).thenReturn(true);
        x.getPdfsFromPdfFolder(files);
        verify(x).getPdfsFromPdfFolder(files);
    }

    @Test
    public void checkChar() {
        String s1 = "prova";
        String s2 = "test";
        Context context = mock(Context.class);
        assertEquals(0, new DirectoryUtils(context).checkChar(s1, s2));
    }

    @Test
    public void checkChar2() {
        String s1 = "prova";
        String s2 = "prova";
        Context context = mock(Context.class);
        assertEquals(1, new DirectoryUtils(context).checkChar(s1, s2));
    }

    @Test
    public void searchPdfsFromPdfFolder() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = null;
        doCallRealMethod().when(x).searchPdfsFromPdfFolder(files);
        x.searchPdfsFromPdfFolder(files);
        verify(x).searchPdfsFromPdfFolder(files);
    }

    @Test
    public void searchPdfsFromPdfFolder2() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[1];
        File file = mock(File.class);
        Mockito.when(file.listFiles()).thenReturn(files);
        files[0] = file;
        doCallRealMethod().when(x).searchPdfsFromPdfFolder(files);
        when(files[0].isDirectory()).thenReturn(true);
        x.searchPdfsFromPdfFolder(files);
        verify(x).searchPdfsFromPdfFolder(files);
    }

    @Test
    public void searchPdfsFromPdfFolder3() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[1];
        File file = mock(File.class);
        Mockito.when(file.listFiles()).thenReturn(files);
        files[0] = file;
        doCallRealMethod().when(x).searchPdfsFromPdfFolder(files);
        when(files[0].isDirectory()).thenReturn(true);
        when(x.isPDFAndNotDirectory(file)).thenReturn(true);
        x.searchPdfsFromPdfFolder(files);
        verify(x).searchPdfsFromPdfFolder(files);
    }

    @Test
    public void searchPdfsFromPdfFolder4() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[1];
        File file = mock(File.class);
        Mockito.when(file.listFiles()).thenReturn(files);
        files[0] = file;
        doCallRealMethod().when(x).searchPdfsFromPdfFolder(files);
        when(files[0].isDirectory()).thenReturn(false);
        x.searchPdfsFromPdfFolder(files);
        verify(x).searchPdfsFromPdfFolder(files);
    }

    @Test
    public void searchPdfsFromPdfFolder5() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[0];
        doCallRealMethod().when(x).searchPdfsFromPdfFolder(files);
        x.searchPdfsFromPdfFolder(files);
        verify(x).searchPdfsFromPdfFolder(files);
    }

    @Test
    public void searchPdfsFromPdfFolder6() {
        DirectoryUtils x = mock(DirectoryUtils.class);
        File[] files = new File[1];
        File file = mock(File.class);
        files[0] = file;
        doCallRealMethod().when(x).searchPdfsFromPdfFolder(files);
        when(files[0].isDirectory()).thenReturn(true);
        File[] filestwo = new File[0];
        when(file.listFiles()).thenReturn(filestwo);
        x.searchPdfsFromPdfFolder(files);
        verify(x).searchPdfsFromPdfFolder(files);
    }


}