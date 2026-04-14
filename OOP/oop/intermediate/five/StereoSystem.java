package intermediate.five;

public class StereoSystem implements RemoteControl{
    private boolean isOn;
    private int volume = 0;
    private String currentSong;

    @Override
    public void turnOff(){
        isOn = false;
    }

    @Override
    public void turnOn(){
        isOn = true;
    }

    @Override
    public void adjustVolume(int level) {
        this.volume = level;
    }

    public void selectSong(String songName){
        if(isOn){
            System.out.println("Selecting song: " + songName);
            this.currentSong = songName;
        }
    }
}
