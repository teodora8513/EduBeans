/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.edubeans.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.HtmlBrowser;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
    category="File",
    id="rs.ac.bg.fon.edubeans.action.FonActionListener"
)
@ActionRegistration(
    iconBase="rs/ac/bg/fon/edubeans/action/icons/fon1.png",
    displayName="#CTL_FonActionListener"
)
  @ActionReference(path="Toolbars/File", position=1300)
@Messages("CTL_FonActionListener=FON")
public final class FonActionListener implements ActionListener {
    
    @Override public void actionPerformed(ActionEvent e) {
        try {
            HtmlBrowser.URLDisplayer.getDefault().showURL(new URL("http://ai.fon.bg.ac.rs/osnovne/softver-otvorenog-koda/"));
        } catch (MalformedURLException ex) {
            ex.getMessage();
        }
    }
}
