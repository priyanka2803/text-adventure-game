package com.adventuregames;

import java.util.List;

public class SeaObstacleGenerator extends ObstacleGenerator
{
	public SeaObstacleGenerator()
	{
	}
	public SeaObstacleGenerator(List<Obstacle> obstacles)
	{
		super(obstacles);
	}
	public String toString()
	{
		return "This is Occean Obstacle Generator";
	}
};