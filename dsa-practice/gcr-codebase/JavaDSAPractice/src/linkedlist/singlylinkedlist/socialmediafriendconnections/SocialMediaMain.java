package linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaMain {
	
	    public static void main(String[] args) {

	        SocialMediaService sm = new SocialMediaService();

	        sm.addUser(1, "Rahul", 22);
	        sm.addUser(2, "Amit", 23);
	        sm.addUser(3, "Sneha", 21);
	        sm.addUser(4, "Priya", 24);

	        sm.addFriend(1, 2);
	        sm.addFriend(1, 3);
	        sm.addFriend(2, 3);
	        sm.addFriend(3, 4);

	        sm.displayFriends(1);
	        sm.mutualFriends(1, 2);
	        sm.searchByName("Sneha");
	        sm.countFriends();

	        sm.removeFriend(1, 2);
	        sm.displayFriends(1);
	    }
	}
