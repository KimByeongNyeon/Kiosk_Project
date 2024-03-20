package kiosk_prj.view.memverShipView;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import kiosk_prj.controller.memberShipEvent.AddMemberEvent;
import kiosk_prj.controller.memberShipEvent.ModifyMemberEvent;

@SuppressWarnings("serial")
public class ModifyMemberDesign extends JDialog{
	private JTextField jPhoneNum, jName, birthDay;
	private JComboBox<String> grade;
	private JButton add, exit, delete;
	
	public ModifyMemberDesign(JDialog MemberShipDesign, String title) {
		super(MemberShipDesign, "회원등록");
		
		//컴포넌트
		//콤보박스 아이템 설정
		String[] grades = {"신규 회원", "귀하신 분", "VVIP"};
		//텍스트 필드 설정
		JLabel jlPhone = new JLabel("연락처");
		JLabel jlName = new JLabel("이름");
		JLabel jlBirthDay = new JLabel("생년월일");
		JLabel jlGrade = new JLabel("등급");
		
		jPhoneNum = new JTextField();
		jName = new JTextField();
		birthDay = new JTextField();
		grade = new JComboBox<>(grades);
		
		//버튼 설정
		add = new JButton("등록");
		exit = new JButton("취소");
		delete = new JButton("회원 삭제");
		
		//배치 관리자 해제
		setLayout(null);
		//컴포넌트 배치
		//텍스트 필드
		jlPhone.setBounds(100, 50, 50, 40);
		jPhoneNum.setBounds(150, 50, 250, 50);
		jlName.setBounds(100, 110, 50, 40);
		jName.setBounds(150, 110, 250, 50);
		jlBirthDay.setBounds(100, 170, 50, 40);
		birthDay.setBounds(150, 170, 250, 50);
		jlGrade.setBounds(100, 230, 50, 40);
		grade.setBounds(150, 230, 250, 40);
		
		//버튼
		add.setBounds(100, 500, 100, 100);
		exit.setBounds(220, 500, 100, 100);
		delete.setBounds(340, 500, 100, 100);
		
	
		add(jlPhone);
		add(jPhoneNum);
		add(jlName);
		add(jName);
		add(jlBirthDay);
		add(birthDay);
		add(jlGrade);
		add(grade);
		
		add(add);
		add(exit);
		add(delete);
		
		ModifyMemberEvent mme = new ModifyMemberEvent(this);
		exit.addActionListener(mme);
		setVisible(true);
		setBounds(MemberShipDesign.getX()+350, MemberShipDesign.getY(), 574,648);
	}

	public JTextField getjPhoneNum() {
		return jPhoneNum;
	}

	public void setjPhoneNum(JTextField jPhoneNum) {
		this.jPhoneNum = jPhoneNum;
	}

	public JTextField getjName() {
		return jName;
	}

	public void setjName(JTextField jName) {
		this.jName = jName;
	}

	public JTextField getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(JTextField birthDay) {
		this.birthDay = birthDay;
	}

	public JComboBox<String> getGrade() {
		return grade;
	}

	public void setGrade(JComboBox<String> grade) {
		this.grade = grade;
	}

	public JButton getAdd() {
		return add;
	}

	public void setAdd(JButton add) {
		this.add = add;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}
}
