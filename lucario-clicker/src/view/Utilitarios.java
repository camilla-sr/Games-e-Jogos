package view;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Utilitarios {
        
    public void inserirIcone(JFrame frm){
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("/lucario chibi.png"));
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
