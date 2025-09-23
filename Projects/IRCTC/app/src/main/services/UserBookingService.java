package IRCTC.services;

import IRCTC.entities.User;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserBookingService {

    private User user;

    private static final String USERS_PATH = "../db/users.json";

    public UserBookingService(User user) {
        this.user = user;
        File users = new File(USERS_PATH);
        
        List<Integer> ar = new ArrayList<>();
        ar.stream().map().filter(null)
    }
}