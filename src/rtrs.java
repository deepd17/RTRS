import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class login extends JFrame{
	JLabel l1, l2, l3, l4, l5;
	JButton b1, b2, b3;
	ImageIcon i, i1;
	login(){
		l1 = new JLabel("RAILWAY TICKET");
		l5 = new JLabel("RESERVATION SYSTEM");
		l2 = new JLabel("Don't have and account, ");
		l3 = new JLabel("Sign in?");
		b1 = new JButton("ADMIN");
		b2 = new JButton("USER");
		l4 = new JLabel();
		i = new ImageIcon("images/login.jpeg");
		//i1 = new ImageIcon("images/close.png");
		//b3 = new JButton();
		
		l1.setBounds(520, 15, 450, 200);
		l1.setFont(new Font("Consolas", Font.BOLD, 40));
		l1.setForeground(new Color(208, 58, 112));
		l5.setBounds(520, 70, 490, 200);
		l5.setFont(new Font("Consolas", Font.BOLD, 40));
		l5.setForeground(new Color(208, 58, 112));
		b1.setBounds(700, 270, 80, 50);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBackground(new Color(251, 249, 157));
		b2.setBounds(700, 350, 80, 50);	
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBackground(new Color(251, 249, 157));
		l2.setBounds(650, 400, 150, 20);
		l3.setBounds(785, 400, 80, 20);
		l3.setForeground(Color.blue);
		l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l4.setBounds(0, 0, i.getIconWidth(), i.getIconHeight()); 
		//b3.setBounds(666, 4, i1.getIconWidth()-220, i1.getIconHeight()-209);	
		getContentPane().setBackground(new Color(155, 240, 216));

		add(l1);
		add(l5);
		add(b1);
		add(b2);
		add(l2);
		add(l3);
		l4.setIcon(i);
		add(l4);
		//b3.setIcon(i1);
		//add(b3);
		//System.out.println(i1.getIconWidth() +" " +i1.getIconHeight());
		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin_login();
				dispose();
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new user_login();
				dispose();
			}
		});
		
		l3.addMouseListener( new MouseAdapter(){
			public void mouseClicked(MouseEvent ae){
				new sign_in();
			}
		});	
		
		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2, 
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		
		setResizable(false);
		setLayout(null);
		setTitle("RTRS");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class sign_in extends JFrame{
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField t1, t2, t3, t4;
	JPasswordField p1;
	JButton b1, b2;
	sign_in(){
		l1 = new JLabel("USER SIGN IN");
		l2 = new JLabel("First Name");
		l3 = new JLabel("Last Name");
		l4 = new JLabel("Username");
		l5 = new JLabel("Email ID");
		l6 = new JLabel("Password");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		p1 = new JPasswordField();
		b1 = new JButton("SIGN IN");
		b2 = new JButton("BACK");

		l1.setBounds(400, 40, 300, 50);
		l1.setFont(new Font("Consolas", Font.PLAIN, 30));
		l1.setForeground(new Color(217, 203, 241));
		l2.setBounds(300, 100, 150, 40);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		l2.setForeground(new Color(217, 203, 241));
		t1.setBounds(480, 105, 200, 35);
		l3.setBounds(300, 160, 150, 40);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		l3.setForeground(new Color(217, 203, 241));
		t2.setBounds(480, 165, 200, 40);
		l4.setBounds(300, 230, 150, 40);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		l4.setForeground(new Color(217, 203, 241));
		t3.setBounds(480, 235, 200, 40);
		l5.setBounds(300, 290, 150, 40);
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		l5.setForeground(new Color(217, 203, 241));
		t4.setBounds(480, 295, 300, 40);
		l6.setBounds(300, 350, 200, 40);
		l6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		l6.setForeground(new Color(217, 203, 241));
		p1.setBounds(480, 355, 200, 40);
		b1.setBounds(450, 435, 80, 40);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBackground(new Color(38, 25, 50));
		b1.setForeground(Color.white);
		b2.setBounds(850, 600, 80, 40);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBackground(new Color(38, 25, 50));
		b2.setForeground(Color.white);
		getContentPane().setBackground(new Color(86, 62, 101));

		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(l6);
		add(p1);
		add(b1);
		add(b2);
		
		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String fname = t1.getText();
				String lname = t2.getText();
				String username = t3.getText();
				String email = t4.getText();
				String password = new String(p1.getPassword());
				
				String query = "insert into signin values(?, ?, ?, ?, ?)";
				if(fname.equals("") || fname==null || fname.trim().equals("") || lname.equals("") || lname==null || lname.trim().equals("") || username.equals("") || username==null || username.trim().equals("") || email.equals("") || email==null || email.trim().equals("") || password.equals("") || password==null || password.trim().equals("") ){
						message2();
				}
				else{
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtrs", "root", "deepanshu");
					PreparedStatement st = con.prepareStatement(query);
					st.setString(1, fname);
					st.setString(2, lname);
					st.setString(3, username);
					st.setString(4, email);
					st.setString(5, password);
					int rs = st.executeUpdate();
						
					st.close();
					con.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				b1.setEnabled(false);
				message();
				}
			}
		});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new login();
				dispose();
			}
		});

		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);	
		setTitle("SIGN IN");
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void message(){
		JOptionPane.showMessageDialog(this, "User Account Created");
	}
	public void message2(){
		JOptionPane.showMessageDialog(this, "Fill all the fields");
	}
}

