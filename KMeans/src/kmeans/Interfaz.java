/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        num(jtfNPuntos);
        getContentPane().setBackground(new Color(204, 255, 204));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new Grafica();
        p2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jblNClases = new javax.swing.JLabel();
        jcbClases = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtfNPuntos = new javax.swing.JTextField();
        btnAleat = new javax.swing.JButton();
        btnMan = new javax.swing.JButton();
        btnGenPunt = new javax.swing.JButton();
        lblTit = new javax.swing.JLabel();
        lbliterAct = new javax.swing.JLabel();
        lblItAct = new javax.swing.JLabel();
        lblIterTot = new javax.swing.JLabel();
        lblItTot = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        lblGenP = new javax.swing.JLabel();
        lblForma = new javax.swing.JLabel();
        btnLimpia = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();

        textArea1.setEditable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );
        p1.addMouseListener(new MouseAdapter(){
           public void mousePressed(MouseEvent evt){
             jPanel1MousePressed(evt);
           }
         });


        p2.setBackground(new java.awt.Color(204, 255, 204));

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        btnInicio.setEnabled(false);
        jblNClases.setText("Clases #k: ");

        jcbClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClasesActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntos a generar");

        btnAleat.setText("Aleatorio");
        btnAleat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatActionPerformed(evt);
            }
        });
        btnAleat.setEnabled(false);

        btnMan.setText("Manual");
        btnMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManActionPerformed(evt);
            }
        });
        btnMan.setEnabled(false);

        btnGenPunt.setText("Generar Puntos");
        btnGenPunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenPuntActionPerformed(evt);
            }
        });

        lblTit.setText("Datos para el algoritmo KMeans");

        lbliterAct.setText("Numero de clases: ");

        lblItAct.setText("None");

        lblIterTot.setText("Iteraciones Totales: ");

        lblItTot.setText("None");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.setEnabled(false);
        lblGenP.setText("Los atractores se generan ");

        lblForma.setText("Aleatoriamente");

        btnLimpia.setText("Limpiar");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });
        btnLimpia.setEnabled(false);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jblNClases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbClases, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTit)
                        .addGap(211, 211, 211))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenPunt)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnLimpia)))
                        .addGap(69, 69, 69)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(btnAleat)
                                .addGap(18, 18, 18)
                                .addComponent(btnMan))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(lblGenP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblForma)))
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p2Layout.createSequentialGroup()
                                        .addComponent(lbliterAct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblItAct))
                                    .addGroup(p2Layout.createSequentialGroup()
                                        .addComponent(lblIterTot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblItTot)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevo)
                                .addGap(52, 52, 52))))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnInicio)
                        .addGap(68, 68, 68)))
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblTit)
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNClases)
                        .addComponent(jcbClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbliterAct)
                        .addComponent(lblItAct))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenPunt)
                            .addComponent(btnAleat)
                            .addComponent(btnMan))
                        .addGap(9, 9, 9)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGenP)
                                .addComponent(lblForma))
                            .addComponent(btnLimpia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInicio))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIterTot)
                            .addComponent(lblItTot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void num(JTextField a){
      a.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e){
          char c = e.getKeyChar();
          if (!Character.isDigit(c) && c != '.') {
            e.consume();
          }
          if(c == '.' && jtfNPuntos.getText().contains(".")){
            e.consume();
          }
        }
      });
    }

    public static void limpiaAtractores(Graphics g){
      if(atractores.isEmpty()){
        System.out.println("No hay nada que Limpiar");
      }else{
        System.out.println("Limpriando elementos");
        Point aux;
        int xaux, yaux;
        //g.setColor(Color.white);
        //p1.setBackground(Color.WHITE);
        //graficaPuntos( p1.getGraphics());
        Point paux;
        int xa, ya;
        for(int i = 0; i<atractores.size(); i++){
            paux = atractores.get(i);
            g.setColor(Color.WHITE);
            xa = (int)paux.getX();
            ya = (int)paux.getY();
            g.drawRect(xa, ya, 8, 8);
            g.fillRect(xa, ya, 8, 8);
        }
      }

      //clearRect(int x, int y, int width, int height)


    }


    private void generaAtractoresAleat(){
      limpiaAtractores(p1.getGraphics());
      Random random = new Random();
      int x = p1.getWidth();
      int y = p1.getHeight();
      int xN, yN;
      atractores = new ArrayList<Point>();
      int contar  = jcbClases.getItemCount();
      if(contar>0)
        k = Integer.parseInt(jcbClases.getSelectedItem().toString());

      for(int i = 0; i<k; i++){
        xN =  random.nextInt(x);
        yN = random.nextInt(y);
        // System.out.println("X: "+xN +" Y: " + yN);
        Point p = new Point(xN,yN);
        //xP.add(xN);
        //yP.add(yN);
        atractores.add(p);
      }
      System.out.println("Tamanio ATRACTORES: "+atractores.size());
      generaColoresAleat();
      pintaAtractores(p1.getGraphics());
    }

    private void generaColoresAleat(){
      Random random = new Random();
      colores = new ArrayList<Color>();
      int r,g,b;
      Color aux;
      for(int i = 0; i<k ; i++){
        r = random.nextInt(255);
        g = random.nextInt(255);
        b = random.nextInt(255);
        aux = new Color(r,g,b);
        colores.add(aux);
      }

      //pintaYa = true;
    }

    public static void pintaAtractores(Graphics g){
      //g.setColor(Color.BLACK);
      Point paux;
      int xa, ya;
      for(int i = 0; i<atractores.size(); i++){
        paux = atractores.get(i);
        xa = (int)paux.getX();
        ya = (int)paux.getY();
        g.setColor(Color.BLACK);
        g.drawRect(xa, ya, 8, 8);
        g.setColor(colores.get(i));
        g.fillRect(xa, ya, 8, 8);
      }
    }

    private void colocarK(){
        System.out.println("Generando K");
        if(numPuntos<50000){
          for(int i = 1; i<numPuntos; i++){
            jcbClases.addItem(i+1+"");
          }
        }else{
          for(int i = 1; i<50000; i++){
            jcbClases.addItem(i+1+"");
          }
        }

    }
    private void crearPuntosLog(){
      Random random = new Random();
      puntos = new ArrayList<Point>();
      xP = new ArrayList<Integer>();
      yP = new ArrayList<Integer>();
      int x = p1.getWidth();
      int y = p1.getHeight();
      int xN, yN;
      System.out.println("Tamanio: "+x+","+y);
      for(int i = 0; i<numPuntos; i++){
        xN =  random.nextInt(x);
        yN = random.nextInt(y);
        // System.out.println("X: "+xN +" Y: " + yN);
        Point p = new Point(xN,yN);
        xP.add(xN);
        yP.add(yN);
        puntos.add(p);
      }
      System.out.println("SIZE COMP: "+xP.size());
      System.out.println("SIZE COMP: "+yP.size());
    }

    public void graficaPuntos(Graphics g){
      System.out.println("Graficando puntos: "+xP.size());

      g.setColor(Color.BLACK);

      if(xP.size()<230000){
        for(int i = 0; i<xP.size(); i++){
          g.drawOval(xP.get(i), yP.get(i), 4, 4);
          //g.setColor(colores.get(cP.get(i)));
          g.fillOval(xP.get(i), yP.get(i), 4, 4);
        }
      }else{
        for(int i = 0; i<230000; i++){
          g.drawOval(xP.get(i), yP.get(i), 4, 4);
          //g.setColor(colores.get(cP.get(i)));
          g.fillOval(xP.get(i), yP.get(i), 4, 4);
        }
      }
    }

    private void addColores(){
      Random random = new Random();
      colores = new ArrayList<Color>();
      int r,g,b;
      Color aux;
      for(int i = colores.size(); i<=k; i++){
        System.out.println("yes");
        r = random.nextInt(255);
        g = random.nextInt(255);
        b = random.nextInt(255);
        aux = new Color(r,g,b);
        colores.add(aux);
      }
      for(Color c: colores){
          System.out.print(c);
      }
    }

    private void jPanel1MousePressed(MouseEvent evt){
    //CREAR LIENZO

      if(esAleat){
          JOptionPane.showMessageDialog(null, "Los atractores se generan ALEATORIAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
      }else{
        Graphics g = p1.getGraphics();
        if(atractores.size()+1<=  Integer.parseInt(jcbClases.getSelectedItem().toString())){
          System.out.println("ATRACTORESsize: "+atractores.size());
          System.out.println("jcbClases: "+jcbClases.getSelectedItem().toString());
          g.setColor(Color.BLACK);
          g.drawRect(evt.getX(), evt.getY(), 6, 6);
          g.setColor(colores.get(comPuntos));
          g.fillRect(evt.getX(), evt.getY(), 6, 6);
          Point p = new Point(evt.getX(), evt.getY());
          atractores.add(p);
          comPuntos+=1;
              //System.out.println("numPuntos "+comPuntos);
          if(comPuntos==Integer.parseInt(jcbClases.getSelectedItem().toString()) ){
            btnInicio.setEnabled(true);
          }
        }else{
          JOptionPane.showMessageDialog(null, "Ya se han puesto todos los atractores", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    //puntos.append("\n");
    }
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        System.out.println("INICANDO ALGORITMO");
        btnLimpia.setEnabled(false);
        paneles = new ArrayList<JPanel>();
        paneles.add(p1);
        jcbClases.setEnabled(false);
        //btnLimpia.setEnabled(false);
        btnAleat.setEnabled(false);
        btnMan.setEnabled(false);
        btnInicio.setEnabled(false);
        //btnLimpia.setEnabled(false);
        lblItAct.setText(""+k);
        kmeans = new KMeans(xP, yP, atractores, colores);
        kmeans.algortimoKmeans();




    }//GEN-LAST:event_btnInicioActionPerformed

    private void jcbClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClasesActionPerformed
        // TODO add your handling code here:
        int contar  = jcbClases.getItemCount();
        System.out.println("Contar: "+contar);
        if(esAleat && contar>0){
            System.out.println("Contar 1: "+contar);
            generaAtractoresAleat();
        }else{
            if(contar>0){
               k = Integer.parseInt(jcbClases.getSelectedItem().toString());
            }

            limpiaAtractores(p1.getGraphics());
            comPuntos = 0;
            atractores.clear();
            btnInicio.setEnabled(false);
            generaColoresAleat();
        }
        // if (contar>0) {
        //   k = Integer.parseInt(jcbClases.getSelectedItem().toString());
        //   System.out.println("Se ha cambiado K..."+k);
        // }else{
        //   System.out.println("Elmento vacio");
        // }

    }//GEN-LAST:event_jcbClasesActionPerformed


    private void btnAleatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatActionPerformed
        // TODO add your handling code here:
        btnMan.setEnabled(true);
        btnAleat.setEnabled(false);
        lblForma.setText("Aleatoriamente");
        btnInicio.setEnabled(true);
        esAleat = true;
        numPuntos = 0;
    }//GEN-LAST:event_btnAleatActionPerformed

    private void btnManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManActionPerformed
        // TODO add your handling code here:
        btnMan.setEnabled(false);
        btnAleat.setEnabled(true);
        lblForma.setText("Manualmente");
        btnInicio.setEnabled(false);
        esAleat = false;
        limpiaAtractores(p1.getGraphics());
        atractores.clear();
        System.out.println("actual "+atractores.size());

    }//GEN-LAST:event_btnManActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpia();

        btnNuevo.setEnabled(false);
        lblItTot.setText("None");
        lblItAct.setText("None");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGenPuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenPuntActionPerformed
        // TODO add your handling code here:
      //  String cad = jtfNPuntos.getText();
        //boolean isNumeric =  str.matches("[+-]?\\d*(\\.\\d+)?");

        if(jtfNPuntos.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Escriba el numero de puntos a generar", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
          btnAleat.setEnabled(false);
          btnInicio.setEnabled(true);
          btnMan.setEnabled(true);
          btnLimpia.setEnabled(true);
          numPuntos = Integer.parseInt(jtfNPuntos.getText());
          btnGenPunt.setEnabled(false);
          jtfNPuntos.setEnabled(false);
          jcbClases.setEnabled(true);
          crearPuntosLog();

          Graphics g1 = p1.getGraphics();
          graficaPuntos(g1);
          colocarK();
        }

    }//GEN-LAST:event_btnGenPuntActionPerformed

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
        // TODO add your handling code here:
        limpia();
    }//GEN-LAST:event_btnLimpiaActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
      contadorP-=1;
      if(contadorP<paneles.size()){
        btnSiguiente.setEnabled(true);
      }
      if(contadorP==0){
        btnAnterior.setEnabled(false);
      }else{
        btnAnterior.setEnabled(true);
      }
      lblItAct.setText(""+contadorP);
      paneles.get(contadorP).setVisible(true);
      //this.add(paneles.get(contadorP));
    }

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
        contadorP+=1;
        if(contadorP>0){
          btnAnterior.setEnabled(true);
        }
        if(contadorP==(paneles.size()-1)){
          btnSiguiente.setEnabled(false);
        }else{
          btnSiguiente.setEnabled(true);
        }
        lblItAct.setText(""+contadorP);
        paneles.get(contadorP).setVisible(true);
        //this.add(paneles.get(contadorP));


    }


    public void limpia(){
        p1.setBackground(Color.WHITE);
        p1.paint(p1.getGraphics());
        limpiaAtractores(p1.getGraphics());
        btnGenPunt.setEnabled(true);
        btnAleat.setEnabled(false);
        btnMan.setEnabled(false);
        btnInicio.setEnabled(false);
        btnLimpia.setEnabled(false);
        jcbClases.removeAllItems();
        jtfNPuntos.setText("");
        jtfNPuntos.setEnabled(true);
        textArea1.setText("");

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleat;
    public static javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnGenPunt;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JButton btnMan;
    public static javax.swing.JButton btnNuevo;
    public static javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jblNClases;
    private javax.swing.JComboBox<String> jcbClases;
    private javax.swing.JTextField jtfNPuntos;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblGenP;
    public static javax.swing.JLabel lblItAct;
    public static javax.swing.JLabel lblItTot;
    private javax.swing.JLabel lblIterTot;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lbliterAct;
    public static javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private boolean esAleat = true;
    private boolean pintaYa = false;
    private int k, numPuntos, comPuntos=0;
    public static int contadorP;
    public static ArrayList<Point> puntos;
    public static ArrayList<Point> atractores = new ArrayList<Point>();
    public static ArrayList<Integer> xP, yP;
    public static ArrayList<Color> colores;
    public static ArrayList<JPanel> paneles;
    public KMeans kmeans;
    public static java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}