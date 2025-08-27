import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCadastro.setBackground(new Color(240, 240, 240));
		btnCadastro.setBounds(289, 167, 231, 75);
		contentPane.add(btnCadastro);
		
		JLabel lblNewLabel = new JLabel("Escolha uma Funcionalidade");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(167, 25, 503, 92);
		contentPane.add(lblNewLabel);
		
		JButton btnRelatorio = new JButton("Relatórios");
		btnRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnRelatorio.setBackground(UIManager.getColor("Button.background"));
		btnRelatorio.setBounds(289, 294, 231, 75);
		contentPane.add(btnRelatorio);
		
		JButton btnLembretes = new JButton("Lembretes");
		btnLembretes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnLembretes.setBackground(UIManager.getColor("Button.background"));
		btnLembretes.setBounds(289, 421, 231, 75);
		contentPane.add(btnLembretes);
	}
}
