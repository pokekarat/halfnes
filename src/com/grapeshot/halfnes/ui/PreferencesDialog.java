/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OptionsDialog.java
 *
 * Created on Jan 16, 2011, 4:21:43 PM
 */
package com.grapeshot.halfnes.ui;

import com.grapeshot.halfnes.PrefsSingleton;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 *
 * @author Andrew
 */
public class PreferencesDialog extends javax.swing.JDialog {
    
    private int screenScaling;
    private boolean okClicked = false;

    /**
     * Creates new form OptionsDialog
     */
    public PreferencesDialog(java.awt.Frame parent) {
        super(parent, true);
        Preferences prefs = PrefsSingleton.get();
        initComponents();
        this.setTitle("HalfNES Preferences");
        //set all of the text boxes
        //aand the sound enable checkbox.
        jCheckSoundEnable.setSelected(prefs.getBoolean("soundEnable", true));
        jCheckSoundFiltering.setSelected(prefs.getBoolean("soundFiltering", true));
        jCheckMaintainAspect.setSelected(prefs.getBoolean("maintainAspect", true));
        jCheckBoxNTSC.setSelected(prefs.getBoolean("TVEmulation", false));
        jCheckBoxNTView.setSelected(prefs.getBoolean("ntView", false));
        jCheckBoxShowScope.setSelected(prefs.getBoolean("showScope", false));
        jCheckBoxSleep.setSelected(prefs.getBoolean("Sleep", true));
        jButtonOK.setActionCommand("OK");
        jButtonCancel.setActionCommand("Cancel");
        screenScaling = prefs.getInt("screenScaling", 2);
        jSpinnerScale.setValue(screenScaling);
        jSampleRateBox.setSelectedItem(Integer.toString(prefs.getInt("sampleRate", 44100)));
        jCheckBoxSmoothVideo.setSelected(prefs.getBoolean("smoothScaling", false));
        volumeSlider.setValue(prefs.getInt("outputvol", 13107));
        jRegionBox.setSelectedIndex(prefs.getInt("region", 0));
        //0-> auto, 1-> NTSC, 2-> PAL, 3-> Dendy
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jCheckSoundEnable = new javax.swing.JCheckBox();
        jButtonCancel = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jSampleRateBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckMaintainAspect = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jCheckSoundFiltering = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBoxNTSC = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jSpinnerScale = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jCheckBoxSmoothVideo = new javax.swing.JCheckBox();
        jCheckBoxSleep = new javax.swing.JCheckBox();
        jCheckBoxShowScope = new javax.swing.JCheckBox();
        jCheckBoxNTView = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jRegionBox = new javax.swing.JComboBox();

        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("OptionsDialog"); // NOI18N
        setResizable(false);

        jLabel1.setText("Screen scaling: scale up "); // NOI18N

        jCheckSoundEnable.setText("Enable Sound"); // NOI18N

        jButtonCancel.setText("Cancel"); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOK.setText("OK"); // NOI18N
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jSampleRateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "16000", "24000", "44100", "48000","96000" }));
        jSampleRateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSampleRateBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Sample Rate:"); // NOI18N

        jCheckMaintainAspect.setText("Maintain Aspect Ratio"); // NOI18N

        jLabel14.setText("Sound:"); // NOI18N

        jCheckSoundFiltering.setText("Enable Filtering"); // NOI18N
        jCheckSoundFiltering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSoundFilteringActionPerformed(evt);
            }
        });

        jLabel15.setText("Output Volume:"); // NOI18N

        volumeSlider.setMajorTickSpacing(8192);
        volumeSlider.setMaximum(16384);
        volumeSlider.setMinorTickSpacing(4096);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setValue(80);

        jLabel17.setText("0"); // NOI18N

        jLabel18.setText("100"); // NOI18N

        jCheckBoxNTSC.setText("Use NTSC TV Filter (Experimental)");
        jCheckBoxNTSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNTSCActionPerformed(evt);
            }
        });

        jLabel19.setText("Video options:"); // NOI18N

        jSpinnerScale.setModel(new javax.swing.SpinnerNumberModel(2, 1, 6, 1));

        jLabel20.setText("times"); // NOI18N

        jCheckBoxSmoothVideo.setText("Use Smooth Scaling");
        jCheckBoxSmoothVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSmoothVideoActionPerformed(evt);
            }
        });

        jCheckBoxSleep.setText("Sleep Between Frames");
        jCheckBoxSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSleepActionPerformed(evt);
            }
        });

        jCheckBoxShowScope.setText("Show Audio Output");

        jCheckBoxNTView.setText("Show Nametable Viewer");

        jLabel3.setText("Console Region:");

        jRegionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Auto Detect", "NTSC", "PAL", "Dendy" }));
        jRegionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegionBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19)
                                    .addComponent(jCheckBoxNTSC)
                                    .addComponent(jCheckMaintainAspect)
                                    .addComponent(jCheckBoxSmoothVideo)
                                    .addComponent(jCheckBoxSleep)
                                    .addComponent(jCheckBoxShowScope)
                                    .addComponent(jCheckBoxNTView))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jCheckSoundEnable)
                                    .addComponent(jCheckSoundFiltering)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSampleRateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRegionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSoundEnable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSoundFiltering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSampleRateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinnerScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxSmoothVideo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckMaintainAspect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxNTSC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxSleep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxShowScope)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxNTView)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRegionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        if ("Cancel".equals(evt.getActionCommand())) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        //    if ("OK".equals(evt.getActionCommand())) {
        //here we go... save everything and hide the window
        Preferences prefs = PrefsSingleton.get();
        prefs.putBoolean("soundEnable", jCheckSoundEnable.isSelected());
        prefs.putBoolean("soundFiltering", jCheckSoundFiltering.isSelected());
        prefs.putBoolean("maintainAspect", jCheckMaintainAspect.isSelected());
        prefs.putBoolean("TVEmulation", jCheckBoxNTSC.isSelected());
        prefs.putBoolean("Sleep", jCheckBoxSleep.isSelected());
        screenScaling = (Integer) (jSpinnerScale.getModel().getValue());
        prefs.putBoolean("smoothScaling", jCheckBoxSmoothVideo.isSelected());
        prefs.putBoolean("showScope", jCheckBoxShowScope.isSelected());
        prefs.putBoolean("ntView", jCheckBoxNTView.isSelected());
        prefs.putInt("screenScaling", screenScaling);
        prefs.putInt("sampleRate", Integer.parseInt(jSampleRateBox.getSelectedItem().toString()));
        prefs.putInt("outputvol", volumeSlider.getValue());
        prefs.putInt("region", jRegionBox.getSelectedIndex());
        try {
            prefs.flush();
        } catch (BackingStoreException ex) {
            Logger.getLogger(PreferencesDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        okClicked = true;
        this.setVisible(false);
        //   }
    }//GEN-LAST:event_jButtonOKActionPerformed
    public boolean okClicked() {
        return okClicked;
    }
    private void jSampleRateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSampleRateBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSampleRateBoxActionPerformed

    private void jCheckSoundFilteringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSoundFilteringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckSoundFilteringActionPerformed

    private void jCheckBoxNTSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNTSCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNTSCActionPerformed

    private void jCheckBoxSmoothVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSmoothVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSmoothVideoActionPerformed

    private void jCheckBoxSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSleepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSleepActionPerformed

    private void jRegionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRegionBoxActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxNTSC;
    private javax.swing.JCheckBox jCheckBoxNTView;
    private javax.swing.JCheckBox jCheckBoxShowScope;
    private javax.swing.JCheckBox jCheckBoxSleep;
    private javax.swing.JCheckBox jCheckBoxSmoothVideo;
    private javax.swing.JCheckBox jCheckMaintainAspect;
    private javax.swing.JCheckBox jCheckSoundEnable;
    private javax.swing.JCheckBox jCheckSoundFiltering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox jRegionBox;
    private javax.swing.JComboBox jSampleRateBox;
    private javax.swing.JSpinner jSpinnerScale;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
