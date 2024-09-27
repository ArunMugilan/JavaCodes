/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPhase;

import java.util.ArrayList;

/**
 *
 * @author Omar Alomory
 */
public class Login {
    private String userName;
    private String password;
    private ArrayList<String> name;
    private ArrayList<String> userPassword;
    public Login (){
        name = new ArrayList();
        userPassword = new ArrayList();

        name.add("admin");
        userPassword.add("admin");
        
    }
//    public Login (String userName, String password){
//                name = new ArrayList();
//        userPassword = new ArrayList();
//
//        name.add("admin");
//        userPassword.add("admin");
//        this.name.add(userName);
//        this.userPassword.add(password);
//        
//    }
public void addUserNameAndPassword(String newUserName, String newPassword){
    name.add(newUserName);
    userPassword.add(newPassword);
}

    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getName() {
        return name;
    }
    
    public ArrayList<String> getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(ArrayList<String> userPassword) {
        this.userPassword.addAll(userPassword);
    }
    
}
