package org.koffa;

public class IssNow {
    public String name;
    public int id;
    public double latitude;
    public double longitude;
    public double altitude;
    public double velocity;
    public String visibility;
    public double footprint;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getVelocity() {
        return velocity;
    }

    public String getVisibility() {
        return visibility;
    }

    public double getFootprint() {
        return footprint;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public double getDaynum() {
        return daynum;
    }

    public double getSolar_lat() {
        return solar_lat;
    }

    public double getSolar_lon() {
        return solar_lon;
    }

    public String getUnits() {
        return units;
    }

    public int timestamp;
    public double daynum;
    public double solar_lat;
    public double solar_lon;
    public String units;

    @Override
    public String toString() {
        return "IssNow " +
                "\n name='" + name + '\'' +
                "\n id=" + id +
                "\n latitude=" + latitude +
                "\n longitude=" + longitude +
                "\n altitude=" + altitude +
                "\n velocity=" + velocity +
                "\n visibility='" + visibility + '\'' +
                "\n footprint=" + footprint +
                "\n timestamp=" + timestamp +
                "\n daynum=" + daynum +
                "\n solar_lat=" + solar_lat +
                "\n solar_lon=" + solar_lon +
                "\n units='" + units + '\'' +
                '}';
    }
}
