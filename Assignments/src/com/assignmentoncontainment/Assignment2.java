/*	Institute->Branch->Subject->Topic->SubTopic->Question
  	Containment using setter method
 */
package com.assignmentoncontainment;

class Question {
	private int qId;
	private String qName;
	
	public void setQId(int qId)
	{
		this.qId = qId;
	}
	
	public void setQName(String qName)
	{
		this.qName = qName;
	}
	
	public String toString()
	{
		return "\nQuestion id: "+qId+"\nQuestion name: "+qName;
	}
}	
	
class SubTopic {
	private int stId;
	private String stName;
	Question qst;
	
	public void setStId(int stId)
	{
		this.stId = stId;
	}
	public void setStName(String stName)
	{
		this.stName = stName;
	}
	public void setQst(Question qst)
	{
		this.qst = qst;
	}
	public String toString()
	{
		return "\nSubtopic id: "+stId+"\nSubtopic name: "+stName+qst;
	}

}

class Topic {
	private int tId;
	private String tName;
	SubTopic st;
	
	public void setTId(int tId)
	{
		this.tId = tId;
	}
	public void setTName(String tName)
	{
		this.tName = tName;
	}
	public void setSt(SubTopic st)
	{
		this.st = st;
	}
	
	public String toString()
	{
		return "\nTopic id :"+tId+"\nTopic name : "+tName+st;
	}

}

class Subject {
	private int sId;
	private String sName;
	Topic tp;
	
	public void setSId(int sId)
	{
		this.sId = sId;
	}
	public void setSName(String sName)
	{
		this.sName = sName;
	}
	public void setTp(Topic tp)
	{
		this.tp = tp;
	}
	
	public String toString()
	{
		return "\nSubject id : "+sId+"\nSubject name: "+sName+tp;
	}

}

class Branch {
	private int bId;
	private String bName;
	Subject sub;
	
	public void setBId(int bId)
	{
		this.bId = bId;
	}
	public void setBName(String bName)
	{
		this.bName = bName;
	}
	public void setSub(Subject sub)
	{
		this.sub = sub;
	}
	
	public String toString()
	{
		return "\nBranch id :"+bId+"\nBranch Name: "+bName+sub;
	}

}

class Institute {
	private int iId;
	private String iName;
	Branch b;
	
	public void setIId(int iId)
	{
		this.iId = iId;
	}
	public void setIName(String iName)
	{
		this.iName = iName;
	}
	public void setB(Branch b)
	{
		this.b=b;
	}
	
	public String toString()
	{
		return "Institute id: "+iId+"\nInstitue name: "+iName+b;
	}

}

public class Assignment2 {	

	public static void main(String[] args) {
		Question q = new Question();
		q.setQId(1);
		q.setQName("What is Java?");
		
		SubTopic st = new SubTopic();
		st.setStId(101);
		st.setStName("Core Java");
		st.setQst(q);
		
		Topic t = new Topic();
		t.setTId(1001);
		t.setTName("Java");
		t.setSt(st);
		
		Subject sb = new Subject();
		sb.setSId(10001);
		sb.setSName("Java with DS");
		sb.setTp(t);
		
		Branch b = new Branch();
		b.setBId(100001);
		b.setBName("Computer");
		b.setSub(sb);
		
		Institute i = new Institute();
		i.setIId(1000001);
		i.setIName("ThinkQuotient");
		i.setB(b);
		
		System.out.println(i);

	}

}
