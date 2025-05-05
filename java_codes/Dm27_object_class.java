class Laptop
{
    String name;
    int model;
    public String toString()
    {
      return name + " :" + model;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + model;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (model != other.model)
            return false;
        return true;
    }


}




public class Dm27_object_class{

    public static void main(String[] args) 
    {
        Laptop obj = new Laptop();
       obj.name = "Hp pavillion";
       obj.model= 235;
       System.out.println(obj);
        
    }

}