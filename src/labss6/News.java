package labss6;

import java.util.ArrayList;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;

    public News(){

    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public float AverageRate;

    public float getAverageRate() {
        return AverageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void Display(){
        System.out.println(Title+"-"+PublishDate+"-"+Author+"-"+Content+"-"+AverageRate);
    }

    public int [] RateList = new int[3];

    public void Calculate() {
        int S=0;
        for (int i =0;i<3;++i) {
            S+= RateList[i];
        }
        AverageRate= S/3;
        System.out.println("AverageRate :"+AverageRate);
    }
}
