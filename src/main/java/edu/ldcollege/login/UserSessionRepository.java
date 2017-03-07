package edu.ldcollege.login;

import edu.ldcollege.domain.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by shenli on 2017/3/5.
 */
public class UserSessionRepository {

    private static final Map<String, User> sessionMap = new ConcurrentHashMap<>();

    public static void put(String sessionId, User user) {
        sessionMap.put(sessionId, user);
    }

    public static User del(String sessionId){
        return sessionMap.remove(sessionId);
    }

    public static User getBySessionId(String sessionId) {
        return sessionMap.get(sessionId);
    }

}
