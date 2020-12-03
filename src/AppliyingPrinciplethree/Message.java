package AppliyingPrinciplethree;

public class Message implements IMessage {
    MyLanguage myLanguage;
    Message(MyLanguage myLanguage){
        this.myLanguage=myLanguage;
    }

    @Override
    public String sendMsg() {
        return myLanguage.chagetoMylanguge("hai hello");
    }
}
