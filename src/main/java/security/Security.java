package security;

public class Security implements ISecurity {
	@Override
	public boolean validatePin(String pinkode, String inputPinkode) {
		return pinkode.equalsIgnoreCase(inputPinkode);
	}
}
