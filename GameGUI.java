package com.adventuregames;

import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GameGUI extends JFrame
{
	JTextArea jta;
	JScrollPane jsp;
	JProgressBar jpb;
	JButton option1btn,option2btn,option3btn;
	AdventureGame game;
	Obstacle obstacle;
	ObstacleHandlingChoice[] choices;
	

	public GameGUI(AdventureGame game)
	{
		super("Game");
		setLocation(10,10);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jsp.setBounds(10,10,700,500);
		add(jsp);

		option1btn = new JButton("Option 1");
		option1btn.setBounds(10,560,200,50);
		add(option1btn);

		option2btn = new JButton("Option 2");
		option2btn.setBounds(260,560,200,50);
		add(option2btn);

		option3btn = new JButton("Option 3");
		option3btn.setBounds(510,560,200,50);
		add(option3btn);

		jpb = new JProgressBar(0,100);
		jpb.setBounds(100,620,500,50);
		add(jpb);
		jpb.setValue(100);

		jta.setEditable(false);

		option1btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jta.append("\n\n");
				game.addChoiceSelected(choices[0].getChoiceDescription());
				game.incrementTotalChoices();
				game.setOptionIndex(0);
				jta.append(choices[0].getFurtherStoryLine());
				game.setGeneratorIndex(choices[0].getNextObstacleType()-1);
				game.setObstacleIndex(choices[0].getNextObstacleIndex());
				game.setNextObstacle();
			}
		});
		option2btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jta.append("\n\n");
				game.addChoiceSelected(choices[1].getChoiceDescription());
				game.incrementTotalChoices();
				game.setOptionIndex(1);
				jta.append(choices[0].getFurtherStoryLine());
				game.setGeneratorIndex(choices[1].getNextObstacleType()-1);
				game.setObstacleIndex(choices[1].getNextObstacleIndex());
				game.setNextObstacle();
			}
		});
		option3btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jta.append("\n\n");
				game.addChoiceSelected(choices[2].getChoiceDescription());
				game.incrementTotalChoices();
				game.setOptionIndex(2);
				jta.append(choices[0].getFurtherStoryLine());
				jta.append("\n\n");
				game.setGeneratorIndex(choices[2].getNextObstacleType()-1);
				game.setObstacleIndex(choices[2].getNextObstacleIndex());
				game.setNextObstacle();
			}
		});

		setSize(735,720);
		setVisible(true);

	}
	public void setObstacle(Obstacle obstacle)
	{
		this.obstacle = obstacle;
		showObstacle();
	}
	public void showObstacle()
	{
		jta.append(obstacle.getObstacleDescription());
		jta.append("\n\n");
		choices = obstacle.getObstacleHandlingChoices();
		if(choices.length == 2)
			option3btn.setEnabled(false);
		if(choices.length == 1)
		{
			option3btn.setEnabled(false);
			option2btn.setEnabled(false);
		}
		if(choices.length == 1)
		{
			option3btn.setEnabled(false);
			option2btn.setEnabled(false);
			option1btn.setEnabled(false);
		}
		for(ObstacleHandlingChoice choice: choices)
			jta.append(choice.getChoiceDescription());
	}
};
