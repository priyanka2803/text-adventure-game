package com.adventuregames;

public class ObstacleHandlingChoiceImpl implements ObstacleHandlingChoice
{
	private String choiceDescription;
	private String furtherStoryLine;
	private int nextObstacleIndex;
	private int nextObstacleType;

	public ObstacleHandlingChoiceImpl()
	{
	}
	public ObstacleHandlingChoiceImpl(String choiceDescription,String furtherStoryLine,int nextObstacleIndex,int nextObstacleType)
	{
		this.choiceDescription = choiceDescription;
		this.furtherStoryLine = furtherStoryLine;
		this.nextObstacleIndex = nextObstacleIndex;
		this.nextObstacleType = nextObstacleType;
	}
	public void setChoiceDescription(String choiceDescription)
	{
		this.choiceDescription = choiceDescription;
	}
	public String getChoiceDescription()
	{
		return choiceDescription;
	}
	public void setFurtherStoryLine(String furtherStoryLine)
	{
		this.furtherStoryLine = furtherStoryLine;
	}
	public String getFurtherStoryLine()
	{
		return furtherStoryLine;
	}
	public void setNextObstacleIndex(int nextObstacleIndex)
	{
		this.nextObstacleIndex = nextObstacleIndex;
	}
	public int getNextObstacleIndex()
	{
		return nextObstacleIndex;
	}
	public void setNextObstacleType(int nextObstacleType)
	{
		this.nextObstacleType = nextObstacleType;
	}
	public int getNextObstacleType()
	{
		return nextObstacleType;
	}
};