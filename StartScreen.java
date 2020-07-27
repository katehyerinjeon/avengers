package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import players.Player;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JFrame implements ActionListener {

	JPanel contentPane;
	JLabel intro = new JLabel("LOKI OPENED THE SPACE PORTAL IN NEW YORK!");
	JLabel start_guide = new JLabel("Press start to save the world");
	JButton start = new JButton("START");
	JLabel background = new JLabel("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen frame = new StartScreen();
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
	public StartScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		intro.setFont(new Font("Arial Black", Font.BOLD, 27));
		intro.setHorizontalAlignment(SwingConstants.CENTER);
		intro.setBounds(0, 57, 800, 150);
		contentPane.add(intro);
		
		start_guide.setHorizontalAlignment(SwingConstants.CENTER);
		start_guide.setForeground(new Color(100, 149, 237));
		start_guide.setFont(new Font("Arial Black", Font.BOLD, 18));
		start_guide.setBounds(259, 518, 298, 39);
		contentPane.add(start_guide);
		
		start.setFont(new Font("Arial Black", Font.PLAIN, 13));
		start.setBounds(343, 558, 117, 29);
		contentPane.add(start);
		
		background.setIcon(new ImageIcon("/Users/katejeon/Documents/Spring_2020/CPSC_35339/avengers_project/ny_portal.jpg"));
		background.setBounds(0, 0, 800, 678);
		contentPane.add(background);
	}

	public StartScreen(Player[] players) {
		this();
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainScreen(players).setVisible(true);
				dispose();
			}
		}
		);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
