package swati4star.createpdf.fragment;


import com.dd.morphingbutton.MorphingButton;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import swati4star.createpdf.util.MorphButtonUtility;

public class MergeFilesFragmentTest {

    @Test
    public void onItemClick() {
        MergeFilesFragment x = Mockito.mock(MergeFilesFragment.class);
        int position = 0;
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        x.mFilePaths = new ArrayList<>();
        x.mFilePaths.add("ciao");
        Mockito.doNothing().when(x).setPassword();
        x.onItemClick(position);
    }

    @Test
    public void onItemClick2() {
        MergeFilesFragment x = Mockito.mock(MergeFilesFragment.class);
        int position = 1;
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        x.mFilePaths = new ArrayList<>();
        x.mFilePaths.add("ciao");
        x.onItemClick(position);
    }

    @Test
    public void setMorphingButtonState() {
        Boolean enable = true;
        MergeFilesFragment x = Mockito.mock(MergeFilesFragment.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        x.mergeBtn = Mockito.mock(MorphingButton.class);
        Mockito.when(x.mMorphButtonUtility.integer()).thenReturn(2);
        int y = x.mMorphButtonUtility.integer();
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        Mockito.doCallRealMethod().when(x).setMorphingButtonState(enable);
        Mockito.doNothing().when(x.mMorphButtonUtility).morphToSquare(x.mergeBtn, y);
        Mockito.doNothing().when(x.mergeBtn).setEnabled(enable);
        x.setMorphingButtonState(enable);
        Mockito.verify(x, Mockito.times(1)).setMorphingButtonState(enable);
    }

    @Test
    public void setMorphingButtonState2() {
        Boolean enable = false;
        MergeFilesFragment x = Mockito.mock(MergeFilesFragment.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        x.mergeBtn = Mockito.mock(MorphingButton.class);
        Mockito.when(x.mMorphButtonUtility.integer()).thenReturn(2);
        int y = x.mMorphButtonUtility.integer();
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        Mockito.doCallRealMethod().when(x).setMorphingButtonState(enable);
        Mockito.doNothing().when(x.mMorphButtonUtility).morphToGrey(x.mergeBtn, y);
        Mockito.doNothing().when(x.mergeBtn).setEnabled(enable);
        x.setMorphingButtonState(enable);
        Mockito.verify(x, Mockito.times(1)).setMorphingButtonState(enable);
    }




}