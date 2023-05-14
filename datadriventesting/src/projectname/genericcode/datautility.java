package projectname.genericcode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datautility
{
    public String getDataFromProporties(String Key)throws IOException
     {
	    FileInputStream fis = new FileInputStream("C:\\Users\\Sudha\\Desktop\\selenium\\datautility.txt");
	    Properties pdoj = new Properties();
	    pdoj.load(fis);
	    String value = pdoj.getProperty(Key);
	    return value;
     }
    public String getDatafromExcelSheet(String sheetname,int rownum,int cellnum) throws IOException 
     {
	    FileInputStream fis = new FileInputStream("C:\\Users\\Sudha\\Desktop\\Book11.xlsx");
	    Workbook book = WorkbookFactory.create(fis);
	    Sheet sh= book.getSheet(sheetname);
	    DataFormatter format = new DataFormatter();
	    String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	    return value;
     }
}
