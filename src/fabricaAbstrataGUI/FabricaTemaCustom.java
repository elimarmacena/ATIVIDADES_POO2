package fabricaAbstrataGUI;

import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elmr
 */
public class FabricaTemaCustom extends FabricaAbstrataBotoes {
    public JButton criaBotaoOK() {
        JButton ok = new ButtonOK();
        ok.setText("OK");
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new ButtonCancel();
        cancel.setText("Cancel");
        return cancel;
    }
}
