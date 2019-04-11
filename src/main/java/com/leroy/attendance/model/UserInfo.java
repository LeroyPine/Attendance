package com.leroy.attendance.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "profile_photo")
    private String profilePhoto;

    private String phone;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return profile_photo
     */
    public String getProfilePhoto() {
        return profilePhoto;
    }

    /**
     * @param profilePhoto
     */
    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}