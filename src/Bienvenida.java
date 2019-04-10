import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Bienvenida extends JFrame implements ActionListener
{  
    protected JMenuBar mb;
    protected JMenu menuOpciones,menuCalcular,menuAcercaDe,menuResultados;
    protected JMenuItem miCalculo,miGlobal,r2011,r2012,r2013,r2014,r2015,r2016,r2017,r2018,r2019,
            miElCreador,miSalir,miNuevo,miTodos,miLoto,agregar;
    protected JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
                   labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    protected JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    protected JComboBox comboDepartamento,comboAntiguedad;
    protected JScrollPane scrollpane1,scrollpane2; 
    public JTextArea textarea1,textarea2;
    
    

    public Bienvenida() {
     
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("SORTEOS LOTO");
   //   getContentPane().setBackground(new Color(255,255,255));
      setIconImage(new ImageIcon(getClass().getResource("images/logo_loto.png")).getImage());
    //icono
      iniciarComponentes();
    }
    private void iniciarComponentes()
    {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
      // setLayout(null);
      mb = new JMenuBar();
      mb.setBackground(new Color(60, 199, 45));
      setJMenuBar(mb); 
//menubar
      menuOpciones = new JMenu("Consultar");
      menuOpciones.setBackground(new Color(255, 255, 255));
      menuOpciones.setFont(new Font("Andale Mono", 1, 14));
      menuOpciones.setForeground(new Color(250, 250, 50));
      mb.add(menuOpciones);
      
      //1. opciones del menu bar
      menuResultados = new JMenu("Resultados");
      menuResultados.setFont(new Font("Andale Mono", 1, 14));
      menuResultados.setForeground(new Color(0, 0, 0));
      menuOpciones.add(menuResultados);
//1.1 sub menu bar de la primera opcion
     
      r2011 = new JMenuItem("2011"); //1.1.1
      r2011.setFont(new Font("Andale Mono", 1, 14));
      r2011.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2011);
      r2011.addActionListener(this);

      r2012 = new JMenuItem("2012"); //1.1.2
      r2012.setFont(new Font("Andale Mono", 1, 14));
      r2012.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2012);
      r2012.addActionListener(this);
      
      r2013 = new JMenuItem("2013"); //1.1.3
      r2013.setFont(new Font("Andale Mono", 1, 14));
      r2013.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2013);
      r2013.addActionListener(this);

      r2014 = new JMenuItem("2014"); //1.1.4
      r2014.setFont(new Font("Andale Mono", 1, 14));
      r2014.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2014);
      r2014.addActionListener(this);
      
      r2015 = new JMenuItem("2015");
      r2015.setFont(new Font("Andale Mono", 1, 14));
      r2015.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2015);
      r2015.addActionListener(this);
      
      r2016 = new JMenuItem("2016");
      r2016.setFont(new Font("Andale Mono", 1, 14));
      r2016.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2016);
      r2016.addActionListener(this);
      
      r2017 = new JMenuItem("2017");
      r2017.setFont(new Font("Andale Mono", 1, 14));
      r2017.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2017);
      r2017.addActionListener(this);
      
      r2018 = new JMenuItem("2018"); //1.1.8
      r2018.setFont(new Font("Andale Mono", 1, 14));
      r2018.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2018);
      r2018.addActionListener(this);
      
      r2019 = new JMenuItem("2019"); //1.1.8
      r2019.setFont(new Font("Andale Mono", 1, 14));
      r2019.setForeground(new Color(131, 107, 229));
      menuResultados.add(r2019);
      r2019.addActionListener(this);
//sub opciones del sub menu bar
      
      miGlobal = new JMenuItem("Global");
      miGlobal.setFont(new Font("Andale Mono", 1, 14));
      miGlobal.setForeground(new Color(0, 0, 0));
      menuOpciones.add(miGlobal);
      miGlobal.addActionListener(this);
//1.2 Sub menu bar segunda opcion de la primera    
  
//1.3 Sub menu bar tercera opcion de la primera

      miSalir = new JMenuItem("Salir");
      miSalir.setFont(new Font("Andale Mono", 1, 14));
      miSalir.setForeground(new Color(0, 0, 0));
      menuOpciones.add(miSalir);
      miSalir.addActionListener(this);
//1.4 Sub menu bar cuarta opcion de la primera

//2. Opcion del menu bar
      menuCalcular = new JMenu("Predecir");
      menuCalcular.setBackground(new Color(255, 255, 255));
      menuCalcular.setFont(new Font("Andale Mono", 1, 14));
      menuCalcular.setForeground(new Color(250, 250, 50));
      mb.add(menuCalcular);
   //2.1  
      miTodos = new JMenuItem("Todos los sorteos");
      miTodos.setFont(new Font("Andale Mono", 1, 14));
      miTodos.setForeground(new Color(0, 0, 0));
      menuCalcular.add(miTodos);
      miTodos.addActionListener(this);
   //2.2   
      miLoto = new JMenuItem("Loto");
      miLoto.setFont(new Font("Andale Mono", 1, 14));
      miLoto.setForeground(new Color(0, 0, 0));
      menuCalcular.add(miLoto);
      miLoto.addActionListener(this);

