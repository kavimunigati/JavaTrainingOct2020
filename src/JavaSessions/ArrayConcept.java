package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int a[]= new int[5];
		    a[0] = 10;
		    a[1] = 20;
		    a[2] = 30;
		    a[3] = 40;
		    a[4] = 50;
		//System.out.println(a[0]);
		    for(int b=0; b<5;b++) {
				System.out.println(a[b]);
			}
		    System.out.println("*********************");
	//Cricket players data
		    
		    Object team[]=  new Object [5];
		    team[0]="Virat Kohli";
		    team[1]= 32;
		    team[2]="Mumbai Indians";
		    team[3]="November 5, 1988";
		    team[4]=131.26;
		    
		    for(int t=0;t<team.length; t++) {
		    	System.out.println(team[t]);
		    }
		    
		    System.out.println("*********************");
		    Object team1[]=  new Object [5];
		    team1[0]="Sandeep sharma";
		    team1[1]= 27;
		    team1[2]="Sunrisers Hyderabad";
		    team1[3]="May 18, 1993";
		    team1[4]=18.6;
		    
		    for(int t1=0;t1<team.length; t1++) {
		    	System.out.println(team1[t1]);
	}
		    System.out.println("*********************");
		    
		    Object team2[]=  new Object [5];
		    team2[0]="Ankit Singh Rajpoot";
		    team2[1]= 26;
		    team2[2]=" Rajastan Royals";
		    team2[3]="4 December 1993";
		    team2[4]=14.21;
		    for(int t2=0;t2<team.length; t2++) {
		    	System.out.println(team1[t2]);
		    	 
}
		    System.out.println("*********************");
		    for (Object e :team) {
		    	System.out.println(e);
		    }
		    System.out.println("************************");
		    
		    //For each loop
		    
		    int num[]= new int[4];
		    num[0] =100;
		    num[1]=200;
		    num[2]=300;
		    num[3]=400;

		    for (int digit :num) {
		    System.out.println(digit);
		    if(digit ==300) {
		    	System.out.println("end program");
		    	break;
		    }
		    	
		    }

}
}
