package com.adventuregames;

import java.util.List;
import java.util.Vector;

public class ObstacleGenerator
{
	private List<Obstacle> obstacles;

	public ObstacleGenerator()
	{
		obstacles = new Vector<Obstacle>();
	}
	public ObstacleGenerator(List<Obstacle> obstacles)
	{
		this.obstacles = obstacles;
	}
	public void addObstacle(Obstacle obstacle)
	{
		obstacles.add(obstacle);
	}
	public Obstacle getObstacle(int index)
	{
		return obstacles.get(index);
	}
	public void setObstacles(List<Obstacle> obstacles)
	{
		this.obstacles = obstacles;
	}
	public List<Obstacle> getObstacles()
	{
		return obstacles;
	}
};