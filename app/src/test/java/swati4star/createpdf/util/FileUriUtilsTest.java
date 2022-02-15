package swati4star.createpdf.util;

import static org.junit.Assert.assertTrue;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FileUriUtilsTest {



    
    
    @Test
    public void isWhatsappImage() {
        FileUriUtils fileUriUtils = new FileUriUtils();
        String uriTest = "com.whatsapp.provider.media";
        boolean val = fileUriUtils.isWhatsappImage(uriTest);
        assertTrue("Deve essere true", val);
    }

    @Test
    public void checkURIAuthority() {
        FileUriUtils fileUriUtils = new FileUriUtils();
        String provaCheck = "prova";
        Uri uri = Mockito.mock(Uri.class);
        Mockito.when(uri.getAuthority()).thenReturn("prova");
        Boolean val = fileUriUtils.checkURIAuthority(uri, provaCheck);
        assertTrue("Deve essere true", val);

    }

    @Test
    public void checkURI() {
    }

    @Test
    public void isDocumentUri() {
        //vero vero
        FileUriUtils fileUriUtils = new FileUriUtils();
        String provaCheck = "prova";
        Uri uri = Mockito.mock(Uri.class);
        Mockito.when(uri.getAuthority()).thenReturn("prova");
        Context context = Mockito.mock(Context.class);
        boolean ret = false;
        ret = DocumentsContract.isDocumentUri(context, uri);
        Assert.assertEquals(fileUriUtils.isDocumentUri(context, uri), ret);

    }


    @Test
    public void isDocumentUri2() {
        // caso vera falsa
        FileUriUtils fileUriUtils = new FileUriUtils();
        Uri uri = null;
        Context context = Mockito.mock(Context.class);
        boolean ret = false;
        Assert.assertEquals(fileUriUtils.isDocumentUri(context, uri), ret);
    }

    @Test
    public void isDocumentUri3() {
        // caso falsa vera
        FileUriUtils fileUriUtils = new FileUriUtils();
        Uri uri = Mockito.mock(Uri.class);
        Context context = null;
        boolean ret = false;
        Assert.assertEquals(fileUriUtils.isDocumentUri(context, uri), ret);
    }

    @Test
    public void isDocumentUri4() {
        // caso falsa falsa
        FileUriUtils fileUriUtils = new FileUriUtils();
        Uri uri = null;
        Context context = null;
        boolean ret = false;
        Assert.assertEquals(fileUriUtils.isDocumentUri(context, uri), ret);
    }

    @Test
    public void getURIForMediaDoc() {
      /*  Uri uri = Mockito.mock(Uri.class);
        FileUriUtils fileUriUtils = new FileUriUtils();
        String documentId =   */
    }

    @Test
    public void getURIForDownloadDoc() {
    }

    @Test
    public void getURIForExternalstorageDoc() {
        /*
        FileUriUtils fileUriUtils = new FileUriUtils();
        Uri uri = Mockito.mock(Uri.class);
       // DocumentsContract documentsContract = Mockito.mock(DocumentsContract.class);
        Mockito.when(DocumentsContract.getDocumentId(uri)).thenReturn("12345");
        String documentId = DocumentsContract.getDocumentId(uri);
        String[] idArray = documentId.split(":");
        String type = idArray[0];
        String realDocId = idArray[1];

         */
    }

    @Test
    public void getUriForDocumentUri() {
    }

    @Test
    public void getUriRealPathAboveKitkat() {
    }

    @Test
    public void getImageRealPath() {

    }

    @Test
    public void getFilePath() {
        FileUriUtils fileUriUtils = new FileUriUtils();
        Uri uri = Mockito.mock(Uri.class);
        Mockito.when(uri.getPath()).thenReturn(null);
        Assert.assertEquals(null, fileUriUtils.getFilePath(uri));
    }

    @Test
    public void getFilePath2() {
        FileUriUtils fileUriUtils = new FileUriUtils();
        Uri uri = Mockito.mock(Uri.class);
        Mockito.when(uri.getPath()).thenReturn("prova.pdf");
        String path = uri.getPath();
        path = path.replace("/document/raw:", "");
        Assert.assertEquals(fileUriUtils.getFilePath(uri), path);

    }

}