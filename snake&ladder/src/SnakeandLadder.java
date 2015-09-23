import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;



public class SnakeandLadder{


	Player pl;
	Snake sc;
	Ladder lc;
	Vector <Snake> snakes =new Vector<Snake>();
	Vector <Ladder> ladders=new Vector<Ladder>();
	Vector <Player> players=new Vector<Player>();
	int CurrentPlayer;
	public SnakeandLadder() {
	CurrentPlayer=0;
	}
	public void addSnake(int start, int end)
	{
		Snake s=new Snake();
		s.head=start;
		s.tail=end;
		snakes.add(s);
	
	}
	public void addLadder(int start, int end)
	{
		Ladder l=new Ladder();
		l.start=start;
		l.end=end;
		ladders.add(l);
	}
	public void addPlayer(Player player)
	{
		players.add(player);
	
	}
	public Player nextPlayer()
	{
		return null;
	//Returns the next player who is to take turn for play. 
	/*Players take turns by their age youngest to oldest.*/
	}
	public boolean hasWinner()
	{
		for(int i=0;i<players.size();i++){
			pl=players.get(i);
			if(pl.curr>=100){
				return true;
			}
		}
		return false;
	}
	public void movePlayer(Player p, int diceValue)
	{
	
	for(int i=0;i<players.size();i++){
		pl=players.get(i);
		if(pl.equals(p)){
			for(int j=0;j<snakes.size();j++)
			{
				sc=snakes.get(j);
				for(int k=0;k<ladders.size();k++){
					lc=ladders.get(k);
					if(pl.curr==sc.head)
						pl.curr=sc.tail;
					else if(pl.curr==lc.end)
						pl.curr=lc.start;
					else
						pl.curr+=diceValue;
				}
			}
		}
	}
	
	}
	public Player getWinner()
	{
		for(int i=0;i<players.size();i++){
			pl=players.get(i);
			if(pl.curr>=100){
				return pl;
			}
		}
		return null;
	}
	public int getPosition(Player p)
	{
		return p.curr;	
	}
	public static void main (String args[])
	{
	SnakeandLadder sl =new SnakeandLadder();
	
	sl.addSnake(36,6);
	sl.addSnake(17,7);
	sl.addSnake(96,30);
	sl.addSnake(25,1);
	sl.addLadder(5,55);
	sl.addLadder(15,88);
	sl.addLadder(25,95);
	sl.addLadder(36,75);
	Player p=new Player("rajesh",21);
	sl.addPlayer(p);
	Player p1=new Player("kumar",22);
	sl.addPlayer(p1);
	Player p2=new Player("sheela",23);
	sl.addPlayer(p2);
	
	Player p3=new Player("krishna",21);
	sl.addPlayer(p3);
	
	Player p4=new Player("rajesh-k",21);
	sl.addPlayer(p4);

	Iterator<Player> it=sl.players.iterator();
	/*while(it.hasNext()){
		System.out.println(it.next());
	}*/
	
	int x=1;
	while(x!=0){
		
		if(sl.hasWinner()){
			System.out.println("Winner is "+sl.getWinner().Name+" of age "+sl.getWinner().age);
			break;
		}else{
			sl.movePlayer(p, Dice.roll());
			//System.out.println(sl.getPosition(p));
			sl.movePlayer(p1, Dice.roll());
			//System.out.println(sl.getPosition(p1));
			sl.movePlayer(p2, Dice.roll());
			//System.out.println(sl.getPosition(p2));
			sl.movePlayer(p3, Dice.roll());
			sl.movePlayer(p4, Dice.roll());
		}
	}
	// call move player to play game
	//announce winner
	}
}

