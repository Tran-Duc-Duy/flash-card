package org.example.domain;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class FlashCard {
    private final BigInteger id;
    private final String name;
    private final String mean;
    private final String linkImg;
    private final String linkAudio;
    private double timeWait;

    public FlashCard( BigInteger id,
                      String name,
                      String mean,
                      String linkImg,
                      String linkAudio,
                      double timeWait) {
        this.id = id;
        this.name = name;
        this.mean = mean;
        this.linkImg = linkImg;
        this.linkAudio = linkAudio;
        this.timeWait = timeWait;
    }

    public String getName() {
        return name;
    }

    public String getMean() {
        return mean;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public String getLinkAudio() {
        return linkAudio;
    }

    public double getTimeWait() {
        return timeWait;
    }

    public void setTimeWait(double timeWait) {
        this.timeWait = timeWait;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final FlashCard flashCard = (FlashCard) o;
        return Objects.equal(id, flashCard.id) &&
                Objects.equal(name, flashCard.name) &&
                Objects.equal(mean, flashCard.mean) &&
                Objects.equal(linkImg, flashCard.linkImg) &&
                Objects.equal(linkAudio, flashCard.linkAudio) &&
                Objects.equal(timeWait, flashCard.timeWait);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, mean, linkImg, linkAudio, timeWait);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("mean", mean)
                .add("linkImg", linkImg)
                .add("linkAudio", linkAudio)
                .add("timeWait", timeWait)
                .toString();
    }

    /*public static class Parser {
        private static final ObjectMapper mapper = new ObjectMapper();

        static {
            mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            mapper.registerModule(new JavaTimeModule());
            mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            mapper.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
        }

        public static String toJson(FlashCard employee) {
            try {
                final StringWriter writer = new StringWriter();
                mapper.writeValue(writer, employee);
                return writer.toString();
            } catch (IOException exc) {
                throw new RuntimeException(exc);
            }
        }

        public static FlashCard parseJson(String json) {
            try {
                return mapper.readValue(json, FlashCard.class);
            } catch (IOException exc) {
                throw new RuntimeException(exc);
            }
        }
    }*/
}
