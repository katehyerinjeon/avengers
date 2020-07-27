package windows;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import players.Battleground;
import players.Player;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class MainScreen extends JFrame implements ActionListener {

	JPanel contentPane;
	JLabel header = new JLabel("AVENGERS       VS.       LOKI");
	JLabel ca = new JLabel("Captain America");
	JLabel he = new JLabel("Hawkeye");
	JLabel bw = new JLabel("Black Widow");
	JLabel hulk = new JLabel("Hulk");
	JLabel thor = new JLabel("Thor");
	JLabel loki = new JLabel("Loki");
	static JButton ca_attack = new JButton("attack");
	static JButton he_attack = new JButton("attack");
	static JButton bw_attack = new JButton("attack");
	static JButton hulk_attack = new JButton("attack");
	static JButton thor_attack = new JButton("attack");
	static JButton loki_attack = new JButton("attack");
	JButton ca_weapons = new JButton("weapons");
	JButton he_weapons = new JButton("weapons");
	JButton bw_weapons = new JButton("weapons");
	JButton hulk_weapons = new JButton("weapons");
	JButton thor_weapons = new JButton("weapons");
	JButton loki_weapons = new JButton("weapons");
	JButton start = new JButton("START GAME");
	JLabel score_board = new JLabel("Score Board");
	JLabel avengers_hp = new JLabel("Avengers HP");
	JLabel loki_hp = new JLabel("Loki HP");
	JProgressBar avengers_hp_bar = new JProgressBar();
	JProgressBar loki_hp_bar = new JProgressBar();
	JScrollPane scrollPane = new JScrollPane();
	public static JTextArea textArea = new JTextArea();
	JButton save_file = new JButton("Save file");
	JLabel background = new JLabel("");
	
	// Initializing Avengers and Loki's hp
	static int avengersHp = 1500;
	static int lokiHp = 1500;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Arial Black", Font.PLAIN, 30));
		header.setForeground(Color.WHITE);
		header.setBounds(152, 39, 505, 45);
		contentPane.add(header);
		
		ca.setForeground(Color.WHITE);
		ca.setFont(new Font("Arial Black", Font.BOLD, 17));
		ca.setBounds(32, 128, 167, 16);
		contentPane.add(ca);
		
		he.setForeground(Color.WHITE);
		he.setFont(new Font("Arial Black", Font.PLAIN, 17));
		he.setBounds(32, 156, 167, 16);
		contentPane.add(he);
		
		bw.setForeground(Color.WHITE);
		bw.setFont(new Font("Arial Black", Font.PLAIN, 17));
		bw.setBounds(32, 184, 167, 16);
		contentPane.add(bw);
		
		hulk.setForeground(Color.WHITE);
		hulk.setFont(new Font("Arial Black", Font.PLAIN, 17));
		hulk.setBounds(32, 212, 167, 16);
		contentPane.add(hulk);
		
		thor.setForeground(Color.WHITE);
		thor.setFont(new Font("Arial Black", Font.PLAIN, 17));
		thor.setBounds(32, 240, 167, 16);
		contentPane.add(thor);
		
		loki.setForeground(Color.WHITE);
		loki.setFont(new Font("Arial Black", Font.PLAIN, 17));
		loki.setBounds(482, 130, 167, 16);
		contentPane.add(loki);
		
		ca_attack.setFont(new Font("Arial Black", Font.PLAIN, 12));
		ca_attack.setBounds(201, 128, 117, 29);
		ca_attack.setBackground(Color.WHITE);
		contentPane.add(ca_attack);
		
		he_attack.setFont(new Font("Arial Black", Font.PLAIN, 12));
		he_attack.setBounds(201, 156, 117, 29);
		he_attack.setBackground(Color.WHITE);
		contentPane.add(he_attack);
		
		bw_attack.setFont(new Font("Arial Black", Font.PLAIN, 12));
		bw_attack.setBounds(201, 184, 117, 29);
		bw_attack.setBackground(Color.WHITE);
		contentPane.add(bw_attack);
		
		hulk_attack.setFont(new Font("Arial Black", Font.PLAIN, 12));
		hulk_attack.setBounds(201, 212, 117, 29);
		hulk_attack.setBackground(Color.WHITE);
		contentPane.add(hulk_attack);
		
		thor_attack.setFont(new Font("Arial Black", Font.PLAIN, 12));
		thor_attack.setBounds(201, 240, 117, 29);
		thor_attack.setBackground(Color.WHITE);
		contentPane.add(thor_attack);
		
		loki_attack.setFont(new Font("Arial Black", Font.PLAIN, 12));
		loki_attack.setBounds(651, 128, 117, 29);
		loki_attack.setBackground(Color.WHITE);
		contentPane.add(loki_attack);

		ca_weapons.setFont(new Font("Arial Black", Font.PLAIN, 12));
		ca_weapons.setBounds(320, 128, 117, 29);
		ca_weapons.setBackground(Color.WHITE);
		contentPane.add(ca_weapons);
		
		he_weapons.setFont(new Font("Arial Black", Font.PLAIN, 12));
		he_weapons.setBounds(320, 156, 117, 29);
		he_weapons.setBackground(Color.WHITE);
		contentPane.add(he_weapons);
		
		bw_weapons.setFont(new Font("Arial Black", Font.PLAIN, 12));
		bw_weapons.setBounds(320, 184, 117, 29);
		bw_weapons.setBackground(Color.WHITE);
		contentPane.add(bw_weapons);
		
		hulk_weapons.setFont(new Font("Arial Black", Font.PLAIN, 12));
		hulk_weapons.setBounds(320, 212, 117, 29);
		hulk_weapons.setBackground(Color.WHITE);
		contentPane.add(hulk_weapons);
		
		thor_weapons.setFont(new Font("Arial Black", Font.PLAIN, 12));
		thor_weapons.setBounds(320, 240, 117, 29);
		thor_weapons.setBackground(Color.WHITE);
		contentPane.add(thor_weapons);
		
		loki_weapons.setFont(new Font("Arial Black", Font.PLAIN, 12));
		loki_weapons.setBounds(651, 182, 117, 29);
		loki_weapons.setBackground(Color.WHITE);
		contentPane.add(loki_weapons);
		start.setFont(new Font("Arial Black", Font.PLAIN, 13));
		
		start.setBounds(482, 262, 286, 29);
		contentPane.add(start);

		score_board.setForeground(Color.WHITE);
		score_board.setFont(new Font("Arial Black", Font.BOLD, 25));
		score_board.setBounds(32, 550, 179, 29);
		contentPane.add(score_board);
		
		avengers_hp.setForeground(Color.WHITE);
		avengers_hp.setFont(new Font("Arial Black", Font.PLAIN, 17));
		avengers_hp.setBounds(32, 591, 134, 20);
		contentPane.add(avengers_hp);
		
		loki_hp.setForeground(Color.WHITE);
		loki_hp.setFont(new Font("Arial Black", Font.PLAIN, 17));
		loki_hp.setBounds(32, 623, 134, 20);
		contentPane.add(loki_hp);
		
		avengers_hp_bar.setMaximum(1500);
		avengers_hp_bar.setValue(avengersHp);
		avengers_hp_bar.setBounds(178, 591, 590, 20);
		contentPane.add(avengers_hp_bar);
		
		loki_hp_bar.setMaximum(1500);
		loki_hp_bar.setValue(lokiHp);
		loki_hp_bar.setBounds(178, 623, 590, 20);
		contentPane.add(loki_hp_bar);
		
		scrollPane.setBounds(32, 303, 736, 216);
		contentPane.add(scrollPane);
		textArea.setFont(new Font("Rockwell", Font.PLAIN, 13));
		scrollPane.setViewportView(textArea);
		
		save_file.setFont(new Font("Arial Black", Font.PLAIN, 13));
		save_file.setBounds(651, 531, 117, 29);
		contentPane.add(save_file);
		save_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		
		background.setIcon(new ImageIcon("/Users/katejeon/Documents/Spring_2020/CPSC_35339/avengers_project/ny_battle.png"));
		background.setBounds(0, 0, 800, 678);
		contentPane.add(background);
	}

	public MainScreen(Player [] players) {
		this();
		
		// Deactivating attack buttons before game starts
		ca_attack.setEnabled(false);
    	he_attack.setEnabled(false);
    	bw_attack.setEnabled(false);
    	hulk_attack.setEnabled(false);
    	thor_attack.setEnabled(false);
    	loki_attack.setEnabled(false);
    	
		printIntro();
		
		// Choosing weapons for players
		textArea.append("Choose weapons for players by clicking the weapons button beside each character.\n");
		textArea.append("When done, press START GAME. You cannot change player's weapons once you start the game.\n\n");
		setWeapons();
		
		// Print all game characters and start game if all players are set
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < players.length; i++) {
					
				}
				if (allSet(players)) {
					textArea.append("\nDisplaying all game characters.\n");
	            	for (int i = 0; i < players.length; i++) {
						if (i == 0) {
							textArea.append("---------- Avengers ----------\n");
						}
						else if (i == 5) {
							textArea.append("---------- The Villain ----------\n");
						}
						players[i].printPlayer();
						textArea.append("\n");
					}
	            	// Deactivating all weapons buttons and game start button
	            	ca_weapons.setEnabled(false);
	            	he_weapons.setEnabled(false);
	            	bw_weapons.setEnabled(false);
	            	hulk_weapons.setEnabled(false);
	            	thor_weapons.setEnabled(false);
	            	loki_weapons.setEnabled(false);
	            	start.setEnabled(false);
	            	
	            	// Activating all attack buttons
	            	ca_attack.setEnabled(true);
	            	he_attack.setEnabled(true);
	            	bw_attack.setEnabled(true);
	            	hulk_attack.setEnabled(true);
	            	thor_attack.setEnabled(true);
	            	loki_attack.setEnabled(true);
	            	
	            	textArea.append("You may start the game. Click attack button next to each character to attack it's enemy.\n\n");
				}
				else {
					for (int i = 0; i < players.length; i++) {
						players[i].printNullWeapons();
					}
				}
			}
		});
		
		// Battle
		// Captain America's attack
		ca_attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Battleground.captainAmerica.attack(Battleground.loki, Battleground.captainAmerica.getAttackPower());
				lokiHp = Battleground.loki.getHp();
				loki_hp_bar.setValue(lokiHp);
				endGame();
				loki_attack.doClick();
			}
		});
		
		// Hawkeye's attack
		he_attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Battleground.hawkeye.attack(Battleground.loki, Battleground.hawkeye.getAttackPower());
				lokiHp = Battleground.loki.getHp();
				loki_hp_bar.setValue(lokiHp);
				endGame();
				loki_attack.doClick();
			}
		});
		
		// Black Widow's attack
		bw_attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Battleground.blackWidow.attack(Battleground.loki, Battleground.blackWidow.getAttackPower());
				lokiHp = Battleground.loki.getHp();
				loki_hp_bar.setValue(lokiHp);
				endGame();
				loki_attack.doClick();
			}
		});
		
		// Thor's attack
		thor_attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Battleground.thor.attack(Battleground.loki, Battleground.thor.getAttackPower());
				lokiHp = Battleground.loki.getHp();
				loki_hp_bar.setValue(lokiHp);
				endGame();
				loki_attack.doClick();
			}
		});
		
		// Hulk's attack
		hulk_attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Battleground.hulk.attack(Battleground.loki, Battleground.hulk.getAttackPower());
				lokiHp = Battleground.loki.getHp();
				loki_hp_bar.setValue(lokiHp);
				endGame();
				loki_attack.doClick();
			}
		});
		
		// Loki's attack
		loki_attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Battleground.loki.attack(getRandomTarget(), Battleground.loki.getAttackPower());
				avengersHp = getAvengersHp();
				avengers_hp_bar.setValue(avengersHp);
				endGame();
			}
		});
		
		// Saving file
		save_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\nSaving file...");
				saveFile();
			}
		});
	}
	
	// Printing header
	public void printIntro() {
		textArea.setText("\n==================== WELCOME TO AVENGERS VS. LOKI GAME ====================\n");
		textArea.append("One moment... Creating game characters.\n\n");
	}
	
	// Setting weapons for all characters by weapons buttons
	public void setWeapons() {
		ca_weapons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CapAmerWeapons(Battleground.captainAmerica).setVisible(true);
			}
		}
		);
		he_weapons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HawkeyeWeapons(Battleground.hawkeye).setVisible(true);
			}
		}
		);
		bw_weapons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BlackWidowWeapons(Battleground.blackWidow).setVisible(true);
			}
		}
		);
		hulk_weapons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HulkWeapons(Battleground.hulk).setVisible(true);
			}
		}
		);
		thor_weapons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ThorWeapons(Battleground.thor).setVisible(true);
			}
		}
		);
		loki_weapons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LokiWeapons(Battleground.loki).setVisible(true);
			}
		}
		);
	}
	
	// Getting random target from 5 Avengers members for Loki to attack
	public Player getRandomTarget() {
		Player target = null;
		int rand = Battleground.getRandomNumber(1, 5);
		switch (rand) {
		case 1:
			if (Battleground.captainAmerica.stillAlive()) {
				target = Battleground.captainAmerica;
				break;
			}
		case 2:
			if (Battleground.hawkeye.stillAlive()) {
				target = Battleground.hawkeye;
				break;
			}
		case 3:
			if (Battleground.blackWidow.stillAlive()) {
				target = Battleground.blackWidow;
				break;
			}
		case 4:
			if (Battleground.hulk.stillAlive()) {
				target = Battleground.hulk;
				break;
			}
		case 5:
			if (Battleground.thor.stillAlive()) {
				target = Battleground.thor;
				break;
			}
		default:
			target = Battleground.captainAmerica;
			break;
		}
		return target;
	}
	
	// Adding all 5 Avengers members hps
	public int getAvengersHp() {
		int avengersHp = Battleground.captainAmerica.getHp()
						+ Battleground.hawkeye.getHp()
						+ Battleground.blackWidow.getHp()
						+ Battleground.hulk.getHp()
						+ Battleground.thor.getHp();
		return avengersHp;
	}
	
	// Check if all player's weapons are all set
	public boolean allSet(Player [] players) {
		for (int i = 0; i < players.length; i++) {
			if (!players[i].allSet()) {
				return false;
			}
		}
		return true;
	}
	
	// Disabling attack button when the player is dead
	public static void disable(Player p) {
		switch (p.name) {
		case "Captain America":
			ca_attack.setEnabled(false);
			break;
		case "Hawkeye":
			he_attack.setEnabled(false);
			break;
		case "Black Widow":
			bw_attack.setEnabled(false);
			break;
		case "Hulk":
			hulk_attack.setEnabled(false);
			break;
		case "Thor":
			thor_attack.setEnabled(false);
			break;
		case "Loki":
			loki_attack.setEnabled(false);
			break;
		}
	}
	
	// Check if any Avengers is alive
	public boolean avengersAlive() {
		if (avengersHp <= 0) {
			return false;
		}
		return true;
	}
	
	// Check if Loki is alive
	public boolean lokiAlive() {
		if (lokiHp <= 0) {
			return false;
		}
		return true;
	}
	
	// Ending the game if Avengers or Loki is dead
	public void endGame() {
		// If Avengers lose and Loki wins
		if (!avengersAlive()) {
			ca_attack.setEnabled(false);
			he_attack.setEnabled(false);
			bw_attack.setEnabled(false);
			hulk_attack.setEnabled(false);
			thor_attack.setEnabled(false);
			loki_attack.setEnabled(false);
			textArea.append("\n                    G A M E   O V E R                    \n");
			textArea.append("Oh no! Avengers lost... Loki conquered earth...");
		}
		
		// If Loki loses and Avengers win
		else if (!lokiAlive()) {
			ca_attack.setEnabled(false);
			he_attack.setEnabled(false);
			bw_attack.setEnabled(false);
			hulk_attack.setEnabled(false);
			thor_attack.setEnabled(false);
			loki_attack.setEnabled(false);
			textArea.append("\n                    Y O U   W O N                    \n");
			textArea.append("Yay! Avengers saved the world from Loki! Nice work!");
		}
	}
	
	// Saving all texts into txt file
	public void saveFile() {
		PrintWriter output = null;
		try {
			output = new PrintWriter("/Users/katejeon/Documents/Spring_2020/CPSC_35339/avengers_project/game_result.txt");
			output.println(textArea.getText());
			output.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File doesn't exist.");
		} finally {
			output.close();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
