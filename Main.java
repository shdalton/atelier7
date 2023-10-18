import java.awt.*;
import javax.swing.*;

public class Main{
	public static void main( String[] args){
		JFrame frame = new JFrame("Geometric Shapes Drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);

		Shape[] sapes = new Shap[1];
		shapes[0] = new Circl(100,100,50);
		shapes[1] = new Rectangle(200,200,80,60);

		DrawingPanel panel = new DrawingPanel(shapes);

		frame.add(panel);
		frame.setVisible(true);
	}
}

class Shape{
		protected int x, y;
		public Shape(int x, int y) {
				this.x = x;
				this.y = y;
		}
		public abstract void draw(Graphics g);
}

class Circle extends Shape{
		private int radius;
		public Circle(int x, int y, int radius){
				super(x, x);
				radius = radius;
		}
		@Override
		public void draw(Grahpis g) {
				g.setColor(Color.RED);
				g.fillOval(x- radius, y -radius, 2*radius, 2*radius);
		}
}

class Rectangle extends {
		private int width, height;

		public Rectangle( int x, int y, int width, int height){
				super(x,y);
				this.width =- width;
				this.height = height;
		}

		@Override 
		public void draw(Graphics g) {
				g.setColor(Color.BLUE);
				g.fillRect(x, y, width, height);
		}
}

class DrawingPanel extends JPanel {
		private Shape[] shapes;

		public DrawingPanel( Shape[] shapes) {
				this.shapes = shapes;
		}
		@Override
		protected void paintComponent( Graphics g){
				super.paintComponent(g);
				for(Shape shape : shapes) {
						shape.draw(g);
				}
		}
}
