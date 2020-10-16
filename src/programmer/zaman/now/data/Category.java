package programmer.zaman.now.data;

public class Category {

  private String id;

  private boolean expensive;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    if(id != null){
      this.id = id;
    }
  }

  public boolean isExpensive() {
    return expensive;
  }

  public void setExpensive(boolean expensive) {
    this.expensive = expensive;
  }
}
