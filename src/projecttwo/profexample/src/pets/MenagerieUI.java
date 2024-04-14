package projecttwo.profexample.src.pets;

/*
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

import projecttwo.profexample.src.utils.MenuEntry;

@SuppressWarnings("serial")
public class MenagerieUI extends JFrame implements ActionListener {

	/*
	 * we define a subclass of MenuEntry performing the user interaction with a
	 * message dialog.
	 */
	private static abstract class MenuEntryUI extends MenuEntry<Animal> {

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

	private final static MenuEntry<Animal> dogEntry = new MenuEntryUI("Dog") {

		@Override
		public Animal get() {
			return new Dog(getStringAttribute("name"), getPositiveIntegerAttribute("age"), getStringAttribute("breed"));
		}

	};

	private final static MenuEntry<Animal> snakeEntry = new MenuEntryUI("Snake") {

		@Override
		public Animal get() {
			return new Snake(getStringAttribute("name"), getPositiveIntegerAttribute("age"), getStringAttribute("type"),
					getStringAttribute("scale color"));
		}

	};

	private final AnimalDisplayPanel animalDisplayPanel = new AnimalDisplayPanel();
	/*
	 * the suppliers map is used to retrieve the menu entry associated to a given
	 * String:
	 * each menu item in the JComboBox allowing to select the shape to be built is
	 * the name of the shape,
	 * so the action of the create button can go from the name of the shape to the
	 * corresponding menu entry to call
	 * its get method, which in turn builds the shape.
	 */
	private final Map<String, MenuEntry<Animal>> suppliers = new TreeMap<>();
	private final JComboBox<String> animalChoices;

	public MenagerieUI() {
		super("Pet Builder and Visualizer");

		suppliers.put(dogEntry.toString(), dogEntry);
		suppliers.put(snakeEntry.toString(), snakeEntry);
		animalChoices = new JComboBox<>(suppliers.keySet().toArray(new String[0]));
		final JButton createButton = new JButton("Create pet");
		createButton.addActionListener(this);
		setLayout(new BorderLayout());
		final JPanel controlPanel = new JPanel(new FlowLayout());
		controlPanel.add(animalChoices);
		controlPanel.add(createButton);
		add(controlPanel, BorderLayout.NORTH);
		add(animalDisplayPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(700, 700));
	}

	private void createAnimal(String shapeName, MenuEntry<Animal> menuEntry) {
		try {
			animalDisplayPanel.setAnimal(menuEntry.get());
		} catch (Exception inputError) {
			JOptionPane.showMessageDialog(null, "Invalid pet: " + shapeName, null, JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] ignored) {
		new MenagerieUI().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ignored) {
		final String key = animalChoices.getSelectedItem().toString();
		createAnimal(key, suppliers.get(key));
	}

}
