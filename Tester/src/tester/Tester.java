package tester;

public class Tester {
	// Uncomment each part as you go.
	// Remember to test often!
	public static void main(String... args) {
		testPart1a();
		testPart1b();
		testPart1c();
		testPart2a();
		testPart2b();
                testPart2c();
		testPart3();
	}
 
	public static void testPart1a() {
		System.out.println("Part 1 - Accessor methods");
		System.out.println("======");
 
		System.out.println("--- Part 1a ---");
		System.out.println();
 
                //creates a new smartcard for student
		System.out.println("* Creating a new SmartCard for student Anna Undergrad...");
		SmartCard card = new SmartCard("Anna Undergrad");
                
                //card.setStaff(false); //added to check setStaff value
		System.out.println("Owner is: " + card.getOwner());
		System.out.println();
	}
 

	public static void testPart1b() {
		System.out.println("--- Part 1b ---");
		System.out.println();
                
		SmartCard card = new SmartCard("Anna Undergrad");
 
		System.out.println("Is " + card.getOwner() + " staff? " + card.isStaff());
		System.out.println();
	}

 

	public static void testPart1c() {
		System.out.println("--- Part 1c ---");
		System.out.println();
                
                // creates a new smartCard for staff                 
		System.out.println("* Creating a new SmartCard for staff member Dr. Bob Lecturer...");
		SmartCard card = new SmartCard("Dr. Bob Lecturer");
		card.setStaff(true); //this is the part where this smartCard gets staff status
		System.out.println("Is " + card.getOwner() + " staff? " + card.isStaff());
		System.out.println();
	}

 
	
	public static void testPart2a() {
		System.out.println("Part 2 - Object interactions");
		System.out.println("======");
                
                //Testing lock last seen method
 
		System.out.println("--- Part 2a ---");
		System.out.println();
 
		System.out.println("* Creating a new CardLock...");
		CardLock lock = new CardLock();
		System.out.println();
 
		SmartCard cardA = new SmartCard("Anna Undergrad");
                //System.out.println(cardA);
		SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
                //System.out.println(cardB);
		cardB.setStaff(true);
 
		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA);
		System.out.println("Last card seen: " + lock.getLastCardSeen().getOwner() + "'s card");
		System.out.println();
 
		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB);
		System.out.println("Last card seen: " + lock.getLastCardSeen().getOwner() + "'s card");
		System.out.println();
	}

 

	public static void testPart2b() {
		System.out.println("--- Part 2b ---");
		System.out.println();
 
                //this is to test the lock which only allows staff in
                
		CardLock lock = new CardLock();
		SmartCard cardA = new SmartCard("Anna Undergrad");
		SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
		cardB.setStaff(true);
 
		System.out.println("* Swiping some cards on the lock...");
		System.out.println("(This lock should only let staff in)");
		System.out.println();
 
		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
 
		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
	}
        

 

	public static void testPart2c() {
		System.out.println("--- Part 2c ---");
		System.out.println();
                
                
                //this is to test toggleStudentAccess, when enabled it allows staff as well as students, when disabled it goes back to status quo
                
		CardLock lock = new CardLock();
		SmartCard cardA = new SmartCard("Anna Undergrad");
		SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
		cardB.setStaff(true);
 
		System.out.println("* Toggling the lock to allow both students and staff...");
		lock.toggleStudentAccess();
		System.out.println();
 
		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
 
		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
 
		System.out.println("* Toggling the lock to allow only staff...");
		lock.toggleStudentAccess();
		System.out.println();
 
		System.out.println("* Swiping " + cardA.getOwner() + "'s card");
		lock.swipeCard(cardA);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
 
		System.out.println("* Swiping " + cardB.getOwner() + "'s card");
		lock.swipeCard(cardB);
		System.out.println("Is the card lock unlocked? " + lock.isUnlocked());
		System.out.println();
	}

 

	public static void testPart3() {
		System.out.println("Part 3 - Writing tests");
		System.out.println("======");
 
		// TODO: Write a test harness for the Door class
                
                //creates a door called researchLabs, lock called researchLock and attach it together
                Door researchLabs = new Door(); 
                CardLock researchLock = new CardLock(); 
                researchLabs.attachLock(researchLock); 
                
                SmartCard studentCard = new SmartCard("Student"); //create a student card and test it against the research door lock
                researchLock.swipeCard(studentCard); 
                System.out.println("\nSwiping Student card on Research Door Lock....");
                System.out.println("Is the card lock unlocked? " + researchLock.isUnlocked());
                
                SmartCard staffCard = new SmartCard("Staff"); //create a staff card and test it against the research door lock
                staffCard.setStaff(true);
                researchLock.swipeCard(staffCard);
                System.out.println("\nSwiping Staff Card on Research Door Lock.....");
                System.out.println("Is the card lock unlocked? " + researchLock.isUnlocked());
	}

}