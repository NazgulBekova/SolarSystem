package com.syntax;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem factorX=new SolarSystem();
        factorX.sun="1";
        factorX.moon="4";
        factorX.planets="2";
        factorX.star="100";

        //adding features to our sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000";
        Xfact.heat="30215454545";

        //adding the features for star in the solar system
        FeatureStars FacX=new FeatureStars();
        FacX.color="green";
        FacX.radius="24527575753km";
        FacX.size="15465865343412m";

        //adding features for planet1
        Planet1Features GulK=new Planet1Features();
        GulK.color="blue";
        GulK.size="23466545345345";
        GulK.name="preacheX";

    }
}
