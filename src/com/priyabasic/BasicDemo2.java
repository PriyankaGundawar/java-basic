package com.priyabasic;

class music{
	public void playMusic() {
		System.out.println("lets play music !!");
	}
	
	public String getMeChoc(int cost) {
		
		if(cost>=5)
		return "choc";
		
		return "nothing";
	}
}

public class BasicDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		music pm = new music();
		pm.playMusic();
		music mc = new music();
		String reschoc = mc.getMeChoc(1);		
		System.out.println(reschoc);
	}

}
