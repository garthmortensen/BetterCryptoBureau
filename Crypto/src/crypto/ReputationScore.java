package crypto;

public class ReputationScore {
public String List;
public String Name;
public String Symbol;
public int score;


public ReputationScore(String list, String name, String symbol, int score) {
	super();
	List = list;
	Name = name;
	Symbol = symbol;
	this.score = score;
}
public String getList() {
	return List;
}
public void setList(String list) {
	List = list;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSymbol() {
	return Symbol;
}
public void setSymbol(String symbol) {
	Symbol = symbol;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

	

}
