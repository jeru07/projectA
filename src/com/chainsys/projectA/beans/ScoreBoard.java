package com.chainsys.projectA.beans;

public class ScoreBoard {
	public int targetScore;
	
     private ScoreBoard()
     {
    	 System.out.println("scoreboard object is created");
     }
     private ScoreBoard(int runs)
     {
    	 targetScore=runs;
    	 System.out.println("scoreboard object is created"+ runs);
     }
     //factorymethod
     public static ScoreBoard createObject() {
    	 return new ScoreBoard();
     }
     public static ScoreBoard createObject(int runs) {
    	 return new ScoreBoard(runs);
     }
     
}
