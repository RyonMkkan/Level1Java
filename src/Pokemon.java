
public class Pokemon {
boolean hasTail;
String Type;
	String Name;
 void Attack()
 {
	 System.out.println(Name+"is attacky");
 }
void heal()
{
	System.out.println(Name+"is healable");
}
void doge()
{
	System.out.println(Name+ "is evadable");
}
public Pokemon(boolean hasTail, String type, String name) {
	super();
	this.hasTail = hasTail;
	Type = type;
	Name = name;
}

}
