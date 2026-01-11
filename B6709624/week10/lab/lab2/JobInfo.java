package oot.b6709624.week10.lab.lab2;


class JobInfo {
  private String position;
  private String department;
  private String password;

  public JobInfo(String position, String department, String password) {
     this.position = position;
     this.department = department;
     this.password = password;
  }

  public String getPosition(){
    return position;
  }

  public String getDepartment(){
    return department;
  }

  public String getPassword(){
    return password;
  }

  public String getMaskedDepartment(){
    String[] part = department.split(" ");
    StringBuilder masked = new StringBuilder();
    for (String parts : part){
      masked.append(parts.charAt(0)).append(". ");
    }

    return masked.toString().trim();
  }
}
