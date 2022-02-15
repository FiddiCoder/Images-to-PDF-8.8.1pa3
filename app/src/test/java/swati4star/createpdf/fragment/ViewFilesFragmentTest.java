package swati4star.createpdf.fragment;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.view.MenuItem;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

import swati4star.createpdf.R;
import swati4star.createpdf.adapter.ViewFilesAdapter;
import swati4star.createpdf.util.DirectoryUtils;
import swati4star.createpdf.util.MergeHelper;

public class ViewFilesFragmentTest {

    @Test
    public void filesPopulated() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        Mockito.doCallRealMethod().when(x).filesPopulated();
        x.filesPopulated();
        Mockito.verify(x, Mockito.times(1)).filesPopulated();
    }

    @Test
    public void filesPopulated2() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        x.mIsMergeRequired = true;
        x.mActivity = mock(Activity.class);
        Mockito.doCallRealMethod().when(x).filesPopulated();
        Mockito.doNothing().when(x.mActivity).invalidateOptionsMenu();
        x.filesPopulated();
        Mockito.verify(x, Mockito.times(1)).filesPopulated();
    }

    @Test
    public void onOptionsItemSelected() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.item_sort);
        doNothing().when(x).displaySortDialog();
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected3() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        x.mViewFilesAdapter = mock(ViewFilesAdapter.class);
        when(x.mViewFilesAdapter.areItemsSelected()).thenReturn(true);
        doNothing().when(x).deleteFiles();
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.item_delete);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected4() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        x.mViewFilesAdapter = mock(ViewFilesAdapter.class);
        when(x.mViewFilesAdapter.areItemsSelected()).thenReturn(true);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.item_share);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected5() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        x.mViewFilesAdapter = mock(ViewFilesAdapter.class);
        when(x.mViewFilesAdapter.getItemCount()).thenReturn(1);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.select_all);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected6() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        x.mViewFilesAdapter = mock(ViewFilesAdapter.class);
        x.mIsAllFilesSelected = true;
        when(x.mViewFilesAdapter.getItemCount()).thenReturn(1);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.select_all);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected7() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        x.mViewFilesAdapter = mock(ViewFilesAdapter.class);
        x.mMergeHelper = mock(MergeHelper.class);
        when(x.mViewFilesAdapter.getItemCount()).thenReturn(2);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.item_merge);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected8() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        MenuItem item = mock(MenuItem.class);
        x.mViewFilesAdapter = mock(ViewFilesAdapter.class);
        x.mMergeHelper = mock(MergeHelper.class);
        when(x.mViewFilesAdapter.getItemCount()).thenReturn(1);
        doCallRealMethod().when(x).onOptionsItemSelected(item);
        when(item.getItemId()).thenReturn(R.id.item_merge);
        x.onOptionsItemSelected(item);
        verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void checkIfListEmpty() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        File[] files = null;
        File file = mock(File.class);
        x.mDirectoryUtils = mock(DirectoryUtils.class);
        doCallRealMethod().when(x).checkIfListEmpty();
        when(x.mDirectoryUtils.getOrCreatePdfDirectory()).thenReturn(file);
        when(x.mDirectoryUtils.getOrCreatePdfDirectory().listFiles()).thenReturn(files);
        x.checkIfListEmpty();
        verify(x).checkIfListEmpty();
    }

    @Test
    public void checkIfListEmpty2() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        File[] files = new File[1];
        File file = mock(File.class);
        files[0] = file;
        x.mDirectoryUtils = mock(DirectoryUtils.class);
        doCallRealMethod().when(x).checkIfListEmpty();
        when(x.mDirectoryUtils.getOrCreatePdfDirectory()).thenReturn(file);
        when(x.mDirectoryUtils.getOrCreatePdfDirectory().listFiles()).thenReturn(files);
        x.checkIfListEmpty();
        verify(x).checkIfListEmpty();
    }

    @Test
    public void checkIfListEmpty3() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        File[] files = new File[0];
        File file = mock(File.class);
        x.mDirectoryUtils = mock(DirectoryUtils.class);
        doCallRealMethod().when(x).checkIfListEmpty();
        when(x.mDirectoryUtils.getOrCreatePdfDirectory()).thenReturn(file);
        when(x.mDirectoryUtils.getOrCreatePdfDirectory().listFiles()).thenReturn(files);
        doNothing().when(x).updateToolbar();
        x.checkIfListEmpty();
        verify(x).checkIfListEmpty();
    }

    @Test
    public void checkIfListEmpty4() {
        ViewFilesFragment x = mock(ViewFilesFragment.class);
        File[] files = new File[1];
        File file = mock(File.class);
        files[0] = file;
        x.mDirectoryUtils = mock(DirectoryUtils.class);
        doCallRealMethod().when(x).checkIfListEmpty();
        when(x.mDirectoryUtils.getOrCreatePdfDirectory()).thenReturn(file);
        when(x.mDirectoryUtils.getOrCreatePdfDirectory().listFiles()).thenReturn(files);
        when(files[0].isDirectory()).thenReturn(true);
        x.checkIfListEmpty();
        verify(x).checkIfListEmpty();
    }
}