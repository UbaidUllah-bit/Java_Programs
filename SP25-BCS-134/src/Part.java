public class Part{

	private PartType type;
	private PartStatus status;
	private String code;
	private String CODE_REGEX;

	Part(int year, int Code, PartType type, PartStatus status){

		this.code = String.format("SIG-%4d-%06d", year, Code);
		this.type = type;
		if(status == PartStatus.In_Service){

			this.status = PartStatus.In_Locker;

		}
		
		else{

			this.status = PartStatus.In_Service;

		}


	}

	public PartType getType(){

		return type;

	}

	public PartStatus getStatus(){

		return status;

	}

	public void setStatus(PartStatus status){

		this.status = status;		

	}
	
	public String getCode(){

		return code;

	}

	public String getCODE_REGEX(){

		return CODE_REGEX;

	}


	@Override
	public String toString(){

		return String.format("%s | %s | %s", code, type, status);

	}

}