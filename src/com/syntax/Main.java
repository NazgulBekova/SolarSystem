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
    }
}
