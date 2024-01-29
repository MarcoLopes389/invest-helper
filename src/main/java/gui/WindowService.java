package gui;

import core.repositories.StockRepository;
import modules.xlsx.services.XlsxService;

import javax.swing.*;
import java.awt.*;

public class WindowService {
    private StockRepository stockRepository;
    public WindowService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    public void createWindow() {
        var frame = new JFrame();

        var panel = createXlsxWindow();
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(new Dimension(300, 400));
        frame.setVisible(true);
    }

    private JFileChooser createChooser() {
        var chooser = new JFileChooser();
        return chooser;
    }

    private JTextField createTextField(String text) {
        var textField = new JTextField(text);
        return textField;
    }

    private JButton createButton(String text) {
        var button = new JButton(text);

        return button;
    }

    private JPanel createXlsxWindow() {
        var panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        var filepath = createTextField("Caminho do arquivo");
        var button = createButton("Abrir");
        var importButton = createButton("Importar");

        var subPanel = new JPanel();

        filepath.setEditable(false);

        button.addActionListener((event) -> {
            var chooser = createChooser();

            var result = chooser.showOpenDialog(panel);
            if (result == JFileChooser.APPROVE_OPTION) {
                filepath.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        });

        importButton.addActionListener((event) -> {
            var stocks = XlsxService.readFile(filepath.getText());
            System.out.println(stocks);
        });

        subPanel.add(filepath);
        subPanel.add(button);
        subPanel.add(importButton);
        panel.add(subPanel);

        return panel;
    }
}
