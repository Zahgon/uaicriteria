/*
 * Copyright 2012 uaiHebert Solucoes em Informatica
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package com.uaihebert.model.test;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Person {

    @Id
    private int id;

    private String name;

    private String nickName;

    private Integer clothesInCloset;

    private Integer shoesInCloset;

    private Long totalBooksOwned;

    private Long socialSecurityNumber;

    private boolean brazilian;

    private boolean japanese;

    private float weight;

    private float weightB;

    private double height;

    private double heightB;

    private BigDecimal justBigDecimalA;

    private BigDecimal justBigDecimalB;

    @Temporal(TemporalType.DATE)
    private Date firstJobDate;

    @Temporal(TemporalType.DATE)
    private Date firstSoccerMatchDate;

    @Temporal(TemporalType.DATE)
    private Calendar birthDayDate;

    @Temporal(TemporalType.DATE)
    private Calendar firstKissDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Car car;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Dog> dogs;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Set<Certification> certifications;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Collection<Cat> cats;

    public Person() {
    }

    public Person(final int id, final String name, final String nickName, final Integer clothesInCloset, final Calendar birthDayDate, final Calendar firstKissDate, final float weight, final double height, final Long socialSecurityNumber, final Integer shoesInCloset, final Long totalBooksOwned, final Date firstJobDate, final Date firstSoccerMatchDate, final boolean brazilian, final boolean japanese, final double heightB, final float weightB, final BigDecimal justBigDecimalA, final BigDecimal justBigDecimalB) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.clothesInCloset = clothesInCloset;
        this.birthDayDate = birthDayDate;
        this.firstKissDate = firstKissDate;
        this.weight = weight;
        this.height = height;
        this.socialSecurityNumber = socialSecurityNumber;
        this.shoesInCloset = shoesInCloset;
        this.totalBooksOwned = totalBooksOwned;
        this.firstJobDate = firstJobDate;
        this.firstSoccerMatchDate = firstSoccerMatchDate;
        this.brazilian = brazilian;
        this.japanese = japanese;
        this.heightB = heightB;
        this.weightB = weightB;
        this.justBigDecimalA = justBigDecimalA;
        this.justBigDecimalB = justBigDecimalB;
    }

    public int getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(final int id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getNickName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNickName(final String nickName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getClothesInCloset() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setClothesInCloset(final Integer clothesInCloset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Calendar getBirthDayDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBirthDayDate(final Calendar birthDayDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Calendar getFirstKissDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFirstKissDate(final Calendar firstKissDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float getWeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWeight(final float weight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getHeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHeight(final double height) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getSocialSecurityNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSocialSecurityNumber(final Long socialSecurityNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getShoesInCloset() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setShoesInCloset(final Integer shoesInCloset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalBooksOwned() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTotalBooksOwned(final Long totalBooksOwned) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getFirstJobDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFirstJobDate(final Date firstJobDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getFirstSoccerMatchDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFirstSoccerMatchDate(final Date firstSoccerMatchDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isBrazilian() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBrazilian(final boolean brazilian) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isJapanese() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setJapanese(final boolean japanese) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Address getAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAddress(final Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Car getCar() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCar(final Car car) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Dog> getDogs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDogs(final List<Dog> dogs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Certification> getCertifications() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCertifications(final Set<Certification> certifications) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Cat> getCats() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCats(final Collection<Cat> cats) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getHeightB() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHeightB(final double heightB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float getWeightB() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWeightB(final float weightB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