class admin_login extends JFrame{
	JLabel l1, l2, l3;
	JTextField t1;
	JPasswordField t2;
	JButton b;
	admin_login(){
		l1 = new JLabel("ADMIN LOGIN");
		l2 = new JLabel("Username");
		l3 = new JLabel("Password");
		t1 = new JTextField();
		t2 = new JPasswordField();
		b = new JButton("LOGIN");
		
		l1.setBounds(20, 10, 300, 50);
		l1.setFont(new Font("Consolas", Font.PLAIN, 30));
		l2.setBounds(30, 60, 80, 20);
		t1.setBounds(120, 60, 100, 20);
		l3.setBounds(30, 90, 80, 20);
		t2.setBounds(120, 90, 100, 20);
		b.setBounds(50, 130, 80, 20);
		b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b);
		
		b.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent ae){
				String user = t1.getText();
				String pass = new String(t2.getPassword());
				message(user, pass);	
			}
		});
		
		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);	
		setTitle("ADMIN LOGIN");
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void message(String a, String b){
		if(a.equals("admin") && b.equals("admin")){
			JOptionPane.showMessageDialog(this,"LOGIN SUCCESSFULL");
			dispose();
			new admin();
		}
		else{
			JOptionPane.showMessageDialog(this, "TRY AGAIN");
		}
	}
}

