package com.adventuregames;

import java.util.List;
import java.util.Vector;

public class GameInitializer
{
	private ObstacleGenerator jungleObstacleGenerator,seaObstacleGenerator,dessertObstacleGenerator;
	ObstacleHandlingChoice choice1,choice2,choice3;
	Obstacle obstacle;
	GameGUI gameGUI;
	AdventureGame adventureGame;

	public GameInitializer(AdventureGame adventureGame)
	{
		this.adventureGame = adventureGame;
		setupJungleObstacleGenerator();
		setupDessertObstacleGenerator();
		setupSeaObstacleGenerator();
		showGameGUI();
	}
	public void setupJungleObstacleGenerator()
	{
		List<Obstacle> obstacles = new Vector<>();
		//Index 0 //choice 2?
		choice1 = new ObstacleHandlingChoiceImpl("\n\n1. Brittle Bridge that breaks with weight\n\n","Brittle bridge, as the name suggests,\n can be broken easily, and that is what has really happened.",1,1);
		choice2 = new ObstacleHandlingChoiceImpl("\n\n2. The Lava Bridge with volcano beneath it\n\n","The lava bridge is known for it's burning temperatures,\n something which you cannot endure.",4,1);
		choice3 = new ObstacleHandlingChoiceImpl("\n\n3. The Rocky bridge with heavy obstacles\n\n","The rocky bridge now has something for you!",6,1);
		obstacle = new ObstacleImpl("You need to choose a bridge to cross the jungle and enter the desert.\nWhich bridge would you choose?\n", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);
		
		//Index 1 //choice 1
		choice1 = new ObstacleHandlingChoiceImpl("\n\n1. Let yourself Fall","Did not expect to leave you so soon!",4,1);
		choice2 = new ObstacleHandlingChoiceImpl("\n\n2. Swing from the bridge to the valley","And finally you have entered the valley!",4,1);
		choice3 = new ObstacleHandlingChoiceImpl("\n\n3. Swing to the rocky bridge","Welcome to the rocky bridge, luckily you have passed the rocky part of the bridge and are walking to the end of the bridge.",2,1);
		obstacle = new ObstacleImpl("The bridge is floating and you are holding tight on the rope. What do you want to do now?", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 2 //Choice 1,2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTalk to them and convince some of them to let you go","Great talk! You did convince some of them but not all!\n And while you try to escape, they are right behind you!",5,1);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nTry to shoot them with the bullets you have","You had only 6 bullets, not enough to shoot them all! \nBut they are enough to haul you right away!",4,1);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nRun","You must be",3,1);
		obstacle = new ObstacleImpl("You have reached the end of the bridge. Behind you is a valley and in front of you\n is a troop of monkeys(protectors of the desert) in order to enter the desert you have to cross them.", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 3
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTo the valley","And you choose to enter the valley!",4,1);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nTowards the monkeys!","Get them all!",5,1);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("Where do you want to run?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 4
		choice1 = new ObstacleHandlingChoiceImpl("\n\nClimb the valley to get out","Climbing the valley out gets you to the top with the monkeys!",2,1);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nRun to the end to find an escape","Running to the other side leads you to the top of the valley with protectors of the desert\nstill waiting for you but on the other side! You need to be fast! ",5,1);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("The valley is filled with worms that have the capability to eat you up.\nHow would you like to escape?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 5 //Choice 1,2,3
		choice1 = new ObstacleHandlingChoiceImpl("\n\nUse a smoke gun","The smoke gun was a smart trick indeed!",0,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nFight them","Whoa fighter! Did not see that coming",0,2);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nPlay defensive and run","And you have finally crossed it!",0,2);
		obstacle = new ObstacleImpl("Escaping by running can be difficult.\nThe troop of monkeys are known for their large troop and agility.", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 6 //Choice 1,2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nPush the rock to fill the pit and slide over","Great work! The strength is finally paying (and wearing off)!",2,1);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nJump over the rock into the pit","Oh darn!  You have fallen into the valley!",4,1);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("The heavy rock that makes the bridge famous is right in front of you. You need to cross it in order to cross the bridge.\nThere is a pit right after the rock. How do you cross?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 7
		/* choice1 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		choice2 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);
		*/




		jungleObstacleGenerator = new JungleObstacleGenerator(obstacles);

	}
	public void setupDessertObstacleGenerator()
	{
		List<Obstacle> obstacles = new Vector<>();
		
		//Index 0
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTry to Scare him","Now that you have tried to scare him, you should know, they try to attack you when  scared.",3,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nBefriend him and talk to him","Such a kind heart! And here's something for you to befriend the ostrich. The ostrich has a clue for you",2,2);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nRun away from it","You should have known, these ostriches travel in heard",1,2);
		obstacle = new ObstacleImpl("You have now entered the desert. The desert is large and no one can be seen around.\n All of a sudden you see a large bullheaded ostrich approach you. What would you do?", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);
		
		//Index 1 choice 1,3
		choice1 = new ObstacleHandlingChoiceImpl("\n\nKeep running hoping to escape","You should have known, Ostriches are much faster than you!",4,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nGet into the sand tunnels","You have been moving around in those tunnels and you see a palace. You enter in to explore",5,2);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nRun, Pick and automobile and escape!","Good choice! Got you a little pecking but that's alright!",7,2);
		obstacle = new ObstacleImpl("You are under attack!!! \nThe whole herd of Ostriches is after you.What do you want to do?", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 2 //Doubt on choice 1 //choice 2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTake and run!","Appearances are deceptive",1,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nNo. Just run","",1,2);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("The ostrich warns you of his herd as a kind gesture who are after you and also has a clue for you.\nDo you want to take it?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 3 //Doubt Choie 1 //Choice 2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nFight Back","You should have known, these ostriches travel in heard",1,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nRun","Smart Move!",4,2);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("You are being attacked by the ostrich. What would you want to do now?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 4 //Choice 2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nGet into the sand tunnels","You have been moving around in those tunnels and you see a palace.\nYou enter in to explore",5,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nPick a broken automobile","Good choice! Got you a little pecking but that's alright!",7,2);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("How would you escape the wrath of ostrich whose speed is unmatched ?\nAll you see ahead are sand tunnels and broken automobiles.", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 5 //Choice 1,2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nYes. Dive into that delicious food and lifestyle","You should have known better than to trust vultures. All the really want is to feed on you.\nAlthough you escape through sand tunnels, you do lose your strength a little!",6,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nEscape through the tunnels","Smart Move!",6,2);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("As you enter the palace, you see a magnificient extravagant vulture kingdom. They offer you the best of service,\nfood and lifestyle and ask you to stay. Would you consider their offer? ", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 6 //Choice 1,2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nYes, drink the water","It was just a mirage and now you have entered the swamp that is trying to suck you in,\nyou do come out but with your health detoriated.",0,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nNo, It's a Mirage!","Yes, it was a mirage and you have been saved and move to the next level.",0,3);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("You are in the desert and health detoriating.You see a pond in the middle of nowhere.\nWhat you drink the water from that pond?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);
		
		//Index 7
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTake some rest","Some rest was good but the ostriches have picked up their pace and after you again!.",4,2);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nGet into the sand tunnels","A good way to escape the ostriches after a drive!.",5,2);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("The fuel of your automobile is over and now you have nothing but yourself to rely on.\n Do you want to take some rest or proceed ahead?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);
		


		dessertObstacleGenerator = new DessertObstacleGenerator(obstacles);
	}
	public void setupSeaObstacleGenerator()
	{
		List<Obstacle> obstacles = new Vector<>();

		//Index 0
		choice1 = new ObstacleHandlingChoiceImpl("\n\nEnter the sea kingdom alone","Well done! Next step is to enter the palace.",1,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nEnter the sea kingdom with sea goons planning to attack the kingdom","The sea goons are all set to attack the palace and they are now taking you with them",3,3);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nMeet the Princess","You meet the princess and befriend her in hope to find a way to the palace.",4,3);
		obstacle = new ObstacleImpl("Now you have entered the sea kingdom. There is jewel in the King's Palace that you need to return back home.\nThis is your only way out. You have the sea immunity potion that will allow you live under the sea.\nYou have to enter the sea kingdom to get the jewel. You see the sea princess on her way returning to the kingdom and some sea goons planning to attack the kingdom.\nHow do you want to enter?", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);
		
		//Index 1
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTell the truth and get arrested","So now you have been arrested and locked in the Palace prison",2,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nImpersonate being a guard","Now that you have impersonated as a guard, it no doubt gives you an easy access in \nbut it also comes with duties to save the palace under attack",3,3);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nImpersonate as the messenger.","You have impersonated as the messenger and entered \nnow you see the Palace is under attack.",3,3);
		obstacle = new ObstacleImpl("You have entered the sea kingdom. In order to enter the palace, you need to choose one way to enter as.\nEach has it's own advantages and disadvantages.Which would you choose?", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 2
		choice1 = new ObstacleHandlingChoiceImpl("\n\nBreak the jail cage","You break out of the Jail cage and wander the halls of the palace where you meet the princess",4,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nDig a tunnel out the prison","You have dug a tunnel that leads you straight outside the palace.",1,3);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("You have been imprisoned. There is one dark room and you need to escape.\nWhat do you do?", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 3
		choice1 = new ObstacleHandlingChoiceImpl("\n\nEscape and enter King's Closet","You skip the war and rush to the king's halls taking advantage of the emergency.\nYou meet the sea princess there",4,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nAttack the Palace with the enemy","You attack the palace aligning with the enemy but you should have known that the Palace is stronger.",2,3);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nHelp the kingdom fight the enemy","For this good deed, the princess of the sea has something for you",5,3);
		obstacle = new ObstacleImpl("The Palace is under attack the enemy has entered the palace and it is an even fight.\nYou can either help them, fight them or run to accomplish your mission.", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 4
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTell the truth and ask for help","For your honesty, the princess has something for you",5,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nKidnap the princess and demand the jewel","The palace is stronger than you and you have been imprisoned.",2,3);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("You have met the Princess of the Sea kingdom. She is one kind sweet and gentle soul.\nNow it is up to you how you can get the jewel through her", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 5
		choice1 = new ObstacleHandlingChoiceImpl("\n\nTake the clue and get arrested","You need to give in your everything",2,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nLeave the clue and escape","You escape the imprisonment and are thrown out of the Palace",1,3);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("The Princess has a clue for you, but for a price. You can either take the clue and get arrested or leave the clue and escape", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);

		//Index 6
		choice1 = new ObstacleHandlingChoiceImpl("\n\nGold Casket","All that glitters is not gold. The guards have been alerted and you are thrown to the prison",2,3);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nSilver Casket","It is empty and you are taken back right outside the palace",1,3);
		choice3 = new ObstacleHandlingChoiceImpl("\n\nLead Casket","\"The jewel is close to king's heart\". You have got the clue now",7,3);
		obstacle = new ObstacleImpl("You have enetered the King's Closet where you find three caskets. The Gold casket reads \"he who has me gets what many men desire\" .\nThe Silver casket reads \"he who has me gets what he deserves\". The Lead Casket reads \"he who has me must give and risk\" all he has", new ObstacleHandlingChoice[] {choice1,choice2,choice3});
		obstacles.add(obstacle);

		//Index 7 //Choice 1 doubt 2,doubt
		choice1 = new ObstacleHandlingChoiceImpl("\n\nSnatch the jewel and risk your life","",0,0);
		choice2 = new ObstacleHandlingChoiceImpl("\n\nHelp the king fight and ask later","The king is grateful for your help and in exhange gives you the jewel as a reward",0,0);
		//choice3 = new ObstacleHandlingChoiceImpl("\n\n","",0,0);
		obstacle = new ObstacleImpl("Now that you have the clue, think what is the King holding so close to him. Isn't it the jewel itself, tied around his neck?\nHow do you plan to take it? Snatch it during the war or help the king in the war and ask later!", new ObstacleHandlingChoice[] {choice1,choice2});
		obstacles.add(obstacle);


		seaObstacleGenerator = new SeaObstacleGenerator(obstacles);
	}

	public void showGameGUI()
	{
		gameGUI = new GameGUI(adventureGame);
	}
	public ObstacleGenerator getJungleObstacleGenerator()
	{
		return jungleObstacleGenerator;
	}
	public ObstacleGenerator getDessertObstacleGenerator()
	{
		return dessertObstacleGenerator;
	}
	public ObstacleGenerator getSeaObstacleGenerator()
	{
		return seaObstacleGenerator;
	}
	public GameGUI getGameGUI()
	{
		return gameGUI;
	}
	
};