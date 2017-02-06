package com.kamikazi3728.mathematics;

public class NDimensionalPlane {

	public double[] point;
	public double[] vector;
	
	public NDimensionalPlane(double dimension,double[] place,double[] direction){
		if((dimension==place.length)&&(dimension==direction.length)){
			point = place;
			vector = direction;
		}
		else{
			String err = "The following values had incorrect dimensions: ";
			if(dimension!=place.length){
				err.concat("place(the point) ");
			}
			if(dimension!=direction.length){
				err.concat("direction");
			}
			throw new UnrecoverableMathException(err);
		}
	}
}
