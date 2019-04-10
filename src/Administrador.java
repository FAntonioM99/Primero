import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.URL;
/*Clase para la ventana de agregar */
public class Administrador extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JComboBox par1,par2;
  private JLabel label2, label3, label4,label5,label6,label7;
  private JButton boton1,boton2,boton3;
  public static String texto = "felipe";  

  public Administrador(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Usuario Administrador");
   //   getContentPane().setBackground(new Color(255,255,255));
      setIconImage(new ImageIcon(getClass().getResource("images/logo_loto.png")).getImage());
    //icono
      iniciarComponentes();
  }
    
   private void iniciarComponentes() 
   {
    
    JPanel panel = new JPanel();
    this.getContentPane().add(panel);   
 
    label2 = new JLabel("Agregar resultado de Loto");
    label2.setOpaque(true);
    label2.setBounds(60,20,225,30);
    label2.setBackground(new Color(0,0,0)); 
    label2.setFont(new Font("Andale Mono", 3, 18));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su contraseña");
    label3.setOpaque(true);
    label3.setBounds(100,40,128,30);
    label3.setBackground(new Color(0,0,0)); 
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("©2018 08 Felipe Mendoza | All Right Reserved");
    label4.setBounds(45,390,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(45,80,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(255,0,0));
    add(textfield1);

    boton1 = new JButton("Verificar");
    boton1.setBounds(110,120,120,30);
    boton1.setBackground(new Color(255,255,255));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.setForeground(new Color(255,0,0));
    boton1.addActionListener(this);
    add(boton1);
    
     boton2 = new JButton("Regresar <");
    boton2.setBounds(110,320,120,30);
    boton2.setBackground(new Color(255,255,255));
    boton2.setFont(new Font("Andale Mono", 1, 14));
    boton2.setForeground(new Color(255,0,0));
    boton2.addActionListener(this);
    add(boton2);
    
    label5 = new JLabel("Ingrese resultado");
    label5.setOpaque(true);
    label5.setBounds(120,180,100,25);
    label5.setBackground(new Color(0,0,0)); 
    label5.setFont(new Font("Andale Mono", 1, 12));
    label5.setForeground(new Color(255,255,255));
    add(label5);
    label5.setVisible(false);
    
    label6 = new JLabel("< Primer dígito");
    label6.setOpaque(true);
    label6.setBounds(55,220,90,25);
    label6.setBackground(new Color(0,0,0)); 
    label6.setFont(new Font("Andale Mono", 1, 12));
    label6.setForeground(new Color(255,255,255));
    add(label6);
    label6.setVisible(false);
    
    label7 = new JLabel("Segundo dígito >");
    label7.setOpaque(true);
    label7.setBounds(200,220,95,25);
    label7.setBackground(new Color(0,0,0)); 
    label7.setFont(new Font("Andale Mono", 1, 12));
    label7.setForeground(new Color(255,255,255));
    add(label7);
    label7.setVisible(false);
   
    par1 = new JComboBox();
    par1.setBounds(5,220,40,20);
    par1.setBackground(new Color(224,224,224));
    par1.setFont(new Font("Andale Mono", 1, 14));
    par1.setForeground(new Color(255,0,0));
    add(par1);
    par1.setVisible(false);
    par1.addItem("");par1.addItem("0"); par1.addItem("1"); par1.addItem("2"); 
    par1.addItem("3");par1.addItem("4"); par1.addItem("5"); par1.addItem("6");
    par1.addItem("7"); par1.addItem("8"); par1.addItem("9");
   
    par2 = new JComboBox();
    par2.setBounds(300,220,40,20);
    par2.setBackground(new Color(224,224,224));
    par2.setFont(new Font("Andale Mono", 1, 14));
    par2.setForeground(new Color(255,0,0));
    add(par2);
    par2.setVisible(false);
    par2.addItem("");par2.addItem("0"); par2.addItem("1"); par2.addItem("2");
    par2.addItem("3");par2.addItem("4"); par2.addItem("5"); par2.addItem("6"); 
    par2.addItem("7");par2.addItem("8"); par2.addItem("9");
    
    boton3 = new JButton("Agregar +");
    boton3.setBounds(110,260,120,30);
    boton3.setBackground(new Color(255,255,255));
    boton3.setFont(new Font("Andale Mono", 1, 14));
    boton3.setForeground(new Color(255,0,0));
    boton3.addActionListener(this);
    add(boton3);
    boton3.setVisible(false);
  }
   /*Hay que obtener la ruta para encontrar el archivo y agregar */
   private void EscribeFichero(int nuevoloto)
  {
        FileWriter fichero = null;
        PrintWriter pw;
        try
        {  
         /*   File arch = new File("Sorteos2018.txt");
            String ruta = arch.getAbsolutePath();*/
           URL ru = getClass().getProtectionDomain().getCodeSource().getLocation();
            String rut = ru.getFile();
            String ruta =rut.replaceFirst("/build/classes/","/src/sorteos2019.txt");
            fichero = new FileWriter(ruta,true);
            pw = new PrintWriter(fichero);
            String nl = Integer.toString(nuevoloto); 
            pw.println(nl);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
        }
    }

  @Override
   public void actionPerformed(ActionEvent e)
   {
     if(e.getSource() == boton1)
     {
       texto = textfield1.getText().trim();
       if(texto.equals(""))
       {
         JOptionPane.showMessageDialog(null, "Debes ingresar tu contraseña.");
       } 
       else 
       {
          if(texto.equals("felipe")) //pidiendo la clave y activar los elementos
          {
             textfield1.setEnabled(false);
             boton1.setEnabled(false);
             label5.setVisible(true);
             label6.setVisible(true);
             label7.setVisible(true);
             par1.setVisible(true);
             par2.setVisible(true);
             boton3.setVisible(true);
          }
          else
          {
            JOptionPane.showMessageDialog(null, "Contraseña Inválida");
          }
       }
     }   
         
       if(e.getSource() == boton2) 
       {
        Bienvenida ventanaPrincipal = new Bienvenida();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.add(new ClaseAdaptada());
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
       } 
      
       if(e.getSource() == boton3)
       {
           String digito1 = par1.getSelectedItem().toString();
           String digito2 = par2.getSelectedItem().toString();
           
           if(digito1.equals("") || digito2.equals(""))
             JOptionPane.showMessageDialog(null, "Error, seleccionar ambos dígitos"); 
           else
           {
              String nuevoNumero = digito1+digito2;
              int nuevo = Integer.parseInt(nuevoNumero);
              EscribeFichero(nuevo);
              JOptionPane.showMessageDialog(null, "Resultado de loto agregado al 2019\nPresione Regresar\nO ingrese otro resultado");
           }
       }
   }
}