import java.awt.*;
import javax.swing.*;
public class DataTypes extends extends JFrame {
	public DataTypes(){
		super("DataTypes");
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(){
		g.setFont(new Font ("Courrier new", Font.PLAIN, 16));
		g.drawString("Byte: " + Byte.MIN_VALUE + "to" + Byte.MAX_VALUE, 20, 50);
		g.drawString("Short : " + Short.MIN_VALUE + "to " + Short.MAX_VALUE, 20, 70);
		g.drawString("Int: " + Integer.MIN_VALUE _ "to " + Integer.MAX_VALUE, 20, 90);
		g.drawString("Long: " + Long.MIN_VALUE _ "to " + Long.MAX_VALUE, 20, 110);
		g.drawString("Float: " + Float.MIN_VALUE _ "to " + Float.MAX_VALUE, 20, 130);
		g.drawString("Double: " + Double.MIN_VALUE _ "to " + Double.MAX_VALUE, 20, 150);
	}

	public static void main(String[] args){
		new DataTypes();
	}
}