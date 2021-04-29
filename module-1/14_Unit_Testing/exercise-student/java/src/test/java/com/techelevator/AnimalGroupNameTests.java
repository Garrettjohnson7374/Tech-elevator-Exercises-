package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {
    @Test
    public void getHerd_returns_tower_for_giraffe(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("giraffe");

        Assert.assertEquals("Tower", herd);

    }
    @Test
    public void getHerd_returns_crash_for_rhino(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("rhino");

        Assert.assertEquals("Crash", herd);

    }
    @Test
    public void getHerd_returns_crash_for_rhino_uppercase(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("Rhino");

        Assert.assertEquals("Crash", herd);

    }

    @Test
    public void getHerd_returns_unknown_for_walrus(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("walrus");

        Assert.assertEquals("unknown", herd);

    }

    @Test
    public void getHerd_returns_herd_for_elephant(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("elephant");

        Assert.assertEquals("Herd", herd);

    }
    @Test
    public void getHerd_returns_herd_for_elephants(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("elephants");

        Assert.assertEquals("unknown", herd);

    }

    @Test
    public void getHerd_returns_unknown_for_name_not_found(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("");

        Assert.assertEquals("unknown", herd);

    }
    @Test
    public void getHerd_returns_pride_for_lion(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("lion");

        Assert.assertEquals("Herd", herd);

    }
    @Test
    public void getHerd_returns_murder_for_crow(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("crow");

        Assert.assertEquals("Murder", herd);
    }
@Test
    public void getHerd_returns_kit_for_pigeon(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("pigeon");

        Assert.assertEquals("Kit", herd);
    }
    @Test
    public void getHerd_returns_Pat_for_flamingo(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("flamingo");

        Assert.assertEquals("Pat", herd);
    }
    @Test
    public void getHerd_returns_herd_for_deer(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("deer");

        Assert.assertEquals("Herd", herd);
    }
    @Test
    public void getHerd_returns_pack_for_dog(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("dog");

        Assert.assertEquals("Pack", herd);

    }
    @Test
    public void getHerd_returns_float_for_crocodile(){
        AnimalGroupName sut = new AnimalGroupName();

        String herd = sut.getHerd("crocodile");

        Assert.assertEquals("Float", herd);

    }



}
