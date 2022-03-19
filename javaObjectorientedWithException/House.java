public class House {
    private int mls;
    private int bedrooms;
    private double price;
    private String seller;
    public House(int mls, int bedrooms, double price, String seller) throws HouseException {
        setMls(mls);
        setBedrooms(bedrooms);
        setPrice(price);
        setSeller(seller);
    }

    //set method
    public void setMls(int mls) throws HouseException {
        if (mls >= 10001 && mls <= 99999) {
            this.mls = mls;
        } else {
            HouseException me = new HouseException();
            me.setMessage("Program terminated!!\n mls value should be between 10001 and 99999 ");
            throw (me);
        }
    }

    public void setBedrooms(int bedrooms) throws HouseException {
        if (bedrooms >= 0 && bedrooms < 6) {
            this.bedrooms = bedrooms;
        } else {
            HouseException me = new HouseException();
            me.setMessage("Program terminated!! \n bedroom value should be between 0 and 5  ");
            throw (me);
        }
    }

    public void setPrice(double price) throws HouseException {
        if (price >= 0 && price <= 1000000) {
            this.price = price;
        } else {
            HouseException me = new HouseException();
            me.setMessage("Program terminated!!\nPrice value should be between 0 and 1000000 ");
            throw (me);
        }
    }

    public void setSeller(String seller) throws HouseException {
        seller = seller.trim();
        if (seller.length() >= 2) {
            //seller.substring(seller.length() - 2);
            this.seller = seller;
        } else {
            HouseException me = new HouseException();
            me.setMessage("Program terminated!!\nSeller name is  WRONG");
            throw (me);
        }
    }


    // get method
    public int getMls() {
        return this.mls;
    }


    public int getBedrooms() {
        return this.bedrooms;
    }

    public double getPrice() {
        return this.price;
    }

    public String getSeller() {
        return this.seller;

    }

    // to String
    public String toString() {
        String temp = "Mls: " + mls + "\nBedrooms: " + bedrooms +
                "\nPrice: $" + String.format("%,.2f", price) + "\nSeller: " + seller;
        return temp;
    }
}
