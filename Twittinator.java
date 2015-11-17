//package faketwitter;

import java.util.Scanner;
/**
 *
 * @author spencer
 */

public class Twittinator {
    public static void main(String[] args){
        //read in files

        //display public feed
        //PublicFeed mainFeed = new PublicFeed();
    
        Boolean running = true;                 //toggle for 'running' loop
        Boolean loggedIn = false;               //toggle for portion of running loop

        Scanner user = new Scanner(System.in); //Scanner for user input
        while(running){ //begin running loop
            System.out.println("How would you like to proceed?");
            //give user choices list 
            if(!loggedIn){
                System.out.println("L : Log in");                       //log in
                System.out.println("R : Register");                     //register
            }
            else{
                 //if logged in
                 System.out.println("P : Display feed");                //display feed
                 System.out.println("C : Create message");              //create message
                                                                            //public
                                                                            //subscriber only
                                                                            //direct message
                 System.out.println("E : Edit bio");                    //edit bio
                 System.out.println("S : Subscribe to user");           //subscribe to user
                 System.out.println("T : Display subscribed to users"); //display subscriber list
                 System.out.println("B : Block user");                   //block user
                 System.out.println("D : Display blocked users");       //display blocked list*
                 System.out.println("V : View profile");                //view profile
            }
            System.out.println("U : Search by user");                   //search by user
            System.out.println("K : Search by keyword");                //search by keyword
            System.out.println("Q : Quit");

            char userInput = user.next().charAt(0);
            
            //given the choice, perform the function(s)
            switch(userInput){             
                //log in
                //register
                //display feed
                //create message
                //edit bio
                //subscribe to user
                //display subscriber list
                //block user
                //display blocked list
                //view profile
                //search by user
                //search by keyword
                case 'Q':         //quit (running/save files)
                    running = false;
                    break;
            }               
            
        } //end running loop
        //write to files
        System.exit(0);       
    }
}

