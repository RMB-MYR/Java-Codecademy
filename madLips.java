public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Rembo
Date: 27/01/2025

  */
  	public static void main(String[] args){
      
      String name1 = "Mr. Variable";
      String adjective1 = "green";
      String adjective2 = "short";
      String adjective3 = "windy";
      String verb1 = "run";
      String noun1 = "car";
      String noun2 = "spoon";
      String noun3 = "pencil";
      String noun4 = "tv";
      String noun5 = "flamingo";
      String noun6 = "watermelon";
      String name2= "Mr.Trump";
      int number = 42;
      String place1 = "Milano";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}