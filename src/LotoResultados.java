
import java.io.*;
import java.util.*;

class Loto2011
{
   int [] loto; 
   int menor,mayor,total;
   int ceros,unos,dos,tres,cuatros,cincos,seis,sietes,ochos,nueves;
   ArrayList<String> numeros = new ArrayList<>();
   ArrayList<Integer> faltantes = new ArrayList<>();
   ArrayList<String> nfaltantes = new ArrayList<>();
   
   
   Loto2011(int loto[])
   {
       this.loto = loto;
       
      
    menor=mayor=total=0;
    ceros=unos=dos=tres=cuatros=cincos=seis=sietes=ochos=nueves=0;
  } 

    public ArrayList<String> getNumeros() {
        return numeros;
    }
     public ArrayList<Integer> getFaltantes() {
        return faltantes;
    }
      
    public ArrayList<String> getNfaltantes() {
        return nfaltantes;
    }

   public int[] getloto()
   {
       return loto;
   }
    public int getMenor() {
        return menor;
    }

    public int getMayor() {
        return mayor;
    }

    public int getTotal() {
        return total;
    }

    public int getCeros() {
        return ceros;
    }

    public int getUnos() {
        return unos;
    }

    public int getDos() {
        return dos;
    }

    public int getTres() {
        return tres;
    }

    public int getCuatros() {
        return cuatros;
    }

    public int getCincos() {
        return cincos;
    }

    public int getSeis() {
        return seis;
    }

    public int getSietes() {
        return sietes;
    }

    public int getOchos() {
        return ochos;
    }

    public int getNueves() {
        return nueves;
    }
   
   
 public String[] MayorMenor() //En un arreglo lleno los datos del archivo 
 {
   String [] lotocopy = new String[loto.length-1];
      //modificando el 17-02
   boolean aver = false;
        
   for(int i =0;i<loto.length-1;i++)
   {
      if(loto[i] >= 0 && loto[i] <= 49)
      {
        menor++;
        if(i %30 == 0)
        {
          if(loto[i] == loto[loto.length-2]) //Cuando coincida con el numero ganador
          {
              lotocopy[i] = " \n▼ {"+Integer.toString(loto[i])+"WIN}";
              numeros.add(" \n < "+Integer.toString(loto[i-1])+", {"+Integer.toString(loto[i])+"WIN}, "+"> "+Integer.toString(loto[i+1]));
              faltantes.add(loto[i-1]);
              faltantes.add(loto[i+1]);
         
          }
          else
            lotocopy[i] = " \n▼ "+Integer.toString(loto[i]);
        }
        else
        {
            if(loto[i] == loto[loto.length-2])
            {
                lotocopy[i] = " ▼ {"+Integer.toString(loto[i])+"WIN}";
                numeros.add(" \n < "+Integer.toString(loto[i-1])+", {"+Integer.toString(loto[i])+"WIN}, "+"> "+Integer.toString(loto[i+1]));
               faltantes.add(loto[i-1]);
              faltantes.add(loto[i+1]);
         
             }
            else
              lotocopy[i] = " ▼ "+Integer.toString(loto[i]);
        }
      }
      else  //Maayor/menor 
      {
        mayor++;
         if(i %30 == 0) 
         {
             if(loto[i] == loto[loto.length-2])
             {
               lotocopy[i] = " \n▲ {"+Integer.toString(loto[i])+"WIN}";
               numeros.add(" \n < "+Integer.toString(loto[i-1])+", {"+Integer.toString(loto[i])+"WIN}, "+"> "+Integer.toString(loto[i+1]));
               faltantes.add(loto[i-1]);
              faltantes.add(loto[i+1]);
         
             }
             else
               lotocopy[i] = " \n▲ "+Integer.toString(loto[i]);
         }
        else
         {   if(loto[i] == loto[loto.length-2])
             {
               lotocopy[i] = " ▲ {"+Integer.toString(loto[i])+"WIN}";
               numeros.add(" \n < "+Integer.toString(loto[i-1])+", {"+Integer.toString(loto[i])+"WIN}, "+"> "+Integer.toString(loto[i+1]));
               faltantes.add(loto[i-1]);
              faltantes.add(loto[i+1]);
         
             }
             else
               lotocopy[i] = " ▲ "+Integer.toString(loto[i]);
         }
      }
      if(loto[i] >= 0 && loto[i] <= 9)
          ceros++;
       if(loto[i] >= 10 && loto[i] <= 19)
          unos++;
        if(loto[i] >= 20 && loto[i] <= 29)
           dos++;
         if(loto[i] >= 30 && loto[i] <= 39)
             tres++;
          if(loto[i] >= 40 && loto[i] <= 49)
             cuatros++;
           if(loto[i] >= 50 && loto[i] <= 59)
              cincos++;
            if(loto[i] >= 60 && loto[i] <= 69)
               seis++;
             if(loto[i] >= 70 && loto[i] <= 79)
               sietes++;
              if(loto[i] >= 80 && loto[i] <= 89)
                ochos++;
               if(loto[i] >= 90 && loto[i] <= 99)
                  nueves++;	
      total++;
   } 
   for(Integer j=0; j<=99; j++)
   {
       for(int k = 0; k<faltantes.size();k++)
       {
           if(Objects.equals(j, faltantes.get(k)))
           {
               aver = true;
           }   
       }
       
       if(aver == false)
           nfaltantes.add(j.toString());
       
       aver = false;
   }
   
    return lotocopy;
 }
 
