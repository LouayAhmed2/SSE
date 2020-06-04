package com.example.builder.login;

public class User {
    private String musername;
     private String mpassword;

    public String getUserName() {
        return musername;
    }

    public void setUserName(String userName) {
        musername = userName;
    }

    public String getpassword() {
        return mpassword;
    }

    public void setpassword(String password) {
        mpassword = password;
    }



    public User(String username, String password){

         this.musername=username;
         this.mpassword=password;


     }

     public User(){


     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return (musername == null ? user.musername == null : musername.equals(user.musername))
                && (mpassword == null ? user.mpassword == null : mpassword.equals(user.mpassword));
    }

    @Override
    public int hashCode() {
        int result = musername == null ? 0 : musername.hashCode();
        result = 31 * result + (mpassword == null ? 0 : mpassword.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "musername='" + musername + '\'' +
                ", mpassword='" + mpassword + '\'' +
                '}';
    }
}

