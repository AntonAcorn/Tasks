package IoC;

public class Test {
}

interface Music {
    //Code for access to any type of music
}

class ClassicalMusic implements Music{
    //code for access to classical music
}

class RockMusic implements Music{
    //code for access to rock music
}

class MusicPlayer{
    private Music music;

    public MusicPlayer(Music music) {       //THIS IS CALLED INVERSION OF CONTROL, когда зависимость внедряется извне
                                            //
        this.music = music;
    }

    public void playMusic(){
        //no more creating objects
        //but where create objects?
    }
}

class UseMusicPlayer{
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic());
    }
}