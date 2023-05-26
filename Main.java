import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

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
        public static int ww;
        public static int s = 0;
        public static int X = 100;
        public static int Y = 15;
        public static int w_idth = 0;
        public static int h_eight = 20;
        public static int stepsize = 2;
        public static JFrame frame;
        public static JFrame frame2;
        public static JPanel timePan;
        public static JPanel endingpanel2;
        public static JPanel endPan;
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
        public static JPanel start;
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
        public static JButton opak;
        public static JButton startB;
        public static Color c;
        public static Color c2;
        public static Color c3;
        public static Color[] poleBarev;
        public static Color x;
        public static JLabel endLabel;
        public static JLabel numb = null;
        public static JLabel scor;
        public static Timer t;
        public static String q;
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



            x = topColorChanging();

            poleBarev = new Color[16];

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

            AllButtonsSleep();
            starter();
            endPanel();
            mover();
            //counter();

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[0] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }

                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[1] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }

                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[2] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }

                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[3] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }

                }
            });
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[4] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }

                }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[5] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[6] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[7] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[8] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[9] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[10] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[11] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[12] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button14.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[13] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button15.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[14] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });
            button16.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (poleBarev[15] == x) {
                        programRepeater();
                        prodluzovac();
                        counter();
                    }
                    else {
                        endingpanel.setVisible(true);
                        AllButtonsSleep();
                        timePan.setVisible(false);
                    }
                }
            });

            numb = new JLabel();
            numb.setText("skóre: " + s);
            numb.setFont(new Font("serif", Font.BOLD, 30));
            numb.setForeground(Color.BLACK);
            numb.setBounds(115, 20, 200, 100);

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


            panelMain.add(timePan);
            panelMain.add(toppblue);
            panelMain.add(numb);
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
            //panelMain.add(start);


            frame = new JFrame();

            frame.setVisible(true);
            frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            frame.setResizable(false);
            frame.pack();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.getContentPane();


            frame.add(start);
            frame.add(endingpanel);
            frame.add(numb);
            frame.add(timePan);
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
        public static void starter(){

            JLabel čřžý = new JLabel("Hra jak sviň");
            čřžý.setForeground(Color.white);
            čřžý.setVisible(true);
            čřžý.setFont(new Font("serif", Font.BOLD, 90));
            čřžý.setBounds(200, 80, 500, 125);

            startB = new JButton("start");
            startB.setFont(new Font("serif", Font.BOLD, 50));
            startB.setForeground(Color.yellow);
            startB.setVisible(true);
            startB.setBackground(Color.CYAN);
            startB.setBounds( 245, 300, 400, 100);

            start = new JPanel();
            start.setVisible(true);
            start.setBackground(c);
            start.setLayout(null);
            start.setBounds(0, 0, WIDTH, HEIGHT);
            start.add(startB);
            start.add(čřžý);

            startB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    start.setVisible(false);
                    timePan.setVisible(true);
                    AllButtonsWakeup();
                    w_idth = 700;
                }
            });


        }
        public static int mover() {
            timePan = new JPanel();
            timePan.setVisible(false);
            timePan.setBackground(Color.white);
            timePan.setOpaque(true);
            timePan.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
            ww = 1;
            t = new Timer();

            while (ww <= 350) {
                t.schedule(new TimerTask() {
                    public void run() {
                        w_idth = w_idth - stepsize;
                        timePan.setBounds(X, Y, w_idth, h_eight);
                        System.out.println(ww +" cycle");
                        ww++;
                        if(w_idth == 0){
                            System.out.println("Time is over!!!");
                            AllButtonsSleep();
                            endingpanel.setVisible(true);
                        }
                    }
                }, 0, 50);
                return ww;
            }
            return w_idth;
        }
        public static int prodluzovac(){
            w_idth = w_idth + 20;
            timePan.setBounds(X, Y, w_idth, h_eight);
            return w_idth;
        }
        public static int counter(){
            s++;
            System.out.println(s);
            q = "skóre: " + s;
            numb.setText(q);
            scor.setText("skóre: " + s);
            return s;
        }
        public static void programRepeater(){

            x = topColorChanging();

            poleBarev = new Color[16];

            int posBut = (int) (Math.random() * 15) + 1;

            //while (poleBarev[posBut] == x){

            for (int i = 0; i <= 15; i++) {

                poleBarev[i] = topColorChanging();

                if (i + 1 == posBut) {

                    poleBarev[i] = x;

                }
            }

            toppblue.setBackground(x);

            button1.setBackground(poleBarev[0]);
            button2.setBackground(poleBarev[1]);
            button3.setBackground(poleBarev[2]);
            button4.setBackground(poleBarev[3]);
            button5.setBackground(poleBarev[4]);
            button6.setBackground(poleBarev[5]);
            button7.setBackground(poleBarev[6]);
            button8.setBackground(poleBarev[7]);
            button9.setBackground(poleBarev[8]);
            button10.setBackground(poleBarev[9]);
            button11.setBackground(poleBarev[10]);
            button12.setBackground(poleBarev[11]);
            button13.setBackground(poleBarev[12]);
            button14.setBackground(poleBarev[13]);
            button15.setBackground(poleBarev[14]);
            button16.setBackground(poleBarev[15]);

        }
        public static void AllButtonsSleep(){

            button1.setVisible(false);
            button2.setVisible(false);
            button3.setVisible(false);
            button4.setVisible(false);
            button5.setVisible(false);
            button6.setVisible(false);
            button7.setVisible(false);
            button8.setVisible(false);
            button9.setVisible(false);
            button10.setVisible(false);
            button11.setVisible(false);
            button12.setVisible(false);
            button13.setVisible(false);
            button14.setVisible(false);
            button15.setVisible(false);
            button16.setVisible(false);
        }
        public static void AllButtonsWakeup(){

            button1.setVisible(true);
            button2.setVisible(true);
            button3.setVisible(true);
            button4.setVisible(true);
            button5.setVisible(true);
            button6.setVisible(true);
            button7.setVisible(true);
            button8.setVisible(true);
            button9.setVisible(true);
            button10.setVisible(true);
            button11.setVisible(true);
            button12.setVisible(true);
            button13.setVisible(true);
            button14.setVisible(true);
            button15.setVisible(true);
            button16.setVisible(true);
        }
        public static void endPanel(){

            opak = new JButton("znova");
            opak.setFont(new Font("serif", Font.BOLD, 50));
            opak.setForeground(Color.yellow);
            opak.setVisible(true);
            opak.setOpaque(true);
            opak.setBounds(245, 300, 400, 100);
            opak.setBackground(Color.CYAN);

            scor = new JLabel();
            scor.setForeground(Color.white);
            scor.setText("skóre: " + s);
            scor.setVisible(true);
            scor.setFont(new Font("serif", Font.BOLD, 60));
            scor.setBounds(340, 210, 300, 50);

            opak.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    endingpanel.setVisible(false);
                    timePan.setVisible(true);
                    AllButtonsWakeup();
                    programRepeater();
                    s = 0;
                    numb.setText("skóre: " + s);
                    w_idth = 700;

                }
            });

            endLabel = new JLabel("Prohrál jsi");

            endLabel.setFont(new Font("serif", Font.BOLD, 90));
            endLabel.setForeground(Color.WHITE);
            endLabel.setBounds(25, 10, 450, 125);

            endPan = new JPanel();

            endPan.setLayout(null);
            endPan.setBounds(215, 80, 470, 150);
            endPan.setBackground(new Color(0, 0, 0, 0));
            endPan.add(endLabel);
            //endPan.add(scor);
            //endPan.add(opak);



            endingpanel = new JPanel();
            //c3 = new Color(c);

            endingpanel.add(endPan);
            endingpanel.setVisible(false);

            endingpanel.setBackground(c);
            endingpanel.setLayout(null);
            endingpanel.setOpaque(true);
            endingpanel.setBounds(0, 0, 900, 700);
            endingpanel.add(opak);
            endingpanel.add(scor);
        }
        public static void buttons(JPanel panel, JButton button, int boundx, int boundy, int widthButton, int heightButton, String text, int locx, int locy, Color ddd){

            button.setVisible(true);
            button.setLocation(locx, locy);
            button.setPreferredSize(new Dimension(widthButton, heightButton));
            button.setOpaque(true);
            button.setBackground(ddd);
            //button.setLayout(null);
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