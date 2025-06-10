package ru.courses.geometry;

public class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0;
        double len1, len2;

        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i + 1].x - points[i].x;
            len2 = points[i + 1].y - points[i].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PolyLine other = (PolyLine) obj;

        if (this.points.length != other.points.length) return false;

        for (int i = 0; i < points.length; i++) {
            if (!points[i].equals(other.points[i])) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PolyLine: ");
        for (Point p : points) {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }
}

