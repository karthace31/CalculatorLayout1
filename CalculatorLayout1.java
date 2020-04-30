package calculatorlayout1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CalculatorLayout1 {

    public static void main(String[] args) {
        new MyFrame();

    }

}

class MyFrame extends JFrame  implements ActionListener{

    JFrame f = new JFrame("Calculator");

    JTextArea txt1 = new JTextArea();
    JTextArea txt2 = new JTextArea();
    //1stCol
    JButton btn7 = new JButton("7");
    JButton btn4 = new JButton("4");
    JButton btn1 = new JButton("1");
    JButton btnClr = new JButton("Clear");
    JButton btnEqls = new JButton("=");
    JButton btnSqrt = new JButton("√");
    //2ndCol
    JButton btn8 = new JButton("8");
    JButton btn5 = new JButton("5");
    JButton btn2 = new JButton("2");
    JButton btn0 = new JButton("0");
    JButton btnAns = new JButton("Ans");
    JButton btnFctrl = new JButton("n!");   
    //3rd
    JButton btn9 = new JButton("9");
    JButton btn6 = new JButton("6");
    JButton btn3 = new JButton("3");
    JButton btnLftArrw = new JButton("←");
    JButton btnXsq = new JButton("X²");
    JButton btnDot = new JButton(".");
    //4th
    JButton btnAdd = new JButton("+");
    JButton btnSub = new JButton("-");
    JButton btnMult = new JButton("*");
    JButton btnDiv = new JButton("/");
    JButton btnXY = new JButton("X^y");
    JButton btnlxl = new JButton("|x|");
    //fifthColumn 
    JButton btnMax = new JButton();
    JButton btnMin = new JButton();
    JButton btnOpenPar = new JButton();
    JButton btnClosePar = new JButton();
    JButton btnComma = new JButton();
    JButton btnFibo = new JButton();

    //lastColumn
    JButton btnMean     = new JButton();
    JButton btnMode     = new JButton();
    JButton btnMedian = new JButton();
    JButton btnSortA = new JButton();
    JButton btnSortD = new JButton();
    JButton btnClose = new JButton();