  @Override
 public String toString()
 {
   return ("\n Frecuencia de resultados:\n\n Ceros: "+ceros+"\n Unos: "+unos+"\n Dos: "+dos+"\n Tres: "+tres+"\n Cuatros: "+cuatros
   +"\n Cincos: "+cincos+"\n Seis: "+seis+"\n Sietes: "+sietes+"\n Ochos: "+ochos+"\n Nueves: "+nueves
   +"\n\n Total: "+total+" Sorteos");
 }
 
 public String[] recorrer()
 {
     return estadistica(loto,total);
 }
public String[] estadistica(int vector[],int size)//Dos parametros el arreglo y tama¤o
{	
   String lotocopy2[] = new String[(size)];
    int dato,veces=0;
   
   for(int i=0; i<size; i++)
   {
     int j= i;
    dato= vector[i]; //Dato guarda el valor del arreglo

    while((j > 0 ) && (dato < vector[j-1]))
    {
	vector[j]= vector[j-1];//Intercambio de posicion de la izquierda  a la derecha
	j--;//Se le resta  a la posicion para comparar con los de la izquierda
    }

    vector[j]= dato; //Se le asigna el dato que estara ordenado
   }//Cierre for
	
   for(int i=0; i<size; i++)
   {
       if(i>0) //Conteo y lo almaceno en un arreglo de cadenas, estrategicamente
       {
        if(vector[i] == vector[i+1]) 
        {
         lotocopy2[i] = " "+Integer.toString(vector[i])+" ";
         veces++;
        }
       else
       {
         if((vector[i] != vector[i+1]) && ((vector[i] != vector[i-1]) || (vector[i] == vector[i-1])))
         {
             veces++;
             lotocopy2[i] = " "+Integer.toString(vector[i])+"   = Total : "+Integer.toString(veces)+"\n";
             veces = 0;
         }
       }
      }
       else //emergencia error -1
       {
           if(vector[i] == vector[i+1]) 
           {
            lotocopy2[i] = " "+Integer.toString(vector[i])+" ";
            veces++;
          }
          else
          {
         
             veces++;
             lotocopy2[i] = " "+Integer.toString(vector[i])+"   = Total : "+Integer.toString(veces)+"\n";
             veces = 0; 
          }    
       }
   } 
   return lotocopy2;
 }
}

class Loto2012 extends Loto2011
{
    Loto2012(int loto[]) 
    {
        super(loto); 
        /*super.loto = new int[]{};
        */
    }
}

class Loto2013 extends Loto2011
{
    Loto2013(int loto[])
    {
        super(loto);
    }
}

class Loto2014 extends Loto2011
{
    Loto2014(int loto[])
    {
        super(loto);
    }
}

class Loto2015 extends Loto2011
{
    Loto2015(int loto[])
    {
        super(loto);
    }
}

class Loto2016 extends Loto2011
{
    Loto2016(int loto[])
    {
        super(loto);    
    }
}

class Loto2017 extends Loto2011
{
    Loto2017(int loto[])
    {
        super(loto);
        
    }
}

class Loto2018 extends Loto2011
{
    Loto2018(int loto[])
    {
        super(loto);
    }    
}


class Loto2019 extends Loto2011
{
    Loto2019(int loto[])
    {
        super(loto);
    }    
}

class LotoGlobal extends Loto2011
{
   
   
    LotoGlobal(int loto1[],int loto2[],int loto3[],int loto4[],int loto5[],int loto6[],int loto7[],int loto8[], int loto9[])
    {
        super(loto1);
        int tam = ((loto1.length-1) + (loto2.length-1) + (loto3.length-1) + (loto4.length-1) + (loto5.length-1) + (loto6.length-1) + (loto7.length-1) + (loto8.length-1) + (loto9.length));      
        super.loto = new int[tam]; 
        /*
        Array origen
Posición inicial del array origen
Array destino
Posición incial en el array de destino
Numero de elementos a copiar del array origen al array destino*/
        
        int s3 = (loto1.length-1) + (loto2.length-1); //Para unir todos los elementos en el arreglo global
        int s4 = s3+ (loto3.length-1);
        int s5= s4+ (loto4.length-1);
        int s6 = s5+ (loto5.length-1);
        int s7 = s6+ (loto6.length-1);
        int s8 = s7+ (loto7.length-1);
        int s9 = s8+ (loto8.length-1);
        System.arraycopy(loto1, 0, loto, 0, loto1.length-1);
        System.arraycopy(loto2, 0, loto, loto1.length-1 ,loto2.length-1);
        System.arraycopy(loto3, 0, loto, s3, loto3.length-1);
        System.arraycopy(loto4, 0, loto, s4, loto4.length-1);
        System.arraycopy(loto5, 0, loto, s5, loto5.length-1);
        System.arraycopy(loto6, 0, loto, s6, loto6.length-1);
        System.arraycopy(loto7, 0, loto, s7, loto7.length-1);
        System.arraycopy(loto8, 0, loto, s8, loto8.length-1);
        System.arraycopy(loto9, 0, loto, s9, loto9.length);
    }
}

