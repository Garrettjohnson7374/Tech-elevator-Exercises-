package com.techelevator;

public class Television {
    private boolean on;
    private int currentChannel;
    private int currentVolume;
    public Television(){
        on = false;
        currentChannel = 3;
        currentVolume = 2;
    }
    public boolean isOn(){
        return on;
    }
    public int getCurrentChannel(){
        return currentChannel;
    }
        public int getCurrentVolume(){
        return currentVolume;
    }
    public void turnOff(){
        on = false;
    }
    public void turnOn(){
        on = true;
    }
    public void changeChannel(int newChannel)
    {
        if ((on) && (currentChannel >= 3) && (currentChannel <= 18))
        { currentChannel = newChannel;
        }
    }
    public void channelUp()
    {
        if (on)
        {
            if (currentChannel == 18)
            {
                currentChannel = 3; }
            else
                {
                currentChannel += 1; }
        }
    }
    public void channelDown()
    {
        if (on)
        {
            if (currentChannel == 3)
            {
                currentChannel = 18;}
            else
            {
                currentChannel -= 1;}
        }
    }
    public void raiseVolume()
    {
        if (on && (currentVolume < 10))
        {
            currentVolume += 1;
        }
    }
    public void lowerVolume()
    {
        if (on && (currentVolume > 0)) {
            currentVolume -= 1;
        }

    }
}
