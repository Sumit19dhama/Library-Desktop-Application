/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newlibrary;

import javax.swing.*;
import java.awt.event.*;

public class Transaction extends JFrame {
    private JTextField bookField, memberField;
    private JButton borrowButton, returnButton;

    public Transaction() {
        setTitle("Library Management System - Borrow/Return Books");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        bookField = new JTextField(15);
        memberField = new JTextField(15);
        borrowButton = new JButton("Borrow Book");
        returnButton = new JButton("Return Book");
        
        // Layout setup
        JPanel panel = new JPanel();
        panel.add(new JLabel("Book:"));
        panel.add(bookField);
        panel.add(new JLabel("Member:"));
        panel.add(memberField);
        panel.add(borrowButton);
        panel.add(returnButton);
        
        add(panel);
        
        // Action listeners
        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String book = bookField.getText();
                String member = memberField.getText();
                
                JOptionPane.showMessageDialog(null, member + " borrowed the book: " + book);
            }
        });
        
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String book = bookField.getText();
                String member = memberField.getText();
                
                JOptionPane.showMessageDialog(null, member + " returned the book: " + book);
            }
        });
    }
}
