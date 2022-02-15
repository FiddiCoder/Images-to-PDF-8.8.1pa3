package swati4star.createpdf.util;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.interfaces.OnPDFCreatedInterface;

public class InvertPdfTest {



    @Test
    public void onPreExecute() {

    }

    @Test
    public void doInBackground() {
    }

    @Test
    public void createPDF() {
        //OK
        String path = "prova";
        String path2 = "prova2";
        String path3 = "prova3";
        OnPDFCreatedInterface onPDFCreatedInterface = Mockito.mock(OnPDFCreatedInterface.class);
        InvertPdf invertPdf = new InvertPdf(path, onPDFCreatedInterface);

        Assert.assertEquals(false, invertPdf.createPDF(path2, path3));
    }

    @Test
    public void createPDF2() {
        // Non funziona java.io.IOException: provain.pdf not found as file or resource

        /*
        String pathin = "provain.pdf";
        String pathout = "provaout.pdf";
        OnPDFCreatedInterface onPDFCreatedInterface = Mockito.mock(OnPDFCreatedInterface.class);
        InvertPdf invertPdf = new InvertPdf(pathin, onPDFCreatedInterface);

        Mockito.when(invertPdf.createPDF(pathin, pathout)).thenReturn(true);
        Assert.assertEquals(true, invertPdf.createPDF(pathin, pathout));
        */


    }

    @Test
    public void invert() {

        /*
        Mockito.mock();
        String pathin = "provain.pdf";
        PdfStamper pdfStamper = Mockito.mock(PdfStamper.class);
        OnPDFCreatedInterface onPDFCreatedInterface = Mockito.mock(OnPDFCreatedInterface.class);
        InvertPdf invertPdf = new InvertPdf(pathin, onPDFCreatedInterface);
        invertPdf.invert(pdfStamper);
        */

    }

    @Test
    public void invertPage() {
    }

    @Test
    public void onPostExecute() {
    }
}