import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Seguradora;
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

public class Cadastro_Seguradora extends JDialog {

	private static final long serialVersionUID = 770440111214611527L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldInputNomeSeg;
	private JTextField txtFieldInputCNPJ;
	Seguradora seguradora = new Seguradora();

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
		txtFieldInputNomeSeg.addFocusListener(new FocusAdapter() {
			   public void focusGained(FocusEvent e) {
	                if (Validador.VerificaFocoCampo(txtFieldInputNomeSeg.getText())) {
	                	txtFieldInputNomeSeg.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtFieldInputNomeSeg.getText().isBlank()) {
	                	txtFieldInputNomeSeg.setText("Digite o Número de SDigite o nome da Seguradoraérie");
	                }
	            }
		});
		
		txtFieldInputCNPJ = new JTextField();
		txtFieldInputCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputCNPJ.setForeground(SystemColor.inactiveCaption);
		txtFieldInputCNPJ.setText("Digite o CNPJ");
		txtFieldInputCNPJ.setColumns(10);
		txtFieldInputCNPJ.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputCNPJ);
		txtFieldInputCNPJ.addFocusListener(new FocusAdapter() {
			   public void focusGained(FocusEvent e) {
	                if (Validador.VerificaFocoCampo(txtFieldInputCNPJ.getText())) {
	                	txtFieldInputCNPJ.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtFieldInputCNPJ.getText().isBlank()) {
	                	txtFieldInputCNPJ.setText("Digite o CNPJ");
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
		    	String cnpjDigitadoSeg = txtFieldInputCNPJ.getText().trim();
		        if (Validador.validarCNPJ(cnpjDigitadoSeg)) {
		            lblCadEfetuado.setVisible(true);
		        } else {
		            lblCadEfetuado.setVisible(false);
		        }
		    }
		});
		contentPanel.add(btnEfetuarCadastro);
		
		JLabel lblNomeSeguradora = new JLabel("Nome da Seguradora");
		lblNomeSeguradora.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNomeSeguradora.setBounds(240, 123, 361, 38);
		contentPanel.add(lblNomeSeguradora);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCnpj.setBounds(240, 221, 361, 38);
		contentPanel.add(lblCnpj);
		
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
