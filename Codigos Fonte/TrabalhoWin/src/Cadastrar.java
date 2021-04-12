import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textN;
	private JTextField textT;
	private JTextField textE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
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
	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                Cadastro ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(114, 11, 144, 14);
		contentPane.add(lblNewLabel);
		
		textN = new JTextField();
		textN.setBounds(36, 55, 150, 20);
		contentPane.add(textN);
		textN.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 97, 184, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Engenhraria Da Computação");
		comboBox.addItem("Analise e Desenvolvimento de Sistemas");
		comboBox.addItem("Tecnologia da infoma��o");
		comboBox.addItem("Engenhraria Civil");

		textT = new JTextField();
		textT.setBounds(36, 142, 150, 20);
		contentPane.add(textT);
		textT.setColumns(10);
		
		textE = new JTextField();
		textE.setBounds(36, 192, 150, 20);
		contentPane.add(textE);
		textE.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Cadastro de Aluno Realizado com sucesso!");
				dispose();
				
			}
		});
		btnNewButton.setBounds(114, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(36, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(36, 84, 46, 14);
		contentPane.add(lblCurso);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(36, 128, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(36, 173, 66, 14);
		contentPane.add(lblEndereo);
		
		JButton Limpar = new JButton("Limpar");
		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textN.setText("");
				textT.setText("");
				textE.setText("");
			}
		});
		Limpar.setBounds(254, 227, 89, 23);
		contentPane.add(Limpar);
		
		JLabel Img = new JLabel("New label");
		ImageIcon imgem = new ImageIcon(this.getClass().getResource("/tcc.jpg").getFile()); 
		Img.setIcon(imgem);
		Img.setBounds(0, 0, 424, 261);
		getContentPane().add(Img);
	}
	
}
