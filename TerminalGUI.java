
package terminal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class TerminalGUI extends JFrame implements ActionListener, KeyListener {
    JMenuBar menu;
    JMenu options;
    JMenuItem changeCalc;
    JPanel titleContainer,footerContainer;
    JTextField fieldN1,fieldN2;
    JLabel title;    
    Font generalFont = new Font("Calibri",0,15);
    PanelContainer OpContainer = new PanelContainer();
    
    public TerminalGUI(){
        this.setSize(1080,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setResizable(false);
        this.add(OpContainer.operationsContainer,BorderLayout.CENTER); 
        
        title = new JLabel("Calculadora simple y más");  
        title.setFont(new Font("Calibri",Font.BOLD,30));
        
        titleContainer = new JPanel();
        titleContainer.add(title);
        this.add(titleContainer,BorderLayout.NORTH);
              

        
        changeCalc = new JMenuItem("Calculadora clásica");
        changeCalc.addActionListener(this);
        changeCalc.setFont(generalFont); 

        options = new JMenu("Cambiar Calculadora");
        options.addActionListener(this);
        options.add(changeCalc);
        options.setFont(generalFont);
        
        menu = new JMenuBar();
        menu.setFont(generalFont);
        menu.add(options);
        this.setJMenuBar(menu);
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
        
        
    
  
    
}