class admin extends JFrame{
	JLabel l1;
	JButton b1, b2, b3, b4, b5;
	admin(){
		l1 = new JLabel("ADMIN");
		b1 = new JButton("VIEW TRAINS");
		b2 = new JButton("ADD TRAIN");
		b3 = new JButton("EDIT TRAIN DETAILS");
		b4 = new JButton("DELETE TRAIN");
		b5 = new JButton("SIGN OUT");
		
		l1.setBounds(660, 20, 80, 40);
		l1.setFont(new Font("Consolas", Font.PLAIN, 20));
		b1.setBounds(100, 70, 120, 40);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(100, 120, 120, 40);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBounds(100, 170, 170, 40);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setBounds(100, 220, 120, 40);
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b5.setBounds(20, 600, 100, 40);
		b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin_view();
			}
		});
			
		b2.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin_add();
			}
		});
		
		b3.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin_edit();
			}
		});
		
		b4.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin_del();
			}
		});
		
		b5.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new login();
				dispose();
			}
		});

		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class admin_view extends JFrame{
	JTable t;
	DefaultTableModel tm;
	JButton b1, b2;
	admin_view(){
		tm = new DefaultTableModel();
		t = new JTable(tm);
		b1 = new JButton("SIGN OUT");
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2 = new JButton("BACK");
		b1.setBounds(20, 600, 100, 40);
		b2.setBounds(850, 600, 80, 40);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t.setBounds(30, 30, 400, 400);
				
		add(b1);
		add(b2);

		tm.addColumn("TRAIN_NO");
		tm.addColumn("TRAIN_NAME");
		tm.addColumn("START");
		tm.addColumn("END");
		tm.addColumn("DATE");
		tm.addColumn("FARE");
		tm.addColumn("No_OF_SEATS");
		
		String query = "select * from train";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtrs", "root", "deep");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);	

			tm.addRow(new Object[]{"TRAIN_NO", "TRAIN_NAME", "START", "END", "DATE", "FARE", "NO_OF_SEATS"});

			while(rs.next()){
				String train_no = rs.getString(1);
				String train_name = rs.getString(2);
				String start = rs.getString(3);
				String end = rs.getString(4);
				String date = rs.getString(5);
				String fare = rs.getString(6);
				String ns = rs.getString(7);
				tm.addRow(new Object[]{train_no, train_name, start, end, date, fare, ns});
				t.setEnabled(false);
			}
			st.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		add(t);
		
		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new login();
				dispose();
			}
		});

		b2.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin();
				dispose();
			}
		});
		
		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);
		setLayout(null);
		setTitle("ADMIN");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class admin_add extends JFrame{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTextField t1, t2, t3, t4, t5, t6;
	JComboBox j1, j2, j3; 
	JButton b, b1;

	String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String months[] = {"jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "oct", "nov", "dec"};
	String year[] = {"2021", "2022", "2023"};

	admin_add(){
		l1 = new JLabel("ADD TRAIN");
		l2 = new JLabel("Train No:");
		l3 = new JLabel("Train Name:");
		l4 = new JLabel("Start:");
		l5 = new JLabel("End:");
		l6 = new JLabel("Date:");
		l7 = new JLabel("Fare:");
		l8 = new JLabel("NO Of Seats:");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		j1 = new JComboBox(dates);
		j2 = new JComboBox(months);
		j3 = new JComboBox(year);	
		b = new JButton("ADD");
		b1 = new JButton("BACK");
		
		l1.setBounds(20, 20, 100, 40);
		l1.setFont(new Font("Consolas", Font.PLAIN, 20));
		l2.setBounds(30, 70, 80, 20);
		t1.setBounds(120, 70, 80, 20);
		l3.setBounds(30, 100, 80, 20);
		t2.setBounds(120, 100, 80, 20);
		l4.setBounds(30, 130, 80, 20);
		t3.setBounds(120, 130, 80, 20);
		l5.setBounds(30, 160, 80, 20);
		t4.setBounds(120, 160, 80, 20);
		l6.setBounds(30, 190, 80, 20);
		j1.setBounds(120, 190, 80, 20);
		j2.setBounds(220, 190, 100, 20);
		j3.setBounds(340, 190, 80, 20);
		l7.setBounds(30, 220, 80, 20);			
		t5.setBounds(120, 220, 80, 20);
		l8.setBounds(30, 250, 80, 20);
		t6.setBounds(120, 250, 80, 20);
		b.setBounds(80, 270, 60, 20);
		b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBounds(850, 600, 80, 20);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(l6);
		add(j1);
		add(j2);
		add(j3);
		add(l7);
		add(t5);
		add(l8);
		add(t6);
		add(b);	
		add(b1);
		
		b.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			
				String tno = t1.getText();   // int i = Integer.parseInt(tno);
				String tname = t2.getText();
				String s = t3.getText();
				String e = t4.getText();
				String f = t5.getText();
				String d1 = (String)j1.getSelectedItem();
				String d2 = (String)j2.getSelectedItem();
				String d3 = (String)j3.getSelectedItem();
				String date = d1 + "/" + d2 + "/" + d3;
				String ns = t6.getText();
				String t_no = null;
				
				String url = "jdbc:mysql://localhost:3306/rtrs";
				String uname = "root";
				String pass = "deepanshu";
		
				String query1 = "select Train_no from train";
				String query = "insert into train values(?, ?, ?, ?, ?, ?, ?)";
		
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query1);
					while(rs.next()){
						t_no = rs.getString(1);
					}
					if(t_no.equals(tno)){
						message1();
					}
					else if(tno.equals("") || tno==null || tno.trim().equals("") || tname.equals("") || tname==null || tname.trim().equals("") || s.equals("") || s==null || s.trim().equals("") || e.equals("") || e==null || e.trim().equals("") || f.equals("") || f==null || f.trim().equals("") ){
						message2();
					}
					else{
						try{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con1 = DriverManager.getConnection(url, uname, pass);
							PreparedStatement st1 = con1.prepareStatement(query);
							st1.setString(1, tno);
							st1.setString(2, tname);
							st1.setString(3, s);
							st1.setString(4, e);
							st1.setString(5, date);
							st1.setString(6, f);
							st1.setString(7, ns);
							int count = st1.executeUpdate();
				
							st1.close();
							con1.close();
						}catch(Exception ee){
							ee.printStackTrace();
						}
						b.setEnabled(false);
						message();
					}
					st.close();
					con.close();
				}catch(Exception ee){
					ee.printStackTrace();
				}
				
			}					
		}); 
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin();
				dispose();
			}
		});

		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void message(){
		JOptionPane.showMessageDialog(this, "Train details has been added");
	}
	public void message1(){
		JOptionPane.showMessageDialog(this, "Train details already exit");
	}
	public void message2(){
		JOptionPane.showMessageDialog(this, "Fill all the fields");
	}
	
}

