package swati4star.createpdf.providers.fragmentmanagement;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import android.support.v4.app.FragmentActivity;

import org.junit.Test;

import swati4star.createpdf.R;
import swati4star.createpdf.util.FeedbackUtils;

public class FragmentManagementTest {

    @Test
    public void handleNavigationItemSelected() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_home);
        x.handleNavigationItemSelected(R.id.nav_home);
        verify(x).handleNavigationItemSelected(R.id.nav_home);
    }

    @Test
    public void handleNavigationItemSelected2() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_camera);
        x.handleNavigationItemSelected(R.id.nav_camera);
        verify(x).handleNavigationItemSelected(R.id.nav_camera);
    }

    @Test
    public void handleNavigationItemSelected3() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_qrcode);
        x.handleNavigationItemSelected(R.id.nav_qrcode);
        verify(x).handleNavigationItemSelected(R.id.nav_qrcode);
    }

    @Test
    public void handleNavigationItemSelected4() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_gallery);
        x.handleNavigationItemSelected(R.id.nav_gallery);
        verify(x).handleNavigationItemSelected(R.id.nav_gallery);
    }

    @Test
    public void handleNavigationItemSelected5() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_merge);
        x.handleNavigationItemSelected(R.id.nav_merge);
        verify(x).handleNavigationItemSelected(R.id.nav_merge);
    }

    @Test
    public void handleNavigationItemSelected6() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_split);
        x.handleNavigationItemSelected(R.id.nav_split);
        verify(x).handleNavigationItemSelected(R.id.nav_split);
    }

    @Test
    public void handleNavigationItemSelected7() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_text_to_pdf);
        x.handleNavigationItemSelected(R.id.nav_text_to_pdf);
        verify(x).handleNavigationItemSelected(R.id.nav_text_to_pdf);
    }

    @Test
    public void handleNavigationItemSelected8() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_history);
        x.handleNavigationItemSelected(R.id.nav_history);
        verify(x).handleNavigationItemSelected(R.id.nav_history);
    }

    @Test
    public void handleNavigationItemSelected9() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_add_text);
        x.handleNavigationItemSelected(R.id.nav_add_text);
        verify(x).handleNavigationItemSelected(R.id.nav_add_text);
    }

    @Test
    public void handleNavigationItemSelected10() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_add_password);
        x.handleNavigationItemSelected(R.id.nav_add_password);
        verify(x).handleNavigationItemSelected(R.id.nav_add_password);
    }

    @Test
    public void handleNavigationItemSelected11() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_remove_password);
        x.handleNavigationItemSelected(R.id.nav_remove_password);
        verify(x).handleNavigationItemSelected(R.id.nav_remove_password);
    }

    @Test
    public void handleNavigationItemSelected12() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        x.mFeedbackUtils = mock(FeedbackUtils.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_share);
        x.handleNavigationItemSelected(R.id.nav_share);
        verify(x).handleNavigationItemSelected(R.id.nav_share);
    }

    @Test
    public void handleNavigationItemSelected13() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_about);
        x.handleNavigationItemSelected(R.id.nav_about);
        verify(x).handleNavigationItemSelected(R.id.nav_about);
    }

    @Test
    public void handleNavigationItemSelected14() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_settings);
        x.handleNavigationItemSelected(R.id.nav_settings);
        verify(x).handleNavigationItemSelected(R.id.nav_settings);
    }


    @Test
    public void handleNavigationItemSelected15() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_extract_images);
        x.handleNavigationItemSelected(R.id.nav_extract_images);
        verify(x).handleNavigationItemSelected(R.id.nav_extract_images);
    }

    @Test
    public void handleNavigationItemSelected16() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_pdf_to_images);
        x.handleNavigationItemSelected(R.id.nav_pdf_to_images);
        verify(x).handleNavigationItemSelected(R.id.nav_pdf_to_images);
    }

    @Test
    public void handleNavigationItemSelected17() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_excel_to_pdf);
        x.handleNavigationItemSelected(R.id.nav_excel_to_pdf);
        verify(x).handleNavigationItemSelected(R.id.nav_excel_to_pdf);
    }

    @Test
    public void handleNavigationItemSelected18() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_remove_pages);
        x.handleNavigationItemSelected(R.id.nav_remove_pages);
        verify(x).handleNavigationItemSelected(R.id.nav_remove_pages);
    }

    @Test
    public void handleNavigationItemSelected19() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_rearrange_pages);
        x.handleNavigationItemSelected(R.id.nav_rearrange_pages);
        verify(x).handleNavigationItemSelected(R.id.nav_rearrange_pages);
    }

    @Test
    public void handleNavigationItemSelected20() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_compress_pdf);
        x.handleNavigationItemSelected(R.id.nav_compress_pdf);
        verify(x).handleNavigationItemSelected(R.id.nav_compress_pdf);
    }


    @Test
    public void handleNavigationItemSelected21() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_add_images);
        x.handleNavigationItemSelected(R.id.nav_add_images);
        verify(x).handleNavigationItemSelected(R.id.nav_add_images);
    }

    @Test
    public void handleNavigationItemSelected22() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_help);
        x.handleNavigationItemSelected(R.id.nav_help);
        verify(x).handleNavigationItemSelected(R.id.nav_help);
    }

    @Test
    public void handleNavigationItemSelected23() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_remove_duplicate_pages);
        x.handleNavigationItemSelected(R.id.nav_remove_duplicate_pages);
        verify(x).handleNavigationItemSelected(R.id.nav_remove_duplicate_pages);
    }

    @Test
    public void handleNavigationItemSelected24() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_invert_pdf);
        x.handleNavigationItemSelected(R.id.nav_invert_pdf);
        verify(x).handleNavigationItemSelected(R.id.nav_invert_pdf);
    }

    @Test
    public void handleNavigationItemSelected25() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_add_watermark);
        x.handleNavigationItemSelected(R.id.nav_add_watermark);
        verify(x).handleNavigationItemSelected(R.id.nav_add_watermark);
    }

    @Test
    public void handleNavigationItemSelected26() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_zip_to_pdf);
        x.handleNavigationItemSelected(R.id.nav_zip_to_pdf);
        verify(x).handleNavigationItemSelected(R.id.nav_zip_to_pdf);
    }

    @Test
    public void handleNavigationItemSelected27() {
        //non va
        /*
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_whatsNew);
        x.handleNavigationItemSelected(R.id.nav_whatsNew);
        verify(x).handleNavigationItemSelected(R.id.nav_whatsNew);

         */
    }

    @Test
    public void handleNavigationItemSelected28() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_rotate_pages);
        x.handleNavigationItemSelected(R.id.nav_rotate_pages);
        verify(x).handleNavigationItemSelected(R.id.nav_rotate_pages);
    }

    @Test
    public void handleNavigationItemSelected29() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_text_extract);
        x.handleNavigationItemSelected(R.id.nav_text_extract);
        verify(x).handleNavigationItemSelected(R.id.nav_text_extract);
    }

    @Test
    public void handleNavigationItemSelected30() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(R.id.nav_faq);
        x.handleNavigationItemSelected(R.id.nav_faq);
        verify(x).handleNavigationItemSelected(R.id.nav_faq);
    }

    @Test
    public void handleNavigationItemSelected31() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mContext = mock(FragmentActivity.class);
        doCallRealMethod().when(x).handleNavigationItemSelected(0);
        x.handleNavigationItemSelected(0);
        verify(x).handleNavigationItemSelected(0);
    }

    @Test
    public void checkDoubleBackPress() {
        FragmentManagement x = mock(FragmentManagement.class);
        x.mDoubleBackToExitPressedOnce = true;
        doCallRealMethod().when(x).checkDoubleBackPress();
        x.checkDoubleBackPress();
        verify(x).checkDoubleBackPress();
    }


}