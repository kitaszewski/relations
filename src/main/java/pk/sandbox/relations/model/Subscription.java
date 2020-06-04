package pk.sandbox.relations.model;

import javax.persistence.*;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String speed;
    private boolean publicIp;
    private boolean wifi;
    private boolean iptv;
    @OneToOne(cascade = CascadeType.ALL)
    private GponSettings gponSettings;
    @OneToOne(cascade = CascadeType.ALL)
    private IpSettings ipSettings;

    public Subscription() {
    }

    public Subscription(String speed, boolean publicIp, boolean wifi, boolean iptv) {
        this.speed = speed;
        this.publicIp = publicIp;
        this.wifi = wifi;
        this.iptv = iptv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public boolean isPublicIp() {
        return publicIp;
    }

    public void setPublicIp(boolean publicIp) {
        this.publicIp = publicIp;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isIptv() {
        return iptv;
    }

    public void setIptv(boolean iptv) {
        this.iptv = iptv;
    }

    public GponSettings getGponSettings() {
        return gponSettings;
    }

    public void setGponSettings(GponSettings gponSettings) {
        this.gponSettings = gponSettings;
    }

    public IpSettings getIpSettings() {
        return ipSettings;
    }

    public Subscription setIpSettings(IpSettings ipSettings) {
        this.ipSettings = ipSettings;
        return this;
    }
}
