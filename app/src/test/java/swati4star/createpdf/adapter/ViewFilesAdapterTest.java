package swati4star.createpdf.adapter;


import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.util.ArrayList;

import swati4star.createpdf.model.PDFFile;
import swati4star.createpdf.util.FileUtils;
import swati4star.createpdf.util.PDFEncryptionUtility;
import swati4star.createpdf.util.PDFRotationUtils;
import swati4star.createpdf.util.PDFUtils;
import swati4star.createpdf.util.WatermarkUtils;

public class ViewFilesAdapterTest {

    @Mock
    ViewFilesAdapter x;

    @Test
    public void performOperation() {
        MockitoAnnotations.initMocks(this);
        int index = 0;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mFileUtils = Mockito.mock(FileUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation2() {
        MockitoAnnotations.initMocks(this);
        int index = 1;
        int position = 0;
        File file = Mockito.mock(File.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        Mockito.doNothing().when(x).deleteFile("anyString()", position);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation3() {
        MockitoAnnotations.initMocks(this);
        int index = 2;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mFileUtils = Mockito.mock(FileUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        Mockito.doNothing().when(x).onRenameFileClick(position);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation4() {
        MockitoAnnotations.initMocks(this);
        int index = 3;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mFileUtils = Mockito.mock(FileUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation5() {
        MockitoAnnotations.initMocks(this);
        int index = 4;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mFileUtils = Mockito.mock(FileUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation6() {
        MockitoAnnotations.initMocks(this);
        int index = 5;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mPDFUtils = Mockito.mock(PDFUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation7() {
        MockitoAnnotations.initMocks(this);
        int index = 6;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mPDFEncryptionUtils = Mockito.mock(PDFEncryptionUtility.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation8() {
        MockitoAnnotations.initMocks(this);
        int index = 7;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mPDFEncryptionUtils = Mockito.mock(PDFEncryptionUtility.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation9() {
        MockitoAnnotations.initMocks(this);
        int index = 8;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mPDFRotationUtils = Mockito.mock(PDFRotationUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation10() {
        MockitoAnnotations.initMocks(this);
        int index = 9;
        int position = 0;
        File file = Mockito.mock(File.class);
        x.mWatermarkUtils = Mockito.mock(WatermarkUtils.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void performOperation11() {
        MockitoAnnotations.initMocks(this);
        int index = 10;
        int position = 0;
        File file = Mockito.mock(File.class);
        Mockito.doCallRealMethod().when(x).performOperation(index, position, file);
        x.performOperation(index, position, file);
        Mockito.verify(x).performOperation(index, position, file);
    }

    @Test
    public void checkAll() {
        MockitoAnnotations.initMocks(this);
        x.mSelectedFiles = new ArrayList<>();
        x.mFileList = new ArrayList<>();
        PDFFile file = Mockito.mock(PDFFile.class);
        x.mFileList.add(file);
        Mockito.doCallRealMethod().when(x).checkAll();
        x.checkAll();
        Mockito.verify(x).checkAll();
    }

    @Test
    public void checkAll2() {
        MockitoAnnotations.initMocks(this);
        x.mSelectedFiles = new ArrayList<>();
        x.mFileList = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).checkAll();
        x.checkAll();
        Mockito.verify(x).checkAll();
    }

    @Test
    public void getSelectedFilePath() {
        //falso
        MockitoAnnotations.initMocks(this);
        x.mSelectedFiles = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).getSelectedFilePath();
        x.getSelectedFilePath();
        Mockito.verify(x).getSelectedFilePath();
    }
    @Test
    public void getSelectedFilePath2() {
        // vero + falso
        MockitoAnnotations.initMocks(this);
        PDFFile file = Mockito.mock(PDFFile.class);
        x.mFileList = Mockito.mock(ArrayList.class);
        x.mSelectedFiles = new ArrayList<>();
        x.mSelectedFiles.add(2);
        Mockito.doCallRealMethod().when(x).getSelectedFilePath();
        x.getSelectedFilePath();
        Mockito.verify(x).getSelectedFilePath();
    }

    @Test
    public void getSelectedFilePath3() {
        // vero + vero
    }


    @Test
    public void getItemCount() {
        MockitoAnnotations.initMocks(this);
        x.mFileList = null;
        Mockito.doCallRealMethod().when(x).getItemCount();
        x.getItemCount();
        Mockito.verify(x).getItemCount();
    }

    @Test
    public void getItemCount2() {
        MockitoAnnotations.initMocks(this);
        x.mFileList = new ArrayList<>();
        PDFFile file = Mockito.mock(PDFFile.class);
        x.mFileList.add(file);
        Mockito.doCallRealMethod().when(x).getItemCount();
        x.getItemCount();
        Mockito.verify(x).getItemCount();
    }

    @Test
    public void areItemsSelected() {
        MockitoAnnotations.initMocks(this);
        x.mSelectedFiles = Mockito.mock(ArrayList.class);
        Mockito.when(x.mSelectedFiles.size()).thenReturn(-1);
        Mockito.doCallRealMethod().when(x).areItemsSelected();
        x.areItemsSelected();
        Mockito.verify(x).areItemsSelected();
    }

    @Test
    public void areItemsSelected2() {
        MockitoAnnotations.initMocks(this);
        x.mSelectedFiles = Mockito.mock(ArrayList.class);
        Mockito.when(x.mSelectedFiles.size()).thenReturn(10);
        Mockito.doCallRealMethod().when(x).areItemsSelected();
        x.areItemsSelected();
        Mockito.verify(x).areItemsSelected();
    }
}