package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private String title;
    private String content;
    private Integer likes;

    private List<comentarios> coments = new ArrayList<>();

    public post() {
    }

    public post(Date momento, String title, String content, Integer likes) {
        this.momento = momento;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<comentarios> getComents() {
        return coments;
    }

    public void addCometarios(comentarios comentarios) {
        coments.add(comentarios);
    }

    public void removeCometarios(comentarios comentarios) {
        coments.remove(comentarios);
    }

    //novo modelo toString->(StringBuilder)
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n");
        sb.append(likes);
        sb.append("- likes -");
        sb.append(sdf.format(momento) + "\n");
        sb.append(content + "\n");
        sb.append("comentarios:\n");
        for (comentarios c : coments) {
            sb.append(c.getTexto()+"\n");
        }
        return sb.toString();
    }

}
