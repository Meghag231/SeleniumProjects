package com;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excelprgm 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 FileInputStream fis=new FileInputStream("C:\\selenium3rd\\book1.xlsx");
	     Workbook book=WorkbookFactory.create(fis);
	     Sheet sh=book.getSheet("sheet3");
	     DataFormatter format=new DataFormatter();
	     String value=format.formatCellValue(sh.getRow(0).getCell(1));
	     System.out.println(value);
	     String value1=format.formatCellValue(sh.getRow(1).getCell(0));
	     System.out.println(value1);
		 Excelprgm ex=new Excelprgm();
		 int rowcount=sh.getLastRowNum();
		 short lastcell=sh.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<rowcount;i++)
		 {
			 Row row=sh.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			 {
				
				 String str=format.formatCellValue(row.getCell(j));
				 System.out.print(str);
			 }
			System.out.println(ex);
		 }
		
	}
}