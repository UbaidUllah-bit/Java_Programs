public class CriticalPart extends Part{

	private int urgency;

	CriticalPart(int year, int code, PartType type, PartStatus status, int urgency){

	super(year, code, type, status);
	this.urgency = urgency;

	}

	public int getUrgency(){


		return urgency;

	}





}