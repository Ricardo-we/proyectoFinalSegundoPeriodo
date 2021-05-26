
package terminal;
    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Font;
    import java.awt.event.*;
    import javax.swing.*;
public class PanelContainer implements ActionListener{
    
    private JButton sumar,restar,multiplicar,dividir,residuo,borrar;
    public JPanel operationsContainer;
    private JLabel space1,space2;
    private JTextField fieldN1,fieldN2; 
    private JLabel showResult;
    Font generalFont = new Font("Calibri",0,15);
    
    public PanelContainer(){
        operationsContainer = new JPanel();
        this.operationsContainer.setLayout(null);
        
        fieldN1 = new JTextField();
        space1 = new JLabel("Ingresa el primer operando:");
        space1.setBounds(190,150,250,50);
        space1.setFont(new Font("Calibri",1,17));
        fieldN1.setBounds(400,160,250,30);
        fieldN1.setFont(generalFont);
        operationsContainer.add(fieldN1);
        operationsContainer.add(space1);
        
        fieldN2 = new JTextField();
        space2 = new JLabel("Ingresa el segundo operando:");
        space2.setBounds(190,200,250,50);
        space2.setFont(new Font("Calibri",1,17));
        fieldN2.setBounds(400,210,250,30);
        fieldN2.setFont(generalFont);
        operationsContainer.add(fieldN2);
        operationsContainer.add(space2);
        
        
        sumar = new JButton("Sumar");
        sumar.setBounds(250,500,100,20);
        sumar.addActionListener(this);
        sumar.setFont(generalFont);
        operationsContainer.add(sumar);
        
        restar = new JButton("Restar");
        restar.setBounds(250,480,100,20);
        restar.addActionListener(this);
        restar.setFont(generalFont);
        operationsContainer.add(restar);     
        
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(450,500,101,20);
        multiplicar.addActionListener(this);
        multiplicar.setFont(generalFont);
        operationsContainer.add(multiplicar);
        
        dividir = new JButton("Dividir");
        dividir.setBounds(450,480,101,20);
        dividir.addActionListener(this);
        dividir.setFont(generalFont);
        operationsContainer.add(dividir);
        
        residuo = new JButton("Residuo");
        residuo.setBounds(650,480,100,20);
        residuo.addActionListener(this);
        residuo.setFont(generalFont);
        operationsContainer.add(residuo);
        
        borrar = new JButton("Borrar");
        borrar.setBounds(650,500,100,20);
        borrar.addActionListener(this);
        borrar.setFont(generalFont);
        operationsContainer.add(borrar);
        
        showResult = new JLabel("El resultado es: ");
        showResult.setFont(new Font("Calibri",1,17));
        showResult.setBounds(300,600,200,20);
        operationsContainer.add(showResult);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == sumar ){
           String number1 = fieldN1.getText().toString();
           String number2 = fieldN2.getText().toString();
           
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);
           double result =  aritmeticaSimple.suma2(num1, num2);
           showResult.setText("El resultado es: " + result);
        }
        
        if( e.getSource() == restar){
           String number1 = fieldN1.getText().toString();
           String number2 = fieldN2.getText().toString();
           
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);
           double result = aritmeticaSimple.resta2(num1, num2);
           showResult.setText("El resultado es: " + result);
        }
        
        if( e.getSource() == multiplicar){
           String number1 = fieldN1.getText().toString();
           String number2 = fieldN2.getText().toString();
           
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);
           double result = aritmeticaSimple.multiplicacion2(num1, num2);
           showResult.setText("El resultado es: " + result);
        }
        
        if( e.getSource() == dividir){
           String number1 = fieldN1.getText().toString();
           String number2 = fieldN2.getText().toString();
           
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);
           double result = aritmeticaSimple.division2(num1, num2);
           showResult.setText("El resultado es: " + result);
        }
        
        if( e.getSource() == residuo){
           String number1 = fieldN1.getText().toString();
           String number2 = fieldN2.getText().toString();
           
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);
           double result = aritmeticaSimple.residuo2(num1, num2);
           showResult.setText("El resultado es: " + result);
        }
        
        if( e.getSource() == borrar){
            fieldN1.setText("");
            fieldN2.setText("");
        }

    }
}
