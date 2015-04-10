<<<<<<< HEAD:monivalinta/src/main/java/harj/monivalinta/model/Users.java
package harj.monivalinta.model;

import java.util.HashMap;
import java.util.Objects;

=======
>>>>>>> 5b80e6f88e078c8de5397997615f257514e4a84a:monivalinta/src/main/java/harj/monivalinta/Command.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD:monivalinta/src/main/java/harj/monivalinta/model/Users.java
=======

package harj.monivalinta;

>>>>>>> 5b80e6f88e078c8de5397997615f257514e4a84a:monivalinta/src/main/java/harj/monivalinta/Command.java
/**
 *
 * @author lmjaland
 */
<<<<<<< HEAD:monivalinta/src/main/java/harj/monivalinta/model/Users.java
public class Users {

    private HashMap<String, User> users;
    

     public Users() {
        this.users = new HashMap<>();
    }
    
    public Users(HashMap<String, User> users) {
        this.users = users;
    }

    public HashMap<String, User> getUsers() {
        return users;
    }
   
public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

public void addNewUser(String name){
    User nu=new User();
    this.users.put(name, nu);
  }

@Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.users);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        return Objects.equals(this.users, other.users);
    }

    @Override
    public String toString() {
        return "Users{" + "users=" + users + '}';
    }

=======
public interface Command {
    public User haeUser(String username);
>>>>>>> 5b80e6f88e078c8de5397997615f257514e4a84a:monivalinta/src/main/java/harj/monivalinta/Command.java
}

