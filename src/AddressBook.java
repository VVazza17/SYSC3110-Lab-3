import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
}
