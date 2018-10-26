/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;



/**
 *
 * @author elmr
 */
public abstract class AbsExportFiles {
    
    
    public abstract void printLine(String output);
    public abstract void save();
    public abstract void export(String output);
    public void cicleExport(String output){
        this.export(output);
        this.save();
    }
    
}
