package swati4star.createpdf.util;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.support.design.widget.BottomSheetBehavior;
import android.widget.RelativeLayout;

import com.airbnb.lottie.LottieAnimationView;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class CommonCodeUtilsTest {

    @Test
    public void populateUtil() {
        CommonCodeUtils x = Mockito.mock(CommonCodeUtils.class);
        RelativeLayout layout = Mockito.mock(RelativeLayout.class);
        LottieAnimationView animationView = Mockito.mock(LottieAnimationView.class);
        ArrayList<String> paths = new ArrayList<>();
        Mockito.doCallRealMethod().when(x).populateUtil(null, paths, null, layout, animationView, null);
        x.populateUtil(null, paths, null, layout, animationView, null);
        verify(x).populateUtil(null, paths, null, layout, animationView, null);
    }


    @Test
    public void updateView() {
    }


    @Test
    public void checkSheetBehaviourUtil() {
        BottomSheetBehavior bottomSheetBehavior = Mockito.mock(BottomSheetBehavior.class);
        assertEquals(false, new CommonCodeUtils().checkSheetBehaviourUtil(bottomSheetBehavior));
    }

    @Test
    public void checkSheetBehaviourUtil2() {
        BottomSheetBehavior bottomSheetBehavior = Mockito.mock(BottomSheetBehavior.class);
        Mockito.when(bottomSheetBehavior.getState()).thenReturn(3);
        assertEquals(true, new CommonCodeUtils().checkSheetBehaviourUtil(bottomSheetBehavior));
    }

    @Test
    public void fillNavigationItemsMap() {
        CommonCodeUtils x = Mockito.mock(CommonCodeUtils.class);
        Mockito.doCallRealMethod().when(x).fillNavigationItemsMap(true);
        x.fillNavigationItemsMap(true);
        verify(x).fillNavigationItemsMap(true);
    }

    @Test
    public void fillNavigationItemsMap2() {
        CommonCodeUtils x = Mockito.mock(CommonCodeUtils.class);
        Mockito.doCallRealMethod().when(x).fillNavigationItemsMap(false);
        x.fillNavigationItemsMap(false);
        verify(x).fillNavigationItemsMap(false);
    }



    @Test
    public void closeBottomSheetUtil() {
        CommonCodeUtils x = Mockito.mock(CommonCodeUtils.class);
        BottomSheetBehavior bottomSheetBehavior = Mockito.mock(BottomSheetBehavior.class);
        doCallRealMethod().when(x).closeBottomSheetUtil(bottomSheetBehavior);
        x.closeBottomSheetUtil(bottomSheetBehavior);
        verify(x).closeBottomSheetUtil(bottomSheetBehavior);
    }

    @Test
    public void closeBottomSheetUtil2() {
        CommonCodeUtils x = Mockito.mock(CommonCodeUtils.class);
        BottomSheetBehavior bottomSheetBehavior = Mockito.mock(BottomSheetBehavior.class);
        when(x.checkSheetBehaviourUtil(bottomSheetBehavior)).thenReturn(true);
        doCallRealMethod().when(x).closeBottomSheetUtil(bottomSheetBehavior);
        x.closeBottomSheetUtil(bottomSheetBehavior);
        verify(x).closeBottomSheetUtil(bottomSheetBehavior);
    }
}