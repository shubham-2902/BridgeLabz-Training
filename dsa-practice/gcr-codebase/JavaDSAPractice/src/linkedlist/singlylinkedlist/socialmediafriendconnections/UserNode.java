package linkedlist.singlylinkedlist.socialmediafriendconnections;

public class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendsHead;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }
}
