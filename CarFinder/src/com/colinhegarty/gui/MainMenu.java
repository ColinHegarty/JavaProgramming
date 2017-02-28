package com.colinhegarty.gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JList;

public class MainMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainMenu() {
		this.setLayout(null);
		
		JList list = new JList();
		list.setBounds(135, 156, 119, 19);
		add(list);
	}
}
