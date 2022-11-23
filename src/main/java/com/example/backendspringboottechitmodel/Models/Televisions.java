package com.example.backendspringboottechitmodel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "televisions")
public class Televisions {

        @Id
        @GeneratedValue
        public int id;
        public String name;
        public String brand;
        public int price;
        public int availableSize;
        public double refreshRate;
        public double screenType;
        public double screenQuality;
        public boolean smartTv;
         public boolean wifi;
        public boolean speech;
        public boolean HDR;
        public boolean bluetooth;
        public boolean ambiLight;
        public int originalStock;
        public int sold;

    @Override
    public String toString() {
        return "Televisions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", availableSize=" + availableSize +
                ", refreshRate=" + refreshRate +
                ", screenType=" + screenType +
                ", screenQuality=" + screenQuality +
                ", smartTv=" + smartTv +
                ", wifi=" + wifi +
                ", speech=" + speech +
                ", HDR=" + HDR +
                ", bluetooth=" + bluetooth +
                ", ambiLight=" + ambiLight +
                ", originalStock=" + originalStock +
                ", sold=" + sold +
                '}';
    }

    public Televisions() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(int availableSize) {
        this.availableSize = availableSize;
    }

    public double getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public double getScreenType() {
        return screenType;
    }

    public void setScreenType(double screenType) {
        this.screenType = screenType;
    }

    public double getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(double screenQuality) {
        this.screenQuality = screenQuality;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isSpeech() {
        return speech;
    }

    public void setSpeech(boolean speech) {
        this.speech = speech;
    }

    public boolean isHDR() {
        return HDR;
    }

    public void setHDR(boolean HDR) {
        this.HDR = HDR;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isAmbiLight() {
        return ambiLight;
    }

    public void setAmbiLight(boolean ambiLight) {
        this.ambiLight = ambiLight;
    }

    public int getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(int originalStock) {
        this.originalStock = originalStock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
