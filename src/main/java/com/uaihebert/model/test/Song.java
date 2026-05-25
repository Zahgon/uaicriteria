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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Song {

    @Id
    private int id;

    private String name;

    private String artist;

    private int length;

    private Long totalDownloads;

    private float weight;

    private double price;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Temporal(TemporalType.DATE)
    private Calendar creationDate;

    @Enumerated(EnumType.STRING)
    private SongType type;

    public Song() {
    }

    public Song(final int id, final Calendar creationDate, final String name, final String artist, final int length, final Long totalDownloads, final float weight, final double price, final Date releaseDate, final SongType type) {
        this.creationDate = creationDate;
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.totalDownloads = totalDownloads;
        this.weight = weight;
        this.price = price;
        this.releaseDate = releaseDate;
        this.type = type;
    }

    public Calendar getCreationDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCreationDate(final Calendar creationDate) {
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

    public String getArtist() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setArtist(final String group) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLength(final int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalDownloads() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTotalDownloads(final Long totalDownloads) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float getWeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWeight(final float weight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPrice(final double price) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getReleaseDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setReleaseDate(final Date releaseDate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SongType getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setType(final SongType type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
