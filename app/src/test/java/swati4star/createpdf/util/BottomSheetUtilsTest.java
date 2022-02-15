package swati4star.createpdf.util;

import static org.mockito.ArgumentMatchers.anyObject;

import android.support.design.widget.BottomSheetBehavior;

import org.junit.Test;
import org.mockito.Mockito;

public class BottomSheetUtilsTest {

    @Test
    public void showHideSheet() {

        BottomSheetUtils bottomSheetUtils = Mockito.mock(BottomSheetUtils.class);
        BottomSheetBehavior sheetBehavior = Mockito.mock(BottomSheetBehavior.class);
        Mockito.when(sheetBehavior.getState()).thenReturn(3);
        Mockito.doCallRealMethod().when(bottomSheetUtils).showHideSheet(sheetBehavior);
        bottomSheetUtils.showHideSheet(sheetBehavior);
        Mockito.verify(bottomSheetUtils, Mockito.times(1)).showHideSheet(sheetBehavior);

    }

    @Test
    public void showHideSheet2() {

        BottomSheetUtils bottomSheetUtils = Mockito.mock(BottomSheetUtils.class);
        BottomSheetBehavior sheetBehavior = Mockito.mock(BottomSheetBehavior.class);
        Mockito.when(sheetBehavior.getState()).thenReturn(4);
        Mockito.doCallRealMethod().when(bottomSheetUtils).showHideSheet(anyObject());
        bottomSheetUtils.showHideSheet(sheetBehavior);
        Mockito.verify(bottomSheetUtils, Mockito.times(1)).showHideSheet(sheetBehavior);


    }
}