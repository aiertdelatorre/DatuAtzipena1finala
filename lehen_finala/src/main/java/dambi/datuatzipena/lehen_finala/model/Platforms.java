package dambi.datuatzipena.lehen_finala.model;

public class Platforms {
    public boolean windows;
    public boolean mac;
    public boolean linux;
    
    public Platforms() {
    }

    public Platforms(boolean windows, boolean mac, boolean linux) {
        this.windows = windows;
        this.mac = mac;
        this.linux = linux;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isMac() {
        return mac;
    }

    public void setMac(boolean mac) {
        this.mac = mac;
    }

    public boolean isLinux() {
        return linux;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }
}
