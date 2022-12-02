package com.kim.sep221.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Game_java {
	private static int t;
	private static int win;
	private static int draw;
	private static int lose;
	public Game_java() {
		// TODO Auto-generated constructor stub
	}
	
	
	



	public static void doRSP(HttpServletRequest request) {
		int userHand = Integer.parseInt(request.getParameter("userHand"));
		request.setAttribute("uh", userHand+".jpg");
		
		int comHand = new Random().nextInt(3)+1;
		request.setAttribute("ch", comHand+".jpg");
		
		
		//ÆÇÁ¤
		int result = userHand-comHand;
		if(result==0) {
			request.setAttribute("r", "¹«");
			draw++;
			t++;
		}else if(result == -1 || result ==2) {
			request.setAttribute("r", "ÆÐ");
			lose++;
			t++;
			
		}else {
			request.setAttribute("r", "½Â");
			 win++;
			 t++;
		}
		request.setAttribute("t", t+"Àü");
		request.setAttribute("w", win+"½Â");
		request.setAttribute("d", draw+"¹«");
		request.setAttribute("i", lose+"ÆÐ");
		
	}
	
}
