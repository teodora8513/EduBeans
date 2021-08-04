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
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.HtmlBrowser;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "rs.ac.bg.fon.edubeans.action.GitActionListener"
)
@ActionRegistration(
        iconBase = "rs/ac/bg/fon/edubeans/action/icons/git.png",
        displayName = "#CTL_GitActionListener"
)
@ActionReference(path = "Toolbars/File", position = 1200)
@Messages("CTL_GitActionListener=Git")
public final class GitActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            HtmlBrowser.URLDisplayer.getDefault().showURL(new URL("https://github.com/teodora8513/EduBeans"));
        } catch (MalformedURLException ex) {
            ex.getMessage();
        }
    }
}
