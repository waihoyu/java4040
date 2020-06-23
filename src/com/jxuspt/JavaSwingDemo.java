package com.jxuspt;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JavaSwingDemo {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("江西软件大学学生管理系统");		
		jf.setSize(200,250);
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel(new FlowLayout());
        JButton sysBtn = new JButton("系统管理");
        JButton stuBtn = new JButton("学生管理");
        JButton scoreBtn = new JButton("成绩管理");
        JButton taskBtn = new JButton("教务管理");
        JButton workBtn = new JButton("考勤管理");
        JButton logBtn = new JButton("工作日志");
        JButton mailBtn = new JButton("信件管理");
        JButton projectBtn = new JButton("项目管理");
        
        panel.add(sysBtn);
        panel.add(stuBtn);
        panel.add(scoreBtn);
        panel.add(taskBtn);
        panel.add(workBtn);
        panel.add(logBtn);
        panel.add(mailBtn);
        panel.add(projectBtn);
        
        sysBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 javax.swing.JDialog jDialog = new JDialog();
				 jDialog.setSize(300, 200);
				 jDialog.show();
			}
		});
        
        stuBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 消息对话框无返回, 仅做通知作用
                JOptionPane.showMessageDialog(
                        jf,
                        "先锋小镇的学生管理系统",
                        "消息标题",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        
        scoreBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 javax.swing.JDialog jDialog = new JDialog();
				 jDialog.setSize(300, 200);
				 jDialog.show();
			}
		});
        jf.setContentPane(panel);
        jf.setVisible(true);        

	}
}
