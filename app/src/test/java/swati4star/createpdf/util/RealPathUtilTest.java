package swati4star.createpdf.util;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.net.Uri;

import org.junit.Test;

public class RealPathUtilTest {

    @Test
    public void isDriveFile() {
        RealPathUtil x = mock(RealPathUtil.class);
        Uri uri = mock(Uri.class);
        doCallRealMethod().when(x).isDriveFile(uri);
        x.isDriveFile(uri);
        verify(x).isDriveFile(uri);
    }

    @Test
    public void isDriveFile2() {
        RealPathUtil x = mock(RealPathUtil.class);
        Uri uri = mock(Uri.class);
        doCallRealMethod().when(x).isDriveFile(uri);
        when(uri.getAuthority()).thenReturn("com.google.android.apps.docs.storage");
        x.isDriveFile(uri);
        verify(x).isDriveFile(uri);
    }
}