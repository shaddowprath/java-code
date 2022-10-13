import java.io.*;
class throwscheckedexcep
{
  public static void findFile() throws IOException
 {

    File newFile=new File("test.txt");              // code that may produce IOException
    FileInputStream stream=new FileInputStream(newFile);
  }

  public static void main(String[] args) 
{
    try{
      findFile();
    } catch(IOException e)
{
      System.out.println(e);
    }
  }
}