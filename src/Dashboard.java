/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newlibrary;

import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Library Management System - Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create buttons for different operations
        JButton bookManagementButton = new JButton("Book Management");
        JButton memberManagementButton = new JButton("Member Management");
        JButton transactionButton = new JButton("Borrow/Return Books");
        
        // Layout
        JPanel panel = new JPanel();
        panel.add(bookManagementButton);
        panel.add(memberManagementButton);
        panel.add(transactionButton);
        add(panel);
        
        // Action listeners
        bookManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookManagement().setVisible(true);
            }
        });
        
        memberManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MemberManagement().setVisible(true);
            }
        });
        
        transactionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Transaction().setVisible(true);
            }
        });
    }
}
