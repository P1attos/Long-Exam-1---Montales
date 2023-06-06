import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ogWorks2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ogWorks2 frame = new ogWorks2();
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
	public ogWorks2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1133, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnHome = new JLabel("");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainFrame mnf = new MainFrame();
				mnf.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(0, 39, 139, 152);
		contentPane.add(btnHome);
		
		JLabel btnNext = new JLabel("");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ogWorks3 ogw3 = new ogWorks3();
				ogw3.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(1015, 649, 46, 22);
		contentPane.add(btnNext);
		
		JLabel btnBack = new JLabel("<<");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ogWorks ogw = new ogWorks();
				ogw.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnBack.setBounds(959, 642, 46, 29);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kenra\\Downloads\\porlopio\\Brand Identity (14).jpg"));
		lblNewLabel.setBounds(0, 0, 1117, 701);
		contentPane.add(lblNewLabel);
	}

}
