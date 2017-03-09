package cn.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class DemoAction {
	
//	private String shuru;
//	
//	
//	public String getShuru() {
//		return shuru;
//	}
//
//	public void setShuru(String shuru) {
//		this.shuru = shuru;
//	}

	
	public String demo2(){
		return "success";
	}
	
	public String demo3(){
		System.out.println("33333");
		return "success";
	}
	
	public String demo4(){
//		System.out.println(this.shuru);
		
		
		ActionContext context = ActionContext.getContext();
		Map par = context.getParameters();
		String shu[] = (String[])par.get("shuru");
		System.out.println("方法2"+shu[0]+"...");
		
		
		
		return "success";
	}
}
