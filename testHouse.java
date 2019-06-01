import java.awt.*;
import javax.swing.*;
public class testHouse 
{public int width;  
  public int height; 
  public int l;
  public String a="";
  public String b="";
    public String c="";
    public String m="";
    public String z="";
    public String f="";
    public String ha="";
      public String hb="";
      public String Para="";
      public String Dyta="";
      public String Treta="";
      public String Katerta="";
     public String Humbja="";
public  void asllani()
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