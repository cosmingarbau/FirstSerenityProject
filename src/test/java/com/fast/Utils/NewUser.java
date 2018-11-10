package com.fast.Utils;

import org.apache.commons.lang3.RandomStringUtils;

public class NewUser {
    String firstName;
    String lastName;
    String password;
    String confirmPassword;
    String email;

    public NewUser()
    {
        firstName= RandomStringUtils.randomAlphabetic(5);
        lastName=RandomStringUtils.randomAlphabetic(4);
        email=RandomStringUtils.randomAlphabetic(3)+"@mylinator.com";
        password = RandomStringUtils.randomAlphabetic(6);
        confirmPassword=password;
    }
    public String getFirstName ( )
    {
        return firstName;
    }

    public void setFirstName (String name)
    {
        firstName = name;
    }

    public String getLastName ( )
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail ( )
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getPassword ( )
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getConfirmPassword ( )
    {
        return password;
    }

    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword = confirmPassword;
    }

}
