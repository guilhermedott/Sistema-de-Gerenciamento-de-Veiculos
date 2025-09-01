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
/*if[Mecanicas]*/
public class Cadastro_Mecanica extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldInputNomeMec;
	private JTextField txtFieldInputCNPJ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cadastro_Mecanica dialog = new Cadastro_Mecanica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cadastro_Mecanica() {
		setBounds(100, 100, 867, 667);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPgCadMecanica = new JLabel("Cadastro da Mecânica");
			lblPgCadMecanica.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblPgCadMecanica.setBounds(236, 28, 393, 64);
			contentPanel.add(lblPgCadMecanica);
		}
		
		txtFieldInputNomeMec = new JTextField();
		txtFieldInputNomeMec.setForeground(SystemColor.inactiveCaption);
		txtFieldInputNomeMec.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputNomeMec.setText("Digite o nome da Mecânica");
		txtFieldInputNomeMec.setBounds(240, 162, 361, 48);
		contentPanel.add(txtFieldInputNomeMec);
		txtFieldInputNomeMec.setColumns(10);
		
		txtFieldInputCNPJ = new JTextField();
		txtFieldInputCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputCNPJ.setForeground(SystemColor.inactiveCaption);
		txtFieldInputCNPJ.setText("Digite o CNPJ");
		txtFieldInputCNPJ.setColumns(10);
		txtFieldInputCNPJ.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputCNPJ);
		
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
/*end[Mecanicas]*/