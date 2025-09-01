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
/*if[Seguradoras]*/
public class Cadastro_Seguradora extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldInputNomeSeg;
	private JTextField txtFieldInputCNPJ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cadastro_Seguradora dialog = new Cadastro_Seguradora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cadastro_Seguradora() {
		setBounds(100, 100, 867, 667);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPgCadSeguradora = new JLabel("Cadastro da Seguradora");
			lblPgCadSeguradora.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblPgCadSeguradora.setBounds(214, 27, 430, 64);
			contentPanel.add(lblPgCadSeguradora);
		}
		
		txtFieldInputNomeSeg = new JTextField();
		txtFieldInputNomeSeg.setForeground(SystemColor.inactiveCaption);
		txtFieldInputNomeSeg.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputNomeSeg.setText("Digite o nome da Seguradora");
		txtFieldInputNomeSeg.setBounds(240, 162, 361, 48);
		contentPanel.add(txtFieldInputNomeSeg);
		txtFieldInputNomeSeg.setColumns(10);
		
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
/*end[Seguradoras]*/