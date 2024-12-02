import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    private final int FRAME_WIDTH = 1000;
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

        JLabel titleLable = new JLabel("Registration Form");
        titleLable.setSize(350, 50);
        titleLable.setLocation(380, 20);
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

        //mobile

        JLabel mobileLable = new JLabel("Mobile");
        mobileLable.setSize(100, 30);
        mobileLable.setLocation(150, 150);
        mobileLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(mobileLable);

        JTextField mobileTextField = new JTextField();
        mobileTextField.setSize(250, 30);
        mobileTextField.setLocation(250, 150);
        mobileTextField.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(mobileTextField);


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


// Address

        JLabel AddressLable = new JLabel("Address");
        AddressLable.setSize(100, 30);
        AddressLable.setLocation(150, 300);
        AddressLable.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPane.add(AddressLable);

        JTextArea AddressText = new JTextArea();
        AddressText.setFont(new Font("Arial", Font.PLAIN, 15));
        AddressText.setSize(250, 200);
        AddressText.setLocation(250, 300);
        AddressText.setLineWrap(true);
        contentPane.add(AddressText);

        //Verify the consent
        JCheckBox checkBox = new JCheckBox("Accept Terms and conditions.");
        checkBox.setFont(new Font("Arial", Font.PLAIN, 15));
        checkBox.setSize(250, 20);
        checkBox.setLocation(220, 550);
        contentPane.add(checkBox);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(100, 20);
        submitButton.setLocation(250, 600);
        contentPane.add(submitButton);

        JButton ResetButton = new JButton("Reset");
        ResetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        ResetButton.setSize(100, 20);
        ResetButton.setLocation(400, 600);
        contentPane.add(ResetButton);

        JTextArea confirmationText = new JTextArea();
        confirmationText.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmationText.setSize(400, 600);
        confirmationText.setLocation(550, 100);
        confirmationText.setLineWrap(true);
        contentPane.add(confirmationText);


        ResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText("");
                mobileTextField.setText("");
                male.setSelected(true);
                dayCombo.setSelectedIndex(0);
                monthCombo.setSelectedIndex(0);
                yearCombo.setSelectedIndex(0);
                AddressText.setText("");
                checkBox.setSelected(false);
                confirmationText.setText("");
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "You must accept the terms and conditions to proceed.",
                            "Terms Not Accepted",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return; // Exit the action listener without assigning values to variables
                }
                String name = nameTextField.getText();
                String mobile = mobileTextField.getText();
                String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected";
                String birthday = dayCombo.getSelectedItem() + " " + monthCombo.getSelectedItem() + " " + yearCombo.getSelectedItem();
                String address = AddressText.getText();
                String terms = checkBox.isSelected() ? "Accepted" : "Not Accepted";


                if (!mobile.matches("\\d+")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Mobile number cannot contain letters. Please enter only digits.",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                // Validate mobile number length
                if (mobile.length() != 10) { // Change 10 to the required length
                    JOptionPane.showMessageDialog(
                            null,
                            "Mobile number must be exactly 10 digits!",
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return; // Exit the action listener
                }

                // Format and display the output if validation passes
                String output = String.format(
                        "Name: %s\nMobile: %s\nGender: %s\nBirthday: %s\nAddress: %s\nTerms: %s",
                        name, mobile, gender, birthday, address, terms
                );

                // Display the output in the confirmation text area
                confirmationText.setText(output);
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
                case 10: // April, June, September, November
                    daysInMonth = 30;
                    break;
                default: // Other months
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
