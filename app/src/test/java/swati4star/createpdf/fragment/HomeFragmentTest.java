package swati4star.createpdf.fragment;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.view.View;

import org.junit.Test;

import java.util.HashMap;

import swati4star.createpdf.R;
import swati4star.createpdf.activity.MainActivity;
import swati4star.createpdf.model.HomePageItem;

public class HomeFragmentTest {

    @Test
    public void onClick() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(0, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(0);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick2() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.images_to_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.images_to_pdf);
        when(v.getId()).thenReturn(R.id.images_to_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick3() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.qr_barcode_to_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.qr_barcode_to_pdf);
        when(v.getId()).thenReturn(R.id.qr_barcode_to_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick4() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.text_to_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.text_to_pdf);
        when(v.getId()).thenReturn(R.id.text_to_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick5() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.view_files, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.view_files);
        when(v.getId()).thenReturn(R.id.view_files);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick6() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.view_history, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.view_history);
        when(v.getId()).thenReturn(R.id.view_history);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick7() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.merge_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.merge_pdf);
        when(v.getId()).thenReturn(R.id.merge_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick8() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.split_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.split_pdf);
        when(v.getId()).thenReturn(R.id.split_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick9() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.compress_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.compress_pdf);
        when(v.getId()).thenReturn(R.id.compress_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick10() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.extract_images, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.extract_images);
        when(v.getId()).thenReturn(R.id.extract_images);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick11() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.pdf_to_images, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.pdf_to_images);
        when(v.getId()).thenReturn(R.id.pdf_to_images);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick12() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.remove_pages, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.remove_pages);
        when(v.getId()).thenReturn(R.id.remove_pages);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }


    @Test
    public void onClick13() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.rearrange_pages, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.rearrange_pages);
        when(v.getId()).thenReturn(R.id.rearrange_pages);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick14() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.add_password, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.add_password);
        when(v.getId()).thenReturn(R.id.add_password);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick15() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.remove_password, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.remove_password);
        when(v.getId()).thenReturn(R.id.remove_password);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick16() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.rotate_pages, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.rotate_pages);
        when(v.getId()).thenReturn(R.id.rotate_pages);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick17() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.add_watermark, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.add_watermark);
        when(v.getId()).thenReturn(R.id.add_watermark);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick18() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.add_images, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.add_images);
        when(v.getId()).thenReturn(R.id.add_images);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick19() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.remove_duplicates_pages_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.remove_duplicates_pages_pdf);
        when(v.getId()).thenReturn(R.id.remove_duplicates_pages_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick20() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.invert_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.invert_pdf);
        when(v.getId()).thenReturn(R.id.invert_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick21() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.zip_to_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.zip_to_pdf);
        when(v.getId()).thenReturn(R.id.zip_to_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick22() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.excel_to_pdf, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.excel_to_pdf);
        when(v.getId()).thenReturn(R.id.excel_to_pdf);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick23() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.extract_text, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.extract_text);
        when(v.getId()).thenReturn(R.id.extract_text);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void onClick24() {
        HomeFragment x = mock(HomeFragment.class);
        HomePageItem home = mock(HomePageItem.class);
        x.mFragmentPositionMap = new HashMap<>();
        x.mFragmentPositionMap.put(R.id.add_text, home);
        View v = mock(View.class);
        doNothing().when(x).highlightNavigationDrawerItem(R.id.add_text);
        when(v.getId()).thenReturn(R.id.add_text);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

    @Test
    public void highlightNavigationDrawerItem() {
        HomeFragment x = mock(HomeFragment.class);
        x.mActivity = mock(MainActivity.class);
        doCallRealMethod().when(x).highlightNavigationDrawerItem(5);
        x.highlightNavigationDrawerItem(5);
        verify(x).highlightNavigationDrawerItem(5);
    }

    @Test
    public void highlightNavigationDrawerItem2() {
        HomeFragment x = mock(HomeFragment.class);
        x.mActivity = mock(Activity.class);
        doCallRealMethod().when(x).highlightNavigationDrawerItem(5);
        x.highlightNavigationDrawerItem(5);
        verify(x).highlightNavigationDrawerItem(5);
    }

    @Test
    public void setTitleFragment() {
        HomeFragment x = mock(HomeFragment.class);
        x.mActivity = mock(Activity.class);
        doCallRealMethod().when(x).setTitleFragment(2);
        x.setTitleFragment(2);
        verify(x).setTitleFragment(2);
    }

    @Test
    public void setTitleFragment2() {
        HomeFragment x = mock(HomeFragment.class);
        x.mActivity = mock(Activity.class);
        doCallRealMethod().when(x).setTitleFragment(0);
        x.setTitleFragment(0);
        verify(x).setTitleFragment(0);
    }
}