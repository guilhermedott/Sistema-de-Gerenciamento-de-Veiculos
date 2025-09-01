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
/*if[Pessoas]*/
public class Cadastro_Pessoa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldInputNome;
	private JTextField txtFieldInputCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cadastro_Pessoa dialog = new Cadastro_Pessoa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cadastro_Pessoa() {
		setBounds(100, 100, 867, 667);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPgCadPessoal = new JLabel("Cadastro pessoal");
			lblPgCadPessoal.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblPgCadPessoal.setBounds(272, 25, 309, 64);
			contentPanel.add(lblPgCadPessoal);
		}
		
		txtFieldInputNome = new JTextField();
		txtFieldInputNome.setForeground(SystemColor.inactiveCaption);
		txtFieldInputNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputNome.setText("Digite seu nome");
		txtFieldInputNome.setBounds(240, 162, 361, 48);
		contentPanel.add(txtFieldInputNome);
		txtFieldInputNome.setColumns(10);
		
		txtFieldInputCPF = new JTextField();
		txtFieldInputCPF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputCPF.setForeground(SystemColor.inactiveCaption);
		txtFieldInputCPF.setText("Digite seu CPF");
		txtFieldInputCPF.setColumns(10);
		txtFieldInputCPF.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputCPF);
		
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
/*end[Pessoas]*/