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

public class LembretesPJ extends JDialog {

	private static final long serialVersionUID = -126270305928409705L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LembretesPJ dialog = new LembretesPJ();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LembretesPJ() {
		setBounds(100, 100, 941, 677);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Lembretes:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblNewLabel.setBounds(345, 10, 210, 68);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("Entrega de carro programada para hoje as 16:10h");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(119, 245, 720, 93);
		contentPanel.add(lblNewLabel_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Voltar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);

				// Adicionando a ação para fechar a janela
				cancelButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        // Pega a referência da janela a partir do botão
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
