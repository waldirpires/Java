import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CadastrarTcc extends JFrame {

	private JPanel contentPane;
	private JTextField textT;
	private JTextField textD;
	String A,B;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarTcc frame = new CadastrarTcc();
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
	public CadastrarTcc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar TCC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(164, -6, 136, 47);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBoxA = new JComboBox();
		comboBoxA.setBounds(9, 49, 151, 20);
		contentPane.add(comboBoxA);
		
		JComboBox comboBoxB = new JComboBox();
		comboBoxB.setBounds(9, 94, 151, 20);
		contentPane.add(comboBoxB);
		
		textT = new JTextField();
		textT.setBounds(9, 143, 151, 20);
		contentPane.add(textT);
		textT.setColumns(10);
		
		textD = new JTextField();
		textD.setBounds(9, 187, 151, 20);
		contentPane.add(textD);
		textD.setColumns(10);
		comboBoxA.addItem("");
		comboBoxA.addItem("Gabriel Melo");
		comboBoxA.addItem("Sarah");
		comboBoxB.addItem("");
		comboBoxB.addItem("Tecnologia da infoma��o");
		comboBoxB.addItem("Engenhraria Da Computa��o");
		
		JLabel lblNewLabel_1 = new JLabel("Aluno:");
		lblNewLabel_1.setBounds(9, 27, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(9, 80, 46, 14);
		contentPane.add(lblCurso);
		
		JLabel lblTema = new JLabel("Tema");
		lblTema.setBounds(9, 125, 46, 14);
		contentPane.add(lblTema);

		
		JLabel lblDataDeEntrega = new JLabel("Data De Entrega");
		lblDataDeEntrega.setBounds(9, 172, 95, 14);
		contentPane.add(lblDataDeEntrega);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				JOptionPane.showMessageDialog(null,"Cadastro de Aluno Realizado com sucesso!");
				dispose();
			}
		});
		btnNewButton.setBounds(107, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textT.setText("");
				textD.setText("");
				
			}
		});
		btnNewButton_1.setBounds(246, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("<------");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(10, 0, 100, 21);
		contentPane.add(button);
		
		JLabel Img = new JLabel("New label");
		ImageIcon imgem = new ImageIcon(this.getClass().getResource("/tcc.jpg").getFile()); 
		Img.setIcon(imgem);
		Img.setBounds(0, 0, 424, 261);
		getContentPane().add(Img);
	}
}
