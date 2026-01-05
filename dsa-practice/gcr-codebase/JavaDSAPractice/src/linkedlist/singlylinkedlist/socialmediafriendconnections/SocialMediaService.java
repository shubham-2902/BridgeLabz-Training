package linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaService {


	    private UserNode head;

	    // Add User
	    public void addUser(int id, String name, int age) {
	        UserNode newUser = new UserNode(id, name, age);

	        if (head == null) {
	            head = newUser;
	            return;
	        }

	        UserNode temp = head;
	        while (temp.next != null)
	            temp = temp.next;

	        temp.next = newUser;
	    }

	    // Find User by ID
	    private UserNode findUser(int id) {
	        UserNode temp = head;
	        while (temp != null) {
	            if (temp.userId == id)
	                return temp;
	            temp = temp.next;
	        }
	        return null;
	    }

	    // Add Friend Connection
	    public void addFriend(int id1, int id2) {
	        UserNode u1 = findUser(id1);
	        UserNode u2 = findUser(id2);

	        if (u1 == null || u2 == null) {
	            System.out.println("User not found");
	            return;
	        }

	        u1.friendsHead = addFriendNode(u1.friendsHead, id2);
	        u2.friendsHead = addFriendNode(u2.friendsHead, id1);

	        System.out.println("Friend added");
	    }

	    private FriendNode addFriendNode(FriendNode head, int id) {
	        FriendNode newNode = new FriendNode(id);

	        if (head == null)
	            return newNode;

	        FriendNode temp = head;
	        while (temp.next != null)
	            temp = temp.next;

	        temp.next = newNode;
	        return head;
	    }

	    // Remove Friend Connection
	    public void removeFriend(int id1, int id2) {
	        UserNode u1 = findUser(id1);
	        UserNode u2 = findUser(id2);

	        if (u1 == null || u2 == null) {
	            System.out.println("User not found");
	            return;
	        }

	        u1.friendsHead = removeFriendNode(u1.friendsHead, id2);
	        u2.friendsHead = removeFriendNode(u2.friendsHead, id1);

	        System.out.println("Friend removed");
	    }

	    private FriendNode removeFriendNode(FriendNode head, int id) {
	        if (head == null)
	            return null;

	        if (head.friendId == id)
	            return head.next;

	        FriendNode prev = head;
	        FriendNode curr = head.next;

	        while (curr != null) {
	            if (curr.friendId == id) {
	                prev.next = curr.next;
	                break;
	            }
	            prev = curr;
	            curr = curr.next;
	        }
	        return head;
	    }

	    // Display Friends
	    public void displayFriends(int userId) {
	        UserNode user = findUser(userId);

	        if (user == null) {
	            System.out.println("User not found");
	            return;
	        }

	        System.out.print("Friends of " + user.name + ": ");
	        FriendNode temp = user.friendsHead;

	        if (temp == null) {
	            System.out.println("No friends");
	            return;
	        }

	        while (temp != null) {
	            System.out.print(temp.friendId + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    // Mutual Friends
	    public void mutualFriends(int id1, int id2) {
	        UserNode u1 = findUser(id1);
	        UserNode u2 = findUser(id2);

	        if (u1 == null || u2 == null) {
	            System.out.println("User not found");
	            return;
	        }

	        System.out.print("Mutual Friends: ");
	        boolean found = false;

	        for (FriendNode f1 = u1.friendsHead; f1 != null; f1 = f1.next) {
	            for (FriendNode f2 = u2.friendsHead; f2 != null; f2 = f2.next) {
	                if (f1.friendId == f2.friendId) {
	                    System.out.print(f1.friendId + " ");
	                    found = true;
	                }
	            }
	        }

	        if (!found)
	            System.out.print("None");

	        System.out.println();
	    }

	    // Search by Name
	    public void searchByName(String name) {
	        UserNode temp = head;

	        while (temp != null) {
	            if (temp.name.equalsIgnoreCase(name)) {
	                System.out.println("Found: ID=" + temp.userId + ", Age=" + temp.age);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("User not found");
	    }

	    // Count Friends
	    public void countFriends() {
	        UserNode temp = head;

	        while (temp != null) {
	            int count = 0;
	            FriendNode f = temp.friendsHead;

	            while (f != null) {
	                count++;
	                f = f.next;
	            }

	            System.out.println(temp.name + " has " + count + " friends");
	            temp = temp.next;
	        }
	    }
	}


