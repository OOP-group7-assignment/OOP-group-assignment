import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Removed the reset button action listener
//Removed right side text area
//Changed the layout. now it has a sign in and a sign up button
//Need to add a correct verfication code to email field. This would vary with the saved password and username of inputs of users


public class Registration extends JFrame {
    private final int FRAME_WIDTH = 700;
    private final int FRAME_HEIGHT = 880;
    private final int FRAME_X = 680;
    private final int FRAME_Y = 150;

    Registration() {
        setTitle("Registration Form");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X, FRAME_Y);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //Registration Form

        JLabel titleLable = new JLabel("SIGN UP");
        titleLable.setSize(350, 50);
        titleLable.setLocation(310, 20);
        titleLable.setFont(new Font("Arial", Font.BOLD, 25));
        contentPane.add(titleLable);

        //name

        JLabel nameLable = new JLabel("Name");
        nameLable.setSize(100, 30);
        nameLable.setLocation(150, 100);
        nameLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(nameLable);

        JTextField nameTextField = new JTextField();
        nameTextField.setSize(250, 30);
        nameTextField.setLocation(250, 100);
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(nameTextField);

        //email

        JLabel emailLable = new JLabel("Email");
        emailLable.setSize(100, 30);
        emailLable.setLocation(150, 150);
        emailLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(emailLable);

        JTextField emailLableTextField = new JTextField();
        emailLableTextField.setSize(250, 30);
        emailLableTextField.setLocation(250, 150);
        emailLableTextField.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(emailLableTextField);


        // gender

        JLabel genderLable = new JLabel("Gender");
        genderLable.setSize(100, 30);
        genderLable.setLocation(150, 200);
        genderLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(genderLable);

        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(250, 205);
        contentPane.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(350, 205);
        contentPane.add(female);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        // birthday

        JLabel birthdayLable = new JLabel("Birthday");
        birthdayLable.setSize(100, 30);
        birthdayLable.setLocation(150, 250);
        birthdayLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(birthdayLable);

        String[] days = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
        };
        JComboBox dayCombo = new JComboBox(days);
        dayCombo.setSize(50, 20);
        dayCombo.setLocation(250, 255);
        add(dayCombo);

        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
                "Nov", "Dec"
        };
        JComboBox monthCombo = new JComboBox(months);
        monthCombo.setSize(80, 20);
        monthCombo.setLocation(300, 255);
        add(monthCombo);

        String[] years = {
                "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015",
                "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005",
                "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995",
                "1994", "1993", "1992", "1991", "1990"
        };
        JComboBox yearCombo = new JComboBox(years);
        yearCombo.setSize(100, 20);
        yearCombo.setLocation(380, 255);
        add(yearCombo);

        monthCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDays(dayCombo, monthCombo.getSelectedIndex(), Integer.parseInt((String) yearCombo.getSelectedItem()));
            }
        });

        yearCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDays(dayCombo, monthCombo.getSelectedIndex(), Integer.parseInt((String) yearCombo.getSelectedItem()));
            }
        });


// password

        JLabel passwordLable = new JLabel("Password");
        passwordLable.setSize(100, 30);
        passwordLable.setLocation(150, 300);
        passwordLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(passwordLable);

        JTextField passwordText = new JTextField();
        passwordText.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordText.setSize(250, 30);
        passwordText.setLocation(250, 300);
        contentPane.add(passwordText);

        //Verify the consent
        JCheckBox checkBox = new JCheckBox("I am not a ROBOT.");
        checkBox.setFont(new Font("Arial", Font.PLAIN, 15));
        checkBox.setSize(250, 20);
        checkBox.setLocation(220, 350);
        contentPane.add(checkBox);

        JButton signupButton = new JButton("Signup");
        signupButton.setFont(new Font("Arial", Font.PLAIN, 20));
        signupButton.setSize(200, 40);
        signupButton.setLocation(250, 400);
        contentPane.add(signupButton);

        JLabel titleLable1 = new JLabel("SIGN IN");
        titleLable1.setSize(350, 50);
        titleLable1.setLocation(310, 480);
        titleLable1.setFont(new Font("Arial", Font.BOLD, 25));
        contentPane.add(titleLable1);

        //email-sign-in

        JLabel nameLable1 = new JLabel("Email");
        nameLable1.setSize(100, 30);
        nameLable1.setLocation(150, 530);
        nameLable1.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(nameLable1);

        JTextField nameTextField1 = new JTextField();
        nameTextField1.setSize(250, 30);
        nameTextField1.setLocation(250, 530);
        nameTextField1.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(nameTextField1);

        //password-sign-in

        JLabel passwordLable1 = new JLabel("Password");
        passwordLable1.setSize(100, 30);
        passwordLable1.setLocation(150, 580);
        passwordLable1.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(passwordLable1);

        JTextField passwordLableTextField1 = new JTextField();
        passwordLableTextField1.setSize(250, 30);
        passwordLableTextField1.setLocation(250, 580);
        passwordLableTextField1.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(passwordLableTextField1);

        JButton ResetButton = new JButton("Sign in");
        ResetButton.setFont(new Font("Arial", Font.PLAIN, 20));
        ResetButton.setSize(200, 40);
        ResetButton.setLocation(250, 630);
        contentPane.add(ResetButton);



        //ResetButton.addActionListener(new ActionListener() {
         //   @Override
         //   public void actionPerformed(ActionEvent e) {
        //        nameTextField.setText("");
         //       emailLableTextField.setText("");
          //      male.setSelected(true);
          //      dayCombo.setSelectedIndex(0);
         //       monthCombo.setSelectedIndex(0);
         //       yearCombo.setSelectedIndex(0);
         //       passwordText.setText("");
          //      checkBox.setSelected(false);

        //    }
       // });
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Confirm You are not a Robot",
                            "Terms Not Accepted",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                String name = nameTextField.getText();
                String email = emailLableTextField.getText();
                String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected";
                String birthday = dayCombo.getSelectedItem() + " " + monthCombo.getSelectedItem() + " " + yearCombo.getSelectedItem();
                String password = passwordText.getText();
                String terms = checkBox.isSelected() ? "Accepted" : "Not Accepted";

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Name field cannot be empty!",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Mobile field cannot be empty!",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Password cannot be empty!",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                // Email Verification should be configured properly
                if (!email.matches("\\d+")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Email Should be in the correct format",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

               //tring output = String.format(
                      //"Name: %s\nMobile: %s\nGender: %s\nBirthday: %s\nAddress: %s\nTerms: %s",
                      //name, email, gender, birthday, password, terms
             // );

            }
        });
    }
        private void updateDays (JComboBox < String > dayCombo,int monthIndex, int year){
            int daysInMonth;

            switch (monthIndex) {
                case 1: // February
                    daysInMonth = isLeapYear(year) ? 29 : 28;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
                    break;
            }

            dayCombo.removeAllItems();
            for (int i = 1; i <= daysInMonth; i++) {
                dayCombo.addItem(String.valueOf(i));
            }
        }

        private boolean isLeapYear ( int year){
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static void main (String[]args){
            Registration frame = new Registration();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    }

//Sign in part must be configured as well. Must add verifiction codes for sign in button and the password. Double checking is needed