    MyFrame() {
        super.setSize(474, 675);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setLayout(null);
        super.setVisible(true);
        super.setResizable(false);

        txt1.setSize(455, 60);
        txt1.setLocation(7, 5);
        txt1.setEditable(false);
        txt2.setSize(455, 60);
        txt2.setLocation(7, 72);
        txt2.setEditable(false);
        //1stCol
        btn7.setSize(70, 75);
        btn7.setLocation(7, 140);
        btn4.setSize(70, 75);
        btn4.setLocation(7, 225);
        btn1.setSize(70, 75);
        btn1.setLocation(7, 310);
        btnSqrt.setSize(70, 75);
        btnSqrt.setLocation(7, 565);
        btnEqls.setSize(70, 75);
        btnEqls.setLocation(7, 480);
        btnClr.setSize(70, 75);
        btnClr.setLocation(7, 395);
        //2ndCol
        btnFctrl.setSize(70, 75);
        btnFctrl.setLocation(84, 565);
        btnAns.setSize(70, 75);
        btnAns.setLocation(84, 480);
        btn0.setSize(70, 75);
        btn0.setLocation(84, 395);
        btn2.setSize(70, 75);
        btn2.setLocation(84, 310);
        btn5.setSize(70, 75);
        btn5.setLocation(84, 225);
        btn8.setSize(70, 75);
        btn8.setLocation(84, 140);
        //3rd
        btnDot.setSize(70, 75);
        btnDot.setLocation(161, 565);
        btnXsq.setSize(70, 75);
        btnXsq.setLocation(161, 480);
        btnLftArrw.setSize(70, 75);
        btnLftArrw.setLocation(161, 395);
        btn3.setSize(70, 75);
        btn3.setLocation(161, 310);
        btn6.setSize(70, 75);
        btn6.setLocation(161, 225);
        btn9.setSize(70, 75);
        btn9.setLocation(161, 140);
        //4thCol
        btnlxl.setSize(70, 75);
        btnlxl.setLocation(238, 565);
        btnXY.setSize(70, 75);
        btnXY.setLocation(238, 480);
        btnDiv.setSize(70, 75);
        btnDiv.setLocation(238, 395);
        btnMult.setSize(70, 75);
        btnMult.setLocation(238, 310);
        btnSub.setSize(70, 75);
        btnSub.setLocation(238, 225);
        btnAdd.setSize(70, 75);
        btnAdd.setLocation(238, 140);
        //5thCol
        btnFibo.setSize(70, 75);
        btnFibo.setLocation(315, 565);
        btnComma.setSize(70, 75);
        btnComma.setLocation(315, 480);
        btnClosePar.setSize(70, 75);
        btnClosePar.setLocation(315, 395);
        btnOpenPar.setSize(70, 75);
        btnOpenPar.setLocation(315, 310);
        btnMin.setSize(70, 75);
        btnMin.setLocation(315, 225);
        btnMax.setSize(70, 75);
        btnMax.setLocation(315, 140);
        //6thCol
        btnClose.setSize(70, 75);
        btnClose.setLocation(392, 565);
        btnSortD.setSize(70, 75);
        btnSortD.setLocation(392, 480);
        btnSortA.setSize(70, 75);
        btnSortA.setLocation(392, 395);
        btnMedian.setSize(70, 75);
        btnMedian.setLocation(392, 310);
        btnMode.setSize(70, 75);
        btnMode.setLocation(392, 225);
        btnMean.setSize(70, 75);
        btnMean.setLocation(392, 140);
        //SUPER.ADD
        super.add(txt1);
        super.add(txt2);
        //1st
        super.add(btn7);
        super.add(btn4);
        super.add(btn1);
        super.add(btnSqrt);
        super.add(btnEqls);
        super.add(btnClr);
        //2nd
        super.add(btnFctrl);
        super.add(btnAns);
        super.add(btn0);
        super.add(btn2);
        super.add(btn5);
        super.add(btn8);
        //3rd
        super.add(btnDot);
        super.add(btnXsq);
        super.add(btnLftArrw);
        super.add(btn3);
        super.add(btn6);
        super.add(btn9);
        //4thCol
        super.add(btnlxl);
        super.add(btnXY);
        super.add(btnDiv);
        super.add(btnMult);
        super.add(btnSub);
        super.add(btnAdd);
        //5thCol
        super.add(btnFibo);
        super.add(btnComma);
        super.add(btnClosePar);
        super.add(btnOpenPar);
        super.add(btnMin);
        super.add(btnMax);
        //6thCol
        super.add(btnClose);
        super.add(btnSortD);
        super.add(btnSortA);
        super.add(btnMedian);
        super.add(btnMode);
        super.add(btnMean);
        
        btn7.addActionListener(this);
        btn4.addActionListener(this);
        btn1.addActionListener(this);
        btnClr.addActionListener(this);
        btnEqls.addActionListener(this);
        btnSqrt.addActionListener(this);
        btn0.addActionListener(this);
        btn2.addActionListener(this);
        btn5.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn6.addActionListener(this);
        btn3.addActionListener(this);
        btnDot.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn7) {
            txt1.setText(txt1.getText() + "7");
        }
        if (e.getSource() == btn4) {
            txt1.setText(txt1.getText() + "4");
        }
        if (e.getSource() == btn1) {
            txt1.setText(txt1.getText() + "1");
        }
        if (e.getSource() == btnClr) {
            txt1.setText(" ");
        }
        if (e.getSource() == btnEqls) {
            txt1.setText(txt1.getText());
        }
        if (e.getSource() == btnSqrt) {
            txt1.setText(txt1.getText());
        }
        if (e.getSource() == btn0) {
            txt1.setText(txt1.getText()+"0");
        }
        if (e.getSource() == btn2) {
            txt1.setText(txt1.getText()+"2");
        }
        if (e.getSource() == btn5) {
            txt1.setText(txt1.getText()+"5");
        }
        if (e.getSource() == btn8) {
            txt1.setText(txt1.getText() +"8");
        }
        if (e.getSource() == btn9) {
            txt1.setText(txt1.getText() +"9");
        }
        if (e.getSource() == btn6) {
            txt1.setText(txt1.getText() +"6");
        }
        if (e.getSource() == btn3) {
            txt1.setText(txt1.getText() +"3");
        }
        if (e.getSource() == btnDot) {
            txt1.setText(txt1.getText() +".");
        }
        
    }
}