package com.colinhegarty.gui;
import com.colinhegarty.classes.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Panel1 extends JPanel {
	JTextPane textPane;
	JTextPane textPane_1;
	private JTextField textField;
	private JTextPane textPane_2;
	private JScrollPane scrollPane_2;
	/**
	 * Create the panel.
	 */
	public Panel1() {
		setLayout(null);
		
		Button button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					getDoc();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(339, 190, 70, 22);
		add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 291, 285, 234);
		add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(419, 287, 296, 234);
		add(scrollPane_1);
		
		textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		
		textField = new JTextField();
		textField.setBounds(36, 192, 200, 20);
		add(textField);
		textField.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(48, 586, 279, 234);
		add(scrollPane_2);
		
		textPane_2 = new JTextPane();
		scrollPane_2.setViewportView(textPane_2);
	}
	
	public void getDoc() throws IOException{
		String url = "";
		if(textField.getText()!=null){
			if(textField.getText().startsWith("http://") || textField.getText().startsWith("https://") ){
				url = textField.getText();
			}
			else{
				url = "http://" + textField.getText();
			}
			WebDocTry wd = new WebDocTry();
			textPane.setText(wd.getSite(url).toString());
			getLinks(wd);
			getEmail(wd);
		}
	}
	
	public void getLinks(WebDocTry wd){
		textPane_1.setText(wd.links().toString());
	}
	
	public void getEmail(WebDocTry wd){
		textPane_2.setText(wd.extractEmail());
	}
}
