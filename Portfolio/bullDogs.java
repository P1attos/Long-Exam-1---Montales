import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bullDogs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bullDogs frame = new bullDogs();
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
	public bullDogs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1133, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnOgw = new JLabel("");
		btnOgw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ogWorks ogw = new ogWorks();
				ogw.setVisible(true);
				dispose();
			}
		});
		btnOgw.setBounds(194, 83, 126, 14);
		contentPane.add(btnOgw);
		
		JLabel btnHome = new JLabel("");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainFrame mnf = new MainFrame();
				mnf.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(10, 43, 123, 147);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kenra\\Downloads\\porlopio\\Brand Identity (5).jpg"));
		lblNewLabel.setBounds(0, 0, 1117, 701);
		contentPane.add(lblNewLabel);
	}

}
