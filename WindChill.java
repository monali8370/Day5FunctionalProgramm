package com.Functional;



    public class WindChill {

        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Usage: java WindChill <temperature> <windSpeed>");
                return;
            }

            try {
                double t = Double.parseDouble(args[0]);
                double v = Double.parseDouble(args[1]);

                // Check validity of input values
                if (Math.abs(t) > 50 || v > 120 || v < 3) {
                    System.out.println("Invalid input values. Temperature and wind speed must be within valid ranges.");
                    return;
                }

                // Calculate wind chill using the formula
                double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

                // Print the result
                System.out.println("Wind Chill: " + windChill);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numeric values.");
            }
        }
    }


