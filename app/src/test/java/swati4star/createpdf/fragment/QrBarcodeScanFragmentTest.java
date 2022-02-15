package swati4star.createpdf.fragment;

import android.view.View;

import com.google.zxing.integration.android.IntentIntegrator;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.R;

public class QrBarcodeScanFragmentTest {

    @Test
    public void onClick() {
        QrBarcodeScanFragment x = Mockito.mock(QrBarcodeScanFragment.class);
        View v = Mockito.mock(View.class);
        Mockito.when(v.getId()).thenReturn(R.id.scan_qrcode);
        Mockito.doCallRealMethod().when(x).onClick(v);
        Mockito.doNothing().when(x).openScanner(IntentIntegrator.QR_CODE_TYPES, R.string.scan_qrcode);
        x.onClick(v);
        Mockito.verify(x).onClick(v);
    }

    @Test
    public void onClick2() {
        QrBarcodeScanFragment x = Mockito.mock(QrBarcodeScanFragment.class);
        View v = Mockito.mock(View.class);
        Mockito.when(v.getId()).thenReturn(R.id.scan_barcode);
        Mockito.doCallRealMethod().when(x).onClick(v);
        Mockito.doNothing().when(x)
                .openScanner(IntentIntegrator.ONE_D_CODE_TYPES, R.string.scan_barcode);
        x.onClick(v);
        Mockito.verify(x).onClick(v);
    }

    @Test
    public void onClick3() {
        QrBarcodeScanFragment x = Mockito.mock(QrBarcodeScanFragment.class);
        View v = Mockito.mock(View.class);
        Mockito.when(v.getId()).thenReturn(143534);
        Mockito.doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        Mockito.verify(x).onClick(v);
    }

}