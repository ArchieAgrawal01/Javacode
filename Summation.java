import javax.swing.JOptionPane;
class Summation{
	public static void main(String args[]){
	int add , a , mul , sub , b , c;
	float div;
	String str1 , str2 , str;
	str1 = JOptionPane.showInputDialog(null,"Enter 1st number:");
	a = Integer.parseInt(str1);
	str2 = JOptionPane.showInputDialog(null,"Enter 2nd number:");
	b = Integer.parseInt(str2);
	str = JOptionPane.showInputDialog(null,"1.Addition"+"\n 2.Substraction"+"\n 3.Multiplication"+"\n 4.Division"+"\nEnter your choice:");
	c = Integer.parseInt(str);
	switch(c){
	case 1: add = a + b;
		  JOptionPane.showMessageDialog(null,"Addition of two number is "+add);
		break;
	case 2 : sub = a - b;
		   JOptionPane.showMessageDialog(null,"Substraction of two number is "+sub);
		break;
	case 3: mul = a * b;
		  JOptionPane.showMessageDialog(null,"Multiplication of two number is "+mul);
		break;
	case 4: div = a / b;
		  JOptionPane.showMessageDialog(null,"Division of two number is "+div);
		break;
	default:
		JOptionPane.showMessageDialog(null,"Invalid Choice");
	}
	}
}