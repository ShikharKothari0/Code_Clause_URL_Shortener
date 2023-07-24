/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeclause_url.shortener.project;

import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class CodeClause_URLShortenerProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        ShortenerWindow url=new ShortenerWindow();
        url.setVisible(true);
    }
    
}
