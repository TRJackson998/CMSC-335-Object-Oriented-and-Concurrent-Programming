/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * 		Panel of the GUI for displaying shape images/drawings 
 * 
 * Based on - 
 * CMSC 335: programming sample
 * Dr. Vergamini
 */

package projecttwo.shapes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ShapeDisplayPanel extends JPanel {

	private final DrawingPanel drawingPanel = new DrawingPanel();
	private final JTextArea area = new JTextArea();

	public ShapeDisplayPanel() {
		super(new BorderLayout(10, 10));

		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		area.setEditable(false);
		area.setSize(new Dimension(100, 100));
		add(area, BorderLayout.LINE_START);
		add(drawingPanel, BorderLayout.CENTER);
	}

	public void setShape(Shape shape) {
		area.setText(shape.toString());
		drawingPanel.currentShape = shape;
		repaint();
	}

	public static class DrawingPanel extends JPanel {
		protected Shape currentShape = null;

		public DrawingPanel() {
			super();
			setMinimumSize(new Dimension(500, 500));
		}

		@Override
		protected void paintComponent(Graphics graphics) {
			super.paintComponent(graphics);
			if (currentShape != null)
				currentShape.draw(graphics);
		}
	}
}
