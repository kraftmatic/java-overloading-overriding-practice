package com.kraftmatic.overloadPractice;

import com.kraftmatic.overloadPractice.objects.Person;

public class Practice {

	public static void main(String args[]) {

		Person person = new Person();
		displayPersonInfo(person);

		// Use your two other constructors from the Person class to make two
		// more people. Use the displayPersonInfo method to display them. Invoke
		// useMagic() to use magic.

	}

	public static void displayPersonInfo(Person person) {
		System.out.println("This persons name is: " + person.getName());
		System.out.println("This persons nickname is: " + person.getNickName());
		System.out.println("This persons age is: " + person.getAge());
	}

	public static void useMagic(MagicUser magicUser) {
		System.out.println(magicUser.useMagic());
	}

}
