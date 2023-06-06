import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1133, 740);
		mainFrame = new JPanel();
		mainFrame.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainFrame);
		mainFrame.setLayout(null);
		
		JLabel btnAbtme = new JLabel("");
		btnAbtme.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe abt = new AboutMe();
			abt.setVisible(true);
			dispose();
			}
		});
		btnAbtme.setBounds(946, 188, 99, 34);
		mainFrame.add(btnAbtme);
		
		JLabel btnOGworks = new JLabel("");
		btnOGworks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ogWorks ogw = new ogWorks();
				ogw.setVisible(true);
				dispose();
			}
		});
		btnOGworks.setBounds(457, 619, 174, 34);
		mainFrame.add(btnOGworks);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kenra\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\XFDZDX1D\\Home_page[1].jpg"));
		lblNewLabel.setBounds(0, 0, 1117, 701);
		mainFrame.add(lblNewLabel);
	}
}
