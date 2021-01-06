package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {
    private List<Photo> photos = new ArrayList<>();

    public List<Photo> getPhotos() {
        return photos;
    }

    public void addPhoto(String... photoNames){
        for(String photoName : photoNames){
            photos.add(new Photo(photoName));
        }
    }

    public int numberOfStars(){
        int sum = 0;
        for(Photo photo : photos){
            sum += photo.getQuality().getValue();
        }
        return sum;
    }

}
