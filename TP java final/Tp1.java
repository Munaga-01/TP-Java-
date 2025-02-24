 // Classe représentant une institution
class Institution {
    private String nomInstitution;
    private String paysInstutition;
    private String typInstutition;
    private int creationYear;

    // Constructeur
    public Institution(String nomInstutition,String paysInstutition, String typInstutition, int creationYear) {
        this.nomInstitution = nomInstutition;
        this.paysInstutition=paysInstutition;
        this.typInstutition=typInstutition;
        this.creationYear = creationYear;
    }
    // getters and setters for all atributes
    public String getNomInstutition() { // getter
        return nomInstitution;
    }
    public void setNomInstutition(String nomInstutition) {  // setter
        this.nomInstitution= nomInstitution; 
    }
    public int getCreationYear() {
        return creationYear;
    }
    public void setCreationYear(int creationYear){
        this.creationYear= creationYear;
    }

    public String getPaysInstitution (){
        return paysInstutition;
    }
    public void setPaysInstutition (String paysInstutition){
        this.paysInstutition =paysInstutition;
    }

    public String getTypInstutition(){
        return typInstutition;
    }
    public void setTypInstutition(String typInstutition){
        this.typInstutition = typInstutition;
    }
    // methode permettant de savoir l'age de l'instituttion
    public int ageInstitution (int creationYear){
        return 2025-creationYear;
    }

    // Méthode pour afficher les détails de l'institution
    public void InfoInstitution(String nomInstitution, int creationYear , String typInstitution) {
       System.out.println("le nom de l'Insitution est  "+nomInstitution);
       System.out.println("type institution  "+typInstitution);
       System.out.println("age de l'institution :"+ageInstitution(creationYear));
    }
}

// Classe représentant une université qui hérite de la classe Institution
class Universite extends Institution {
    private int nombreFaculte;
    private String systeme; // LMD ou Classique
    private String nomRecteur;

    // Constructeur
    public Universite(String nomInstitution,String paysInstutition, String typInstutition, int creationYear, 
    int nombreFaculte, String systeme,String nomRecteur) {
        super(nomInstitution,paysInstutition,typInstutition, creationYear);
        this.nombreFaculte = nombreFaculte;
        this.systeme = systeme;
        this.nomRecteur = nomRecteur;
    }

    // creation des accesseurs et mutateurs
    public int getNombreFaculte() {
        return nombreFaculte;
    }
    public void setNombreFaculte(int nombreFaculte){
        this.nombreFaculte = nombreFaculte;
    }

    public String  getSysteme (){
        return systeme;
    }
    public void setSysteme(String systeme){
        this.systeme=systeme;
    }

    public String getNomRecteur(){
        return nomRecteur;
    }
    public void setNomRecteur(String nomRecteur){
        this.nomRecteur= nomRecteur;
    }
    // Méthode pour afficher les détails de l'université
    @Override
    public void InfoInstitution(String nomInstitution, int creationYear , String typInstitution) {
        super.InfoInstitution(nomInstitution,creationYear ,typInstitution);
        System.out.println("Nombre de facultes: " + nombreFaculte);
        System.out.println("fonctionnement dans le systeme  "+systeme);
        System.out.println("le nom du recteur est "+nomRecteur);
    }
}

// Classe représentant une école qui hérite de la classe Institution
class School extends Institution {
    private String type; // Primaire ou Secondaire
    private int numberOfClasses;
    private String promoterName; // Nom du promoteur

    // Constructeur
    public School(String nomInstitution,String paysInstutition, String typInstitution, int creationYear, String type, int numberOfClasses, String promoterName) {
        super(nomInstitution,paysInstutition,typInstitution,creationYear);
        this.type = type;
        this.numberOfClasses = numberOfClasses;
        this.promoterName = promoterName;
    }

    // les getters et les setters
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type= type;
    }

    
    public int getNumberOfClasses() {
        return numberOfClasses;
    }
    public void setNumberOfClassses( int numberOfClasses){
        this.numberOfClasses= numberOfClasses;
    }

   
    public String getPromoterName() {
        return promoterName;
    }
    public void setPromoterName(String promoterName){
        this.promoterName= promoterName;
    }
    // Méthode pour afficher les détails de l'école, polymorphisme dynamique
    @Override
    public void InfoInstitution(String nomInstitution, int creationYear , String typInstitution) {
        super.InfoInstitution(nomInstitution,creationYear ,typInstitution);
        System.out.println("Type: " + type + ", Nombre de classes: " + numberOfClasses + ", Nom du promoteur: " + promoterName);
    }
}

// Exemple d'utilisation
public class Main {
    public static void main(String[] args) {
       Institution institution1 = new Institution("Microsoft", "USA", "education", 1990);
       institution1.InfoInstitution(institution1.getNomInstutition(), institution1.getCreationYear(),institution1.getTypInstutition());
       System.out.println("                                                                 ");
       Universite universite1 = new Universite("ULPGL", "RDC","Educatif", 1984, 10, "LMD", "Dr  WASSO");
       universite1.InfoInstitution("ULPGL", 1984,"educatif");
       System.out.println("                                                       ");
       School ecole1 = new School("kauta", "DRC", "educatif", 2000, "primaire", 20, "Amedeo");
       ecole1.InfoInstitution("Kauta", 2000, "educatif");
       System.out.println("                   ");
       School ecole2 = new School("Bakanja", "DRC", "educatif", 2004, "secondaire", 30, "Saint Paul");
       System.out.println("           ");
       School ecole3 = new School("ITIG", "DRC", "educatif", 1960, "secondaire", 30, "Nivard");
       System.out.println("       ");
       Universite universite2 = new Universite("UNH", "RDC","Educatif", 2005, 5, "LMD", "Dr  Kapend");
       // les promoteurs des 3 ecoles crees
       System.out.println("le promoteur de "+ecole1.getNomInstutition()+" est "+ ecole1.getPromoterName());
       System.out.println("le promoteur de "+ecole2.getNomInstutition()+" est "+ ecole2.getPromoterName());
       System.out.println("le promoteur de "+ecole3.getNomInstutition()+" est "+ ecole3.getPromoterName());
       System.out.println("         ");

    //    les recteurs de deux universites deja crees
    System.out.println("le recteur de l'"+universite1.getNomInstutition()+" est "+universite1.getNomRecteur());
    System.out.println("le recteur de l'"+universite2.getNomInstutition()+" est "+universite2.getNomRecteur());
    System.out.println("          ");
    System.out.println("MERCI BEAUCOUP POUR VOTRE ATTENTION");
    System.out.println("code signé Sam MUNAGA");
    }
}
