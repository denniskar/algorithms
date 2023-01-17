package com.company;

public class JoinSqlQueries {


  public static void main(String[] args) {
      System.out.println(loans("bosa00001","001","JAMES","RU"));
      System.out.println(schemes("3434","bosa002","543","SAMUEL"));
  }

  public  static String loans(String db,String employerCode ,String member,String loansInService ){
      String sql =null;
      StringBuilder sb = new StringBuilder();
        for (int i=1;i<13;i++){
       sql=   String.format(" SELECT * FROM %s.MEM_STATEMENT"+(i<10?"0"+i:i)+" WHERE Employer_Code='"+employerCode+"' AND Payroll_No='" + member+ "' AND Reference_Code='" + loansInService + "' AND (Loan_Dr <> 0 OR Loan_Cr <> 0 OR ActivityRef = 'B/F'  OR Interest_Dr <> 0 OR Interest_Cr <> 0) %s",db,(i==12?")":"UNION ALL"));
        sb.append(sql);

        }

      return  String.format("SELECT * FROM  (%s) A  ORDER BY Document_Date;", sb) ;
  }


  public  static  String  schemes(String  schemeCode, String db , String employerCode, String member){
      String sql= null;
      StringBuilder sb =new StringBuilder();
      for(int i=1;i<13;i++){
   sql= String.format( "SELECT SysCode,Employer_Code,Payroll_No,Document_Number,Document_Date,ActivityRef,Reference_Name,Period,Share_Dr,Share_Cr,Scheme,0 AS Share,0 AS Deposit,SS.SchemeName,IF(TblAdv.Advice IS NULL OR TblAdv.Advice=0,SS.Contribution,TblAdv.Advice) " +
                "AS Contr FROM %s.MEM_STATEMENT"+(i<10?"0"+i:i)+" AS A01 LEFT JOIN Main.SavingSchemes AS SS ON A01.Scheme=SS.SchemeCode LEFT JOIN Main.SharesAdvise AS TblAdv ON A01.Employer_Code=TblAdv.EmployerNo AND A01.Payroll_no=TblAdv.PayrollNo AND A01.Scheme=TblAdv.SchemeCode" +
                " WHERE (Employer_Code='"+employerCode+"' AND Payroll_No='" + member + "') AND (A01.Share_Dr <> 0 or A01.Share_Cr <> 0)  AND SS.IsWelfare = 'N'  " +
                "AND A01.Scheme IN ('" + schemeCode + "') %s ",db,(i==12?"":"UNION ALL"));

        sb.append(sql);
      }
      return  String.format("SELECT * FROM  (%s) AS tblx  ORDER BY Document_Date,SysCode ASC;", sb) ;
  }
}

