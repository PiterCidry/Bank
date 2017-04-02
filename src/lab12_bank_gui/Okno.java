/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab12_bank_gui;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import lab10.Bank;
import lab10.BrakPieniedzyException;
import lab10.Konto;
import lab10.Wlasciciel;

/**
 *
 * @author 284099
 */
public class Okno extends javax.swing.JFrame 
{
    private static Bank b1 = new Bank();
    
    public Okno() throws BrakPieniedzyException
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNumer = new javax.swing.JLabel();
        lWlasciciel = new javax.swing.JLabel();
        lSaldo = new javax.swing.JLabel();
        lOperacja = new javax.swing.JLabel();
        lKwota = new javax.swing.JLabel();
        cbNumer = new javax.swing.JComboBox();
        cbOperacja = new javax.swing.JComboBox();
        tWlasciciel = new javax.swing.JTextField();
        tSaldo = new javax.swing.JTextField();
        tKwota = new javax.swing.JTextField();
        buttonWykonaj = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuOdczytaj = new javax.swing.JMenuItem();
        menuZapisz = new javax.swing.JMenuItem();
        menuWyjdz = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNumer.setText("Numer");

        lWlasciciel.setText("Właściciel");

        lSaldo.setText("Saldo");

        lOperacja.setText("Operacja");

        lKwota.setText("Kwota");

        cbNumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumerActionPerformed(evt);
            }
        });

        cbOperacja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wplac", "Wyplac" }));
        cbOperacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOperacjaActionPerformed(evt);
            }
        });

        tWlasciciel.setEditable(false);
        tWlasciciel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tWlascicielActionPerformed(evt);
            }
        });

        tSaldo.setEditable(false);
        tSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSaldoActionPerformed(evt);
            }
        });

        buttonWykonaj.setText("Wykonaj");
        buttonWykonaj.setToolTipText("");
        buttonWykonaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWykonajActionPerformed(evt);
            }
        });

        menu.setText("Plik");

        menuOdczytaj.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOdczytaj.setText("Odczytaj");
        menuOdczytaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOdczytajActionPerformed(evt);
            }
        });
        menu.add(menuOdczytaj);

        menuZapisz.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuZapisz.setText("Zapisz");
        menuZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuZapiszActionPerformed(evt);
            }
        });
        menu.add(menuZapisz);

        menuWyjdz.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuWyjdz.setText("Wyjdz");
        menu.add(menuWyjdz);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lKwota)
                    .addComponent(lNumer)
                    .addComponent(lWlasciciel)
                    .addComponent(lSaldo)
                    .addComponent(lOperacja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tKwota)
                    .addComponent(tSaldo)
                    .addComponent(tWlasciciel)
                    .addComponent(cbNumer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOperacja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonWykonaj)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumer)
                    .addComponent(cbNumer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lWlasciciel)
                    .addComponent(tWlasciciel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSaldo)
                    .addComponent(tSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lOperacja)
                    .addComponent(cbOperacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lKwota)
                    .addComponent(tKwota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(buttonWykonaj)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSaldoActionPerformed

    private void cbOperacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOperacjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOperacjaActionPerformed

    private void menuOdczytajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOdczytajActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION)
    {
        File file = fileChooser.getSelectedFile();
        b1 = (Bank)b1.Odczytaj(file.getPath());
        cbNumer.removeAll();
        for(Konto k : b1.getLista())
        {
            cbNumer.addItem(k.getNumer());
        }
    } 
    else 
    {
        System.out.println("File access cancelled by user.");
    }
    }//GEN-LAST:event_menuOdczytajActionPerformed

    private void buttonWykonajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWykonajActionPerformed
        Konto k = b1.PodajKonto(Long.valueOf(cbNumer.getSelectedItem().toString()));
        switch(cbOperacja.getSelectedItem().toString())
        {
            case "Wplac":
            {
            try 
            {
                k.Wplac(Double.valueOf(tKwota.getText()));
            } catch (Exception ex)
            {
                System.out.println(ex.toString());
            }
            }
            case "Wyplac":
            {
            try 
            {
                k.Wyplac(Double.valueOf(tKwota.getText()));
            } catch (BrakPieniedzyException ex)
            {
                System.out.println(ex.toString());
            }
            }
        tSaldo.setText(Double.valueOf(k.getSaldo()).toString());
        }
    }//GEN-LAST:event_buttonWykonajActionPerformed

    private void tWlascicielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tWlascicielActionPerformed
        
    }//GEN-LAST:event_tWlascicielActionPerformed

    private void cbNumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumerActionPerformed
        Konto k = b1.PodajKonto(Long.valueOf(cbNumer.getSelectedItem().toString()));
        Wlasciciel w = k.getWlasciciel();
        tWlasciciel.setText(w.getNazwa().toString());
        tSaldo.setText(Double.valueOf(k.getSaldo()).toString());
    }//GEN-LAST:event_cbNumerActionPerformed

    private void menuZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuZapiszActionPerformed
        b1.Zapisz("bankGui");
    }//GEN-LAST:event_menuZapiszActionPerformed

    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                try 
                {
                    new Okno().setVisible(true);
                } catch (BrakPieniedzyException ex) 
                {
                    Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonWykonaj;
    private javax.swing.JComboBox cbNumer;
    private javax.swing.JComboBox cbOperacja;
    private javax.swing.JLabel lKwota;
    private javax.swing.JLabel lNumer;
    private javax.swing.JLabel lOperacja;
    private javax.swing.JLabel lSaldo;
    private javax.swing.JLabel lWlasciciel;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuOdczytaj;
    private javax.swing.JMenuItem menuWyjdz;
    private javax.swing.JMenuItem menuZapisz;
    private javax.swing.JTextField tKwota;
    private javax.swing.JTextField tSaldo;
    private javax.swing.JTextField tWlasciciel;
    // End of variables declaration//GEN-END:variables
}
