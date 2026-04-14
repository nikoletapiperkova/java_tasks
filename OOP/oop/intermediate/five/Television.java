package intermediate.five;

public class Television implements RemoteControl {
    private boolean isOn = false;
    private int volume = 10;
    private int currentChannel;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public void adjustVolume(int level) {
        if (isOn) {
            this.volume = level;
        }
    }

    public void changeChannel(int channel) {
        if(isOn){
            this.currentChannel = channel;
        }
    }
}