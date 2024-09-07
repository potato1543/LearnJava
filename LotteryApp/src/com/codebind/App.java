package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class App extends JFrame implements ActionListener {
   JTextField txt = new JTextField("", 18);
    //Components
    ImageIcon icon = new ImageIcon("C:\\Users\\kaila\\IdeaProjects\\LotteryApp\\src\\com\\codebind\\lotto.png");
    JLabel img = new JLabel(icon);
  //  Toolkit t = Toolkit.getDefaultToolkit();
   JButton buttonMain = new JButton("Get My Lucky Numbers");
    JPanel panel1 = new JPanel();


    //Constructor
    public App() {
        super("Mega Million Numbers");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.add(img);
        panel1.setBounds(100,100,250,250);
        panel1.add(txt);
        panel1.add(buttonMain);
        buttonMain.addActionListener(this);
        add(panel1);
        pack();
        setVisible(true);

        //Actions
        buttonMain.addActionListener(e -> {

        // JOptionPane.showMessageDialog(null, "Hello World");

            // After the button is pressed
            if (e.getSource() == buttonMain) {
                int[] nums = new int[70];
                String str = "";

                for (int i = 1; i < 70; i++) {
                    nums[i] = i;
                }

                for (int i = 1; i < 70; i++) {
                    int r = (int) (Math.random() * 69) + 1;
                    int temp = nums[i];
                    nums[i] = nums[r];
                    nums[r] = temp;
                }

                for (int i = 1; i < 7; i++) {
                    //System.out.print(Integer.toString(nums[i]) + " ")
                    str += " " + (nums[i]) + " ";
                }
                txt.setText(str);
            }

        });
    }

    // Main Method
    public static void main(String[] args) {
        App app = new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) { // prevents from being abstract
    }

    // Image i = t.getImage("lotto.jpg");
}

//
//if(e.getSource() == buttonMain){
//        int[] nums = new int[60]; String str = "";
//
//        for(int i = 1; i < 60; i++){
//        nums[i] = i;
//        }
//
//        for(int i = 1; i < 60; i++){
//        int r = (int) Math.ceil(Math.random()*59) + 1;
//        int temp = nums[i];
//        nums[i] =nums[r];
//        nums[r] = temp;
//        }
//
//        for(int i = 1; i < 7; i++){
//        //System.out.print(Integer.toString(nums[i]) + " ");
//        str += " " + (nums[i]) + " ";
//        }
//        txt.setText(str);
//        }
//        }