//3. Opcion del menu bar
      menuAcercaDe = new JMenu("Acerca de");
      menuAcercaDe.setBackground(new Color(255, 255, 255));
      menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
      menuAcercaDe.setForeground(new Color(250, 250, 50));
      mb.add(menuAcercaDe);
  //3.1
      miElCreador = new JMenuItem("El creador");
      miElCreador.setFont(new Font("Andale Mono", 1, 14));
      miElCreador.setForeground(new Color(0, 0, 0));
      menuAcercaDe.add(miElCreador);
      miElCreador.addActionListener(this);
  //3.2
      agregar = new JMenuItem("Administrador/Resultados");
      agregar.setFont(new Font("Andale Mono", 1, 14));
      agregar.setForeground(new Color(0,0,0));
      menuAcercaDe.add(agregar);
      agregar.addActionListener(this);

      labelResultado = new JLabel("Resultado de Consulta:");
      labelResultado.setOpaque(true);
      labelResultado.setBounds(168, 24, 310, 25);
      labelResultado.setBackground(new Color(0,0,0)); 
      labelResultado.setFont(new Font("Tahoma", 30, 30));
      labelResultado.setForeground(new Color(244, 244, 244));
      add(labelResultado);

      textarea1 = new JTextArea();
      textarea1.setEditable(false);
      textarea1.setBackground(new Color(224,224, 100));
      textarea1.setFont(new Font("Italic", 1, 16));
      textarea1.setForeground(new Color(0, 0, 0));
      scrollpane1 = new JScrollPane(textarea1);
      scrollpane1.setBounds(95,50,455,185);
      add(scrollpane1); 
      
      textarea2 = new JTextArea();
      textarea2.setEditable(false);
      textarea2.setBackground(new Color(224, 224, 224));
      textarea2.setFont(new Font("Italic", 1, 16));
      textarea2.setForeground(new Color(0, 0, 0));
      scrollpane2 = new JScrollPane(textarea2);
      scrollpane2.setBounds(95,250,455,185);
      add(scrollpane2); 
      

      labelfooter = new JLabel("©2018 Felipe Mendoza | All Right Reserved");
      labelfooter.setBounds(195,445,500,30);
      labelfooter.setFont(new java.awt.Font("Arial Narrow", 1, 14));
      labelfooter.setForeground(new java.awt.Color(255, 255, 255));
      add(labelfooter);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        LeeFichero resultados = new LeeFichero();
     
        if (e.getSource() == r2011) 
        {
            Loto2011 l1 = new Loto2011(resultados.leertexto("sorteos2011.txt"));
           
            textarea1.setText("\n Patrón 2011 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l1.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l1.numeros+"\n\nNumeros Faltantes: "+l1.nfaltantes+
                    "\n\n Cantidad ▲: "+l1.getMayor()+"\n Cantidad ▼: "+l1.getMenor());
            
            textarea2.setText("\n Resultados 2011 || N°Total Resultado\n\n"+Arrays.toString(l1.recorrer())+l1.toString());
          
        }
      
        if (e.getSource() == r2012) 
        {
            Loto2012 l2 = new Loto2012(resultados.leertexto("sorteos2012.txt"));
            textarea1.setText("\n Patrón 2012 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l2.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l2.numeros+"\n\nNumeros Faltantes: "+l2.nfaltantes+
                    "\n\n Cantidad ▲: "+l2.getMayor()+"\n Cantidad ▼: "+l2.getMenor());
            
            textarea2.setText("\n Resultados 2012 || N°Total Resultado\n\n"+Arrays.toString(l2.recorrer())+l2.toString());
          
        }
        
           if (e.getSource() == r2013) 
        {
            Loto2013 l3 = new Loto2013(resultados.leertexto("sorteos2013.txt"));
            textarea1.setText("\n Patrón 2013 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l3.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l3.numeros+"\n\nNumeros Faltantes: "+l3.nfaltantes+
                    "\n\n Cantidad ▲: "+l3.getMayor()+"\n Cantidad ▼: "+l3.getMenor());
            
            textarea2.setText("\n Resultados 2013 || N°Total Resultado\n\n"+Arrays.toString(l3.recorrer())+l3.toString());
          
        }
           
              if (e.getSource() == r2014) 
        {
            Loto2014 l4 = new Loto2014(resultados.leertexto("sorteos2014.txt"));
            textarea1.setText("\n Patrón 2014 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l4.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l4.numeros+"\n\nNumeros Faltantes: "+l4.nfaltantes+
                    "\n\n Cantidad ▲: "+l4.getMayor()+"\n Cantidad ▼: "+l4.getMenor());
            
            textarea2.setText("\n Resultados 2014|| N°Total Resultado\n\n"+Arrays.toString(l4.recorrer())+l4.toString());
          
        }
              
            if (e.getSource() == r2015) 
        {
            Loto2015 l5 = new Loto2015(resultados.leertexto("sorteos2015.txt"));
            textarea1.setText("\n Patrón 2015 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l5.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l5.numeros+"\n\nNumeros Faltantes: "+l5.nfaltantes+
                    "\n\n Cantidad ▲: "+l5.getMayor()+"\n Cantidad ▼: "+l5.getMenor());
            
            textarea2.setText("\n Resultados 2015 || N°Total Resultado\n\n"+Arrays.toString(l5.recorrer())+l5.toString());
          
        }     
        
           if (e.getSource() == r2016) 
        {
            Loto2016 l6 = new Loto2016(resultados.leertexto("sorteos2016.txt"));
            textarea1.setText("\n Patrón 2016 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l6.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l6.numeros+"\n\nNumeros Faltantes: "+l6.nfaltantes+
                    "\n\n Cantidad ▲: "+l6.getMayor()+"\n Cantidad ▼: "+l6.getMenor());
            
            textarea2.setText("\n Resultados 2016 || N°Total Resultado\n\n"+Arrays.toString(l6.recorrer())+l6.toString());
          
        }
           
        if (e.getSource() == r2017) 
        {
            Loto2017 l7 = new Loto2017(resultados.leertexto("sorteos2017.txt"));
            textarea1.setText("\n Patrón 2017 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l7.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l7.numeros+"\n\nNumeros Faltantes: "+l7.nfaltantes+
                    "\n\n Cantidad ▲: "+l7.getMayor()+"\n Cantidad ▼: "+l7.getMenor());
            
            textarea2.setText("\n Resultados 2017 || N°Total Resultado\n\n"+Arrays.toString(l7.recorrer())+l7.toString());
        }
        if (e.getSource() == r2018) 
        {
            Loto2018 l8 = new Loto2018(resultados.leertexto("sorteos2018.txt"));
            textarea1.setText("\n Patrón 2018 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l8.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l8.numeros+"\n\nNumeros Faltantes: "+l8.nfaltantes+
                    "\n\n Cantidad ▲: "+l8.getMayor()+"\n Cantidad ▼: "+l8.getMenor());
            
            textarea2.setText("\n Resultados 2018 || N°Total Resultado\n\n"+Arrays.toString(l8.recorrer())+l8.toString());
        }
        if (e.getSource() == r2019) 
        {
            Loto2018 l9 = new Loto2018(resultados.leertexto("sorteos2019.txt"));
            textarea1.setText("\n Patrón 2019 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(l9.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+l9.numeros+"\n\nNumeros Faltantes: "+l9.nfaltantes+
                    "\n\n Cantidad ▲: "+l9.getMayor()+"\n Cantidad ▼: "+l9.getMenor());
            
            textarea2.setText("\n Resultados 2019 || N°Total Resultado\n\n"+Arrays.toString(l9.recorrer())+l9.toString());
        }
        if (e.getSource() == miGlobal) 
        {         
            LotoGlobal lg = new LotoGlobal(resultados.leertexto("sorteos2011.txt"),resultados.leertexto("sorteos2012.txt"),resultados.leertexto("sorteos2013.txt"),resultados.leertexto("sorteos2014.txt"),resultados.leertexto("sorteos2015.txt"),resultados.leertexto("sorteos2016.txt"),resultados.leertexto("sorteos2017.txt"),resultados.leertexto("sorteos2018.txt"),resultados.leertexto("sorteos2019.txt"));
            textarea1.setText("\n\n Patrón 2011-2019 || ▲ Arriba ▼Abajo\n Orden de Lectura >>>\n\n"+Arrays.toString(lg.MayorMenor())+
                    "\n\n Antescedentes del número Ganador\n"+lg.numeros+"\n\nNumeros Faltantes: "+lg.nfaltantes+
                    "\n\n Cantidad ▲: "+lg.getMayor()+"\n Cantidad ▼: "+lg.getMenor());
            
            textarea2.setText("\n Resultados 2011-2019 || N°Total Resultado\n\n"+Arrays.toString(lg.recorrer())+lg.toString());
        }

        if (e.getSource() == miSalir)
        {
   	   System.exit(0);
	}
        
        if(e.getSource() == miTodos)
        {
            PredecirResultados pr = new PredecirResultados();
            textarea1.setText(pr.funcion_aleatoria_loto());
            textarea2.setText(" ¡Todos los Sorteos!");
        }
        
        if(e.getSource() == miLoto)
        {
            PredecirResultados pr = new PredecirResultados();
           textarea1.setText(pr.loto_exacta());
            textarea2.setText(" ¡Loto!");
        }

        if (e.getSource() == miElCreador){

            JOptionPane.showMessageDialog(null,"Desarrollado por Felipe Antonio Mendoza 19 \nVersion 3.0");
        }
        if (e.getSource() == agregar){

   	    Administrador admin = new Administrador();
            admin.setBounds(0,0,350,450);
            admin.add(new ClaseAdaptada());
            admin.setVisible(true);
            admin.setResizable(false);
            admin.setLocationRelativeTo(null);
            this.setVisible(false);
	}
    }

    public static void main(String args[]) {      
        Bienvenida ventanaPrincipal = new Bienvenida();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.add(new ClaseAdaptada());
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);  
    } 
}
