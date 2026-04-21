package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
  public String getMychoice() {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("自分のじゃんけんの手を入力しましょう");
      System.out.println("グーはrockのrを入力しましょう");
      System.out.println("チョキはscissorsのsを入力しましょう");
      System.out.println("パーはpaperのpを入力しましょう");
      
      String myChoice = scanner.next();
	  
	  return myChoice;
	  
  }
  
  
  public String getRandom() {
	  String[] choices = {"r","s","p"};
	  
	  double randomValue = Math.random()*3;
	  
	int index =	(int) Math.floor(randomValue);
	  
	  return choices[index];
  }
	
  
  
  public void playGame() {
	  
           String myChoice = getMychoice();
           String enemyChoice = getRandom();
	
HashMap<String,String> handMap = new HashMap<String,String>();
handMap.put("r", "グー");
handMap.put("s", "チョキ");
handMap.put("p", "パー");

System.out.println("自分の手は"+handMap.get(myChoice)+"、対戦相手の手は" + handMap.get(enemyChoice));

if (myChoice.equals(enemyChoice)) {
	System.out.println("あいこです");
	
}else if(
		
	(myChoice.equals("r") && enemyChoice.equals("s"))||
	 (myChoice.equals("s") && enemyChoice.equals("p")) ||
     (myChoice.equals("p") && enemyChoice.equals("r"))
     ){
	
   System.out.println("自分の勝ちです");
  } else {
      System.out.println("自分の負けです");
  }
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
