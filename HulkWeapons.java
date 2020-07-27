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

public class HulkWeapons extends JFrame {

	JPanel contentPane;
	JLabel header = new JLabel("Choose Hulk's weapons.");
	JLabel main_weapon = new JLabel("Main weapon:");
	JRadioButton main_hammer = new JRadioButton("Hammer");
	JRadioButton main_bow = new JRadioButton("Bow");
	JRadioButton main_gun = new JRadioButton("Gun");
	JRadioButton main_staff = new JRadioButton("Staff");
	JRadioButton main_shield = new JRadioButton("Shield");
	JLabel sub_weapon = new JLabel("Sub weapon:");
	JRadioButton sub_hammer = new JRadioButton("Hammer");
	JRadioButton sub_bow = new JRadioButton("Bow");
	JRadioButton sub_gun = new JRadioButton("Gun");
	JRadioButton sub_staff = new JRadioButton("Staff");
	JRadioButton sub_shield = new JRadioButton("Shield");
	private final JButton done = new JButton("DONE");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HulkWeapons frame = new HulkWeapons();
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
	public HulkWeapons() {
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
		main_weapon.setBounds(21, 50, 95, 16);
		contentPane.add(main_weapon);
		
		main_hammer.setFont(new Font("Arial", Font.PLAIN, 13));
		main_hammer.setBounds(128, 50, 93, 23);
		contentPane.add(main_hammer);
		main_hammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (main_hammer.isSelected()) {
					main_shield.setSelected(false);
					main_gun.setSelected(false);
					main_bow.setSelected(false);
					main_staff.setSelected(false);
				}
			}
		});
		
		main_bow.setFont(new Font("Arial", Font.PLAIN, 13));
		main_bow.setBounds(128, 85, 93, 23);
		contentPane.add(main_bow);
		main_bow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (main_bow.isSelected()) {
					main_shield.setSelected(false);
					main_gun.setSelected(false);
					main_staff.setSelected(false);
					main_hammer.setSelected(false);
				}
			}
		});
		
		main_gun.setFont(new Font("Arial", Font.PLAIN, 13));
		main_gun.setBounds(128, 120, 93, 23);
		contentPane.add(main_gun);
		main_gun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (main_gun.isSelected()) {
					main_shield.setSelected(false);
					main_bow.setSelected(false);
					main_staff.setSelected(false);
					main_hammer.setSelected(false);
				}
			}
		});
		
		main_staff.setFont(new Font("Arial", Font.PLAIN, 13));
		main_staff.setBounds(128, 155, 93, 23);
		contentPane.add(main_staff);
		main_staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (main_staff.isSelected()) {
					main_shield.setSelected(false);
					main_gun.setSelected(false);
					main_bow.setSelected(false);
					main_hammer.setSelected(false);
				}
			}
		});
		
		main_shield.setFont(new Font("Arial", Font.PLAIN, 13));
		main_shield.setBounds(128, 190, 93, 23);
		contentPane.add(main_shield);
		main_shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (main_shield.isSelected()) {
					main_bow.setSelected(false);
					main_gun.setSelected(false);
					main_staff.setSelected(false);
					main_hammer.setSelected(false);
				}
			}
		});
		
		sub_weapon.setFont(new Font("Arial", Font.PLAIN, 15));
		sub_weapon.setBounds(233, 50, 95, 16);
		contentPane.add(sub_weapon);
		
		sub_hammer.setFont(new Font("Arial", Font.PLAIN, 13));
		sub_hammer.setBounds(340, 50, 93, 23);
		contentPane.add(sub_hammer);
		sub_hammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sub_hammer.isSelected()) {
					sub_shield.setSelected(false);
					sub_gun.setSelected(false);
					sub_staff.setSelected(false);
					sub_bow.setSelected(false);
				}
			}
		});
		
		sub_bow.setFont(new Font("Arial", Font.PLAIN, 13));
		sub_bow.setBounds(340, 85, 93, 23);
		contentPane.add(sub_bow);
		sub_bow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sub_bow.isSelected()) {
					sub_shield.setSelected(false);
					sub_gun.setSelected(false);
					sub_staff.setSelected(false);
					sub_hammer.setSelected(false);
				}
			}
		});
		
		sub_gun.setFont(new Font("Arial", Font.PLAIN, 13));
		sub_gun.setBounds(340, 120, 93, 23);
		contentPane.add(sub_gun);
		sub_gun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sub_gun.isSelected()) {
					sub_shield.setSelected(false);
					sub_hammer.setSelected(false);
					sub_staff.setSelected(false);
					sub_bow.setSelected(false);
				}
			}
		});
		
		sub_staff.setFont(new Font("Arial", Font.PLAIN, 13));
		sub_staff.setBounds(340, 155, 93, 23);
		contentPane.add(sub_staff);
		sub_staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sub_staff.isSelected()) {
					sub_shield.setSelected(false);
					sub_gun.setSelected(false);
					sub_hammer.setSelected(false);
					sub_bow.setSelected(false);
				}
			}
		});
		
		sub_shield.setFont(new Font("Arial", Font.PLAIN, 13));
		sub_shield.setBounds(340, 190, 93, 23);
		contentPane.add(sub_shield);
		sub_shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sub_shield.isSelected()) {
					sub_hammer.setSelected(false);
					sub_gun.setSelected(false);
					sub_staff.setSelected(false);
					sub_bow.setSelected(false);
				}
			}
		});
		
		done.setFont(new Font("Arial", Font.PLAIN, 13));
		done.setBounds(166, 243, 117, 29);
		
		contentPane.add(done);
	}
	
	public HulkWeapons(Player p) {
		this();
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Setting main weapon
				if (main_staff.isSelected()) {
					Staff staff = new Staff("staff", 20);
					p.setMainWeapon(staff);
					MainScreen.textArea.append("Hulk's main weapon is set to staff.\n");
				}
				if (main_shield.isSelected()) {
					Shield shield = new Shield("shield", 35);
					p.setMainWeapon(shield);
					MainScreen.textArea.append("Hulk's main weapon is set to shield.\n");
				}
				if (main_bow.isSelected()) {
					Bow bow = new Bow("bow", 3);
					p.setMainWeapon(bow);
					bow.load();
					MainScreen.textArea.append("Hulk's main weapon is set to bow.\n");
				}
				if (main_gun.isSelected()) {
					Gun gun = new Gun("gun", 4);
					p.setMainWeapon(gun);
					gun.load();
					MainScreen.textArea.append("Hulk's main weapon is set to gun.\n");
				}
				if (main_hammer.isSelected()) {
					Hammer hammer = new Hammer("hammer", 40);
					p.setMainWeapon(hammer);
					MainScreen.textArea.append("Hulk's main weapon is set to hammer.\n");
				}
				
				// Setting sub weapon
				if (sub_staff.isSelected()) {
					Staff staff = new Staff("staff", 20);
					p.setSubWeapon(staff);
					MainScreen.textArea.append("Hulk's sub weapon is set to staff.\n");
				}
				if (sub_shield.isSelected()) {
					Shield shield = new Shield("shield", 35);
					p.setSubWeapon(shield);
					MainScreen.textArea.append("Hulk's sub weapon is set to shield.\n");
				}
				if (sub_bow.isSelected()) {
					Bow bow = new Bow("bow", 3);
					p.setSubWeapon(bow);
					MainScreen.textArea.append("Hulk's sub weapon is set to bow.\n");
				}
				if (sub_gun.isSelected()) {
					Gun gun = new Gun("gun", 4);
					p.setSubWeapon(gun);
					MainScreen.textArea.append("Hulk's sub weapon is set to gun.\n");
				}
				if (sub_hammer.isSelected()) {
					Hammer hammer = new Hammer("hammer", 40);
					p.setSubWeapon(hammer);
					MainScreen.textArea.append("Hulk's sub weapon is set to hammer.\n");
				}
				
				// Closing weapon window
				dispose();
			}
		});
	}

}
