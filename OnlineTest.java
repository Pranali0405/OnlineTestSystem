import java.awt.event.*;  
import javax.swing.*;  
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
  
class OnlineTest extends JFrame implements ActionListener  

{  
 JLabel label = new JLabel("Your time starts now");
  JLabel l;  
JLabel timeLabel;
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];  
String  timeText="";    
private final Timer timer;
     int count1 = 10;
    OnlineTest(String s)  
    {  
        super(s);  
        l=new JLabel();  
        timeLabel = new JLabel();
        add(l);  

timer = new Timer(1000, e -> {
            if (count1 > 0) {
                label.setText(String.valueOf(count1--));
            } else {
            count=count+1;  

            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
                ((Timer) (e.getSource())).stop();
                count1 = 10;
              resetTimer();
            }
        });

//JLabel label = new JLabel(timeText);
        label.setBounds(20, 20, 500, 20);
        add(label);
        timer.start();
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Bookmark");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(30,40,450,20);  
        
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
public void resetTimer(){
timer.start();
}
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {       
timer.stop();
count1 = 10;
 timer.start();
       if(check())  
                count=count+1;  

            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Which one of the following is not an access modifier?");  
            jb[0].setText("Protected");jb[1].setText("Void");jb[2].setText("Public");jb[3].setText("Private");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: Which of the following is not a Java features?");  
            jb[0].setText("Dynamic");jb[1].setText("Architecture Neutral");jb[2].setText("Use of pointers");jb[3].setText("Object-oriented");  
        }  
        if(current==2)  
        {  
            l.setText("Que3:  Which component is used to compile, debug and execute the java programs?");  
            jb[0].setText("JVM");jb[1].setText("JRE");jb[2].setText("JIT");jb[3].setText("JDK");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: Which keyword is used for accessing the features of a package? ");  
            jb[0].setText("import");jb[1].setText("package");jb[2].setText("extends");jb[3].setText("export");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: Who invented Java Programming?");  
            jb[0].setText("Guido van Rossum");jb[1].setText("Dennis Ritchie");jb[2].setText("James Gosling");jb[3].setText("Bjarne Stroustrup");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: Which one among these is not a keyword?");  
            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: Which of these cannot be used for a variable name in Java? ");  
            jb[0].setText(" identifier & keyword");jb[1].setText("keyword");jb[2].setText("identifier");  
                        jb[3].setText(" none of the mentioned");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: What is the extension of java code files?");  
            jb[0].setText(".js");jb[1].setText(".class");jb[2].setText(".txt");  
                        jb[3].setText(".java");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: Which of the following is not an OOPS concept in Java?");  
            jb[0].setText("Polymorphism");jb[1].setText("Compilation");jb[2].setText("Inheritance");jb[3].setText("Encapsulation");  
        }  
        if(current==9)  
        {  
            l.setText("Que10: What is the range of byte data type in Java?");  
            jb[0].setText("-2147483648 to 2147483647");jb[1].setText("-32768 to 32767");jb[2].setText("-128 to 127");  
                        jb[3].setText("None of the mentioned");  
        }  
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[1].isSelected());  
        if(current==7)  
            return(jb[3].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    { 
        new Calcy();
        new OnlineTest("Online Test Of Java");  
	
    }  
}  