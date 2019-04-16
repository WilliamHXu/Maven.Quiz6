package rocks.zipcode.io.objectorientation;

public class Television {
    private TVChannel tvChannel;
    private Boolean on;

    public Television(TVChannel tvChannel) {
        this.tvChannel = tvChannel;
        on = false;
    }

    public Television() {
        this(null);
    }

    public void turnOn() {
        on = true;
    }

    public void setChannel(Integer channel) {
        if (on) {
            tvChannel = TVChannel.getByOrdinal(channel);
        }
        else throw new IllegalStateException();
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