class admin_edit extends JFrame{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTextField  t2, t3, t4, t5, t6;
	JComboBox j1, j2, j3, j4; 
	JButton b, b1;

	String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String months[] = {"jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "oct", "nov", "dec"};
	String year[] = {"2021", "2022", "2023"};

	admin_edit(){
		l1 = new JLabel("EDIT TRAIN DETAILS");
		l2 = new JLabel("Select The Train : ");
		l3 = new JLabel("Train Name:");
		l4 = new JLabel("Start:");
		l5 = new JLabel("End:");
		l6 = new JLabel("Date:");
		l7 = new JLabel("Fare:");
		l8 = new JLabel("No_Of_Seats:");
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		j1 = new JComboBox(dates);
		j2 = new JComboBox(months);
		j3 = new JComboBox(year);	
		j4 = new JComboBox();
		b = new JButton("EDIT");
		b1 = new JButton("BACK");
		
		l1.setBounds(20, 20, 300, 40);
		l1.setFont(new Font("Consolas", Font.PLAIN, 20));
		l2.setBounds(30, 70, 150, 20);
		j4.setBounds(170, 70, 80, 20);
		l3.setBounds(30, 100, 80, 20);
		t2.setBounds(120, 100, 80, 20);
		l4.setBounds(30, 130, 80, 20);
		t3.setBounds(120, 130, 80, 20);
		l5.setBounds(30, 160, 80, 20);
		t4.setBounds(120, 160, 80, 20);
		l6.setBounds(30, 190, 80, 20);
		j1.setBounds(120, 190, 80, 20);
		j2.setBounds(220, 190, 100, 20);
		j3.setBounds(340, 190, 80, 20);
		l7.setBounds(30, 220, 80, 20);			
		t5.setBounds(120, 220, 80, 20);
		l8.setBounds(30, 250, 80, 20);
		t6.setBounds(120, 250, 80, 20);
		b.setBounds(80, 270, 60, 20);
		b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBounds(850, 600, 80, 20);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(l1);
		add(l2);
		add(j4);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(l6);
		add(j1);
		add(j2);
		add(j3);
		add(l7);
		add(t5);
		add(b);	
		add(b1);
		
		String url = "jdbc:mysql://localhost:3306/rtrs";
		String uname = "root";
		String pass = "deepanshu";
				
		String query = " select TRAIN_NO from train";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()){
				String tno = rs.getString(1);
				j4.addItem(tno);
			}
			st.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}			
			
		b.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String tno = (String)j4.getSelectedItem();  
				String tname = t2.getText();
				String s = t3.getText();
				String e = t4.getText();
				String f = t5.getText();
				String d1 = (String)j1.getSelectedItem();
				String d2 = (String)j2.getSelectedItem();
				String d3 = (String)j3.getSelectedItem();
				String date = d1 + "/" + d2 + "/" + d3;
				String ns = t6.getText();
				
				String url = "jdbc:mysql://localhost:3306/rtrs";
				String uname = "root";
				String pass = "deepanshu";
				
				String query = "update train set train_name = ?, start = ?, end = ?, date= ?, fare= ?, no_seats = ? where train_no= ? ";
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					PreparedStatement st = con.prepareStatement(query);
					st.setString(1, tname);
					st.setString(2, s);
					st.setString(3, e);
					st.setString(4, date);
					st.setString(5, f);
					st.setString(6, tno);
					st.setString(7, ns);
					
					int count = st.executeUpdate();	
					st.close();
					con.close();
				}catch(Exception ee)
				{
					ee.printStackTrace();
				}
				b.setEnabled(false);
				message();
			}
		});
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin();
				dispose();
			}
		});

		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void message(){
		JOptionPane.showMessageDialog(this, "Train details has been edited");
	}
}
		
