/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newlibrary;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MemberManagement extends JFrame {
    private ArrayList<Member> members = new ArrayList<>();
    private JTextField nameField, idField;
    private JButton addButton;

    public MemberManagement() {
        setTitle("Library Management System - Member Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        nameField = new JTextField(15);
        idField = new JTextField(15);
        addButton = new JButton("Add Member");
        
        // Layout setup
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(addButton);
        
        add(panel);
        
        // Action listener for adding a member
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                
                members.add(new Member(name, id));
                JOptionPane.showMessageDialog(null, "Member added successfully!");
            }
        });
    }
    
    // Member class to store member information
    class Member {
        private String name;
        private String id;

        public Member(String name, String id) {
            this.name = name;
            this.id = id;
        }

        // Getters and toString() for Member class
        public String getName() { return name; }
        public String getId() { return id; }

        @Override
        public String toString() {
            return name + " (ID: " + id + ")";
        }
    }
}
