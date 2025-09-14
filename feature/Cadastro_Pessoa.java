import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Pessoa;
import services.Validador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Window;
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
		Pessoa pessoa = new Pessoa();
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
		txtFieldInputNome.addFocusListener(new FocusAdapter() {
			   public void focusGained(FocusEvent e) {
	                if (Validador.VerificaFocoCampo(txtFieldInputNome.getText())) {
	                	txtFieldInputNome.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtFieldInputNome.getText().isBlank()) {
	                	txtFieldInputNome.setText("Digite seu nome");
	                }
	            }
		});
		
		txtFieldInputCPF = new JTextField();
		txtFieldInputCPF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputCPF.setForeground(SystemColor.inactiveCaption);
		txtFieldInputCPF.setText("Digite seu CPF");
		txtFieldInputCPF.setColumns(10);
		txtFieldInputCPF.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputCPF);
		txtFieldInputCPF.addFocusListener(new FocusAdapter() {
			   public void focusGained(FocusEvent e) {
	                if (Validador.VerificaFocoCampo(txtFieldInputCPF.getText())) {
	                	txtFieldInputCPF.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtFieldInputCPF.getText().isBlank()) {
	                	txtFieldInputCPF.setText("Digite seu CPF");
	                }
	            }
		});
		
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
		    	String cpfDigitado = txtFieldInputCPF.getText().trim();
		        if (Validador.validarCPF(cpfDigitado)) {
		            lblCadEfetuado.setVisible(true);
		        } else {
		            lblCadEfetuado.setVisible(false);
		        }
		    }
		});
		contentPanel.add(btnEfetuarCadastro);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNome.setBounds(240, 114, 361, 48);
		contentPanel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCpf.setBounds(240, 208, 361, 48);
		contentPanel.add(lblCpf);

		
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
/*end[Pessoas]*/