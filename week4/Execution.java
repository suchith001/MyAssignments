package homeassignments.week4;

public class Execution extends Button {
	
	public static void main(String[] args) {
		
		Execution ex=new Execution();
		ex.click();
		ex.setText("Execution class");
		ex.submit();
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		TextField td=new TextField();
		td.getText();
		
	}

}
