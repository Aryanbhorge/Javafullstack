
package javaproject;

public class PlanetWeightCalculator {

    public static void main(String[] args) {
        final double mass = 70.0; 
        String[] planets = {
            "Mercury", "Venus", "Earth", "Moon",
            "Mars", "Jupiter", "Saturn", "Uranus",
            "Neptune", "Pluto"
        };
        double[] gravities = {
            3.7, 8.87, 9.81, 1.62,
            3.71, 24.79, 10.44, 8.69,
            11.15, 0.62
        };
        for (int i = 0; i < planets.length; i++) {
            String planet = planets[i];
            double gravity = gravities[i];

            Runnable task = () -> {
                double weight = mass * gravity;
                System.out.printf("%s: Gravity = %.2f m/s², Weight = %.2f N%n",
                        planet, gravity, weight);
            };

            Thread thread = new Thread(task, planet + "-Thread");
            thread.start();
        }
    }
}
