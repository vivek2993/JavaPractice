import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
  
class Login extends JFrame implements ActionListener
 {
  JButton SUBMIT;
  JPanel panel;
  JLabel label1,label2;
  final JTextField  text1,text2;
   Login()
   {
   label1 = new JLabel();
   label1.setText("Username:");
   text1 = new JTextField(15);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(15);
  
   SUBMIT=new JButton("SUBMIT");
   
   panel=new JPanel(new GridLayout(3,1));
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("FlOWER SHOP");
   }
  public void actionPerformed(ActionEvent ae)
   {
   String value1=text1.getText();
   String value2=text2.getText();
   if (value1.equals("akash") && value2.equals("akash1")) {
   NextPage page=new NextPage();
   page.setVisible(true);
   JLabel label = new JLabel("Welcome:"+value1);
   page.getContentPane().add(label);
   }
   else{
   System.out.println("enter the valid username and password");
   JOptionPane.showMessageDialog(this,"Incorrect login or password",
   "Error",JOptionPane.ERROR_MESSAGE);
   }
 }
 }
  class LoginDemo
 {
   public static void main(String arg[])
   {
   try
   {
   Login frame=new Login();
   frame.setSize(300,100);
   frame.setVisible(true);
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, e.getMessage());}
 }}
 class NextPage extends JFrame
 {
   NextPage()
  {
  setDefaultCloseOperation(javax.swing.
   WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("Welcome");
  setSize(400, 200);
  FlowerCounter f=new FlowerCounter();
   }
  }
  
  //Logic part of program where cost of flower calculated & Data stored sucessfully
  class FlowerCounter {
FlowerCounter()
{
   String[] flowers = {"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
   double[] price = {.50, .75, 1.50, .50, .80};
   double cost = 0;

   Scanner keyboard = new Scanner(System.in);
   System.out.println("What kind of flower would you " +
                          "like to purchase? \nPetunia, Pansy, Rose," +
                          " Violet, or Carnation?");

   String index = keyboard.nextLine();

   System.out.println("How many " + index +"s" + " would you like?");
   int count = keyboard.nextInt();

  if (index.equals("Petunia") || index.equals("petunia"))
       cost = (double)price[0] * count;
   
   else if (index.equals("Pansy") || index.equals("pansy"))
       cost = (double)price[1] * count;
   
   else if (index.equals("Rose") || index.equals("rose"))
       cost = (double)price[2] * count;
   
   else if (index.equals("Violet") || index.equals("violet"))
       cost = (double)price[3] * count;
   
   else if (index.equals("Carnation") || index.equals("carnation"))
       cost = (double)price[4] * count;
   
   else 
       System.out.println("wrong flower");

   System.out.println("The cost for " + count+ " "  +  index  + " is " + cost);    

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);
        System.out.println("Current Date and Time is: " + formatted);
        




   
}

}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 