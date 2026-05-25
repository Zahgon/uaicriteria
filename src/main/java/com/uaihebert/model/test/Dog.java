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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Dog {

    @Id
    private int id;

    private String name;

    private double weight;

    private float hairSize;

    private long fleasTotal;

    private int toysTotal;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfFirstPuppyBirth;

    @ManyToOne
    private Person person;

    public Dog() {
    }

    public Dog(final int id, final String name, final double weight, final Date dateOfBirth, final float hairSize, final long fleasTotal, final int toysTotal) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.hairSize = hairSize;
        this.fleasTotal = fleasTotal;
        this.toysTotal = toysTotal;
    }

    public static void main(final String[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
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

    public double getWeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWeight(final double weight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getDateOfBirth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDateOfBirth(final Date dateOfBirth) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Person getPerson() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPerson(final Person person) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getDateOfFirstPuppyBirth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDateOfFirstPuppyBirth(final Date dateOfFirstPuppyBirth) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float getHairSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHairSize(final float hairSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long getFleasTotal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFleasTotal(final long fleasTotal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getToysTotal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setToysTotal(final int toysTotal) {
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
}
