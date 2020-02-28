package com.kodilla.testing.library;

public class LibraryUser {

    String firstname;
    String lasname;
    String peselId;

    public LibraryUser(String firstname, String lasname, String peselId) {
        this.firstname = firstname;
        this.lasname = lasname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLasname() {
        return lasname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;

        LibraryUser that = (LibraryUser) o;

        if (!firstname.equals(that.firstname)) return false;
        if (!lasname.equals(that.lasname)) return false;
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lasname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
