import javax.swing.*;
import java.awt.*;

public class View {
    public static void addComponents(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 2;
        constraints.gridx = 0;
        constraints.gridy = 0;
        pane.add(new JLabel("Нижний предел"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        JTextField AIntervalText = new JTextField();
        pane.add(AIntervalText, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        pane.add(new JLabel("Верхний предел"), constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        JTextField BIntervalText = new JTextField();
        pane.add(BIntervalText, constraints);
        constraints.gridx = 3;
        constraints.gridy = 3;
        JButton calculateButton = new JButton("Вычислить интеграл");
        calculateButton.setPreferredSize(new Dimension(75, 20));
        pane.add(calculateButton, constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        JLabel ResultText = new JLabel("Результат: ");
        pane.add(ResultText, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        calculateButton.addActionListener(e -> {
            var SinX = new Integral(Double.parseDouble(AIntervalText.getText()), Double.parseDouble(BIntervalText.getText()));
            ResultText.setText("Результат: " + SinX.getResult());
        });
    }
}

