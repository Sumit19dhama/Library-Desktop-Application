/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newlibrary;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BookManagement extends JFrame {
    private ArrayList<Book> books = new ArrayList<>();
    private JTextField titleField, authorField, isbnField;
    private JButton addButton;

    public BookManagement() {
        setTitle("Library Management System - Book Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        titleField = new JTextField(15);
        authorField = new JTextField(15);
        isbnField = new JTextField(15);
        addButton = new JButton("Add Book");
        
        // Layout setup
        JPanel panel = new JPanel();
        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Author:"));
        panel.add(authorField);
        panel.add(new JLabel("ISBN:"));
        panel.add(isbnField);
        panel.add(addButton);
        
        add(panel);
        
        // Action listener for adding a book
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String isbn = isbnField.getText();
                
                books.add(new Book(title, author, isbn));
                JOptionPane.showMessageDialog(null, "Book added successfully!");
            }
        });
    }
    
    // Book class to store book information
    class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        // Getters and toString() for Book class
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getIsbn() { return isbn; }

        @Override
        public String toString() {
            return title + " by " + author + " (ISBN: " + isbn + ")";
        }
    }
}
