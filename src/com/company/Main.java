package com.company;


    public class Main {
        public static void main(String[] args) {
            //write your code here
            SolarSystem FactorX = new SolarSystem();
            FactorX.Sun = "1";
            FactorX.Moon = "4";
            FactorX.Planet = "2";
            FactorX.Star= "10000";

            //adding features to our sun
            FeatureSun Xfact = new FeatureSun();
            Xfact.color="green";
            Xfact.radius="1000000000km";
            Xfact.heat="3093244934898kj";

            //adding the features for stars in the solar system
            FeatureStars FacX=new FeatureStars();
            FacX.color="green";
            FacX.radius="73654789866km";
            FacX.size="9999999999999m";

            //adding the features for Planet2
            Planet2 Olso=new Planet2();
            Olso.color="pink";
            Olso.size="696855km";
            Olso.name="Ozhan";

        }
    }

