package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import players.Player;
import weapons.*;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;

public class BlackWidowWeapons extends JFrame {

	JPanel contentPane;
	JLabel header = new JLabel("Choose Black Widow's weapons.");
	JLabel main_weapon = new JLabel("Main weapon: Glock 26");
	JLabel sub_weapon = new JLabel("Sub weapon:");
	JRadioButton hammer = new JRadioButton("Hammer");
	JRadioButton bow = new JRadioButton("Bow");
	JRadioButton shield = new JRadioButton("Shield");
	JRadioButton staff = new JRadioButton("Staff");
	private final JButton done = new JButton("DONE");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackWidowWeapons frame = new BlackWidowWeapons();
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
	public BlackWidowWeapons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		header.setFont(new Font("Arial", Font.PLAIN, 13));
		header.setBounds(6, 6, 438, 16);
		contentPane.add(header);
		
		main_weapon.setFont(new Font("Arial", Font.PLAIN, 15));
		main_weapon.setBounds(35, 45, 270, 16);
		contentPane.add(main_weapon);
		
		sub_weapon.setFont(new Font("Arial", Font.PLAIN, 15));
		sub_weapon.setBounds(35, 87, 95, 16);
		contentPane.add(sub_weapon);
		
		hammer.setFont(new Font("Arial", Font.PLAIN, 13));
		hammer.setBounds(142, 87, 141, 23);
		contentPane.add(hammer);
		hammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hammer.isSelected()) {
					shield.setSelected(false);
					bow.setSelected(false);
					staff.setSelected(false);
				}
			}
		});
		
		bow.setFont(new Font("Arial", Font.PLAIN, 13));
		bow.setBounds(142, 122, 141, 23);
		contentPane.add(bow);
		bow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bow.isSelected()) {
					shield.setSelected(false);
					hammer.setSelected(false);
					staff.setSelected(false);
				}
			}
		});
		
		shield.setFont(new Font("Arial", Font.PLAIN, 13));
		shield.setBounds(142, 157, 141, 23);
		contentPane.add(shield);
		shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shield.isSelected()) {
					hammer.setSelected(false);
					bow.setSelected(false);
					staff.setSelected(false);
				}
			}
		});
		
		staff.setFont(new Font("Arial", Font.PLAIN, 13));
		staff.setBounds(142, 192, 141, 23);
		contentPane.add(staff);
		staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (staff.isSelected()) {
					shield.setSelected(false);
					hammer.setSelected(false);
					bow.setSelected(false);
				}
			}
		});
		
		done.setFont(new Font("Arial", Font.PLAIN, 13));
		done.setBounds(166, 243, 117, 29);
		
		contentPane.add(done);
	}
	
	public BlackWidowWeapons(Player p) {
		this();
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hammer.isSelected()) {
					Hammer hammer = new Hammer("hammer", 40);
					p.setSubWeapon(hammer);
					MainScreen.textArea.append("Black Widow's sub weapon is set to hammer.\n");
				}
				if (shield.isSelected()) {
					Shield shield = new Shield("shield", 35);
					p.setSubWeapon(shield);
					MainScreen.textArea.append("Black Widow's sub weapon is set to shield.\n");
				}
				if (bow.isSelected()) {
					Bow bow = new Bow("bow", 4);
					p.setSubWeapon(bow);
					bow.load();
					MainScreen.textArea.append("Black Widow's sub weapon is set to bow.\n");
				}
				if (staff.isSelected()) {
					Staff staff = new Staff("staff", 20);
					p.setSubWeapon(staff);
					MainScreen.textArea.append("Black Widow's sub weapon is set to staff.\n");
				}
				dispose();
			}
		});
	}

}
