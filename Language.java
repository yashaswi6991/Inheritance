//Creating a parent class
class Language
{
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;
  //Creating a constructor with arguments
  Language(String lname,int speakers, String regions,String word)
  {
    this.name = lname;
    this.numSpeakers = speakers;
    this.regionSpoken = regions;
    this.wordOrder = word;
    System.out.println(this.name +  "is spoken by" + this.numSpeakers+ "people mainly in" + this.regionSpoken +
"The language follows the word order:" + this.wordOrder);
  }
  // getInfo() is created with no arguments and no return time
  public void getInfo()
  {

  }
  //main method
  public static void main(String[] args)
  {
    //instance of parent class is created
    Language l1 = new Language("India",10000000,"Telugu,Hindi","any");
    l1.getInfo();
    //instance of childclass 1 is created 
    Mayan m1 = new Mayan("French",900000);
    m1.getInfo();
    //instance of child class2 is created by passing value 1
    SinoTibetan s1 = new  SinoTibetan("Chinese", 20000000);
    s1.getInfo();
  //instance of child class 2 is created by passing value 2
    SinoTibetan s2 = new  SinoTibetan("Burmese", 50000000);
      s2.getInfo();
  }

}
//Child class Mayan is created which extends parent class
class Mayan extends Language
{
// constructor
  Mayan(String lname, int speakers)
  {
  // passing the values 
  super( lname, speakers , "Central America" , "verb-object-subject" );
  }
  // Overriding the method
   @Override
  public void getInfo() {
 
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
    
 
  }

}
//Child Class2
class SinoTibetan extends Language
{
//constructor
   SinoTibetan(String lname, int speakers)
   {
    super( lname, speakers , "Asia" , "subject-object-verb");
    //if - statement to whether the language is chinese which follows subject-verb-object as its word form
    if(lname.contains("Chinese"))
    {
      this.wordOrder = "subject-verb-object";
    }
   }

}

