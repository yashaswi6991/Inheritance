class Language
{
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;
  Language(String lname,int speakers, String regions,String word)
  {
    this.name = lname;
    this.numSpeakers = speakers;
    this.regionSpoken = regions;
    this.wordOrder = word;
    System.out.println(this.name +  "is spoken by" + this.numSpeakers+ "people mainly in" + this.regionSpoken +
"The language follows the word order:" + this.wordOrder);
  }
  public void getInfo()
  {

  }
  public static void main(String[] args)
  {
    Language l1 = new Language("India",10000000,"Telugu,Hindi","any");
    l1.getInfo();
    Mayan m1 = new Mayan("French",900000);
    m1.getInfo();
    SinoTibetan s1 = new  SinoTibetan("Chinese", 20000000);
    s1.getInfo();
      SinoTibetan s2 = new  SinoTibetan("Burmese", 50000000);
      s2.getInfo();
  }

}