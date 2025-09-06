import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Produto;
import services.Validador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
/*if[Produtos]*/
public class Cadastro_Produto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldInputNomeProd;
	private JTextField txtFieldInputSerialNumber;
	Produto produto = new Produto();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cadastro_Produto dialog = new Cadastro_Produto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cadastro_Produto() {
		setBounds(100, 100, 867, 667);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPgCadProduto = new JLabel("Cadastro de Produto");
			lblPgCadProduto.setFont(new Font("Tahoma", Font.PLAIN, 40));
			lblPgCadProduto.setBounds(238, 27, 365, 64);
			contentPanel.add(lblPgCadProduto);
		}
		
		txtFieldInputNomeProd = new JTextField();
		txtFieldInputNomeProd.setForeground(SystemColor.inactiveCaption);
		txtFieldInputNomeProd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputNomeProd.setText("Digite o nome do Produto");
		txtFieldInputNomeProd.setBounds(240, 162, 361, 48);
		contentPanel.add(txtFieldInputNomeProd);
		txtFieldInputNomeProd.setColumns(10);
		
		txtFieldInputSerialNumber = new JTextField();
		txtFieldInputSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputSerialNumber.setForeground(SystemColor.inactiveCaption);
		txtFieldInputSerialNumber.setText("Digite o Número de Série");
		txtFieldInputSerialNumber.setColumns(10);
		txtFieldInputSerialNumber.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputSerialNumber);
		
		JButton btnEfetuarCadastro = new JButton("Cadastrar");
		btnEfetuarCadastro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEfetuarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// cria o label já invisível
		JLabel lblCadEfetuado = new JLabel("Cadastro efetuado!");
		lblCadEfetuado.setForeground(Color.GREEN);
		lblCadEfetuado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCadEfetuado.setBounds(300, 484, 258, 58);
		lblCadEfetuado.setVisible(false);
		contentPanel.add(lblCadEfetuado);

		btnEfetuarCadastro.setBounds(330, 342, 176, 48);
		btnEfetuarCadastro.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Faz validação pra ver se está válido o número de série
		        if (Validador.validarNumeroSerie(produto.getserialNumber())) {
		            lblCadEfetuado.setVisible(true); // mostra se válido
		        } else {
		            lblCadEfetuado.setVisible(false); // esconde se inválido
		        }
		    }
		});
		contentPanel.add(btnEfetuarCadastro);

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
/*end[Produtos]*/