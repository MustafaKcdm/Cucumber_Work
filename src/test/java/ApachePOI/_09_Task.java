package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static Utilities.ExcelUtility.getData;

public class _09_Task {
    /**
     * Kullanıcıdan istediği kolon sayısını aldıktan sonra
     * aşağıdaki excelin 2.Sheet inden istediği kadar kolon miktarını alarak
     * bir fonksyonda ArrayListe çevirerek mainden yazdırınız
     * src/test/java/ApachePOI/resources/ApacheExcel2.xlsx
     */
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";
        String sheetName = "testCitizen";

        Scanner scanner = new Scanner(System.in);
        System.out.print("İstenilen Kolon Syısını Giriniz:");
        int kolonSayisi = scanner.nextInt();
        ArrayList<ArrayList<String>> donensonuc = getData(kolonSayisi, path, sheetName);
        System.out.println("sonuc: " + donensonuc);


    }
}

