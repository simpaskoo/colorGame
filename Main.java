import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        c1.f();
    }

    public static class c1 extends JFrame {

        public static int HEIGHT = 700;
        public static int WIDTH = 900;
        public static int r;
        public static int g;
        public static int b;
        public static JFrame frame;
        public static JFrame frame2;
        public static JPanel endingpanel2;
        public static JPanel endingpanel;
        public static JPanel panelMain;
        public static JPanel panel1;
        public static JPanel panel2;
        public static JPanel panel3;
        public static JPanel panel4;
        public static JPanel panel5;
        public static JPanel panel6;
        public static JPanel panel7;
        public static JPanel panel8;
        public static JPanel panel9;
        public static JPanel panel10;
        public static JPanel panel11;
        public static JPanel panel12;
        public static JPanel panel13;
        public static JPanel panel14;
        public static JPanel panel15;
        public static JPanel panel16;
        public static JPanel toppblue;
        public static JButton button1;
        public static JButton button2;
        public static JButton button3;
        public static JButton button4;
        public static JButton button5;
        public static JButton button6;
        public static JButton button7;
        public static JButton button8;
        public static JButton button9;
        public static JButton button10;
        public static JButton button11;
        public static JButton button12;
        public static JButton button13;
        public static JButton button14;
        public static JButton button15;
        public static JButton button16;
        public static Color c;
        public static Color c2;
        public static Color c3;
        public static void f(){

            panel1 = new JPanel();
            panel2 = new JPanel();
            panel3 = new JPanel();
            panel4 = new JPanel();
            panel5 = new JPanel();
            panel6 = new JPanel();
            panel7 = new JPanel();
            panel8 = new JPanel();
            panel9 = new JPanel();
            panel10 = new JPanel();
            panel11 = new JPanel();
            panel12 = new JPanel();
            panel13 = new JPanel();
            panel14 = new JPanel();
            panel15 = new JPanel();
            panel16 = new JPanel();

            button1 = new JButton();
            button2 = new JButton();
            button3 = new JButton();
            button4 = new JButton();
            button5 = new JButton();
            button6 = new JButton();
            button7 = new JButton();
            button8 = new JButton();
            button9 = new JButton();
            button10 = new JButton();
            button11 = new JButton();
            button12 = new JButton();
            button13 = new JButton();
            button14 = new JButton();
            button15 = new JButton();
            button16 = new JButton();



            Color x = topColorChanging();

            Color[] poleBarev = new Color[16];

            int posBut = (int) (Math.random() * 15) + 1;

            for (int i = 0; i <= 15; i++){

                poleBarev[i] = topColorChanging();

                if (i + 1 == posBut){

                    poleBarev[i] = x;

                }

            }



            buttons(panel1, button1, 100, 250, 100, 50, "1", 0, 0, poleBarev[0]);
            buttons(panel2, button2, 300, 250, 100, 50, "2", 0, 0,poleBarev[1]);
            buttons(panel3, button3, 500, 250, 100, 50, "3", 0, 0, poleBarev[2]);
            buttons(panel4, button4, 700, 250, 100, 50, "4", 0, 0, poleBarev[3]);

            buttons(panel5, button5, 100, 350, 100, 50, "5", 0, 0, poleBarev[4]);
            buttons(panel6, button6, 300, 350, 100, 50, "6", 0, 0, poleBarev[5]);
            buttons(panel7, button7, 500, 350, 100, 50, "7", 0, 0, poleBarev[6]);
            buttons(panel8, button8, 700, 350, 100, 50, "8", 0, 0, poleBarev[7]);

            buttons(panel9, button9, 100, 450, 100, 50, "9", 0, 0, poleBarev[8]);
            buttons(panel10, button10, 300, 450, 100, 50, "10", 0, 0, poleBarev[9]);
            buttons(panel11, button11, 500, 450, 100, 50, "11", 0, 0, poleBarev[10]);
            buttons(panel12, button12, 700, 450, 100, 50, "12", 0, 0, poleBarev[11]);

            buttons(panel13, button13, 100, 550, 100, 50, "13", 0, 0, poleBarev[12]);
            buttons(panel14, button14, 300, 550, 100, 50, "14", 0, 0, poleBarev[13]);
            buttons(panel15, button15, 500, 550, 100, 50, "15", 0, 0, poleBarev[14]);
            buttons(panel16, button16, 700, 550, 100, 50, "16", 0, 0, poleBarev[15]);



            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[0] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[1] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[2] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[3] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[4] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[5] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[6] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[7] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[8] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[9] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[10] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[11] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[12] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button14.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[13] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button15.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[14] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });
            button16.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[15] == x){
                        System.out.println("správně");
                    }else {

                    }
                }
            });

            endingpanel = new JPanel();
            c3 = new Color(156, 25, 67, 200);

            endingpanel.setVisible(true);
            endingpanel.setBackground(c3);
            endingpanel.setLayout(new CardLayout());
            endingpanel.setOpaque(true);
            endingpanel.setBounds(0, 0, 900, 700);

            /*frame2 = new JFrame();

            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame2.setBackground(Color.yellow);
            frame2.setAlwaysOnTop(true);
            frame2.setPreferredSize(new Dimension(900, 700));
            frame2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
            frame2.setResizable(false);
            frame2.pack();
            frame2.setLocationRelativeTo(null);
            frame2.getContentPane();
            frame2.add(endingpanel);*/


            toppblue = new JPanel();
            toppblue.setVisible(true);
            toppblue.setOpaque(true);
            toppblue.setBounds(100, 50, 700, 150);
            toppblue.setBackground(x);
            toppblue.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

            panelMain = new JPanel();
            c2 = new Color(0, 110, 109);
            panelMain.setVisible(true);
            panelMain.setBackground(c2);
            panelMain.setPreferredSize(new Dimension(WIDTH, HEIGHT));

            //panelMain.add(endingpanel);
            panelMain.add(toppblue);
            panelMain.add(panel1);
            panelMain.add(panel2);
            panelMain.add(panel3);
            panelMain.add(panel4);
            panelMain.add(panel5);
            panelMain.add(panel6);
            panelMain.add(panel7);
            panelMain.add(panel8);
            panelMain.add(panel9);
            panelMain.add(panel10);
            panelMain.add(panel11);
            panelMain.add(panel12);
            panelMain.add(panel13);
            panelMain.add(panel14);
            panelMain.add(panel15);
            panelMain.add(panel16);

            frame = new JFrame();

            frame.setVisible(true);
            frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            frame.setResizable(false);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.getContentPane();


            frame.add(endingpanel);
            frame.add(toppblue);
            frame.add(panel1);
            frame.add(panel2);
            frame.add(panel3);
            frame.add(panel4);
            frame.add(panel5);
            frame.add(panel6);
            frame.add(panel7);
            frame.add(panel8);
            frame.add(panel9);
            frame.add(panel10);
            frame.add(panel11);
            frame.add(panel12);
            frame.add(panel13);
            frame.add(panel14);
            frame.add(panel15);
            frame.add(panel16);
            frame.add(panelMain);


        }

        public static void endPanel(){





        }
        public static void buttons(JPanel panel, JButton button, int boundx, int boundy, int widthButton, int heightButton, String text, int locx, int locy, Color ddd){

            button.setVisible(true);
            button.setLocation(locx, locy);
            button.setPreferredSize(new Dimension(widthButton, heightButton));
            button.setOpaque(true);
            button.setBackground(ddd);
            button.setText(text);

            panel.setVisible(true);
            panel.setOpaque(true);
            panel.setBounds(boundx, boundy, widthButton, heightButton);
            panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
            panel.add(button);

        }
        public static Color topColorChanging(){

            r = (int) (Math.random() * 256);
            g = (int) (Math.random() * 256);
            b = (int) (Math.random() * 256);

            c = new Color(r, g, b);

            return c;

        }

    }

}