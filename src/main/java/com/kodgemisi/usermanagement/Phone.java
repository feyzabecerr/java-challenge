package com.kodgemisi.usermanagement;

/**
 * Represents a phone number, never stores a null value. If constructed with a null value stores an empty string.
 */
public class Phone implements CharSequence {

	private final String phoneNumber;

	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber == null ? "" : phoneNumber;
		if(phoneNumber == null){
			throw new IllegalArgumentException("A phone number cannot be null");
		}
		else{
			checkEmpty(phoneNumber);
			checkSign();
		}
	}

	public void checkEmpty(String phoneNumber){
		if(phoneNumber.isEmpty()){
			throw new IllegalArgumentException("A phone number cannot be empty");
		}

	}

	public void checkSign(){
		if(charAt(0) == '+'){
			if(length() < 5){
				throw new IllegalArgumentException("A phone number should be at least 5-char long when it starts with +");
			}
			if(subSequence(0, 3).equals("+90") && length()!= 13){
				throw new IllegalArgumentException("should be exactly 13-char long when it starts with `+90`");	
			}
		}
		else{
			if(!(phoneNumber.equals("112") || phoneNumber.equals("911"))){
				throw new IllegalArgumentException("may not start with `+` if it's `112` or `911`");
			}
		}
	}

	public String number() {
		return phoneNumber;
	}

	@Override
	public int length() {
		return phoneNumber.length();
	}

	@Override
	public char charAt(int index) {
		return phoneNumber.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return phoneNumber.subSequence(start, end);
	}

	@Override
	public String toString() {
		return phoneNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Phone phone = (Phone) o;

		return phoneNumber.equals(phone.phoneNumber);
	}

	@Override
	public int hashCode() {
		return phoneNumber.hashCode();
	}

}
