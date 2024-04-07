


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class StudentInfo{
   

    public static void main(String[] args) {
       StudentInfoForm obj = new StudentInfoForm();
    }
 
}

    class StudentInfoForm extends JFrame{
          JLabel lb1;  
     JTextField tf1;
      JButton b1;  

       public StudentInfoForm(){
            lb1 = new JLabel("Enter Name:");  
        lb1.setBounds(20, 20, 100, 20);
         tf1 = new JTextField(20);
          tf1.setBounds(30,40,450,20);
         b1 = new JButton("Submit");
         b1.setBounds(270,240,100,30);  
         add(b1);
         add(lb1);  
        add(tf1);  
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
        b1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)  
    {  
        String student_name = tf1.getText();
        System.out.println("name is : "+student_name);
      //  new OnlineTest("Exam Starts Now"+student_name);
	//new Calci();
    }
        });
       }
    }
