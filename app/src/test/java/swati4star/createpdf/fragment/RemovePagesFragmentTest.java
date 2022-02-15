package swati4star.createpdf.fragment;


import static swati4star.createpdf.util.Constants.COMPRESS_PDF;
import static swati4star.createpdf.util.Constants.REMOVE_PWd;

import android.widget.EditText;
import android.widget.TextView;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.util.MorphButtonUtility;

public class RemovePagesFragmentTest {

    @Test
    public void resetValues() {
        RemovePagesFragment x = Mockito.mock(RemovePagesFragment.class);
        x.pagesInput = Mockito.mock(EditText.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        x.mInfoText = Mockito.mock(TextView.class);
        x.mOperation = REMOVE_PWd;
        Mockito.doCallRealMethod().when(x).resetValues();
        x.resetValues();
        Mockito.verify(x).resetValues();
    }

    @Test
    public void resetValues2() {
        RemovePagesFragment x = Mockito.mock(RemovePagesFragment.class);
        x.pagesInput = Mockito.mock(EditText.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        x.mInfoText = Mockito.mock(TextView.class);
        x.mOperation = COMPRESS_PDF;
        Mockito.doCallRealMethod().when(x).resetValues();
        x.resetValues();
        Mockito.verify(x).resetValues();
    }

    @Test
    public void resetValues3() {
        RemovePagesFragment x = Mockito.mock(RemovePagesFragment.class);
        x.pagesInput = Mockito.mock(EditText.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        x.mInfoText = Mockito.mock(TextView.class);
        x.mOperation = "ciso";
        Mockito.doCallRealMethod().when(x).resetValues();
        x.resetValues();
        Mockito.verify(x).resetValues();
    }
}