package io.deepdivedylan.springhotornot.entities;

import javax.persistence.*;

@Entity
@Table(name = "captain")
public class Captain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long captainId;
    private String captainName;
    private String captainImage;

    public Long getCaptainId() {
        return captainId;
    }

    public void setCaptainId(Long captainId) {
        this.captainId = captainId;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public String getCaptainImage() {
        return captainImage;
    }

    public void setCaptainImage(String captainImage) {
        this.captainImage = captainImage;
    }
}
