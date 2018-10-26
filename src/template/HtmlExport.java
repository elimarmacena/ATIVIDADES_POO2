/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elmr
 */
public class HtmlExport extends AbsExportFiles{
    private BufferedWriter out = null;
    
    public HtmlExport(){
        try {
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\" + "index.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            out = new BufferedWriter(fw);
            out.write("<HTML><BODY>");
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void printLine(String output) {
        try {
            out.write("<BR>" + output);
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
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
