package kiosk_prj.memvership;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ConsumePatternDesign extends JDialog{
	private JTable consumePattern;
	private JButton back;
	private DefaultTableModel dtmConsumePattern;
	
	public ConsumePatternDesign(JDialog DetailMemberDesign, String title) {
		super(DetailMemberDesign, "회원상세 >>> 소비패턴" );
		String[] cspColumns = {"번호", "메뉴명", "판매량", "판매비율", "판매액", "비율"};
		
		dtmConsumePattern = new DefaultTableModel(cspColumns, 0);
		consumePattern = new JTable(dtmConsumePattern);
		JScrollPane  jspConsumePattern = new JScrollPane(consumePattern);
		
		back = new JButton("돌아가기");
		//컴포넌트 배치
		jspConsumePattern.setBounds(10, 10, 500, 480);
		back.setBounds(300, 500, 100, 100);
		//컴포넌트 추가
		add(jspConsumePattern);
		add(back);
		//배치 관리자 해제
		setLayout(null);
		//ActionListener 등록
		ConsumePatternEvent cpe = new ConsumePatternEvent(this);
		back.addActionListener(cpe);
		
		setVisible(true);
		setBounds(DetailMemberDesign.getX(), DetailMemberDesign.getY(), 574, 648);
	}

	public JTable getConsumePattern() {
		return consumePattern;
	}

	public void setConsumePattern(JTable consumePattern) {
		this.consumePattern = consumePattern;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public DefaultTableModel getDtmConsumePattern() {
		return dtmConsumePattern;
	}

	public void setDtmConsumePattern(DefaultTableModel dtmConsumePattern) {
		this.dtmConsumePattern = dtmConsumePattern;
	}
}
