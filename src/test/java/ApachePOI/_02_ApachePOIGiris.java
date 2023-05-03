package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class _02_ApachePOIGiris {
    public static void main(String[] args) throws IOException {
//dosya yolunu değişkene at
        String path ="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";
        //dosya  okuma istemcisine dosya yolunu tanıt
        FileInputStream dosyaOkuma = new FileInputStream(path);
        //dosya okuma istemcisini çalışma kitabına tanıt
        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkuma);
        //istenilen isimdeki çalışmas sayfasını al
        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1");
        //istenilen satırı al
        Row satir = calismaSayfasi.getRow(0);
        //istenilen hücreyi al
        Cell hucre = satir.getCell(0);

        System.out.println(hucre);

    }
}