class admin_del extends JFrame{
	JLabel l1, l2;
	JButton b1, b2;
	JComboBox<String> j1;
	admin_del(){
		l1 = new JLabel("Delete Train Details");
		l2 = new JLabel("Select The Train: ");
		b1 = new JButton("Delete");
		b2 = new JButton("BACK");
		j1  = new JComboBox<String>();
		
		l1.setBounds(20, 20, 300, 40);
		l1.setFont(new Font("Consolas", Font.PLAIN, 20));
		l2.setBounds(30, 70, 150, 40);
		j1.setBounds(170, 70, 150, 20);
		b1.setBounds(150, 150, 80, 20);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(850, 600, 80, 20);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(l1);
		add(l2);
		add(j1);
		add(b1);
		add(b2);
		
		String url = "jdbc:mysql://localhost:3306/rtrs";
		String uname = "root";
		String pass = "deepanshu";
				
		String query = " select TRAIN_NO from train";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()){
				String tno = rs.getString(1);
				j1.addItem(tno);
			}
			st.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}			
		
		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String tno = (String)j1.getSelectedItem();
				String url = "jdbc:mysql://localhost:3306/rtrs";
				String uname = "root";
				String pass = "deepanshu";
				
				String query =" delete from train where Train_no = ?";
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					PreparedStatement st = con.prepareStatement(query);
					st.setString(1, tno);
					int rs = st.executeUpdate();
					
					st.close();
					con.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				b1.setEnabled(false);
				message();
			}
		});
				
		b2.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new admin();
				dispose();
			}
		});

		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2, 
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void message(){
		JOptionPane.showMessageDialog(this, "Train details has been deleted");
	}

}

class user_login extends JFrame{
	JLabel l1, l2, l3;
	JTextField t1;
	JPasswordField t2;
	JButton b;
	JOptionPane p;
	user_login(){
		l1 = new JLabel("USER LOGIN");
		l2 = new JLabel("Username");
		l3 = new JLabel("Password");
		t1 = new JTextField();
		t2 = new JPasswordField();
		b = new JButton("LOGIN");
		
		l1.setBounds(20, 10, 300, 50);
		l1.setFont(new Font("Consolas", Font.PLAIN, 30));
		l2.setBounds(30, 60, 80, 20);
		t1.setBounds(120, 60, 100, 20);
		l3.setBounds(30, 90, 80, 20);
		t2.setBounds(120, 90, 100, 20);
		b.setBounds(50, 130, 80, 20);
		b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b);
		
		b.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent ae){
				String user = t1.getText();
				String pass = new String(t2.getPassword());
				message(user, pass);	
			}
		});
		
		setSize(1000, 700);
		
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		
		setResizable(false);	
		setTitle("ADMIN LOGIN");
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void message(String a, String b){
		if(a.equals("user") && b.equals("user")){
			p.showMessageDialog(this,"LOGIN SUCCESSFULL");
			new user();
		}
		else{
			p.showMessageDialog(this, "TRY AGAIN");
		}
	}
}

class user extends JFrame{
	JLabel l1, l2, l3;
	JTextField t1;
	JButton b1, b2, b3;
	JTable t;
	DefaultTableModel tm;
	JPanel p1, p2;
	JTabbedPane tp;
	user(){
		l1 = new JLabel("BOOK TICKETS");
		l2 = new JLabel("Click On SEARCH TO Select The Train");
		l3 = new JLabel("Seats Available");
		t1 = new JTextField();
		b1 = new JButton("SEARCH");
		b2 = new JButton("BOOK");
		b3 = new JButton("SIGN OUT");
		tm = new DefaultTableModel();
		t = new JTable(tm);
		tp = new JTabbedPane();
		p1 = new JPanel();
		p2 = new JPanel();

		l1.setBounds(20, 20, 300, 40);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l2.setBounds(50, 100, 500, 40);
		l3.setBounds(40, 130, 100, 40);
		t1.setBounds(150, 130, 80, 20);
		b1.setBounds(100, 200, 100, 30);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(230, 200, 80, 30);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBounds(850, 600, 80, 20);
		tp.setBounds(500, 100, 350, 400);
		
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(b2);
		add(b1);
		add(b3);
		p1.add(t);
		tp.add(new JScrollPane(p1), "All");
		add(tp);
		
		tm.addColumn("TRAIN_NO");
		tm.addColumn("TRAIN_NAME");
		tm.addColumn("START");
		tm.addColumn("END");
		tm.addColumn("DATE");
		tm.addColumn("FARE");
		tm.addColumn("NO_OF_SEATS");

		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String url = "jdbc:mysql://localhost:3306/rtrs";
				String uname = "root";
				String pass = "deepanshu";
				String query = "select * from train ";
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query);

