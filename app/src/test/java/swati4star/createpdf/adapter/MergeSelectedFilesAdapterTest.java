package swati4star.createpdf.adapter;


import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

public class MergeSelectedFilesAdapterTest {

    @Mock
    MergeSelectedFilesAdapter x;

    @Test
    public void getItemCount() {
        MockitoAnnotations.initMocks(this);
        x.mFilePaths = null;
        Mockito.doCallRealMethod().when(x).getItemCount();
        x.getItemCount();
        Mockito.verify(x).getItemCount();
    }

    @Test
    public void getItemCount2() {
        MockitoAnnotations.initMocks(this);
        x.mFilePaths = new ArrayList<>();
        x.mFilePaths.add("prova");
        Mockito.doCallRealMethod().when(x).getItemCount();
        x.getItemCount();
        Mockito.verify(x).getItemCount();
    }


}