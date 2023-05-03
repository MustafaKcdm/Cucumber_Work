package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInExcel {
    public static void main(String[] args) throws IOException {
        //önce okuma modunda açılış yapılır
        String path = "src/test/java/ApachePOI/Resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        //hafızada işlem yap

        Row yeniSatir = sheet.createRow(0);
        Cell yeniHucre = yeniSatir.createCell(0);
        yeniHucre.setCellValue("Data");

        //sıra kaydetmeye geldi, yazma moduna geç

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Yazma İşlemi Yapıldı");
    }
}
