package burp.menu;

import burp.IHttpRequestResponse;
import burp.ui.FastJsonUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FastjsonJNDIMenu extends JMenuItem {
    public FastjsonJNDIMenu(IHttpRequestResponse[] responses) {
        this.setText("^_^ FastJson JNDI Check");
        this.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new FastJsonUI().CheckJNDIVul(responses);
                    }
                });
                thread.start();

            }
        });
    }
}
