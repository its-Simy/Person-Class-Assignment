public class HiringDate {
    private  int hday;
    private  int hmonth;
    private  int hyear;
    HiringDate(int _day, int _month, int _year){
        this.hday = _day;
        this.hmonth = _month;
        this.hyear = _year;
    }
    HiringDate(HiringDate hD){
        this.hday = hD.hday;
        this.hmonth = hD.hmonth;
        this.hyear = hD.hyear;
    }

    @Override
    public String toString() {
        String hiringDate = this.hmonth + "/"+ this.hday + "/"+ hyear;
        return hiringDate;
    }

    @Override
    protected HiringDate clone() throws CloneNotSupportedException {
        HiringDate obj = new HiringDate(this.hday,this.hmonth,this.hyear);
        return obj;
    }


    public boolean equals(HiringDate obj) {
        return (obj.hday == this.hday &&
                obj.hmonth == this.hmonth &&
                obj.hyear == this.hyear);

    }
}

