import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class newaddmission extends Frame implements ItemListener 
{
 Label l1,l2,l3,l4,l5,l6,l7;
 TextField t1,t2,t3,t4;
 Button b1;
 Checkbox c1,c2;
 newaddmission()
{
setLayout(null);
 l1=new Label("NIEC");
l1.setBounds(100,20,100,50);
this.add(l1);
l2=new Label("Addmission form");
l2.setBounds(70,110,100,50);
this.add(l2);
l3=new Label("Name");
l3.setBounds(20,190,50,25);
this.add(l3);
t1=new TextField();
t1.setBounds(200,190,100,25);
this.add(t1);
l4=new Label("Father's Name");
l4.setBounds(20,220,100,25);
this.add(l4);
t2=new TextField();
t2.setBounds(200,220,100,25);
this.add(t2);
l5=new Label("phone no.");
l5.setBounds(20,250,100,25);
this.add(l5);
t3=new TextField();
t3.setBounds(200,250,100,25);
this.add(t3);
l6=new Label("Gender");
l6.setBounds(20,300,50,25);
this.add(l6);

    c1=new Checkbox("Male");
  c1.setBounds(100,300,50,25);  
   c2=new Checkbox("Female");
   c2.setBounds(150,300,90,25);
     c1.addItemListener(this);
     c2.addItemListener(this);
     this.add(c1);
     this.add(c2);
 }
	public void itemStateChanged(ItemEvent ie)
   {
 }
public static void main(String s[])
{
	newaddmission obj=new newaddmission();
	obj.setSize(500,500);
	obj.setLocation(100,100);
	obj.show();

}
}
    