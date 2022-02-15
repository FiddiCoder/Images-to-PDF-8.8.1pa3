package util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static swati4star.createpdf.util.FileUtils.getFileName;

import android.app.Activity;
import android.net.Uri;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.TimeZone;

import swati4star.createpdf.util.FileUriUtils;
import swati4star.createpdf.util.FileUtils;

@RunWith(MockitoJUnitRunner.class)
public class FileUtilsTest {

    private static final String FILE_PATH = "/a/b/";
    private static final String FILE_NAME = "c.pdf";

    @Mock
    FileUtils fileUtils;

    @Mock
    File file;

    @Before
    public void setUp() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void when_CallingGetFormattedDate_Expect_CorrectDateReturned() {
        when(file.lastModified()).thenReturn(0L);
        assertThat(FileUtils.getFormattedDate(file), is("Thu, Jan 01 at 00:00"));
    }

    @Test
    public void when_CallingGetFormattedSize_Expect_CorrectDateReturned() {
        //when(file.length()).thenReturn(5242880L);
        //String value = "5,00 MB";
        //assertThat(FileUtils.getFormattedSize(file), is(value));
    }

    @Test
    public void when_CallingGetFileName_Expect_CorrectValueReturned() {
        assertThat(getFileName(FILE_PATH + FILE_NAME), is(FILE_NAME));
        assertThat(getFileName(""), is(""));
    }

    @Test
    public void when_CallingStaticGetFileName_Expect_CorrectValueReturned() {
        assertThat(getFileName(FILE_PATH + FILE_NAME), is(FILE_NAME));
        assertThat(getFileName(""), is(""));
    }

    @Test
    public void when_CallingGetFileNameWithoutExtension_Expect_CorrectValueReturned() {
        assertThat(FileUtils.getFileNameWithoutExtension(FILE_PATH + FILE_NAME), is("c"));
        assertThat(FileUtils.getFileNameWithoutExtension(""), is(""));
    }

    @Test
    public void when_CallingGetFileDirectoryPath_Expect_CorrectValueReturned() {
        assertThat(FileUtils.getFileDirectoryPath(FILE_PATH + FILE_NAME), is(FILE_PATH));
        assertThat(FileUtils.getFileDirectoryPath(""), is(""));
    }

    @Test
    public void getUriRealPath() {
        //uri null
        Activity context = new Activity();
        FileUtils fileUtils = new FileUtils(context);
        Uri uri = null;
        Assert.assertNull(fileUtils.getUriRealPath(uri));

    }

    @Test
    public void getUriRealPath2() {
        Activity context = new Activity();
        FileUtils fileUtils = new FileUtils(context);
        FileUriUtils fileUriUtils = mock(FileUriUtils.class);

        Uri uri = mock(Uri.class);
        fileUtils.getUriRealPath(uri);
        String fileName = "";

        Assert.assertThat(fileName, is(""));
    }

    @Test
    public void getUriRealPath3() {
        /*
        Activity context = new Activity();
        FileUtils fileUtils = new FileUtils(context);
        FileUriUtils fileUriUtils = mock(FileUriUtils.class);
        FileUriUtils.SingletonHolder y = mock(FileUriUtils.SingletonHolder.class);

        Uri uri = mock(Uri.class);
        fileUtils.getUriRealPath(uri);
        String fileName = "";

        Assert.assertThat(fileName, is(""));
     
         */
    }

    @Test
    public void isFileExist() {
        String nomefile = "prova.pdf";
        Assert.assertEquals(false, fileUtils.isFileExist(nomefile));
    }

    @Test
    public void getLastFileName() {
        FileUtils x = mock(FileUtils.class);
        ArrayList<String> file = new ArrayList<>();
        doCallRealMethod().when(x).getLastFileName(file);
        x.getLastFileName(file);
        verify(x).getLastFileName(file);
    }

    @Test
    public void getLastFileName2() {
        FileUtils x = mock(FileUtils.class);
        x.mContext = mock(Activity.class);
        ArrayList<String> file = new ArrayList<>();
        file.add("prova.pdf");
        doCallRealMethod().when(x).getLastFileName(file);
        x.getLastFileName(file);
        verify(x).getLastFileName(file);
    }

    @Test
    public void checkRepeat() {
    }


    @Test
    public void stripExtension() {
        FileUtils x = mock(FileUtils.class);
        doCallRealMethod().when(x).stripExtension(null);
        x.stripExtension(null);
        verify(x).stripExtension(null);
    }

    @Test
    public void stripExtension2() {
        FileUtils x = mock(FileUtils.class);
        String t = "prova.pdf";
        doCallRealMethod().when(x).stripExtension(t);
        x.stripExtension(t);
        verify(x).stripExtension(t);
    }

    @Test
    public void stripExtension3() {
        FileUtils x = mock(FileUtils.class);
        String t = "pdf";
        doCallRealMethod().when(x).stripExtension(t);
        x.stripExtension(t);
        verify(x).stripExtension(t);
    }

    @Test
    public void getFileNameTest() {
        FileUtils x = mock(FileUtils.class);
        Uri uri = mock(Uri.class);
        doCallRealMethod().when(x).getFileName(uri);
        when(uri.getScheme()).thenReturn(null);
        x.getFileName(uri);
        verify(x).getFileName(uri);
    }

    @Test
    public void getFileNameTest2() {
        FileUtils x = mock(FileUtils.class);
        Uri uri = mock(Uri.class);
        doCallRealMethod().when(x).getFileName(uri);
        when(uri.getScheme()).thenReturn("file");
        x.getFileName(uri);
        verify(x).getFileName(uri);
    }

}