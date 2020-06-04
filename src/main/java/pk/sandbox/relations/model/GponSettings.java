package pk.sandbox.relations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GponSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int oltId;
    private int oltPort;
    private int onuId;
    private String ontType;
    private String ontSn;
    private String mngtIp;
    private int tvPort;

    public GponSettings() {
    }

    private GponSettings(GponSettingsBuilder gponSettingsBuilder) {
        this.oltId = gponSettingsBuilder.oltId;
        this.oltPort = gponSettingsBuilder.oltPort;
        this.onuId = gponSettingsBuilder.onuId;
        this.ontType = gponSettingsBuilder.ontType;
        this.ontSn = gponSettingsBuilder.ontSn;
        this.mngtIp = gponSettingsBuilder.mngtIp;
        this.tvPort = gponSettingsBuilder.tvPort;
    }

    public static class GponSettingsBuilder {
        private int oltId;
        private int oltPort;
        private int onuId;
        private String ontType;
        private String ontSn;
        private String mngtIp;
        private int tvPort;

        public GponSettingsBuilder() {
        }

        public GponSettingsBuilder setOltId(int oltId) {
            this.oltId = oltId;
            return this;
        }

        public GponSettingsBuilder setOltPort(int oltPort) {
            this.oltPort = oltPort;
            return this;
        }

        public GponSettingsBuilder setOnuId(int onuId) {
            this.onuId = onuId;
            return this;
        }

        public GponSettingsBuilder setOntType(String ontType) {
            this.ontType = ontType;
            return this;
        }

        public GponSettingsBuilder setOntSn(String ontSn) {
            this.ontSn = ontSn;
            return this;
        }

        public GponSettingsBuilder setMngtIp(String mngtIp) {
            this.mngtIp = mngtIp;
            return this;
        }

        public GponSettingsBuilder setTvPort(int tvPort) {
            this.tvPort = tvPort;
            return this;
        }

        public GponSettings build(){
            return new GponSettings(this);
        }
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOltId() {
        return oltId;
    }

    public void setOltId(int oltId) {
        this.oltId = oltId;
    }

    public int getOltPort() {
        return oltPort;
    }

    public void setOltPort(int oltPort) {
        this.oltPort = oltPort;
    }

    public int getOnuId() {
        return onuId;
    }

    public void setOnuId(int onuId) {
        this.onuId = onuId;
    }

    public String getOntType() {
        return ontType;
    }

    public void setOntType(String ontType) {
        this.ontType = ontType;
    }

    public String getOntSn() {
        return ontSn;
    }

    public void setOntSn(String ontSn) {
        this.ontSn = ontSn;
    }

    public String getMngtIp() {
        return mngtIp;
    }

    public void setMngtIp(String mngtIp) {
        this.mngtIp = mngtIp;
    }

    public int getTvPort() {
        return tvPort;
    }

    public void setTvPort(int tvPort) {
        this.tvPort = tvPort;
    }
}
