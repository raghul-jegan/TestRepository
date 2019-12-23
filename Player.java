class Player {
static int playerCount = 0;
public String name;
public Player(String n) {
name = n;
playerCount++;
}
public static void go(){
System.out.println("static method");

}
public void go2(){
System.out.println("go2 method");
}
}
 class PlayerTestDrive {
public static void main(String[] args) {
System.out.println(Player.playerCount);
//System.out.println(Player.name);
Player one = new Player("player1");
//System.out.println("after first inst static variable is "+Player.playerCount+" instance variable is "+one.playerCount);
//Player two = new Player("player2");
//System.out.println("after second inst static variable is "+Player.playerCount+" instance variable is "+two.playerCount);
System.out.println(playerCount);
//System.out.println(one.playerCount);
//Player.go();
}
}