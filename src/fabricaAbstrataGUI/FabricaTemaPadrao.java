/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstrataGUI;

import javax.swing.JButton;

/**
 *
 * @author elmr
 */
public class FabricaTemaPadrao extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        JButton ok = new JButton();
        ok.setText("OK");
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new JButton();
        cancel.setText("Cancel");
        return cancel;
    }
    
}
