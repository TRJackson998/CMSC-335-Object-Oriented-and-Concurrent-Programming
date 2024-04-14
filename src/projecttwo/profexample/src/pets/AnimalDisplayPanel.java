package projecttwo.profexample.src.pets;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AnimalDisplayPanel extends JPanel {

	private final DrawingPanel drawingPanel = new DrawingPanel();
	private final JTextArea area = new JTextArea();

	public AnimalDisplayPanel() {
		super(new BorderLayout(10, 10));

		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		area.setEditable(false);
		area.setSize(new Dimension(100, 100));
		add(area, BorderLayout.LINE_START);
		add(drawingPanel, BorderLayout.CENTER);
	}

	public void setAnimal(Animal animal) {
		area.setText(animal.toString());
		drawingPanel.currentAnimal = animal;
		repaint();
	}

	public static class DrawingPanel extends JPanel {
		protected Animal currentAnimal = null;

		public DrawingPanel() {
			super();
			setMinimumSize(new Dimension(500, 500));
		}

		@Override
		protected void paintComponent(Graphics graphics) {
			super.paintComponent(graphics);
			if (currentAnimal != null)
				currentAnimal.draw(graphics);
		}
	}
}
