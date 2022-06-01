package com.kodgemisi.usermanagement;

import java.util.Set;

public class Profile {

	private String avatarUrl;

	private String address;

	private Phone primaryPhone;

	private Email primaryEmail;

	private Set<Phone> phones;

	private Set<Email> emails;

	private Language language;

	public Profile(String avatarUrl, String address, Phone primaryPhone, Email primaryEmail, Set<Phone> phones, Set<Email> emails,
			Language language) {
		this.avatarUrl = avatarUrl;
		this.address = address;
		this.primaryPhone = primaryPhone;
		this.primaryEmail = primaryEmail;
		this.phones = phones;
		this.emails = emails;
		this.language = language;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Phone getPrimaryPhone() {
		return primaryPhone;
	}

	// return true if user have TR primary phone number
	public boolean getTrPrimaryPhone(){
		return primaryPhone.subSequence(0, 3).equals("+90");
	}

	public void setPrimaryPhone(Phone primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public Email getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(Email primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public Set<Email> getEmails() {
		return emails;
	}

	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Profile{" + "primaryPhone=" + primaryPhone + ", primaryEmail=" + primaryEmail + ", language=" + language + '}';
	}
}