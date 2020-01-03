import java.lang.reflect.Array;
import java.util.ArrayList;
class Contact {
    public String name;
    public String sdt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Contact(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }

}
public class ContactList {
    ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact(String name, String sdt){
        contacts.add(new Contact(name,sdt));
        System.out.println("Successful Add New Contact");
    }
    public void showContact(){
        for(int i=0;i<contacts.size();i++){
            System.out.println("Contact "+(i+1)+":\nName : "+contacts.get(i).getName()+"\nSDT : "+contacts.get(i).getSdt());
        }
    }
    public void removeContact(int index){
        contacts.remove(index);
        System.out.println("Successful remove Contact: "+(index+1));
    }
    public void updateContact(int index ,String name,String sdt){
      contacts.set(1,new Contact(name,sdt));
        System.out.println("Successful update Contact : "+(index+1));
    }
    public void findContact(String name){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getName().equals(name)){
                System.out.println("\n" +
                        ""+name+" is in the list");

                System.out.println("Information:"+"\nName: "+contacts.get(i).getName()+"\nSdt:"+contacts.get(i).getSdt());
            }
        }
    }
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        contactList.addContact("thang","0973006340");
        contactList.addContact("thang2","0973006342");
        contactList.showContact();
        contactList.removeContact(1);
        contactList.showContact();
        contactList.addContact("thang2","0973006342");
        contactList.showContact();
        contactList.updateContact(1,"thang3","0974848484");
        contactList.showContact();
        contactList.addContact("thang10","0973006342");
        contactList.showContact();
        contactList.findContact("thang11");
    }
}
