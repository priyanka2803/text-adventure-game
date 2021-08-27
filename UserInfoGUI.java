package com.adventuregames;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInfoGUI extends JFrame
{
	private User user;
	private JComboBox<String> nameChoice, genderChoice, astroChoice;
	private JLabel nameLabel, genderLabel, astroLabel, submitLabel;
	private JButton submitButton;
	AdventureGame game;

	public UserInfoGUI(User user,AdventureGame game)
	{
		super("User Info");
		this.game = game;
		this.user = user;
		setLayout(new GridLayout(4,2));
		setSize(400,400);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		nameLabel = new JLabel("Select Your Name");
		add(nameLabel);

		nameChoice = new JComboBox<String>();
		nameChoice.addItem("Sanjay");
		nameChoice.addItem("Vivaan");
		nameChoice.addItem("Priyanka");
		add(nameChoice);

		genderLabel = new JLabel("Select Your Gender");
		add(genderLabel);

		genderChoice = new JComboBox<String>();
		genderChoice.addItem("Male");
		genderChoice.addItem("Female");
		add(genderChoice);

		astroLabel = new JLabel("Select Your Astro Sign");
		add(astroLabel);

		astroChoice = new JComboBox<String>();
		astroChoice.addItem("Aries");
		astroChoice.addItem("Taurus");
		astroChoice.addItem("Gemini");
		astroChoice.addItem("Cancer");
		astroChoice.addItem("Leo");
		astroChoice.addItem("Virgo");
		astroChoice.addItem("Libra");
		astroChoice.addItem("Scorpio");
		astroChoice.addItem("Sagittarius");
		astroChoice.addItem("Aquarius");
		astroChoice.addItem("Pisces");
		add(astroChoice);
		
		submitLabel = new JLabel("Click Submt");
		add(submitLabel);

		submitButton = new JButton("Submit");
		add(submitButton);

		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				user.setName((String)nameChoice.getSelectedItem());
				user.setGender((String)genderChoice.getSelectedItem());
				user.setAstroSign((String)astroChoice.getSelectedItem());
				dispose();
				game.initalizeGame();
			}
		});
		
		setVisible(true);
	}
	
};