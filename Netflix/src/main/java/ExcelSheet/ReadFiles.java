package ExcelSheet;
import base.MainAPI;
import excelutility.XlsxExcelReader;
import reporting.TestLogger;
import java.io.IOException;
public class ReadFiles extends MainAPI {
    XlsxExcelReader er = new XlsxExcelReader();
    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = "Q:\\WebAutomationGroup11\\Netflix.com\\src\\main\\java\\ExcelSheet\\Movies.xlsx";
        String[] data = er.fileReader2(path, 0);
        return data;
    }
}
