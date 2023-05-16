import javax.swing.*;
import java.awt.*;

public class ColorPicker extends JFrame {
private JPanel colorPanel;
private JColorChooser colorChooser;

public ColorPicker() {
super("Color Picker");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());

// Create the color panel and add it to the frame
colorPanel = new JPanel();
colorPanel.setPreferredSize(new Dimension(200, 200));
add(colorPanel, BorderLayout.CENTER);

// Create the color chooser and add it to the frame
colorChooser = new JColorChooser();
colorChooser.getSelectionModel().addChangeListener(e -> {
// Update the color panel when the color changes
Color newColor = colorChooser.getColor();
colorPanel.setBackground(newColor);
});
add(colorChooser, BorderLayout.PAGE_END);

pack();
setLocationRelativeTo(null);
setVisible(true);
}

public static void main(String[] args) {
SwingUtilities.invokeLater(ColorPicker::new);



}
}

