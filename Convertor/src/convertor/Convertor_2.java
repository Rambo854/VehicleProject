package convertor;

import javax.swing.JOptionPane;
public class Convertor_2 extends javax.swing.JFrame
{
    /*This is my final convertor version using GUI, 
    * with the JOptionPane method. So this porgram will be clicked based
    * with buttons, textfields, labels and graphics.
    */
    
//Array for unit converions
    double[] conversions = {0.393701, 3.28084, 1.8, 0.0328084, 1.60934};
    
    public Convertor_2()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        case2 = new javax.swing.JButton();
        case1 = new javax.swing.JButton();
        case6 = new javax.swing.JButton();
        case3 = new javax.swing.JButton();
        case4 = new javax.swing.JButton();
        case5 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        case2.setText("Meters to Feet");
        case2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                case2ActionPerformed(evt);
            }
        });

        case1.setText("Centimeters to Inches");
        case1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                case1ActionPerformed(evt);
            }
        });

        case6.setText("Exit");
        case6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                case6ActionPerformed(evt);
            }
        });

        case3.setText("Celsius to Fahrenheit");
        case3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                case3ActionPerformed(evt);
            }
        });

        case4.setText("Centimeters to Feet");
        case4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                case4ActionPerformed(evt);
            }
        });

        case5.setText("Miles to Kilometers");
        case5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                case5ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label1.setText("Convertor");

        label2.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        label2.setText("Cosimo RICUPERO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(case6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(case3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(case5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(case4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(case1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(case2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(case1)
                .addGap(18, 18, 18)
                .addComponent(case2)
                .addGap(18, 18, 18)
                .addComponent(case3)
                .addGap(18, 18, 18)
                .addComponent(case4)
                .addGap(18, 18, 18)
                .addComponent(case5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(case6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void case1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case1ActionPerformed
		try
		{ 
			//this is first of five if the main functions for this convertor
			//This converts cm to inches

			//here, i declare my variables and inches
			//double inches = 0.393701;
			double value;
			double answer;

			//here, I convert my input into double
			//I inserted the JOption method inside of the Parse method
			value = Double.parseDouble(JOptionPane.showInputDialog
			(null, "Enter your number in centimeters"));

			//here, I retrieved the answer by multiplying 'value' by 'inches'
			answer = value*conversions[0];

			//here, i display the answer to the user
		JOptionPane.showMessageDialog(null,answer + " ''","Answer",
					JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }//GEN-LAST:event_case1ActionPerformed
	
    private void case2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case2ActionPerformed
		try
		{
			double value;
			double answer;

			value = Double.parseDouble(JOptionPane.showInputDialog
			(null,"Enter your number in meters"));

			answer = value*conversions[1];

		JOptionPane.showMessageDialog(null,answer + " feet","Answer",
					JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }//GEN-LAST:event_case2ActionPerformed

    private void case3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_case3ActionPerformed
    {//GEN-HEADEREND:event_case3ActionPerformed
		try
		{                           //To multiply with the entered value
			int fahren = 32;    //Then add 32 to get final result
			double value;
			double answer;

			value = Double.parseDouble(JOptionPane.showInputDialog
			(null,"Enter your number in Celsius"));

			answer = (value*conversions[2]) + fahren;

		JOptionPane.showMessageDialog(null, answer + " fahrenheit", "Answer",
				JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }//GEN-LAST:event_case3ActionPerformed

    private void case4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_case4ActionPerformed
    {//GEN-HEADEREND:event_case4ActionPerformed
		try
		{
			double value;
			double answer;

			value = Double.parseDouble(JOptionPane.showInputDialog
			(null,"Enter your number in centimeters"));

			answer = value*conversions[3];

		JOptionPane.showMessageDialog(null, answer + " feet", "Answer", 
				JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }//GEN-LAST:event_case4ActionPerformed

    private void case5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_case5ActionPerformed
    {//GEN-HEADEREND:event_case5ActionPerformed
		try
		{
			double value;
			double answer;

			value = Double.parseDouble(JOptionPane.showInputDialog
			(null, "Enter your number in centimeters"));

			answer = value*conversions[4];

		JOptionPane.showMessageDialog(null, answer + " Km", "Answer",
				JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }//GEN-LAST:event_case5ActionPerformed

    private void case6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_case6ActionPerformed
    {//GEN-HEADEREND:event_case6ActionPerformed
        System.exit(-1);
    }//GEN-LAST:event_case6ActionPerformed

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
            java.util.logging.Logger.getLogger(Convertor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertor_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton case1;
    private javax.swing.JButton case2;
    private javax.swing.JButton case3;
    private javax.swing.JButton case4;
    private javax.swing.JButton case5;
    private javax.swing.JButton case6;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
