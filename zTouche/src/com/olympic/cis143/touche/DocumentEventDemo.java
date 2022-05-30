package com.olympic.cis143.touche;

/*
 * DocumentEventDemo.java requires no other files.
 */

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import java.awt.event.*;

public class DocumentEventDemo extends JPanel 
                               implements ActionListener {
    JTextField textField;
    JTextArea textArea;
    JTextArea displayArea;

    public DocumentEventDemo() {
        super(new GridBagLayout());
        GridBagLayout gridbag = (GridBagLayout)getLayout();
        GridBagConstraints c = new GridBagConstraints();

        JButton button = new JButton("Clear");
        button.addActionListener(this);

        textField = new JTextField(20);
        textField.getDocument().addDocumentListener(new MyDocumentListener());
        textField.getDocument().putProperty("name", "Text Field");

        textArea = new JTextArea();
        textArea.getDocument().addDocumentListener(new MyDocumentListener());
        textArea.getDocument().putProperty("name", "Text Area");

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(200, 75));

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane displayScrollPane = new JScrollPane(displayArea);
        displayScrollPane.setPreferredSize(new Dimension(200, 75));

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        gridbag.setConstraints(textField, c);
        add(textField);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.0;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        gridbag.setConstraints(scrollPane, c);
        add(scrollPane);

        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 1.0;
        gridbag.setConstraints(displayScrollPane, c);
        add(displayScrollPane);

        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.0;
        c.gridheight = 1;
        c.weighty = 0.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        gridbag.setConstraints(button, c);
        add(button);

        setPreferredSize(new Dimension(450, 250));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    class MyDocumentListener implements DocumentListener {
        final String newline = "\n";

        public void insertUpdate(DocumentEvent e) {
            updateLog(e, "inserted: ");
        }
        public void removeUpdate(DocumentEvent e) {
            updateLog(e, "removed: ");
        }
        public void changedUpdate(DocumentEvent e) {
            //Plain text components don't fire these events.
        }

        public void updateLog(DocumentEvent e, String action) {
            Document doc = (Document)e.getDocument();
            
            System.out.println(e.getDocument().getRootElements());
            
            
            
            int changeLength = e.getLength();
//            displayArea.append(
//                changeLength + " character"
//              + ((changeLength == 1) ? " " : "s ")
//              + action + " " + doc.getProperty("name") + "."
//              + newline
//              + "  Text length = " + doc.getLength() + newline);
//            displayArea.setCaretPosition(displayArea.getDocument().getLength());
        }
    }



    /** Handle button click. */
    public void actionPerformed(ActionEvent e) {
        displayArea.setText("");
        textField.requestFocus();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("DocumentEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new DocumentEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}