package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import players.Player;
import weapons.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CapAmerWeapons extends JFrame {

	JPanel contentPane;
	JLabel header = new JLabel("Choose Captain America's weapons.");
	JLabel main_weapon = new JLabel("Main weapon: Captain America's shield");
	JLabel sub_weapon = new JLabel("Sub weapon:");
	JRadioButton hammer = new JRadioButton("Hammer");
	JRadioButton bow = new JRadioButton("Bow");
	JRadioButton gun = new JRadioButton("Gun");
	JRadioButton staff = new JRadioButton("Staff");
	JButton done = new JButton("DONE");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CapAmerWeapons frame = new CapAmerWeapons();
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
	public CapAmerWeapons() {
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
					bow.setSelected(false);
					gun.setSelected(false);
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
					hammer.setSelected(false);
					gun.setSelected(false);
					staff.setSelected(false);
				}
			}
		});
		
		gun.setFont(new Font("Arial", Font.PLAIN, 13));
		gun.setBounds(142, 157, 141, 23);
		contentPane.add(gun);
		gun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gun.isSelected()) {
					bow.setSelected(false);
					hammer.setSelected(false);
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
					bow.setSelected(false);
					gun.setSelected(false);
					hammer.setSelected(false);
				}
			}
		});
		
		done.setFont(new Font("Arial", Font.PLAIN, 13));
		done.setBounds(166, 243, 117, 29);
		contentPane.add(done);
	}
	
	public CapAmerWeapons(Player p) {
		this();
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hammer.isSelected()) {
					Hammer hammer = new Hammer("hammer", 40);
					p.setSubWeapon(hammer);
					MainScreen.textArea.append("Captain America's sub weapon is set to hammer.\n");
				}
				if (bow.isSelected()) {
					Bow bow = new Bow("bow", 3);
					p.setSubWeapon(bow);
					bow.load();
					MainScreen.textArea.append("Captain America's sub weapon is set to bow.\n");
				}
				if (gun.isSelected()) {
					Gun gun = new Gun("gun", 4);
					p.setSubWeapon(gun);
					gun.load();
					MainScreen.textArea.append("Captain America's sub weapon is set to gun.\n");
				}
				if (staff.isSelected()) {
					Staff staff = new Staff("staff", 20);
					p.setSubWeapon(staff);
					MainScreen.textArea.append("Captain America's sub weapon is set to staff.\n");
				}
				dispose();
			}
		});
	}
}
