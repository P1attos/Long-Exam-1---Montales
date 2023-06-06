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

public class AboutMe extends JFrame {

	private JPanel aboutMee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
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
	public AboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1133, 740);
		aboutMee = new JPanel();
		aboutMee.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(aboutMee);
		aboutMee.setLayout(null);
		
		JLabel btnHome = new JLabel("");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainFrame mnf = new MainFrame();
				mnf.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(10, 33, 87, 125);
		aboutMee.add(btnHome);
		
		JLabel btnNext = new JLabel("");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Education edu = new Education();
				edu.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(1046, 579, 46, 46);
		aboutMee.add(btnNext);
		
		JLabel abtMeBg = new JLabel("");
		abtMeBg.setIcon(new ImageIcon("C:\\Users\\kenra\\Downloads\\porlopio\\Brand Identity.jpg"));
		abtMeBg.setBounds(0, 0, 1117, 701);
		aboutMee.add(abtMeBg);
	}
}
