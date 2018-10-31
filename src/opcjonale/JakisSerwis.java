package opcjonale;

import java.util.Optional;

public class JakisSerwis {

	private Boolean flaga;
	
	
	public String  sprawdzFlageNPL(){
		String napis;
		if (flaga == true)
				return napis="ustawiona";
		else
			return napis="nieustawiona";
	}
	

	public String sprawdzFlageOptional(){
		String napis;
		Optional<Boolean> flagaOptional = Optional.ofNullable(flaga);
		if (flagaOptional.isPresent())
			return napis="ustawiona";
		else
			return napis="nieustawiona";
		
	}
	
	public String sprawdzFlageOptionalZParmaterm(Boolean flagaZmienna){
		String napis;
		Optional<Boolean> flagaOptional = Optional.ofNullable(flagaZmienna);
		if (flagaOptional.isPresent())
			return napis="ustawiona";
		else
			return napis="nieustawiona";
		
	}
	
}
