package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpecificData {
/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Aranacak Datayı Giriniz:");
    String arananData = scanner.next();
    System.out.println(getData(arananData));




}

public static String getData(String data) {

    String donecek ="";
    Sheet sheet =null;
    try {
        String path = "src/test/java/ApachePOI/Resources/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        sheet = workbook.getSheetAt(0);
    } catch (Exception e) {
    }
    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
        if(sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(data)){
            for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    donecek += sheet.getRow(i).getCell(j)+" ";
            }
        }
    }


    return donecek;
}
}
