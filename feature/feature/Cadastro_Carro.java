package feature;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Carro;
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
import javax.swing.JFormattedTextField;

/*if[Carros]*/
public class Cadastro_Carro extends JDialog {

	private static final long serialVersionUID = -7537696676531178169L;
	private final JPanel contentPanel = new JPanel();
	private JFormattedTextField txtFieldInputModeloCarro;
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
		Carro carro = new Carro();
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
		
		txtFieldInputModeloCarro = new JFormattedTextField();
		txtFieldInputModeloCarro.setText("Digite o Modelo do Veiculo\r\n");
		txtFieldInputModeloCarro.setToolTipText("lll");
		txtFieldInputModeloCarro.setForeground(SystemColor.inactiveCaption);
		txtFieldInputModeloCarro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputModeloCarro.setText("Digite o modelo do carro");
		txtFieldInputModeloCarro.setBounds(240, 162, 361, 48);
		contentPanel.add(txtFieldInputModeloCarro);
		txtFieldInputModeloCarro.setColumns(10);
		txtFieldInputModeloCarro.addFocusListener(new FocusAdapter() {
			   public void focusGained(FocusEvent e) {
	                if (Validador.VerificaFocoCampo(txtFieldInputModeloCarro.getText())) {
	                	txtFieldInputModeloCarro.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtFieldInputModeloCarro.getText().isBlank()) {
	                	txtFieldInputModeloCarro.setText("Digite o modelo do carro");
	                }
	            }
		});
		
		
		txtFieldInputChassis = new JTextField();
		txtFieldInputChassis.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtFieldInputChassis.setForeground(SystemColor.inactiveCaption);
		txtFieldInputChassis.setText("Digite o número do chassis");
		txtFieldInputChassis.setColumns(10);
		txtFieldInputChassis.setBounds(240, 257, 361, 48);
		contentPanel.add(txtFieldInputChassis);
		txtFieldInputChassis.addFocusListener(new FocusAdapter() {
			   public void focusGained(FocusEvent e) {
	                if (Validador.VerificaFocoCampo(txtFieldInputChassis.getText())) {
	                	txtFieldInputChassis.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtFieldInputChassis.getText().isBlank()) {
	                	txtFieldInputChassis.setText("Digite o número do chassis");
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
		        if (Validador.validarChassis(carro.getchassis())) {
		            lblCadEfetuado.setVisible(true); // mostra
		        } else {
		            lblCadEfetuado.setVisible(false); // esconde se quiser
		        }
		    }
		});
		contentPanel.add(btnEfetuarCadastro);
		
		JLabel lblNewLabel = new JLabel("Modelo do Carro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(240, 114, 336, 49);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNmeroDoChassis = new JLabel("Número do Chassis");
		lblNmeroDoChassis.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNmeroDoChassis.setBounds(240, 209, 336, 49);
		contentPanel.add(lblNmeroDoChassis);

		
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
/*end[Carros]*/