					tm.addRow(new Object[]{"TRAIN_NO", "TRAIN_NAME", "START", "END", "DATE", "FARE", "NO_OF_SEATS"});
					while(rs.next()){
						String tno1 = rs.getString(1);
						String tname = rs.getString(2);
						String s = rs.getString(3);
						String e = rs.getString(4);
						String d = rs.getString(5);
						String f = rs.getString(6);
						String ns = rs.getString(7);
						tm.addRow(new Object[]{tno1, tname, s, e, d, f, ns});
						//t.setEnabled(false);
					}
					st.close();
					con.close();
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		});
		
		t.addMouseListener(new MouseAdapter(){
			public void mousePressed( MouseEvent me){
				int row = t.getSelectedRow();
				int col = t.getSelectedColumn();
				String val = (String)t.getValueAt(row, col);
				String tn = null;
				String ns = null;

				String url = "jdbc:mysql://localhost:3306/rtrs";
				String uname = "root";
				String pass = "deepanshu";

				String query1 = "select TRAIN_NO, no_seats from train";

				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query1);
					while(rs.next()){
						tn = rs.getString(1);
						ns = rs.getString(2);
					}
					if(tn.equals(val)){
						t1.setText(ns);
					}
					else{
						System.out.println(tn +" "+ ns);
					}
					
					st.close();
					con.close();
				}catch(Exception e){
					e.printStackTrace();
				}	
			}
		});
		
		b2.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new user_book();
				dispose();
			}
		});
		
		b3.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new user_login();
				dispose();
			}
		});

		setSize(1000, 700);
		setResizable(false);
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2, 
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class user_book extends JFrame{
	JPanel p1;
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField t1, t2;
	JComboBox j1, j2, j3, j4;
	SpinnerModel sm;
	JSpinner s1;
	JButton b1, b2;
	
	String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String months[] = {"jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "oct", "nov", "dec"};
	String year[] = {"2021", "2022", "2023"};

	user_book(){
		p1 = new JPanel();
		l1 = new JLabel("FILL THE DEATILS");
		l2 = new JLabel("FIRST NAME");
		l3 = new JLabel("LAST NAME");
		l4 = new JLabel("TRAIN NO");
		l5 = new JLabel("DATE");
		l6 = new JLabel("No. of Passenger");
		t1 = new JTextField();
		t2 = new JTextField();
		j4 = new JComboBox();
		j1 = new JComboBox(dates);
		j2 = new JComboBox(months);
		j3 = new JComboBox(year);
		sm = new SpinnerNumberModel(1, 0, 5, 1);
		s1 = new JSpinner(sm);
		b1 = new JButton("BOOK");
		b2 = new JButton("BACK");
		
		p1.setBounds(0, 0, 1000, 100);
		p1.setBackground(Color.blue);
		l1.setBounds(10, 10, 300, 60);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l2.setBounds(50, 110, 100, 20);
		t1.setBounds(170, 110, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		t2.setBounds(170, 150, 100, 20);
		l4.setBounds(50, 190, 100, 20);
		j4.setBounds(170, 190, 100, 20);
		l5.setBounds(50, 230, 100, 20);
		j1.setBounds(170, 230, 80, 20);
		j2.setBounds(270, 230, 100, 20);
		j3.setBounds(390, 230, 100, 20);
		l6.setBounds(50, 270, 100, 20);
		s1.setBounds(170, 270, 80, 20);
		b1.setBounds(100, 310, 80, 30);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(850, 600, 80, 20);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		p1.add(l1);
		add(p1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(j4);
		add(l5);
		add(j1);
		add(j2);
		add(j3);
		add(l6);
		add(s1);
		add(b1);
		add(b2);

		b2.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new user();
				dispose();
			}
		});

		setSize(1000, 700);
		setLocation(
			(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
			(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
 
public class rtrs{
	public static void main(String args[]) throws Exception{
		new login();		
	}
}