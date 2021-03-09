package com.techelevator;


import java.awt.Menu;

import org.apache.commons.dbcp2.BasicDataSource;


import com.techelevator.view.FlopMenu;

public class YourFlopCLI {
	
	
	private static final String MAIN_MENU_BY_YEAR = "Get flop by year";
	private static final String MAIN_MENU_BY_GENRE= "Get flop by genre";
	private static final String MAIN_MENU_SEE_RAZZIES = "See Razzie Award Winners";
	private static final String MAIN_MENU_EXIT = "Exit the application";
	
	
	private FlopMenu menu;
	
	private static final String [] MAIN_MENU_OPTIONS = {
			
			MAIN_MENU_BY_YEAR, 
			MAIN_MENU_BY_GENRE, 
			MAIN_MENU_SEE_RAZZIES, 
			MAIN_MENU_EXIT
			};
	
	public void run() {
		while(true) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(choice.contentEquals(MAIN_MENU_BY_GENRE)){
				System.out.println("*****************GENRES GO HERE**********************");
			}else if(choice.contentEquals(MAIN_MENU_EXIT)) {
				System.out.println("Thanks for coming!");
				System.exit(0);
			}
			//TODO make a menu
		}
	}
	
	public YourFlopCLI() {
		//datasource
		
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setUrl("jdbc:postgressql://localhost:5432/box_office_flops");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
	
		//menu object for printing
		this.menu = new FlopMenu(System.in, System.out);
		
		
	}
	
	public static void main (String[] args) {
		YourFlopCLI cli = new YourFlopCLI();
		cli.run();
	}

}
