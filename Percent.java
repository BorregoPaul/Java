public class Percent {
	
	private int percent;
	
	// Getter
	public int getPercent() {
	return percent;
   }

   // Setter
	public void setPercent(int newPercent) {
	newPercent = newPercent * newPercent ; 
	this.percent = newPercent;
	}
}
