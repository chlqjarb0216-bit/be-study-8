package be_study.quiz.quiz60;

public class MinuDustWeek { //DTO 생략

	//int id; //PK

	String presnatnDT;
	String frcstOneDt;
	String frcstTwoDt;
	String frcstOneCn;
	String frcstTwoCn;

	/*
	CREATE TABLE MINU_DUST_WEEK (
	    id NUMBER PRIMARY KEY,
	    presnatn_dt VARCHAR2(10),
		frcst_One_Cn VARCHAR2(4000),
		frcst_Two_Cn VARCHAR2(4000),
		frcst_One_Dt VARCHAR2(10),
		frcst_Two_Dt VARCHAR2(10)
	);
	
	CREATE SEQUENCE SEQ_MINU_DUST_WEEK_PK
	START WITH 1
	INCREMENT BY 1
	NOCYCLE;
	
	 */

	public String getPresnatnDT() {
		return presnatnDT;
	}

	public void setPresnatnDT(String presnatnDT) {
		this.presnatnDT = presnatnDT;
	}

	public String getFrcstOneDt() {
		return frcstOneDt;
	}

	public void setFrcstOneDt(String frcstOneDt) {
		this.frcstOneDt = frcstOneDt;
	}

	public String getFrcstTwoDt() {
		return frcstTwoDt;
	}

	public void setFrcstTwoDt(String frcstTwoDt) {
		this.frcstTwoDt = frcstTwoDt;
	}

	public String getFrcstOneCn() {
		return frcstOneCn;
	}

	public void setFrcstOneCn(String frcstOneCn) {
		this.frcstOneCn = frcstOneCn;
	}

	public String getFrcstTwoCn() {
		return frcstTwoCn;
	}

	public void setFrcstTwoCn(String frcstTwoCn) {
		this.frcstTwoCn = frcstTwoCn;
	}

	@Override
	public String toString() {
		return "MinuDustWeek [presnatnDT=" + presnatnDT + ", frcstOneDt=" + frcstOneDt + ", frcstTwoDt=" + frcstTwoDt
				+ ", frcstOneCn=" + frcstOneCn + ", frcstTwoCn=" + frcstTwoCn + "]";
	}

}
