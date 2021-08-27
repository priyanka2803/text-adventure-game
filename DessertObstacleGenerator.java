package com.adventuregames;

import java.util.List;

public class DessertObstacleGenerator extends ObstacleGenerator
{
	public DessertObstacleGenerator()
	{
	}
	public DessertObstacleGenerator(List<Obstacle> obstacles)
	{
		super(obstacles);
	}
	public String toString()
	{
		return "This is Occean Obstacle Generator";
	}
};