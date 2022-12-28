/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kmeans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.io.*;
import static java.awt.Font.PLAIN;
/**
 *
 * @author tania
 */
public class KMeans {


  private ArrayList<Color> coloresC;
  private ArrayList<Point> puntos, atractoresOld, atractoresNew;
  private ArrayList<Integer> indClasePert, cordX, cordY;
  private ArrayList<Double> distancias;
  private boolean ver = false;
  private int Iteracion = 0;

  public KMeans(ArrayList<Integer> cordX, ArrayList<Integer> cordY,  ArrayList<Point> atractores,  ArrayList<Color> coloresC){
    this.cordX = cordX;
    this.cordY = cordY;
    this.atractoresNew = atractores;
    this.coloresC = coloresC;
    this.atractoresOld = new ArrayList<Point>();
  }
  public Double distancia(int x1, double x2, double y1, double y2){
    //System.out.println("Calculando distancia");
    Double xD, yD;
    xD = Math.pow((x2-x1), 2);
    yD = Math.pow((y2-y1), 2);
    Double dis = Math.sqrt(xD + yD);
    //System.out.println("xD "+xD+" yD "+yD);
    dis = Math.round(dis*100.0)/100.0;
    return dis;
  }

  public void calculaDistancias(){
    distancias = new ArrayList<Double>();
    indClasePert = new ArrayList<Integer>();

    Double d;
    //System.out.println("Calculando distancias");
    for(int i = 0; i < cordX.size(); i++){
      for(int j = 0; j<atractoresNew.size(); j++){
        d = distancia(cordX.get(i), atractoresNew.get(j).getX(),cordY.get(i), atractoresNew.get(j).getY());
        distancias.add(d);
      }
      comparaDist();
      //System.out.println("distancias size "+distancias.size());
      distancias.clear();
    //  System.out.println("distancias size "+distancias.size());
    }
  }

  public void comparaDist(){
    //ArrayList<Integer> indClasePert = new ArrayList<Integer>();
    int indice = 0;
    double aux = distancias.get(0);
    double aux2;
    for(int i=1; i<distancias.size(); i++){
      aux2 = distancias.get(i);
      if(aux2<aux){
        aux = aux2;
        indice = i;
      }
    }
    indClasePert.add(indice);
  }

  public void algortimoKmeans(){
    System.out.println("KMEANS");
    while(!ver){
      calculaDistancias();
      //System.out.println("111111");
      calcNuevoCentroide();
      //System.out.println("2222222");
      comparaCentroides();
      //System.out.println("33333333");
      pintarPuntos();
      //System.out.println("4444444");
      //Interfaz.lblItTot.setText(""+Interfaz.paneles.size());
    }
    System.out.println("PANELES SIZE "+Interfaz.paneles.size());
    //Interfaz.btnAnterior.setEnabled(true);
    //Interfaz.btnSiguiente.setEnabled(false);
    Interfaz.contadorP = Interfaz.paneles.size()-1;
    Interfaz.lblItTot.setText(""+Interfaz.contadorP);
    //Interfaz.lblItAct.setText(""+Interfaz.contadorP);
    Interfaz.btnNuevo.setEnabled(true);
  }

  public void calcNuevoCentroide(){
    atractoresOld = new ArrayList<Point>();
    atractoresOld.addAll(atractoresNew);
    atractoresNew = new ArrayList<Point>();
    // System.out.println("ATRACTORES old");
    // for(Point p: atractoresOld){
    //   System.out.println(p);
    // }
    // System.out.println("ATRACTORES new");
    // for(Point p: atractoresNew){
    //   System.out.println(p);
    // }
    // System.out.println("PRIMEROS");
    int aux;
    int sumaX = 0;
    int sumaY = 0;
    int nuevX = 0;
    int nuevY = 0;
    int cont = 0;
    for(int i = 0; i<atractoresOld.size(); i++){
      aux = i;
      for(int j = 0; j<cordX.size(); j++){
        if(indClasePert.get(j)==aux){
        //  System.out.println("icp: "+indClasePert.get(j)+ " i: "+i+" cordX: "+cordX.get(j)+ " cordY: "+cordY.get(j));
          sumaX += cordX.get(j);
          sumaY += cordY.get(j);
          cont += 1;
        }
      }
      //System.out.println("cont "+cont+" nuevX: "+nuevX+" nuevY"+nuevY);
      if(cont>0){
        nuevX = sumaX/cont;
        nuevY = sumaY/cont;
        System.out.println(nuevX + ","+nuevY);
        Point p = new Point(nuevX, nuevY);
        atractoresNew.add(p);
      }else{
        atractoresNew.add(atractoresOld.get(i));
      }
      // nuevX = 0;
      // nuevY = 0;
      sumaX = 0;
      sumaY = 0;
      cont = 0;
    }
  }
  public void comparaCentroides(){
    int cont = 0;
    double x1,y1,x2,y2;
    for(int i = 0; i<atractoresOld.size(); i++){
      x1 = atractoresOld.get(i).getX();
      x2 = atractoresNew.get(i).getX();
      y1 = atractoresOld.get(i).getY();
      y2 = atractoresNew.get(i).getY();
    //  System.out.println("x1 "+x1+" x2 "+x2+" y1 "+y1+" y2 "+y2);

      if(x1==x2 && y1==y2){
        cont += 1;
        System.out.println("Si es");
      }
    }
  //  System.out.println("COntador "+cont);
    if(cont == atractoresOld.size()){
      ver = true;
      //System.out.println("falso");
    }else{
      ver = false;
      //System.out.println("verdadero");

    }
    System.out.println("verifica "+ver);
  }

  public void pintarPuntos(){
    String texto = "\tATRACTORES old"+"\t\tATRACTORES new\n";

    System.out.println("ATRACTORES old");
    int auxI = 0;
    for(Point p: atractoresOld){
      System.out.println(p);
      Point p2 = atractoresNew.get(auxI);
      //texto+=(p);
      texto+="("+p.getX()+","+p.getY()+")\t\t\t("+p2.getX()+" , "+p2.getY()+")\n";
      auxI++;
    }
    //texto+="\tATRACTORES new\n";
    System.out.println("ATRACTORES new");
    for(Point p: atractoresNew){
      System.out.println(p);
      //texto+=p+"\n";
    }
    Interfaz.textArea1.setText(texto);
    System.out.println("Pintando puntos");
    Graphics g = Interfaz.p1.getGraphics();
    Interfaz.p1.paint(g);
    //g = Interfaz.p1.getGraphics();
    Interfaz.limpiaAtractores(g);
    Interfaz.atractores = atractoresOld;

    if(cordX.size()<230000){
      for(int i = 0; i< cordX.size(); i++){
        g.setColor(coloresC.get(indClasePert.get(i)));
        g.drawOval(cordX.get(i), cordY.get(i), 4,4);
        g.fillOval(cordX.get(i), cordY.get(i), 4, 4);

      }
    }else{
      for(int i = 0; i< 230000; i++){
        g.setColor(coloresC.get(indClasePert.get(i)));
        g.drawOval(cordX.get(i), cordY.get(i), 4,4);
        g.fillOval(cordX.get(i), cordY.get(i), 4, 4);

      }
    }


    JPanel aux = new Grafica();
    aux = Interfaz.p1;
    Interfaz.pintaAtractores(g);
    Interfaz.paneles.add(aux);

    try{
      Thread.sleep(3000);
    }catch(InterruptedException e ) {
      System.out.println("Thread Interrupted");
    }
  }
}
