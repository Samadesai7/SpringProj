package com.cts.SpringProj;

public class Teacher {
	private String Tname;
	private int Tid;
	private String dept;
	public Teacher(String Tname,int Tid,String dept) {
		this.Tname=Tname;
		this.Tid=Tid;
		this.dept=dept;
	}
	void work() {
		
		System.out.println("Teacher details: \n Name: " + this.getTname()
				+ ", ID : " + this.getTid()+",Dept:"+this.getDept());

			}

public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
		public String getTname() {
				
		return Tname;
	}
     public void setTname(String Tname) {
				
		this.Tname = Tname;
				
				
	}
     public int getTid() {
    	 return Tid;
     }
     public void setTid(int Tid) {
    	 this.Tid = Tid;				
    	 
}
}



