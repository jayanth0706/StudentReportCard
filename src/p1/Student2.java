package p1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

@SuppressWarnings("serial")
public class Student2 extends JFrame implements ActionListener {
    // Variables for input fields and labels
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8;
    JComboBox<String> jc;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2;

    // Constructor for setting up the GUI
    Student2() {
        Container c = this.getContentPane();
        String[] branches = { "ECE", "CSE", "EEE", "MECH", "CIVIL" }; // Available branches
        jc = new JComboBox<>(branches);
        c.setLayout(null);
        c.setBackground(Color.yellow);

        // Fonts
        Font f1 = new Font("dialog", Font.BOLD, 30);
        Font f = new Font("dialog", Font.BOLD, 20);

        // Setting up labels, text fields, buttons
        lb1 = new JLabel("Student Data");
        lb1.setFont(f1);
        lb1.setBounds(250, 30, 300, 50);
        lb1.setForeground(Color.red);

        lb2 = new JLabel("NAME");
        lb2.setFont(f);
        lb2.setBounds(50, 100, 150, 50);
        lb2.setForeground(Color.red);
        t1 = new JTextField(50);
        t1.setBounds(200, 100, 200, 50);

        lb3 = new JLabel("BRANCH");
        lb3.setFont(f);
        lb3.setBounds(450, 100, 150, 50);
        lb3.setForeground(Color.red);
        jc.setFont(f);
        jc.setBounds(550, 100, 150, 50);
        jc.setForeground(Color.GREEN);

        lb4 = new JLabel("RNO");
        lb4.setFont(f);
        lb4.setBounds(50, 180, 150, 50);
        lb4.setForeground(Color.red);
        t2 = new JTextField(50);
        t2.setBounds(200, 180, 200, 50);

        lb5 = new JLabel("6 SUB MARKS");
        lb5.setFont(f);
        lb5.setBounds(50, 260, 150, 50);
        lb5.setForeground(Color.red);
        t3 = new JTextField(50);
        t3.setBounds(200, 260, 300, 50);

        lb6 = new JLabel("TOTAL");
        lb6.setFont(f);
        lb6.setBounds(50, 340, 150, 50);
        lb6.setForeground(Color.red);
        t4 = new JTextField(50);
        t4.setBounds(200, 340, 150, 50);

        lb7 = new JLabel("PERCENTAGE");
        lb7.setFont(f);
        lb7.setBounds(450, 340, 150, 50);
        lb7.setForeground(Color.red);
        t5 = new JTextField(50);
        t5.setBounds(600, 340, 150, 50);

        lb8 = new JLabel("RESULT");
        lb8.setFont(f);
        lb8.setBounds(50, 420, 150, 50);
        lb8.setForeground(Color.red);
        t6 = new JTextField(50);
        t6.setBounds(200, 420, 150, 50);

        b1 = new JButton("Calculate");
        b1.setBounds(300, 500, 100, 50);
        b2 = new JButton("Clear");
        b2.setBounds(500, 500, 100, 50);

        // Adding components to container
        c.add(lb1);
        c.add(lb2);
        c.add(t1);
        c.add(lb3);
        c.add(jc);
        c.add(lb4);
        c.add(t2);
        c.add(lb5);
        c.add(t3);
        c.add(lb6);
        c.add(t4);
        c.add(lb7);
        c.add(t5);
        c.add(lb8);
        c.add(t6);
        c.add(b1);
        c.add(b2);

        // Action listeners for buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public static void main(String[] args) {
        Student2 obj1 = new Student2();
        obj1.setTitle("Student Details");
        obj1.setSize(800, 600);
        obj1.setVisible(true);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Action handling
    public void actionPerformed(ActionEvent arg) {
        String command = arg.getActionCommand();
        if (command.equals("Calculate")) {
            // Retrieving inputs
            @SuppressWarnings("unused")
			String name = t1.getText();
            String rno = t2.getText();
            String marksInput = t3.getText();

            // Basic validation
            try {
                if (rno.length() != 10) {
                    JOptionPane.showMessageDialog(this, "RNO must be 10 digits");
                    return;
                }

                // Extract marks and calculate total and percentage
                StringTokenizer st = new StringTokenizer(marksInput, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int f = Integer.parseInt(st.nextToken());

                // Validating marks range
                if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100 || d < 0 || d > 100 || e < 0 || e > 100 || f < 0 || f > 100) {
                    JOptionPane.showMessageDialog(this, "Marks should be between 0 and 100");
                    return;
                }

                // Calculating total and percentage
                int total = a + b + c + d + e + f;
                t4.setText(String.valueOf(total));

                float percentage = total / 6.0f;
                t5.setText(String.valueOf(percentage));

                // Checking if any subject marks are below the pass mark
                if (a < 35 || b < 35 || c < 35 || d < 35 || e < 35 || f < 35) {
                    t6.setText("Fail");
                } else {
                    t6.setText("Pass");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter valid marks for 6 subjects");
            }
        } else if (command.equals("Clear")) {
            // Clear all input fields
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
        }
    }
}

