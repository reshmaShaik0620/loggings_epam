package cleancode.Interest;



public class SCInterest

{

	double principal_amount,rate;

	int tperiod;

	SCInterest(double principal_amt,double rate,int tperiod)

	{

		principal_amount=principal_amt;

		this.rate=rate;

		this.tperiod=tperiod;

	}

	double SimpleInterest()

	{

		return (principal_amount*timeperiod*rate)/100;

	}
double CompoundInterest()

	{

		double t=1+(rate/100);

		return principal_amount*Math.pow(t,timeperiod);

	}

}