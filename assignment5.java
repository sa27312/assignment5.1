
/**
*
* author Sina Abdollahi
*/
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ScoreGui implements ActionListener{


	private JFrame frame;
	private JPanel panel;
	private JLabel nameOfStudent;
	private JLabel test1;
	private JLabel test2;
	private JLabel test3;
	private JLabel test4;
	private JLabel gradeAverage;
	private JLabel weight;
	private JLabel averageOutput;
	private JLabel nameOutput;
	private JButton button;
	private JTextField student;
	private JTextField score1;
	private JTextField score2;
	private JTextField score3;
	private JTextField score4;
	private JTextField weight1;
	private JTextField weight2;
	private JTextField weight3;
	private JTextField weight4;


	
	public ScoreGui(){
	
		frame = new JFrame("WEIGHTED AVERAGE CALCULATOR");
		frame.setVisible(true);
		frame.setSize(600,320 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		panel = new JPanel();
		panel.setBackground(Color.yellow);
		panel.setLayout(new GridLayout(7,3));
		nameOfStudent = new JLabel();
		nameOfStudent.setText(" STUDENT NAME");
		nameOfStudent.setForeground(Color.black);

		weight = new JLabel();
		weight.setText(" WEIGHT");
		weight.setForeground(Color.black);
		test1 = new JLabel();
		test1.setText(" TEST # 1");
		test1.setForeground(Color.black);
		test2 = new JLabel();
		test2.setText(" TEST # 2");
		test2.setForeground(Color.black);
		test3 = new JLabel();
		test3.setText(" TEST # 3");
		test3.setForeground(Color.black);
		test4 = new JLabel();
		test4.setText(" TEST # 4");
		test4.setForeground(Color.black);
		gradeAverage = new JLabel();
		gradeAverage.setText(" AVERAGE :");
		gradeAverage.setForeground(Color.black);
		averageOutput = new JLabel();
		averageOutput.setText(" ");
		nameOutput = new JLabel();
		nameOutput.setText(" ");

		student = new JTextField(5);
		score1 = new JTextField(5);
		score2 = new JTextField(5);
		score3 = new JTextField(5);
		score4 = new JTextField(5);
		weight1 = new JTextField(5);
		weight2 = new JTextField(5);
		weight3 = new JTextField(5);
		weight4 = new JTextField(5);

		button = new JButton();
		button.setBackground(Color.LIGHT_GRAY);
		button.setText("CALCULATE");
		button.addActionListener(this);
		button.setForeground(Color.BLACK);

		panel.add(nameOfStudent);
		panel.add(student);
		panel.add(weight);
		panel.add(test1);
		panel.add(score1);
		panel.add(weight1);
		panel.add(test2);
		panel.add(score2);
		panel.add(weight2);
		panel.add(test3);
		panel.add(score3);
		panel.add(weight3);
		panel.add(test4);
		panel.add(score4);
		panel.add(weight4);
		panel.add(gradeAverage);
		panel.add(averageOutput);
		panel.add(nameOutput);
		panel.add(button);
		frame.add(panel);
	}

	public double calculateAverageScore(){
		double grade= 0.0;
		return grade;
	}

	public void actionPerformed(ActionEvent e) {
		String name;

		double [] grade= new double[4];
		grade[0]= 0.0;
		grade[1]= 0.0;
		grade[2]= 0.0;
		grade[3]= 0.0;
		double weightedAverage;
		double [] thisWeight = new double[4];
		thisWeight[0]= 0.0;
		thisWeight[1]= 0.0;
		thisWeight[2]= 0.0;
		thisWeight[3]= 0.0;
		grade[0] = Double.parseDouble(score1.getText());
		grade[1] = Double.parseDouble(score2.getText());
		grade[2] = Double.parseDouble(score3.getText());
		grade[3] = Double.parseDouble(score4.getText());
		thisWeight[0] = Double.parseDouble(weight1.getText());
		thisWeight[1] = Double.parseDouble(weight2.getText());
		thisWeight[2] = Double.parseDouble(weight3.getText());
		thisWeight[3] = Double.parseDouble(weight4.getText());
		weightedAverage = (grade[0]*thisWeight[0] + grade[1]*thisWeight[1] + grade[2]*thisWeight[2] + grade[3]*thisWeight[3]);
		name = student.getText();
		averageOutput.setText(String.valueOf(name+"'s weighted average is " + weightedAverage));
	}
}
