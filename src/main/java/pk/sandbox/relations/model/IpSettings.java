package pk.sandbox.relations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IpSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ip = "";
    private String subnetMask = "";
    private String gateway = "";
    private String macId = "";
    private int vlan;

    public IpSettings() {
    }

    public Long getId() {
        return id;
    }

    public IpSettings setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public IpSettings setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public IpSettings setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
        return this;
    }

    public String getGateway() {
        return gateway;
    }

    public IpSettings setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    public String getMacId() {
        return macId;
    }

    public IpSettings setMacId(String macId) {
        this.macId = macId;
        return this;
    }

    public int getVlan() {
        return vlan;
    }

    public IpSettings setVlan(int vlan) {
        this.vlan = vlan;
        return this;
    }
}
