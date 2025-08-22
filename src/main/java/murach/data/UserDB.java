package murach.data;

import murach.business.User;

public class UserDB {
    public static void insert(User user) {
        // tạm thời chưa kết nối database, chỉ in ra console
        System.out.println("Saving user: "
            + user.getFirstName() + " "
            + user.getLastName() + " "
            + user.getEmail());
    }
}
