import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Cadastro_Carro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldInputModeloCarro;
	private JTextField txtFieldInputChassis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cadastro_Carro dialog = new Cadastro_Carro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cadastro_Carro() {
		setBounds(100, 100, 867, 667);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPgCadCarro = new JLabel("Cadastro do carro");
			lblPgCadCarro.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblPgCadCarro.setBounds(260, 27, 329, 64);
			contentPanel.add(lblPgCadCarro);
		}
		
		txtFieldInputModeloCarro = new JTextField();
		txtFieldInputModeloCarro.setForeground(SystemColor.inactiveCaption);
		txtFieldInputModeloCarro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputModeloCarro.setText("Digite o modelo do carro");
		txtFieldInputModeloCarro.setBounds(240, 162, 361, 48);
		contentPanel.add(txtFieldInputModeloCarro);
		txtFieldInputModeloCarro.setColumns(10);
		
		txtFieldInputChassis = new JTextField();
		txtFieldInputChassis.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputChassis.setForeground(SystemColor.inactiveCaption);
		txtFieldInputChassis.setText("Digite o número do chassis");
		txtFieldInputChassis.setColumns(10);
		txtFieldInputChassis.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputChassis);
		
		JButton btnEfetuarCadastro = new JButton("Cadastrar");
		btnEfetuarCadastro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEfetuarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEfetuarCadastro.setBounds(330, 342, 176, 48);
		contentPanel.add(btnEfetuarCadastro);
		
		JLabel lblCadEfetuado = new JLabel("Cadastro efetuado!");
		lblCadEfetuado.setForeground(Color.GREEN);
		lblCadEfetuado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCadEfetuado.setBounds(300, 484, 258, 58);
		contentPanel.add(lblCadEfetuado);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnVoltar = new JButton("Voltar");
				btnVoltar.setActionCommand("Cancel");
				buttonPane.add(btnVoltar);
			}
		}
	}
}
