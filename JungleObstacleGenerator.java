package com.adventuregames;

import java.util.List;

public class JungleObstacleGenerator extends ObstacleGenerator
{
	public JungleObstacleGenerator()
	{
	}
	public JungleObstacleGenerator(List<Obstacle> obstacles)
	{
		super(obstacles);
	}
	public String toString()
	{
		return "This is Land Obstacle Generator";
	}
};