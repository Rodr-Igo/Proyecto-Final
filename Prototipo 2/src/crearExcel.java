import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.FileOutputStream;
import java.io.*;
/**
 * Created by Anton on 4/11/2017.
 */

public class crearExcel {
    public static void Crear(File Lista) {
        try {
            int i,j;
            if(!Lista.exists()) {
                HSSFWorkbook libro = new HSSFWorkbook();
                HSSFSheet hoja = libro.createSheet("Lista");
                HSSFRow linea = hoja.createRow(0);

                HSSFCell celda = linea.createCell(0);
                celda.setCellValue("numero de alumnos");
                HSSFCell nda = linea.createCell(1);
                nda.setCellValue(0);
                HSSFRow lineaDatos = hoja.createRow(1);
                for (i = 0; i <= 10; i++)
                {
                    HSSFCell dato = lineaDatos.createCell(i);
                    if (i == 0)
                    {

                        dato.setCellValue("Nombre");
                    }
                        if (i == 1)
                        {
                        dato.setCellValue("Matricula");
                    }
                        if(i>1)
                        {

                        dato.setCellValue("clase " + i);
                        }


            }
            libro.write(new FileOutputStream("Lista.xls"));
            libro.close();}
        } catch (Exception e) {
        }
    }

   /* public static void Modificar()
    {
        try {
            File file = new File"C:\\update.xls");
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell = null;

            //Update the value of cell
            cell = sheet.getRow(1).getCell(2);
            cell.setCellValue(cell.getNumericCellValue() * 2);
            cell = sheet.getRow(2).getCell(2);
            cell.setCellValue(cell.getNumericCellValue() * 2);
            cell = sheet.getRow(3).getCell(2);
            cell.setCellValue(cell.getNumericCellValue() * 2);

            file.close();

            FileOutputStream outFile =new FileOutputStream(new File("C:\\update.xls"));
            workbook.write(outFile);
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}