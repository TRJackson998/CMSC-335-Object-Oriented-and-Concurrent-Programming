package projecttwo.shapes;

/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * 		Main method
 * 		Opens a GUI to generate shape drawings/images
 * 
 * Based on - 
 * CMSC 335: programming sample
 * Dr. Vergamini
 * Test UI, with a simple menu.
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import projecttwo.utils.MenuEntry;

@SuppressWarnings("serial")
public class ShapeBoxUI extends JFrame implements ActionListener {

	/*
	 * we define a subclass of MenuEntry performing the user interaction with a
	 * message dialog.
	 */
	private abstract static class MenuEntryUI extends MenuEntry<Shape> {

		public MenuEntryUI(String label) {
			super(label);
		}

		@Override
		public String getStringAttribute(String parameterName) {
			final JTextField parameterInputTextField = new JTextField();
			JOptionPane.showMessageDialog(null, parameterInputTextField, getQuestion(parameterName),
					JOptionPane.QUESTION_MESSAGE);
			return parameterInputTextField.getText();
		}
	}

	private static String radiusAttribute = "radius";
	private static String heightAttribute = "height";
	private static final MenuEntry<Shape> circleEntry = new MenuEntryUI("Circle") {

		@Override
		public Shape get() {
			return new Circle(getPositiveDoubleAttribute(radiusAttribute));
		}

	};

	private static final MenuEntry<Shape> coneEntry = new MenuEntryUI("Cone") {

		@Override
		public Shape get() {
			return new Cone(getPositiveDoubleAttribute(radiusAttribute), getPositiveDoubleAttribute(heightAttribute));
		}

	};

	private static final MenuEntry<Shape> cubeEntry = new MenuEntryUI("Cube") {
		@Override
		public Shape get() {
			return new Cube(getPositiveDoubleAttribute("sideLength"));
		}

	};

	private static final MenuEntry<Shape> cylinderEntry = new MenuEntryUI("Cylinder") {
		@Override
		public Shape get() {
			return new Cylinder(getPositiveDoubleAttribute(radiusAttribute),
					getPositiveDoubleAttribute(heightAttribute));
		}

	};

	private static final MenuEntry<Shape> rectangleEntry = new MenuEntryUI("Rectangle") {
		@Override
		public Shape get() {
			return new Rectangle(getPositiveDoubleAttribute("width"), getPositiveDoubleAttribute(heightAttribute));
		}

	};

	private static final MenuEntry<Shape> sphereEntry = new MenuEntryUI("Sphere") {
		@Override
		public Shape get() {
			return new Sphere(getPositiveDoubleAttribute(radiusAttribute));
		}
	};

	private static final MenuEntry<Shape> squareEntry = new MenuEntryUI("Square") {
		@Override
		public Shape get() {
			return new Square(getPositiveDoubleAttribute("sideLength"));
		}
	};

	private static final MenuEntry<Shape> torusEntry = new MenuEntryUI("Torus") {
		@Override
		public Shape get() {
			return new Torus(getPositiveDoubleAttribute("majorRadius"), getPositiveDoubleAttribute("minorRadius"));
		}
	};

	private static final MenuEntry<Shape> triangleEntry = new MenuEntryUI("Triangle") {
		@Override
		public Shape get() {
			return new Triangle(getPositiveDoubleAttribute("base"),
					getPositiveDoubleAttribute(heightAttribute));
		}
	};

	private final ShapeDisplayPanel shapeDisplayPanel = new ShapeDisplayPanel();
	/*
	 * the suppliers map is used to retrieve the menu entry associated to a given
	 * String:
	 * each menu item in the JComboBox allowing to select the shape to be built is
	 * the name of the shape,
	 * so the action of the create button can go from the name of the shape to the
	 * corresponding menu entry to call
	 * its get method, which in turn builds the shape.
	 */
	private final Map<String, MenuEntry<Shape>> suppliers = new TreeMap<>();
	private final JComboBox<String> shapeChoices;

	public ShapeBoxUI() {
		super("Shape Builder and Visualizer");

		suppliers.put(circleEntry.toString(), circleEntry);
		suppliers.put(coneEntry.toString(), coneEntry);
		suppliers.put(cubeEntry.toString(), cubeEntry);
		suppliers.put(cylinderEntry.toString(), cylinderEntry);
		suppliers.put(rectangleEntry.toString(), rectangleEntry);
		suppliers.put(sphereEntry.toString(), sphereEntry);
		suppliers.put(squareEntry.toString(), squareEntry);
		suppliers.put(torusEntry.toString(), torusEntry);
		suppliers.put(triangleEntry.toString(), triangleEntry);
		shapeChoices = new JComboBox<>(suppliers.keySet().toArray(new String[0]));
		final JButton createButton = new JButton("Create shape");
		createButton.addActionListener(this);
		setLayout(new BorderLayout());
		final JPanel controlPanel = new JPanel(new FlowLayout());
		controlPanel.add(shapeChoices);
		controlPanel.add(createButton);
		add(controlPanel, BorderLayout.NORTH);
		add(shapeDisplayPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(700, 700));
	}

	private void createShape(String shapeName, MenuEntry<Shape> menuEntry) {
		try {
			shapeDisplayPanel.setShape(menuEntry.get());
		} catch (Exception inputError) {
			JOptionPane.showMessageDialog(null, "Invalid shape: " + shapeName, null, JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] ignored) {
		new ShapeBoxUI().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ignored) {
		final String key = shapeChoices.getSelectedItem().toString();
		createShape(key, suppliers.get(key));
	}

}
