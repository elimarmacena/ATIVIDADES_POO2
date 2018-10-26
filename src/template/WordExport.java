/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**
 *
 * @author elmr
 */
public class WordExport  extends AbsExportFiles{
    private XWPFDocument document;
    private FileOutputStream out1 = null;

    public WordExport(){
        try {
            String current = new java.io.File(".").getCanonicalPath();
            out1 = new FileOutputStream(new File(current + "\\src\\" + "word.docx"));
            document = new XWPFDocument();
            //Blank Document
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void printLine(String output) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(output);
    }

    @Override
    public void save() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void export(String output) {
        String[] txtLinhas = output.split("\n");
        for(Object linhas : txtLinhas )
        {
            this.printLine((String)linhas);
        }   
        this.save();
    }


}
