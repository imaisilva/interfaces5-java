package services;

public class BrazillnterestService implements InterestService {
	
	private double interestRate;

	public BrazillnterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}