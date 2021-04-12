import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Meus TCC's");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeusTccs meus = new MeusTccs();
				meus.setBounds(100, 100, 450, 300);
				meus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				meus.getContentPane().setLayout(null);
				meus.setVisible(true);
			}
		});
		btnNewButton.setBounds(23, 68, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CadastrarTCC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarTcc meus = new CadastrarTcc();
				meus.setBounds(100, 100, 450, 300);
				meus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				meus.getContentPane().setLayout(null);
				meus.setVisible(true);
				JButton btnNewButton = new JButton("Cadastrar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,"Cadastro de Aluno Realizado com sucesso!");
						dispose();
					}
				});

			}
		});
		btnNewButton_1.setBounds(23, 137, 130, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Gest\u00E3o De TCC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(166, 11, 188, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("<------");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(0, 7, 102, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel Img = new JLabel("New label");
		ImageIcon imgem = new ImageIcon(this.getClass().getResource("/tcc.jpg").getFile()); 
		Img.setIcon(imgem);
		Img.setBounds(0, 0, 424, 261);
		getContentPane().add(Img);
	}
}