class PredecirResultados //Todos los sorteos de forma aleatoria
{
    public String  funcion_aleatoria_loto()
   {
	int numero;
    //    String [] todos = new String[1];
      
    String todos;
	todos = "\n **Predicciones**\n\n La Grande\n :";
 
	for(int i=1; i<=5; i++)
        {
          numero = (int)(Math.random()*(25-1+1)+1);
	  todos += Integer.toString(numero)+"  ";
         
        }
	
        numero = (int)(Math.random()*(9-0+1)+0);
        todos += "\n Bolita de Oro:  "+Integer.toString(numero)+"\n\n Súper combo\n ";
 
        numero = (int)(Math.random()*(9-0+1)+0);
        todos += " 1 Par: "+Integer.toString(numero);
	 
        numero = (int)(Math.random()*(9-0+1)+0);
        todos += Integer.toString(numero)+" | 2 Par: ";
	
        
        for(int i=1; i<=2; i++)
	{
          numero = (int)(Math.random()*(9-0+1)+0);
          todos += Integer.toString(numero);  
	}

	todos += "\n\n Juega3\n : ";

	for(int i=1; i<=3; i++)
	{
            
          numero = (int)(Math.random()*(9-0+1)+0);
          todos += Integer.toString(numero);
	}

        todos +="\n\n Diaria\n : ";
	for(int i=1; i<=2; i++)
	{
          numero = (int)(Math.random()*(9-0+1)+0);
          todos += Integer.toString(numero);
	}
      return todos;
   }
    
    public String loto_exacta()//Dejando un ultimo digito  y agregando otro
    {
        int numero;
       String todos;
       int cont=0,uno=0,dos=0,tres=0,cuatro=0,cinco=0,seis=0,siete=0,ocho=0,nueve=0,cero=0,result=0;
	do
	{
          numero = (int)(Math.random()*(99-0+1)+0);
          
          if((numero >=10 && numero<=19) && uno ==0) {
              cont++;   uno = 1; 
          }
           if((numero >=20 && numero<=29) && dos ==0){
              cont++;   dos = 1;
          }
            if((numero >=30 && numero<=39) && tres ==0) {
              cont++;   tres = 1;
          }
             if((numero >=40 && numero<=49) && cuatro ==0){
              cont++;   cuatro = 1;
          }
              if((numero >=50 && numero<=59) && cinco ==0){
              cont++;   cinco = 1;
          }
               if((numero >=60 && numero<=69) && seis ==0){
              cont++;   seis = 1;
          }
                if((numero >=70 && numero<=79)&& siete ==0){
              cont++;   siete = 1;
          }
                if((numero >=80 && numero<=89) && ocho ==0){
              cont++;   ocho = 1;
          }
                if((numero >=90 && numero<=99) && nueve ==0){
              cont++;   nueve = 1;
          }
                if((numero >=0 && numero<=9) && cero ==0){
              cont++;   cero = 1;
          }
	}while(cont != 9 );
         
           if( uno ==0) 
              result = 1; 
           if(dos ==0)
              result = 2;
           if(tres ==0)
              result = 3;
           if(cuatro ==0)
              result = 4;
           if(cinco ==0)
              result = 5;
           if(seis ==0)
              result = 6;
           if(siete ==0)
              result = 7;
           if(ocho ==0)
              result = 8;
           if(nueve ==0)
              result = 9;
           if(cero ==0)
              result = 0;
          
           numero = (int)(Math.random()*(9-0+1)+0);
            todos = "\n LOTO || Diaria\n\n Resultado Exacto\n =   "+Integer.toString(result)+Integer.toString(numero);
          
          return todos;   
  }
}

class LeeFichero { //Leyendo los datos del archivo correspondiente
  
    
   public int[] leertexto(String ruta)
   {
      ArrayList<Integer> numeros = new ArrayList<>();    
      InputStreamReader fr = null;
      BufferedReader br;
     
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         InputStream archivo = this.getClass().getResourceAsStream(ruta);    
         fr = new InputStreamReader(archivo);
         br = new BufferedReader(fr);
     
         
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
         {
             numeros.add(Integer.parseInt(linea));
            
         }
      }
      catch(IOException e){
          System.out.println("Error "+e);
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
             e2.printStackTrace();
         }
      }                        
      numeros.add(101);
      
      int [] miarray = new int[numeros.size()];
          for(int i = 0; i < numeros.size(); i++) 
                   miarray[i] = numeros.get( i ); 
      
      return miarray;
   }
}