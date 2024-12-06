package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex_14_7 extends JFrame
{
    private JTextArea outputArea;
    private JTextField inputField;

    public Ex_14_7()
    {
        super("Pig Latin Converter");

        JPanel inputPanel = new JPanel(new BorderLayout());
        JLabel promptLabel = new JLabel("Enter an English sentence: ");
        inputField = new JTextField();
        inputPanel.add(promptLabel, BorderLayout.WEST);
        inputPanel.add(inputField, BorderLayout.CENTER);

        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton convertButton = new JButton("Convert to Pig Latin");
        convertButton.addActionListener(new ConvertButtonListener());

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(convertButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private String toPigLatin(String word)
    {
        if (word.length() > 1)
        {
            return word.substring(1) + word.charAt(0) + "ay";
        }
        return word;
    }

    private class ConvertButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String input = inputField.getText();
            String[] words = input.split(" ");
            StringBuilder pigLatinSentence = new StringBuilder();

            for (String word : words)
            {
                pigLatinSentence.append(toPigLatin(word)).append(" ");
            }

            outputArea.append("Original: " + input + "\n");
            outputArea.append("Pig Latin: " + pigLatinSentence.toString().trim() + "\n\n");

            inputField.setText("");
        }
    }

    public static void main(String[] args)
    {
        new Ex_14_7();
    }
}
