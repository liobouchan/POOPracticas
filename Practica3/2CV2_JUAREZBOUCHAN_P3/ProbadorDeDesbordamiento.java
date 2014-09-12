public class ProbadorDeDesbordamiento{
	public static void main (String[] args){
		DesbordadorPositivo desbordadorPos=new DesbordadorPositivo();
		DesbordadorNegativo desbordadorNeg=new DesbordadorNegativo();
		desbordadorPos.desbordarBytePositivo();
		desbordadorNeg.desbordarByteNegativo();
		desbordadorPos.desbordarShortPositivo();
		desbordadorNeg.desbordarShortNegativo();
		desbordadorPos.desbordarIntPositivo();
		desbordadorNeg.desbordarIntNegativo();
		desbordadorPos.desbordarLongPositivo();
		desbordadorNeg.desbordarLongNegativo();
		desbordadorPos.desbordarCharPositivo();
		desbordadorNeg.desbordarCharNegativo();
		desbordadorPos.desbordarFloatPositivo();
		desbordadorNeg.desbordarFloatNegativo();
		desbordadorPos.desbordarDoublePositivo();
		desbordadorNeg.desbordarDoubleNegativo();
	}


}