import javax.swing.JOptionPane;
class division{
	public static void main(String args[]){
		float height, weight;
		int age ;
		String str;
		str = JOptionPane.showInputDialog("Enter the height of person");
		height = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Enter the age of person");
		age = Integer.parseInt(str);
		weight = (height - 100 + age % 10)* 0.90f;
		JOptionPane.showMessageDialog(null,"Weight of Person is: "+weight);
	} 
}