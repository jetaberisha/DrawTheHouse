import java.awt.*;
import javax.swing.*;
public class testHouse 
{public int width;  
  public int height; 
  public int l;
  public String a=""; //ndryshorja a nderton nje pjese te murit te shtepise
  public String b=""; //ndryshorja a nderton nje pjese te murit te shtepise
    public String c=""; //ndryshorja c nderton bazen e poshtme te shtepise
    public String m=""; //ndryshorja m nderton bazen e siperme te shtepise
    public String z=""; //ndryshorja z nderton nje pjese te kulmit te shtepise
    public String f=""; //ndryshorja f nderton nje pjese te kulmit te shtepise
    public String ha=""; //ndryshorja ha nderton deren e shtepise
      public String hb=""; //ndryshorja hb nderon dritaren e shtepise
      public String Para=""; 
      public String Dyta="";
      public String Treta="";
      public String Katerta="";
     public String Humbja="";
public  void asllani() //Modelon ndertimin e shtepise varsisht prej renies se zarit
{Die zari= new Die();

l=zari.throw1();
if (l==6){Para="Ne heren e pare ra 6 dhe ju procesuat tutje";
a="/     /";
 b="/     /";
 c="------";
l=zari.throw1();
if (l==5){Dyta="Ne heren e dyte ra 5 dhe ju procesuat tutje";
 z="  /\\";
f=" /  \\";
m="------";
l=zari.throw1();
if (l==4){Treta="Ne heren e trete ra 4 dhe ju procesuat tutje";
ha="  -  ";
l=zari.throw1();
if(l==3){hb=" /X/";
Katerta="Ne heren e katert ra 3 dhe ju fituat lojen ";}
else {Humbja="You lost the game,sepse ne heren e katert ra numri ";} 
}
else {Humbja="You lost the game,,sepse ne heren e trete ra numri";}
}
else {Humbja="You lost the game,sepse ne heren e dyte ra numri ";}
}else {Humbja="You lost the game,sepse ne heren e pare ra numri";}
}
}          
