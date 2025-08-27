import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Relatorio extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Relatorio dialog = new Relatorio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Relatorio() {
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
			}
		}
		{
			JLabel lblEscolhaRelatorio = new JLabel("Selecione o Relatório Desejado:");
			lblEscolhaRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblEscolhaRelatorio.setBounds(193, 29, 440, 64);
			getContentPane().add(lblEscolhaRelatorio);
		}
		{
			JButton btnRelSeguros = new JButton("Seguros");
			btnRelSeguros.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRelSeguros.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnRelSeguros.setBounds(300, 180, 218, 64);
			getContentPane().add(btnRelSeguros);
		}
		{
			JButton btnRelDanos = new JButton("Danos");
			btnRelDanos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRelDanos.setBounds(300, 252, 218, 64);
			getContentPane().add(btnRelDanos);
		}
		{
			JButton btnRelDonos = new JButton("Donos");
			btnRelDonos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRelDonos.setBounds(300, 325, 218, 64);
			getContentPane().add(btnRelDonos);
		}
		{
			JButton btnRelManutencao = new JButton("Manutenções");
			btnRelManutencao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnRelManutencao.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRelManutencao.setBounds(300, 396, 218, 64);
			getContentPane().add(btnRelManutencao);
		}
		{
			JButton btnRelInfoGeral = new JButton("Informações Gerais");
			btnRelInfoGeral.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRelInfoGeral.setBounds(300, 471, 218, 64);
			getContentPane().add(btnRelInfoGeral);
		}
	}

}
