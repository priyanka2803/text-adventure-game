
package com.adventuregames;

import java.util.List;
import java.util.Vector;

public class AdventureGame
{
	GameInitializer initializer;
	ObstacleGenerator jungleObstacleGenerator, dessertObstacleGenerator, seaObstacleGenerator;
	GameGUI gui;
	User user;
	int generatorIndex,obstacleIndex,totalChoices,optionIndex;
	ObstacleGenerator[] obstacleGenerators;
	List<String> choicesSelected;
	boolean healthFlag= true, stopGame=false,gameWon=false;
	public AdventureGame()
	{
		user = new User();
		choicesSelected = new Vector<String>();
		obstacleGenerators = new ObstacleGenerator[3];
		new UserInfoGUI(user,this);
	}
	public void setOptionIndex(int optionIndex)
	{
		this.optionIndex=optionIndex;
		checkHealth();
	}
	public void checkHealth()
	{
			if(generatorIndex==0)
			{
				if(obstacleIndex==0 && optionIndex==1)
					updateHealth(40);
				else if(obstacleIndex==1 && optionIndex==0)
					updateHealth(40);
				else if(obstacleIndex==2 && optionIndex==0)
					updateHealth(15);
				else if(obstacleIndex==2 && optionIndex==1)
					updateHealth(40);
				else if(obstacleIndex==5 && optionIndex==0)
					updateHealth(5);
				else if(obstacleIndex==5 && optionIndex==1)
					updateHealth(15);
				else if(obstacleIndex==5 && optionIndex==2)
					updateHealth(10);
				else if(obstacleIndex==6 && optionIndex==0)
					updateHealth(5);
			}
			else if(generatorIndex==1)
			{
				if(obstacleIndex==1 && optionIndex==2)
					updateHealth(5);
				else if(obstacleIndex==4 && optionIndex==1)
					updateHealth(5);
				else if(obstacleIndex==5 && optionIndex==0)
					updateHealth(40);
				else if(obstacleIndex==6 && optionIndex==0)
					updateHealth(40);
			}
			else if(generatorIndex==2)
			{
				if(obstacleIndex==7 && optionIndex==0)
					updateHealth(40);
			}
			if(user.getHealth()<=0)
				stopGame=true;
			else
				gui.jpb.setValue(user.getHealth());
			if(generatorIndex==2&&obstacleIndex==7)
				gameWon=true;
	}
	private void updateHealth(int health)
	{
			user.setHealth(user.getHealth()-health);
	}
	public void initalizeGame()
	{
		initializer = new GameInitializer(this);
		jungleObstacleGenerator = initializer.getJungleObstacleGenerator();
		dessertObstacleGenerator = initializer.getDessertObstacleGenerator();
		seaObstacleGenerator = initializer.getSeaObstacleGenerator();
		obstacleGenerators[0] = jungleObstacleGenerator;
		obstacleGenerators[1] = dessertObstacleGenerator;
		obstacleGenerators[2] = seaObstacleGenerator;
		gui = initializer.getGameGUI();
		setInitialStoryLine();
	}
	public void setInitialStoryLine()
	{
		gui.jta.append("Welcome to Adventure Game\n");
		gui.jta.append("To reach your Destination Get Started\n");

		ObstacleHandlingChoice choice1 = new ObstacleHandlingChoiceImpl("1. Brittle Bridge that breaks with weight\n\n","Brittle bridge, as the name suggests,\n can be broken easily, and that is what has really happened.",1,1);
		ObstacleHandlingChoice choice2 = new ObstacleHandlingChoiceImpl("2. The Lava Bridge with volcano beneath it\n\n","The lava bridge is known for it's burning temperatures,\n something which you cannot endure.",4,1);
		ObstacleHandlingChoice choice3 = new ObstacleHandlingChoiceImpl("3. The Rocky bridge with heavy obstacles\n\n","The rocky bridge now has something for you!",6,1);
		Obstacle obstacle = new ObstacleImpl("You need to choose a bridge to cross the jungle and enter the desert.\nWhich bridge would you choose?\n", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		
		gui.setObstacle(obstacle);

		/*
		gui.jta.append("Welcome to Adventure Game\n");
		gui.jta.append("To reach your Destination Get Started\n");	
		gui.jta.append("\n\n 1. Cruise through the Land\n");
		gui.jta.append("\n\n 2. Swim through the Occean\n");
		*/
	}
	public void setGeneratorIndex(int generatorIndex)
	{
		this.generatorIndex = generatorIndex;
		
	}
	public void setObstacleIndex(int obstacleIndex)
	{
		this.obstacleIndex = obstacleIndex;
		
	}
	public void incrementTotalChoices()
	{
		totalChoices = totalChoices+1;
	}
	public void setNextObstacle()
	{
		if(!stopGame && !gameWon)
			gui.setObstacle(obstacleGenerators[generatorIndex].getObstacle(obstacleIndex));
		else
		{
			if(!gameWon)
			{
				gui.jta.append("\n\nSince the health has been reduced to zero, the game has ended");
			}
			else
				gui.jta.append("\n\nYou have finally accomplished your mission!!!");

			gui.option1btn.setEnabled(false);
			gui.option2btn.setEnabled(false);
			gui.option3btn.setEnabled(false);
			gui.jta.append("\n\n\nTotal Choices you selected during the game = "+totalChoices);
			gui.jta.append("\n\nFollowing are the choices you selected\n");
			for(String s: choicesSelected)
			{
					gui.jta.append("\n\n"+s);
			}
		}
	}
	public void addChoiceSelected(String choiceSelected)
	{
		choicesSelected.add(choiceSelected);
	}
	public static void main(String args[])
	{
		new AdventureGame();
	}
};
