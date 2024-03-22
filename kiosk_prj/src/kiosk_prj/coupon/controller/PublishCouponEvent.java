package kiosk_prj.coupon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import kiosk_prj.coupon.dao.CoupConditionTypeDAO;
import kiosk_prj.coupon.dao.CouponKindDAO;
import kiosk_prj.coupon.view.PublishCouponDesign;
import kiosk_prj.coupon.vo.CoupConditionTypeVO;
import kiosk_prj.coupon.vo.CouponKindVO;
import static java.lang.String.valueOf;

public class PublishCouponEvent extends WindowAdapter implements ActionListener {

	private PublishCouponDesign pcd;
	
	public PublishCouponEvent(PublishCouponDesign pcd) {
		this.pcd = pcd;
	} // PublishCouponEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == pcd.getJbtnGoMain()) {		// 메인으로 가기 버튼
			closeDialog();
			pcd.getMcd().dispose();
		} // end if
		if(ae.getSource() == pcd.getJbtnPublish()) {	// 발급 버튼
			
		} // end if
		if(ae.getSource() == pcd.getJbtnCancel()) {		// 취소 버튼
			closeDialog();
		} // end if
	} // actionPerformed
	
	public void closeDialog() {
		pcd.dispose();
	} // closeDialog

	@Override
	public void windowClosing(WindowEvent we) {
		closeDialog();
	} // windowClosing

	public void searchAllCoupPubConditionType() throws SQLException {
		CoupConditionTypeDAO cctDAO = CoupConditionTypeDAO.getInstance();
		List<CoupConditionTypeVO> listCctVO = cctDAO.selectAllCoupConditionType();
		for (int i = 0; i < listCctVO.size(); i++) {
			pcd.getDcmPubCondition().addElement(listCctVO.get(i).getConditionTypeName());	
		} // end for
	} // searchAllCoupPubConditionType
	
	public void searchPublishableCouponType() throws SQLException {
		CouponKindDAO ckDAO = CouponKindDAO.getInstance();
		List<CouponKindVO> ckList;
		ckList = ckDAO.selectAllCoupKind();
		
		CouponKindVO ckVO = null;
		int i = 1;
		Iterator<CouponKindVO> ita = ckList.iterator();
		while(ita.hasNext()) {
			ckVO = ita.next();
			pcd.getDtmCoupType().addRow(new String[] {valueOf(i++), valueOf(ckVO.getCoupKindNo()), ckVO.getCoupKindName(), valueOf(ckVO.getExpiresPeriod()).concat("개월"), valueOf(ckVO.getDiscount()).concat("원"), ckVO.isFlagPublishable() == true ? "O" : "X"});
		} // end while
	} // searchPublishableCouponType
	
} // class
