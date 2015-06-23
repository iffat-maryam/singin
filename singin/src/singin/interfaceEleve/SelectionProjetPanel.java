/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singin.interfaceEleve;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import singin.ConsoleBdd;
import singin.DataNotFound;
import singin.Projet;
import singin.ProjetJComboBox;
import singin.User;

/**
 *
 * @author Othmane
 */
public class SelectionProjetPanel extends javax.swing.JPanel {

  private GUIeleve jFrame;
  
  
    /**
     * Creates new form SelectionProjetPanel
     */
    public SelectionProjetPanel() {
        initComponents();
		
		//chargerListeProjets(); Génère une exception si laissé à l'instanciation
    }
	
	public void ouvrir(){
	  String prenom = jFrame.getUser().getPrenom();
	  bienvenueLabel.setText("Bonjour " + prenom + ". Bienvenue dans Sing'in.");
	  chargerListeProjets();
	  
	}
	
	public void chargerListeProjets(){
	  
	  ComboBoxModel<ProjetJComboBox> model;
	  if(jFrame.getUser() != null){
		model = ConsoleBdd.getBdd().getProjetsJComboBox(jFrame.getUser());
	  }
	  else{
		model = new DefaultComboBoxModel<>();
	  }
	  projetsComboBox.setModel(model);
	}

  public void setjFrame(GUIeleve jFrame) {
	this.jFrame = jFrame;
  }

	
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    projetsComboBox = new javax.swing.JComboBox();
    projetsLabel = new javax.swing.JLabel();
    ouvrirButton = new javax.swing.JButton();
    rafraichirButton = new javax.swing.JButton();
    bienvenueLabel = new javax.swing.JLabel();
    fermerButton = new javax.swing.JButton();

    jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 51));
    jLabel1.setText("Selection du projet :");

    projetsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    projetsLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    projetsLabel.setText("Liste projets :");

    ouvrirButton.setText("Ouvrir");
    ouvrirButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ouvrirButtonActionPerformed(evt);
      }
    });

    rafraichirButton.setText("Raffraichir");

    bienvenueLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N

    fermerButton.setText("Fermer");
    fermerButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fermerButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(projetsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                  .addComponent(projetsComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(ouvrirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rafraichirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 25, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(fermerButton)))
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(bienvenueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(58, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(projetsLabel)
        .addGap(13, 13, 13)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(projetsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ouvrirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(rafraichirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
        .addComponent(bienvenueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(fermerButton)
        .addContainerGap())
    );

    ouvrirButton.getAccessibleContext().setAccessibleDescription("");
  }// </editor-fold>//GEN-END:initComponents

    private void ouvrirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirButtonActionPerformed
      Projet pSelected;
	  pSelected = ((ProjetJComboBox)projetsComboBox.getSelectedItem()).getProjet();
	try {
	  jFrame.ouvrirProjet(pSelected);
	} catch (DataNotFound ex) {
	  Logger.getLogger(SelectionProjetPanel.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_ouvrirButtonActionPerformed

  private void fermerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerButtonActionPerformed
    
	jFrame.fermer();
  }//GEN-LAST:event_fermerButtonActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel bienvenueLabel;
  private javax.swing.JButton fermerButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JButton ouvrirButton;
  private javax.swing.JComboBox projetsComboBox;
  private javax.swing.JLabel projetsLabel;
  private javax.swing.JButton rafraichirButton;
  // End of variables declaration//GEN-END:variables
}
