package awtLaundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Laundry implements ActionListener {
	JFrame f;
	JCheckBox cb, cb1;
	JLabel size, type, ql, co, to;
	JTextField qnt, qnt1, cost, cost1, tot;
	JButton b;
	JRadioButton rb, rb1;

	public Laundry() {
		f = new JFrame();
		f.setLayout(null);

		type = new JLabel("Type");
		type.setBounds(50, 50, 100, 30);

		rb = new JRadioButton("Cotton");
		rb.setBounds(50, 90, 80, 30);
		rb.addActionListener(this);

		rb1 = new JRadioButton("Silk");
		rb1.setBounds(50, 130, 60, 30);
		rb1.addActionListener(this);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rb);
		bgroup.add(rb1);

		size = new JLabel("Size");
		size.setBounds(180, 50, 100, 30);

		cb = new JCheckBox("30");
		cb.setBounds(180, 90, 80, 30);

		cb1 = new JCheckBox("32");
		cb1.setBounds(180, 130, 60, 30);

		cb.addActionListener(this);
		cb1.addActionListener(this);

		ql = new JLabel("Qty");
		ql.setBounds(270, 50, 100, 30);

		qnt = new JTextField();
		qnt1 = new JTextField();
		qnt.setBounds(270, 90, 40, 30);
		qnt1.setBounds(270, 130, 40, 30);

		co = new JLabel("Cost");
		co.setBounds(330, 50, 60, 30);

		cost = new JTextField();
		cost.setBounds(320, 90, 40, 30);
		cost1 = new JTextField();
		cost1.setBounds(320, 130, 40, 30);

		to = new JLabel("Total");
		to.setBounds(390, 50, 60, 30);
		tot = new JTextField();
		tot.setBounds(390, 90, 70, 70);

		b = new JButton("Print Receipt");
		b.setBounds(120, 180, 150, 30);
		b.addActionListener(this);

		f.add(rb);
		f.add(ql);
		f.add(qnt);
		f.add(qnt1);
		f.add(rb1);
		f.add(b);
		f.add(cb);
		f.add(cb1);
		f.add(size);
		f.add(type);
		f.add(co);
		f.add(cost);
		f.add(cost1);
		f.add(tot);
		f.add(to);
		f.setSize(600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(300, 50);
	}

	public void actionPerformed(ActionEvent e) {
		String number;
		String number1;
		int price;
		int price1;
		int total = 0;
		int cos;
		int cos1;
		if (e.getSource() == b) {
			if (rb.isSelected() && cb.isSelected() && cb1.isSelected()) {
				number = qnt.getText();
				number1 = qnt1.getText();
				price = 10;
				price1 = 15;
				Integer q = Integer.parseInt(number);
				Integer q1 = Integer.parseInt(number1);

				cos = price * q;
				cos1 = price1 * q1;
				String per = Integer.toString(cos);
				String per1 = Integer.toString(cos1);
				cost.setText(per);
				cost1.setText(per1);

				total = price * q + price1 * q1;
				String i = Integer.toString(total);

				tot.setText(i);

			} else if (cb.isSelected() && rb.isSelected()) {
				number = qnt.getText();
				price = 10;
				Integer q = Integer.parseInt(number);
				cos = price * q;
				String per = Integer.toString(cos);

				cost.setText(per);
				cost1.setText("");
				qnt1.setText("");
				total = price * q;

				String i = Integer.toString(total);

				tot.setText(i);
			} else if (cb1.isSelected() && rb.isSelected()) {
				number1 = qnt1.getText();
				price1 = 15;
				Integer q1 = Integer.parseInt(number1);
				cos1 = price1 * q1;
				String per1 = Integer.toString(cos1);
				cost1.setText(per1);
				total = price1 * q1;

				cost.setText("");
				qnt.setText("");

				String i = Integer.toString(total);
				tot.setText(i);
			}
		}
	}

	public static void main(String[] args) {
		new Laundry();
	}
}
