package kiosk_prj.login;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class LoginDesign extends JFrame{
	private JTextField iD;
	private JPasswordField password;
	private JButton login;
	
	public LoginDesign() {
		super("로그인");
		
		//이미지
		ImageIcon imgLogin = new ImageIcon(getClass().getClassLoader().getResource("login.png"));
		ImageIcon imgLogo = new ImageIcon(getClass().getClassLoader().getResource("login_logo.png"));
		
		//컴포넌트
		JLabel jlId = new JLabel("ID");
		JLabel jlPw = new JLabel("PW");
		JLabel jlLogo = new JLabel(imgLogo);
		iD = new JTextField(15);
		password = new JPasswordField(15);
		login = new JButton("로그인",imgLogin);
		
		// 텍스트 중앙에 정렬
		jlId.setHorizontalAlignment(JLabel.CENTER);
		jlPw.setHorizontalAlignment(JLabel.CENTER);
		iD.setHorizontalAlignment(JLabel.CENTER);
		password.setHorizontalAlignment(JLabel.CENTER);
		
		// 테두리
		LineBorder lb = new LineBorder(Color.GRAY, 1, false);
		jlId.setBorder(lb);
		jlPw.setBorder(lb);
		iD.setBorder(lb);
		password.setBorder(lb);
		jlLogo.setBorder(lb);
		
		//폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 21);
		jlId.setFont(font);
		jlPw.setFont(font);
		iD.setFont(font);
		password.setFont(font);
		
		//배치관리자 해제
		setLayout(null);
		
		//컴포넌트 배치
		jlId.setBounds(330,400,51,40);
		iD.setBounds(380,400,230,40);
		jlPw.setBounds(330,460,51,40);
		password.setBounds(380,460,230,40);
		login.setBounds(395, 530, 160, 30);
		jlLogo.setBounds(330,100,280,250);
		
		// 컴포넌트 등록
		add(jlId);
		add(jlPw);
		add(iD);
		add(password);
		add(login);
		add(jlLogo);
		
		//배경 색
		Color backgroundColor = new Color(0xECEDFA);
		getContentPane().setBackground(backgroundColor);
		
		//이벤트 등록
		LoginEvent le = new LoginEvent(this);
		iD.addActionListener(le);
		password.addActionListener(le);
		login.addActionListener(le);
		addWindowFocusListener(le);
		
		//기타 설정 등등등드읃으등ㄷ
		setVisible(true);
		setResizable(false);//창 크기 변경 불가능
		setBounds(455,130,1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//LoginDesign

	

	public JTextField getiD() {
		return iD;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public JButton getLogin() {
		return login;
	}

}
