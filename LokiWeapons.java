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

public class LokiWeapons extends JFrame {

	JPanel contentPane;
	JLabel header = new JLabel("Choose Loki's weapons.");
	JLabel main_weapon = new JLabel("Main weapon: Scepter");
	JLabel sub_weapon = new JLabel("Sub weapon:");
	JRadioButton hammer = new JRadioButton("Hammer");
	JRadioButton bow = new JRadioButton("Bow");
	JRadioButton gun = new JRadioButton("Gun");
	JRadioButton shield = new JRadioButton("Shield");
	private final JButton done = new JButton("DONE");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LokiWeapons frame = new LokiWeapons();
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
	public LokiWeapons() {
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
					gun.setSelected(false);
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
					gun.setSelected(false);
					hammer.setSelected(false);
				}
			}
		});
		
		gun.setFont(new Font("Arial", Font.PLAIN, 13));
		gun.setBounds(142, 157, 141, 23);
		contentPane.add(gun);
		gun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gun.isSelected()) {
					shield.setSelected(false);
					bow.setSelected(false);
					hammer.setSelected(false);
				}
			}
		});
		
		shield.setFont(new Font("Arial", Font.PLAIN, 13));
		shield.setBounds(142, 192, 141, 23);
		contentPane.add(shield);
		shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shield.isSelected()) {
					hammer.setSelected(false);
					bow.setSelected(false);
					gun.setSelected(false);
				}
			}
		});
		
		done.setFont(new Font("Arial", Font.PLAIN, 13));
		done.setBounds(166, 243, 117, 29);
		
		contentPane.add(done);
	}
	
	public LokiWeapons(Player p) {
		this();
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hammer.isSelected()) {
					Hammer hammer = new Hammer("hammer", 40);
					p.setSubWeapon(hammer);
					MainScreen.textArea.append("Loki's sub weapon is set to hammer.\n");
				}
				if (shield.isSelected()) {
					Shield shield = new Shield("shield", 35);
					p.setSubWeapon(shield);
					MainScreen.textArea.append("Loki's sub weapon is set to shield.\n");
				}
				if (bow.isSelected()) {
					Bow bow = new Bow("bow", 3);
					p.setSubWeapon(bow);
					bow.load();
					MainScreen.textArea.append("Loki's sub weapon is set to bow.\n");
				}
				if (gun.isSelected()) {
					Gun gun = new Gun("gun", 4);
					p.setSubWeapon(gun);
					gun.load();
					MainScreen.textArea.append("Loki's sub weapon is set to gun.\n");
				}
				dispose();
			}
		});
	}

}
