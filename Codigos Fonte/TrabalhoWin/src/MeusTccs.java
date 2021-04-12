import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MeusTccs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeusTccs frame = new MeusTccs();
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
	public MeusTccs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meus Tcc's");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(173, 26, 104, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Tcc's entregues");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Os trabalhos da data 25/10/2020 foram entregues!");
				dispose();
			}
		});
		btnNewButton.setBounds(26, 78, 147, 23);
		contentPane.add(btnNewButton);
		
		JButton btnTccsAtrasados = new JButton("Tcc's atrasados");
		btnTccsAtrasados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Aluno 1 e 2 atrasados");
				dispose();
			}
		});
		btnTccsAtrasados.setBounds(26, 145, 147, 23);
		contentPane.add(btnTccsAtrasados);
		
		JButton btnNewButton_1 = new JButton("<------");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton_1);
	
		JLabel Img = new JLabel("New label");
		ImageIcon imgem = new ImageIcon(this.getClass().getResource("/tcc.jpg").getFile()); 
		Img.setIcon(imgem);
		Img.setBounds(0, 0, 424, 261);
		getContentPane().add(Img);
	}

}
