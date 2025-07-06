package com.arianit.RAG_IMPL.dummy.hr_servis;


public class HrResponse {
    private int numriDiteveTePushimit;
    private String name;
    private String surname;

    public int getNumriDiteveTePushimit() {
        return numriDiteveTePushimit;
    }

    public HrResponse(int numriDiteveTePushimit, String name, String surname) {
        this.numriDiteveTePushimit = numriDiteveTePushimit;
        this.name = name;
        this.surname = surname;
    }

    public void setNumriDiteveTePushimit(int numriDiteveTePushimit) {
        this.numriDiteveTePushimit = numriDiteveTePushimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
