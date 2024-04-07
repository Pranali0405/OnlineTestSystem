
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
  
class Calci extends JFrame {
    double firstbutton,secondbutton,res;
String op;
   JButton jButton1;
     JButton jButton10;
     JButton jButton11;
     JButton jButton12;
     JButton jButton13;
     JButton jButton14;
     JButton jButton15;
     JButton jButton2;
     JButton jButton3;
     JButton jButton4;
     JButton jButton5;
     JButton jButton6;
     JButton jButton7;
     JButton jButton8;
     JButton jButton9;
     JTextField jTextField1;
     Label label1;
     Label label2;
    /** Creates new form calcy */
    public Calci() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     void initComponents() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jTextField1 = new JTextField();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        label1 = new Label();
        label2 = new Label();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("1");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jButton10.setText("0");
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
                clickingOnAnyButton(evt);
            }
        });

        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton11.setText("+");
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("-");
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("*");
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("/");
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("=");
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        label1.setFont(new Font("Serif", 1, 14)); // NOI18N
        label1.setText("Operators");

        label2.setText("Basic Calculator");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton10)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton8)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton9))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton13)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton11)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton12))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton15)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(label2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(label2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton15))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

     void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

     void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

     void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

     void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

     void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

     void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

     void jButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

     void jButton9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

     void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

     void jTextField1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

     void clickingOnAnyButton(ActionEvent evt) {//GEN-FIRST:event_clickingOnAnyButton
jTextField1.setText(evt.getActionCommand());


    }//GEN-LAST:event_clickingOnAnyButton

     void jButton11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
op="+";
firstbutton= Double.parseDouble(jTextField1.getText());
jTextField1.setText("");

    }//GEN-LAST:event_jButton11ActionPerformed

     void jButton15ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
secondbutton=Double.parseDouble(jTextField1.getText());
if(op=="+"){
    jTextField1.setText(Double.toString(res));
    res=firstbutton+secondbutton;
}
else if(op=="-"){
    
        res=firstbutton-secondbutton;
        jTextField1.setText(Double.toString(res));
}

else if(op=="*"){
    
        res=firstbutton*secondbutton;
        jTextField1.setText(Double.toString(res));
}

else if(op=="/"){
    
        res=firstbutton/secondbutton;
        jTextField1.setText(Double.toString(res));
}
System.out.println(res);
jTextField1.setText(String.valueOf(res));




    }//GEN-LAST:event_jButton15ActionPerformed

     void jButton12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
op="-";
firstbutton=Double.parseDouble(jTextField1.getText());
jTextField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

     void jButton13ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
op="*";
firstbutton=Double.parseDouble(jTextField1.getText());
jTextField1.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

     void jButton14ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
op="/";
firstbutton=Double.parseDouble(jTextField1.getText());
jTextField1.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calci().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
  
    // End of variables declaration//GEN-END:variables
}
