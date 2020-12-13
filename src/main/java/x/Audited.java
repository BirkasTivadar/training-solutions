package x;


import java.time.LocalDateTime;
import java.util.List;

public interface Audited {

    LocalDateTime getCreatedAt();

    static Audited findLastCreated(List<Audited> values){
        Audited last = values.get(0);
        for (Audited audited : values){
            if(audited.getCreatedAt().isAfter(last.getCreatedAt())){
                last = audited;
            }
        }
        return last;
    }
}
