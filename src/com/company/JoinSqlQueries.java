package com.company;

public class JoinSqlQueries {


  public static void main(String[] args) {
      System.out.println(loans("bosa00001","001","JAMES","RU"));
  }

  public  static String loans(String db,String employerCode ,String member,String loansInService ){
      String sql =null;
      StringBuilder sb = new StringBuilder();
        for (int i=1;i<13;i++){
       sql=   String.format("SELECT * FROM ( SELECT * FROM %s.MEM_STATEMENT"+(i<10?"0"+i:i)+" WHERE Employer_Code='"+employerCode+"' AND Payroll_No='" + member+ "' AND Reference_Code='" + loansInService + "' AND (Loan_Dr <> 0 OR Loan_Cr <> 0 OR ActivityRef = 'B/F'  OR Interest_Dr <> 0 OR Interest_Cr <> 0)  %s  ",db,(i==12?"":"UNION ALL") );
        sb.append(sql);

        }
        return sb.toString();
  }
}

