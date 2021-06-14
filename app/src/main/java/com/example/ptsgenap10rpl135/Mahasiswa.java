package com.example.ptsgenap10rpl135;

public class Mahasiswa {
    private String nama, nohp, email, ttl;
    private Integer myimage;
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Mahasiswa(String nama, String nohp, String email, String ttl, int myimage) {
        this.nama = nama;
        this.nohp = nohp;
        this.email = email;
        this.ttl = ttl;
        this.myimage = myimage;
    }
    public String getTtl() { return ttl; }

    public void setTtl(String ttl) { this.ttl = ttl; }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public Integer getMyimage() { return myimage; }

    public void setMyimage(Integer myimage) { this.myimage = myimage; }
}
