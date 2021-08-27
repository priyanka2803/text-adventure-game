package com.adventuregames;

public class ObstacleImpl implements Obstacle
{
	private String obstacleDescription;
	private ObstacleHandlingChoice[] obstacleHandlingChoices;

	public ObstacleImpl()
	{
	}
	public ObstacleImpl(String obstacleDescription,ObstacleHandlingChoice[] obstacleHandlingChoices)
	{
		this.obstacleDescription = obstacleDescription;
		this.obstacleHandlingChoices = obstacleHandlingChoices;
	}
	public void setObstacleDescription(String obstacleDescription)
	{
		this.obstacleDescription = obstacleDescription;
	}
	public String getObstacleDescription()
	{
		return obstacleDescription;
	}
	public void setObstacleHandlingChoices(ObstacleHandlingChoice[] obstacleHandlingChoices)
	{
		this.obstacleHandlingChoices = obstacleHandlingChoices;
	}
	public ObstacleHandlingChoice[] getObstacleHandlingChoices()
	{
		return obstacleHandlingChoices;
	}
};