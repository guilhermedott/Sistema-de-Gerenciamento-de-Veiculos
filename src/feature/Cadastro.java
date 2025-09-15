package feature;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JDialog {

	private static final long serialVersionUID = 6104131923519581320L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cadastro dialog = new Cadastro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cadastro() {
		setBounds(100, 100, 861, 656);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 847, 20);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 588, 847, 31);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
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
		{
			JLabel titlePage = new JLabel("Selecione a opção que deseja cadastrar:");
			titlePage.setFont(new Font("Tahoma", Font.PLAIN, 30));
			titlePage.setBounds(145, 30, 570, 64);
			getContentPane().add(titlePage);
		}
		
		{
			JButton btnCadPessoa = new JButton("Pessoa");
			btnCadPessoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnCadPessoa.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        Cadastro_Pessoa dialog = new Cadastro_Pessoa();
			        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			        dialog.setModal(true);
			        dialog.setVisible(true);
			    }
			});
			btnCadPessoa.setBounds(300, 120, 218, 64);
			getContentPane().add(btnCadPessoa);
		}
		
		
		{
			JButton btnCarro = new JButton("Carro");
			btnCarro.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnCarro.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        Cadastro_Carro dialog = new Cadastro_Carro();
			        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			        dialog.setModal(true);
			        dialog.setVisible(true);
			    }
			});
			btnCarro.setBounds(300, 192, 218, 64);
			getContentPane().add(btnCarro);
		}
		
		















		















		















		















	}

}
