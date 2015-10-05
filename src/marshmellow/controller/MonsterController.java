package marshmellow.controller;

import marshmellow.model.MarshmellowMonster;

public class MonsterController
	{
		private MarshmellowMonster joshMonster;
		private MarshmellowMonster userMonster;
		private MarshmellowOutput myOutput;
		private Scanner monsterScanner;
		
		public MonsterController()
		{
			int eyes = 2 ;
			double legs = 4 ;
			double hair = 3 ;
			int noses = 2 ; 
			boolean hasBellyButton = false;
			String name = "Happy Monster"
			
			monsterScanner = new Scanner(System.in);
			myOutput = new MarshmellowOutput();
			joshMonster = new MarshmellowMonster(eyes, legs, hair, noses, hasBellyButton);
		}
		
		public void start()
		
		{
			myOutput.displayMonsterInfo(joshMonster.toString());
			myOutput.displayMonsterGUI(joshMonster.toString());
			this.makeUserMonster();
			myOutput.displayMonsterInfo("New Monster Info" + userMonster.toString())
			
		}
		
		private void askQuestions()
		{
			System.out.println("Type in a better name for the monster")
			String betterMonsterName = monsterSCanner.next();
			joshMonster.setMonsterName(betterMonsterName);
			System.out.println("Type in a diffrent number of eyes for the monster");
			int betterMonsterEyes = monsterScanner.nextInt();
			joshMonster.setMonsterEYes(betterMonsterEyes);
			
		}
		
	
	
	}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		