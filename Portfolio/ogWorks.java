import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ogWorks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ogWorks frame = new ogWorks();
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
	public ogWorks() {
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
		btnHome.setBounds(0, 43, 136, 150);
		contentPane.add(btnHome);
		
		JLabel btnNext = new JLabel("");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ogWorks2 ogw2 = new ogWorks2();
				ogw2.setVisible(true);
				dispose();
			}
		
		});
		btnNext.setBounds(1012, 644, 54, 28);
		contentPane.add(btnNext);
		
		JLabel btnBullDogs = new JLabel("");
		btnBullDogs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bullDogs bld = new bullDogs();
				bld.setVisible(true);
				dispose();
			}
		});
		btnBullDogs.setBounds(170, 127, 299, 403);
		contentPane.add(btnBullDogs);
		
		JLabel btnBms = new JLabel("");
		btnBms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bmSearch bms = new bmSearch();
				bms.setVisible(true);
				dispose();
			}
		});
		btnBms.setBounds(479, 371, 329, 307);
		contentPane.add(btnBms);
		
		JLabel btnchnl = new JLabel("");
		btnchnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chanel chn = new chanel();
				chn.setVisible(true);
				dispose();
			}
		});
		btnchnl.setBounds(818, 127, 268, 352);
		contentPane.add(btnchnl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kenra\\Downloads\\porlopio\\Brand Identity (13).jpg"));
		lblNewLabel.setBounds(0, 0, 1117, 701);
		contentPane.add(lblNewLabel);
	}
}
