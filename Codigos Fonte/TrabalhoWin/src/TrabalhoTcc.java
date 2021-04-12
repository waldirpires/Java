import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class TrabalhoTcc {

	private JFrame frame;
	private JTextField textL;
	private JTextField textS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrabalhoTcc window = new TrabalhoTcc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrabalhoTcc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setBounds(100, 100, 450, 300);
				login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				login.getContentPane().setLayout(null);
				login.setVisible(true);
			}
		});
		login.setBounds(170, 136, 102, 33);
		frame.getContentPane().add(login);
		
		JButton cadastrp = new JButton("Cadastar");
		cadastrp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastrar cadastrar = new Cadastrar();
				cadastrar.setBounds(100, 100, 450, 300);
				cadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				cadastrar.getContentPane().setLayout(null);
				cadastrar.setVisible(true);
				
			}
		});
		cadastrp.setBounds(170, 196, 102, 23);
		frame.getContentPane().add(cadastrp);
		
		textL = new JTextField();
		textL.setBounds(160, 61, 141, 20);
		frame.getContentPane().add(textL);
		textL.setColumns(10);
		
		textS = new JTextField();
		textS.setBounds(160, 105, 139, 20);
		frame.getContentPane().add(textS);
		textS.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(160, 45, 102, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(160, 92, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton limparlogin = new JButton("Limpar");
		limparlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textL.setText("");
			}
		});
		limparlogin.setBounds(323, 60, 89, 23);
		frame.getContentPane().add(limparlogin);
		
		JButton limparsenha = new JButton("Limpar");
		limparsenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textS.setText("");
			}
		});
		limparsenha.setBounds(323, 104, 89, 23);
		frame.getContentPane().add(limparsenha);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(170, 20, 92, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel Img = new JLabel("New label");
		ImageIcon imgem = new ImageIcon(this.getClass().getResource("/tcc.jpg").getFile()); 
		Img.setIcon(imgem);
		Img.setBounds(0, 0, 424, 261);
		frame.getContentPane().add(Img);
		
	}
}
