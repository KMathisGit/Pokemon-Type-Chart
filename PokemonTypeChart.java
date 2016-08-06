import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class PokemonTypeChart {
	private static String[] pokemonTypes = new String[17];
	private static int Normal = 0;
	private static int Fire = 1;
	private static int Water = 2;
	private static int Grass = 3;
	private static int Electrical = 4;
	private static int Ice = 5;
	private static int Fighting = 6; 
	private static int Poison = 7; 
	private static int Ground = 8;
	private static int Flying = 9;
	private static int Psychic = 10;
	private static int Bug = 11;
	private static int Rock = 12;
	private static int Ghost = 13;
	private static int Dragon = 14;
	private static int Dark = 15;
	private static int Steel = 16;
	public static double[][] pokeChart = new double[17][17];
	public static int attacker = 0;
	public static int defender = 0;
	public static String attacking;
	public static String defending;
	
	private JFrame frmPokemonAttributeCalculator;
	
	public static void main(String[] args) {
		populateCharts();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokemonTypeChart window = new PokemonTypeChart();
					window.frmPokemonAttributeCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private static void populateCharts() {
		pokeChart[0][0] = 1.0;pokeChart[0][1] = 1.0;pokeChart[0][2] = 1.0;pokeChart[0][3] = 1.0;pokeChart[0][4] = 1.0;pokeChart[0][5] = 1.0;pokeChart[0][6] = 1.0;pokeChart[0][7] = 1.0;pokeChart[0][8] = 1.0;pokeChart[0][9] = 1.0;pokeChart[0][10] = 1.0;pokeChart[0][11] = 1.0;pokeChart[0][12] = 0.5;pokeChart[0][13] = 0.0;pokeChart[0][14] = 1.0;pokeChart[0][15] = 1.0;pokeChart[0][16] = 0.5;
		pokeChart[1][0] = 1.0;pokeChart[1][1] = 0.5;pokeChart[1][2] = 0.5;pokeChart[1][3] = 2.0;pokeChart[1][4] = 1.0;pokeChart[1][5] = 2.0;pokeChart[1][6] = 1.0;pokeChart[1][7] = 1.0;pokeChart[1][8] = 1.0;pokeChart[1][9] = 1.0;pokeChart[1][10] = 1.0;pokeChart[1][11] = 2.0;pokeChart[1][12] = 0.5;pokeChart[1][13] = 1.0;pokeChart[1][14] = 0.5;pokeChart[1][15] = 1.0;pokeChart[1][16] = 2.0;
		pokeChart[2][0] = 1.0;pokeChart[2][1] = 2.0;pokeChart[2][2] = 0.5;pokeChart[2][3] = 0.5;pokeChart[2][4] = 1.0;pokeChart[2][5] = 1.0;pokeChart[2][6] = 1.0;pokeChart[2][7] = 1.0;pokeChart[2][8] = 2.0;pokeChart[2][9] = 1.0;pokeChart[2][10] = 1.0;pokeChart[2][11] = 1.0;pokeChart[2][12] = 2.0;pokeChart[2][13] = 1.0;pokeChart[2][14] = 0.5;pokeChart[2][15] = 1.0;pokeChart[2][16] = 1.0;
		pokeChart[3][0] = 1.0;pokeChart[3][1] = 0.5;pokeChart[3][2] = 2.0;pokeChart[3][3] = 0.5;pokeChart[3][4] = 1.0;pokeChart[3][5] = 1.0;pokeChart[3][6] = 1.0;pokeChart[3][7] = 0.5;pokeChart[3][8] = 2.0;pokeChart[3][9] = 0.5;pokeChart[3][10] = 1.0;pokeChart[3][11] = 0.5;pokeChart[3][12] = 2.0;pokeChart[3][13] = 1.0;pokeChart[3][14] = 0.5;pokeChart[3][15] = 1.0;pokeChart[3][16] = 0.5;
		pokeChart[4][0] = 1.0;pokeChart[4][1] = 1.0;pokeChart[4][2] = 2.0;pokeChart[4][3] = 0.5;pokeChart[4][4] = 0.5;pokeChart[4][5] = 1.0;pokeChart[4][6] = 1.0;pokeChart[4][7] = 1.0;pokeChart[4][8] = 0.0;pokeChart[4][9] = 2.0;pokeChart[4][10] = 1.0;pokeChart[4][11] = 1.0;pokeChart[4][12] = 1.0;pokeChart[4][13] = 1.0;pokeChart[4][14] = 0.5;pokeChart[4][15] = 1.0;pokeChart[4][16] = 1.0;
		pokeChart[5][0] = 1.0;pokeChart[5][1] = 0.5;pokeChart[5][2] = 0.5;pokeChart[5][3] = 2.0;pokeChart[5][4] = 1.0;pokeChart[5][5] = 0.5;pokeChart[5][6] = 1.0;pokeChart[5][7] = 1.0;pokeChart[5][8] = 2.0;pokeChart[5][9] = 2.0;pokeChart[5][10] = 1.0;pokeChart[5][11] = 1.0;pokeChart[5][12] = 1.0;pokeChart[5][13] = 1.0;pokeChart[5][14] = 2.0;pokeChart[5][15] = 1.0;pokeChart[5][16] = 0.5;
		pokeChart[6][0] = 2.0;pokeChart[6][1] = 1.0;pokeChart[6][2] = 1.0;pokeChart[6][3] = 1.0;pokeChart[6][4] = 1.0;pokeChart[6][5] = 2.0;pokeChart[6][6] = 1.0;pokeChart[6][7] = 0.5;pokeChart[6][8] = 1.0;pokeChart[6][9] = 0.5;pokeChart[6][10] = 0.5;pokeChart[6][11] = 0.5;pokeChart[6][12] = 2.0;pokeChart[6][13] = 0.0;pokeChart[6][14] = 1.0;pokeChart[6][15] = 2.0;pokeChart[6][16] = 2.0;
		pokeChart[7][0] = 1.0;pokeChart[7][1] = 1.0;pokeChart[7][2] = 1.0;pokeChart[7][3] = 2.0;pokeChart[7][4] = 1.0;pokeChart[7][5] = 1.0;pokeChart[7][6] = 1.0;pokeChart[7][7] = 0.5;pokeChart[7][8] = 0.5;pokeChart[7][9] = 1.0;pokeChart[7][10] = 1.0;pokeChart[7][11] = 1.0;pokeChart[7][12] = 0.5;pokeChart[7][13] = 0.5;pokeChart[7][14] = 1.0;pokeChart[7][15] = 1.0;pokeChart[7][16] = 0.0;
		pokeChart[8][0] = 1.0;pokeChart[8][1] = 2.0;pokeChart[8][2] = 1.0;pokeChart[8][3] = 0.5;pokeChart[8][4] = 2.0;pokeChart[8][5] = 1.0;pokeChart[8][6] = 1.0;pokeChart[8][7] = 2.0;pokeChart[8][8] = 1.0;pokeChart[8][9] = 0.0;pokeChart[8][10] = 1.0;pokeChart[8][11] = 0.5;pokeChart[8][12] = 2.0;pokeChart[8][13] = 1.0;pokeChart[8][14] = 1.0;pokeChart[8][15] = 1.0;pokeChart[8][16] = 2.0;
		pokeChart[9][0] = 1.0;pokeChart[9][1] = 1.0;pokeChart[9][2] = 1.0;pokeChart[9][3] = 2.0;pokeChart[9][4] = 0.5;pokeChart[9][5] = 1.0;pokeChart[9][6] = 2.0;pokeChart[9][7] = 1.0;pokeChart[9][8] = 1.0;pokeChart[9][9] = 1.0;pokeChart[9][10] = 1.0;pokeChart[9][11] = 2.0;pokeChart[9][12] = 0.5;pokeChart[9][13] = 1.0;pokeChart[9][14] = 1.0;pokeChart[9][15] = 1.0;pokeChart[9][16] = 2.0;
		pokeChart[10][0] = 1.0;pokeChart[10][1] = 1.0;pokeChart[10][2] = 1.0;pokeChart[10][3] = 1.0;pokeChart[10][4] = 1.0;pokeChart[10][5] = 1.0;pokeChart[10][6] = 2.0;pokeChart[10][7] = 2.0;pokeChart[10][8] = 1.0;pokeChart[10][9] = 1.0;pokeChart[10][10] = 0.5;pokeChart[10][11] = 1.0;pokeChart[10][12] = 1.0;pokeChart[10][13] = 1.0;pokeChart[10][14] = 1.0;pokeChart[10][15] = 0.0;pokeChart[10][16] = 0.5;
		pokeChart[11][0] = 1.0;pokeChart[11][1] = 0.5;pokeChart[11][2] = 1.0;pokeChart[11][3] = 2.0;pokeChart[11][4] = 1.0;pokeChart[11][5] = 1.0;pokeChart[11][6] = 0.5;pokeChart[11][7] = 0.5;pokeChart[11][8] = 1.0;pokeChart[11][9] = 0.5;pokeChart[11][10] = 2.0;pokeChart[11][11] = 1.0;pokeChart[11][12] = 1.0;pokeChart[11][13] = 0.5;pokeChart[11][14] = 1.0;pokeChart[11][15] = 2.0;pokeChart[11][16] = 0.5;
		pokeChart[12][0] = 1.0;pokeChart[12][1] = 2.0;pokeChart[12][2] = 1.0;pokeChart[12][3] = 1.0;pokeChart[12][4] = 1.0;pokeChart[12][5] = 2.0;pokeChart[12][6] = 0.5;pokeChart[12][7] = 1.0;pokeChart[12][8] = 0.5;pokeChart[12][9] = 2.0;pokeChart[12][10] = 1.0;pokeChart[12][11] = 2.0;pokeChart[12][12] = 1.0;pokeChart[12][13] = 1.0;pokeChart[12][14] = 1.0;pokeChart[12][15] = 1.0;pokeChart[12][16] = 0.5;
		pokeChart[13][0] = 0.0;pokeChart[13][1] = 1.0;pokeChart[13][2] = 1.0;pokeChart[13][3] = 1.0;pokeChart[13][4] = 1.0;pokeChart[13][5] = 1.0;pokeChart[13][6] = 1.0;pokeChart[13][7] = 1.0;pokeChart[13][8] = 1.0;pokeChart[13][9] = 1.0;pokeChart[13][10] = 2.0;pokeChart[13][11] = 1.0;pokeChart[13][12] = 1.0;pokeChart[13][13] = 2.0;pokeChart[13][14] = 1.0;pokeChart[13][15] = 0.5;pokeChart[13][16] = 0.5;
		pokeChart[14][0] = 1.0;pokeChart[14][1] = 1.0;pokeChart[14][2] = 1.0;pokeChart[14][3] = 1.0;pokeChart[14][4] = 1.0;pokeChart[14][5] = 1.0;pokeChart[14][6] = 1.0;pokeChart[14][7] = 1.0;pokeChart[14][8] = 1.0;pokeChart[14][9] = 1.0;pokeChart[14][10] = 1.0;pokeChart[14][11] = 1.0;pokeChart[14][12] = 1.0;pokeChart[14][13] = 1.0;pokeChart[14][14] = 2.0;pokeChart[14][15] = 1.0;pokeChart[14][16] = 0.5;
		pokeChart[15][0] = 1.0;pokeChart[15][1] = 1.0;pokeChart[15][2] = 1.0;pokeChart[15][3] = 1.0;pokeChart[15][4] = 1.0;pokeChart[15][5] = 1.0;pokeChart[15][6] = 0.5;pokeChart[15][7] = 1.0;pokeChart[15][8] = 1.0;pokeChart[15][9] = 1.0;pokeChart[15][10] = 2.0;pokeChart[15][11] = 1.0;pokeChart[15][12] = 1.0;pokeChart[15][13] = 2.0;pokeChart[15][14] = 1.0;pokeChart[15][15] = 0.5;pokeChart[15][16] = 0.5;
		pokeChart[16][0] = 1.0;pokeChart[16][1] = 0.5;pokeChart[16][2] = 0.5;pokeChart[16][3] = 1.0;pokeChart[16][4] = 1.0;pokeChart[16][5] = 2.0;pokeChart[16][6] = 1.0;pokeChart[16][7] = 1.0;pokeChart[16][8] = 1.0;pokeChart[16][9] = 1.0;pokeChart[16][10] = 1.0;pokeChart[16][11] = 1.0;pokeChart[16][12] = 2.0;pokeChart[16][13] = 1.0;pokeChart[16][14] = 1.0;pokeChart[16][15] = 1.0;pokeChart[16][16] = 0.5;
	}


	public PokemonTypeChart() {
		initialize();
	}

	
	private void initialize() {
		frmPokemonAttributeCalculator = new JFrame();
		frmPokemonAttributeCalculator.setTitle("Pokemon Attribute Calculator");
		frmPokemonAttributeCalculator.setBounds(100, 100, 484, 385);
		frmPokemonAttributeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokemonAttributeCalculator.getContentPane().setLayout(null);
		
		JLabel lblAttacker = new JLabel("Attacking Type");
		lblAttacker.setBounds(54, 11, 132, 23);
		lblAttacker.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPokemonAttributeCalculator.getContentPane().add(lblAttacker);
		
		JLabel lblDefender = new JLabel("Defending Type");
		lblDefender.setBounds(314, 11, 123, 23);
		lblDefender.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPokemonAttributeCalculator.getContentPane().add(lblDefender);
		
		JButton btnNewButton = new JButton("Normal");
		btnNewButton.setBounds(10, 36, 91, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				attacking = "Normal";
				attacker = 0;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnNewButton);
		
		JButton btnFire = new JButton("Fire");
		btnFire.setBounds(107, 36, 91, 23);
		btnFire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Fire";
				attacker = 1;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnFire);
		
		JButton btnWater = new JButton("Water");
		btnWater.setBounds(10, 64, 91, 23);
		btnWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Water";
				attacker = 2;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnWater);
		
		JButton btnGrass = new JButton("Grass");
		btnGrass.setBounds(107, 64, 91, 23);
		btnGrass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Grass";
				attacker = 3;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnGrass);
		
		JButton btnElectric = new JButton("Electric");
		btnElectric.setBounds(10, 93, 91, 23);
		btnElectric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Electric";
				attacker = 4;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnElectric);
		
		JButton btnIce = new JButton("Ice");
		btnIce.setBounds(107, 93, 91, 23);
		btnIce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Ice";
				attacker = 5;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnIce);
		
		JButton btnFighting = new JButton("Fighting");
		btnFighting.setBounds(10, 121, 91, 23);
		btnFighting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Fighting";
				attacker = 6;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnFighting);
		
		JButton btnPoison = new JButton("Poison");
		btnPoison.setBounds(107, 121, 91, 23);
		btnPoison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Poison";
				attacker = 7;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnPoison);
		
		JButton btnGround = new JButton("Ground");
		btnGround.setBounds(10, 152, 91, 23);
		btnGround.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Ground";
				attacker = 8;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnGround);
		
		JButton btnFlying = new JButton("Flying");
		btnFlying.setBounds(107, 152, 91, 23);
		btnFlying.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Flying";
				attacker = 9;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnFlying);
		
		JButton btnPsychic = new JButton("Psychic");
		btnPsychic.setBounds(10, 183, 91, 23);
		btnPsychic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Psychic";
				attacker = 10;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnPsychic);
		
		JButton btnBug = new JButton("Bug");
		btnBug.setBounds(107, 183, 91, 23);
		btnBug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Bug";
				attacker = 11;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnBug);
		
		JButton btnRock = new JButton("Rock");
		btnRock.setBounds(10, 212, 91, 23);
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Rock";
				attacker = 12;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnRock);
		
		JButton btnGhost = new JButton("Ghost");
		btnGhost.setBounds(107, 212, 91, 23);
		btnGhost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Ghost";
				attacker = 13;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnGhost);
		
		JButton btnDragon = new JButton("Dragon");
		btnDragon.setBounds(10, 239, 91, 23);
		btnDragon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Dragon";
				attacker = 14;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnDragon);
		
		JButton btnDark = new JButton("Dark");
		btnDark.setBounds(107, 239, 91, 23);
		btnDark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Dark";
				attacker = 15;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnDark);
		
		JButton btnSteel = new JButton("Steel");
		btnSteel.setBounds(54, 269, 91, 23);
		btnSteel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attacking = "Steel";
				attacker = 16;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnSteel);
		
		JButton btnNormal = new JButton("Normal");
		btnNormal.setBounds(274, 36, 91, 23);
		btnNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Normal";
				defender = 0;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnNormal);
		
		JButton btnFire_1 = new JButton("Fire");
		btnFire_1.setBounds(371, 36, 91, 23);
		btnFire_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Fire";
				defender = 1;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnFire_1);
		
		JButton btnWater_1 = new JButton("Water");
		btnWater_1.setBounds(274, 64, 91, 23);
		btnWater_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Water";
				defender = 2;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnWater_1);
		
		JButton btnElectric_1 = new JButton("Electric");
		btnElectric_1.setBounds(274, 93, 91, 23);
		btnElectric_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Electric";
				defender = 4;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnElectric_1);
		
		JButton btnFighting_1 = new JButton("Fighting");
		btnFighting_1.setBounds(274, 121, 91, 23);
		btnFighting_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				defending = "Fighting";
				defender = 6;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnFighting_1);
		
		JButton btnGround_1 = new JButton("Ground");
		btnGround_1.setBounds(274, 152, 91, 23);
		btnGround_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Ground";
				defender = 8;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnGround_1);
		
		JButton btnPsychic_1 = new JButton("Psychic");
		btnPsychic_1.setBounds(274, 183, 91, 23);
		btnPsychic_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Psychic";
				defender = 10;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnPsychic_1);
		
		JButton btnRock_1 = new JButton("Rock");
		btnRock_1.setBounds(274, 212, 91, 23);
		btnRock_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Rock";
				defender = 12;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnRock_1);
		
		JButton btnDragon_1 = new JButton("Dragon");
		btnDragon_1.setBounds(274, 239, 91, 23);
		btnDragon_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Dragon";
				defender = 14;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnDragon_1);
		
		JButton btnSteel_1 = new JButton("Steel");
		btnSteel_1.setBounds(323, 269, 91, 23);
		btnSteel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Steel";
				defender = 16;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnSteel_1);
		
		JButton btnGrass_1 = new JButton("Grass");
		btnGrass_1.setBounds(371, 64, 91, 23);
		btnGrass_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Grass";
				defender = 3;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnGrass_1);
		
		JButton btnIce_1 = new JButton("Ice");
		btnIce_1.setBounds(371, 93, 91, 23);
		btnIce_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Ice";
				defender = 5;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnIce_1);
		
		JButton btnPoison_1 = new JButton("Poison");
		btnPoison_1.setBounds(371, 121, 91, 23);
		btnPoison_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Poison";
				defender = 7;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnPoison_1);
		
		JButton btnFlying_1 = new JButton("Flying");
		btnFlying_1.setBounds(371, 152, 91, 23);
		btnFlying_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Flying";
				defender = 9;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnFlying_1);
		
		JButton btnBug_1 = new JButton("Bug");
		btnBug_1.setBounds(371, 183, 91, 23);
		btnBug_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Bug";
				defender = 11;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnBug_1);
		
		JButton btnGhost_1 = new JButton("Ghost");
		btnGhost_1.setBounds(371, 212, 91, 23);
		btnGhost_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Ghost";
				defender = 13;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnGhost_1);
		
		JButton btnDark_1 = new JButton("Dark");
		btnDark_1.setBounds(371, 239, 91, 23);
		btnDark_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defending = "Dark";
				defender = 15;
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnDark_1);
		
		JLabel lblVs = new JLabel("VS.");
		lblVs.setBounds(220, 132, 46, 19);
		lblVs.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmPokemonAttributeCalculator.getContentPane().add(lblVs);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(25, 295, 340, 44);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel.setVisible(false);
		frmPokemonAttributeCalculator.getContentPane().add(lblNewLabel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculate.setBounds(371, 303, 91, 33);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(true);
				lblNewLabel.setText("A " + attacking + " type attacking a " + defending + " results in " + pokeChart[attacker][defender] + "x damage.");
				
			}
		});
		frmPokemonAttributeCalculator.getContentPane().add(btnCalculate);
		
		
	}
}
