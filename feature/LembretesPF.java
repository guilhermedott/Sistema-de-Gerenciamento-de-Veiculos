import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LembretesPF extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LembretesPF dialog = new LembretesPF();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LembretesPF() {
		setBounds(100, 100, 871, 677);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 857, 609);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Seu carro estará disponível para retirada a partir das 16:10");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
			lblNewLabel.setBounds(73, 260, 715, 61);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblLembrete = new JLabel("Lembretes:");
			lblLembrete.setBounds(277, 10, 250, 61);
			lblLembrete.setFont(new Font("Tahoma", Font.PLAIN, 50));
			contentPanel.add(lblLembrete);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 609, 857, 31);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton cancelButton = new JButton("Voltar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);

				
				cancelButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        Window window = SwingUtilities.getWindowAncestor(cancelButton);
				        if (window != null) {
				            window.dispose();
				        }
				    }
				});
			}
		}
	}
}
