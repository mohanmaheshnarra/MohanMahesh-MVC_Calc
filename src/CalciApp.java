import java.awt.*;
import java.awt.event.*;
public class CalciApp extends Frame {
	TextField op1;
	Button sum;
	TextField op2;
	Button diff;
	Button mul;
	Button div;
	Label equal;
	Label Error;
	TextField result;
	
	public CalciApp()
	{
		initialize();
		addComponentsToFrame();
		addListeners();
	}
	
	private void addListeners() {
		addWindowListener(new WindowClosingAdapter());
		sum.addActionListener(new CalciActionListener());
		div.addActionListener(new CalciActionListener());
		diff.addActionListener(new CalciActionListener());
		mul.addActionListener(new CalciActionListener());

	}
	
	private void addComponentsToFrame() {
		setLayout(new FlowLayout());
		add(op1);
		add(sum);
		add(diff);
		add(mul);
		add(div);
		add(op2);
		add(equal);
		add(result);
	} 
	
	private void initialize() {
		op1=new TextField(10);
		sum = new Button("+");
		diff = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		op2=new TextField(10);
		result=new TextField(10);
		equal=new Label("=");
		result.setEditable(false);

	}
	private class WindowClosingAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	private class CalciActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			CalciMod cCM=new CalciMod();
			try{
				int o1=Integer.parseInt(op1.getText());
				int o2=Integer.parseInt(op2.getText());
				//System.out.print(o1);
				//System.out.print(o2);
				cCM.setOper1(o1);
				cCM.setOper2(o2);
				if(e.getSource()==sum) {
					cCM.setRes(o1+o2);}
				if(e.getSource()==diff) {
					cCM.setRes(o1-o2);}
				
				if(e.getSource()==mul) {
					int r= o1*o2;
					cCM.setRes(r);
				}
				if(e.getSource()==div) {
					cCM.setRes(o1/o2);
				}
				
			}
			catch(Exception E) {
				Error=new Label("Add some values");
				add(Error);
			}
			result.setText(String.valueOf(cCM.getRes()));

			
		}
		
	}
}