package kiosk_prj.coupon.vo;

public class CouponAddedInfoVO {
	private int conditionPrice;
	private int conditionTypeNo;
	private int coupKindNo;
	private String coupKindName;
	private int discount;
	private boolean flagDisable;
	private int expiresPeriod;
	private String condition;
	
	public CouponAddedInfoVO() {
	}
	public CouponAddedInfoVO(int conditionPrice, int conditionTypeNo, int coupKindNo, String coupKindName, int discount,
			boolean flagDisable, int expiresPeriod, String condition) {
		this.conditionPrice = conditionPrice;
		this.conditionTypeNo = conditionTypeNo;
		this.coupKindNo = coupKindNo;
		this.coupKindName = coupKindName;
		this.discount = discount;
		this.flagDisable = flagDisable;
		this.expiresPeriod = expiresPeriod;
		this.condition = condition;
	}
	public int getConditionPrice() {
		return conditionPrice;
	}
	public void setConditionPrice(int conditionPrice) {
		this.conditionPrice = conditionPrice;
	}
	public int getConditionTypeNo() {
		return conditionTypeNo;
	}
	public void setConditionTypeNo(int conditionTypeNo) {
		this.conditionTypeNo = conditionTypeNo;
	}
	public int getCoupKindNo() {
		return coupKindNo;
	}
	public void setCoupKindNo(int coupKindNo) {
		this.coupKindNo = coupKindNo;
	}
	public String getCoupKindName() {
		return coupKindName;
	}
	public void setCoupKindName(String coupKindName) {
		this.coupKindName = coupKindName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public boolean getFlagDisable() {
		return flagDisable;
	}
	public void setFlagDisable(boolean flagDisable) {
		this.flagDisable = flagDisable;
	}
	public int getExpiresPeriod() {
		return expiresPeriod;
	}
	public void setExpiresPeriod(int expiresPeriod) {
		this.expiresPeriod = expiresPeriod;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return "CouponAddedInfoVO [conditionPrice=" + conditionPrice + ", conditionTypeNo=" + conditionTypeNo
				+ ", coupKindNo=" + coupKindNo + ", coupKindName=" + coupKindName + ", discount=" + discount
				+ ", flagDisable=" + flagDisable + ", expiresPeriod=" + expiresPeriod + ", condition="
				+ condition + "]";
	}
	
}
