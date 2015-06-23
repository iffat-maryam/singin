/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singin.interfaceEleve;

import singin.DataNotFound;
import singin.Projet;
import singin.User;

/**
 *
 * @author matt
 */
public class GUIeleve extends javax.swing.JFrame {

  private enum ETAT { LOGIN, SELECTION, DETAIL};
  private ETAT etat;
  
  private User user;
  private Projet projet;
  
  /**
   * Creates new form GUIeleve
   */
  public GUIeleve() {
	initComponents();
	
	etat = ETAT.LOGIN;
	loginPanel1.setjFrame(this);
	selectionProjetPanel1.setjFrame(this);
	detailProjetPanel1.setjFrame(this);
	
	user = null;
	
	this.setSize(1000, 700);
	activationLogin();
	
	
  }

  public void ouvertureLogin(){
	
  }
  
  public void ouvrirSelection(){
	switch(etat){
	  case LOGIN:
		etat = ETAT.SELECTION;
		activationSelection();
		selectionProjetPanel1.ouvrir();
		break;
	  case SELECTION:
		throw new RuntimeException();
	  case DETAIL:
		etat = ETAT.SELECTION;
		activationSelection();
		break;
	}
  }
  
  public void ouvrirProjet(Projet projet) throws DataNotFound{
	switch(etat){
	  case LOGIN:
		throw new RuntimeException();
	  case SELECTION:
		etat = ETAT.DETAIL;
		activationDetail();
		this.projet = projet;
		detailProjetPanel1.ouvrirProjet();
		break;
	  case DETAIL:
		throw new RuntimeException();
	}
  }
  
  public void fermerProjet(){
	switch(etat){
	  case DETAIL:
		etat = ETAT.SELECTION;
		activationSelection();
		break;
	  case SELECTION:
		throw new RuntimeException();
	  case LOGIN:
		throw new RuntimeException();
	}
  }
  
  public void fermer(){
	
	
	this.dispose();
  }
  
  private void activationLogin(){
	loginPanel1.setVisible(true);
	selectionProjetPanel1.setVisible(false);
	detailProjetPanel1.setVisible(false);
  }
  
  private void activationSelection(){
	loginPanel1.setVisible(false);
	selectionProjetPanel1.setVisible(true);
	detailProjetPanel1.setVisible(false);
  }
  
  private void activationDetail(){
	loginPanel1.setVisible(false);
	selectionProjetPanel1.setVisible(false);
	detailProjetPanel1.setVisible(true);
  }
  
  private void clearDataDetail(){
	//detailProjetPanel1.clearData();
  }

  public User getUser() {
	if(user != null)
	  return user;
	return null;
  }

  public void setUser(User user) {
	this.user = user;
  }

  public Projet getProjet() {
	return projet;
  }

  public void setProjet(Projet projet) {
	this.projet = projet;
  }
  
  
  
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    loginPanel1 = new singin.interfaceEleve.LoginPanel();
    selectionProjetPanel1 = new singin.interfaceEleve.SelectionProjetPanel();
    detailProjetPanel1 = new singin.interfaceEleve.DetailProjetPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(selectionProjetPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(detailProjetPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(416, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(selectionProjetPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(detailProjetPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

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
	  java.util.logging.Logger.getLogger(GUIeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	  java.util.logging.Logger.getLogger(GUIeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	  java.util.logging.Logger.getLogger(GUIeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	  java.util.logging.Logger.getLogger(GUIeleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	  public void run() {
		new GUIeleve().setVisible(true);
	  }
	});
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private singin.interfaceEleve.DetailProjetPanel detailProjetPanel1;
  private singin.interfaceEleve.LoginPanel loginPanel1;
  private singin.interfaceEleve.SelectionProjetPanel selectionProjetPanel1;
  // End of variables declaration//GEN-END:variables
}
