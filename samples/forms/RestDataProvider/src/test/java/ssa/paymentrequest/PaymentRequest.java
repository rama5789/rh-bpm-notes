package ssa.paymentrequest;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PaymentRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "subject")
   private java.lang.String subject;
   @org.kie.api.definition.type.Label(value = "manager approval")
   private java.lang.Boolean managerApproval;
   @org.kie.api.definition.type.Label(value = "colombo approval")
   private java.lang.Boolean colomboApproval;
   @org.kie.api.definition.type.Label(value = "payment type")
   private java.lang.String paymentType;

   public PaymentRequest()
   {
   }

   public java.lang.Boolean getManagerApproval()
   {
      return this.managerApproval;
   }

   public void setManagerApproval(java.lang.Boolean managerApproval)
   {
      this.managerApproval = managerApproval;
   }

   public java.lang.Boolean getColomboApproval()
   {
      return this.colomboApproval;
   }

   public void setColomboApproval(java.lang.Boolean colomboApproval)
   {
      this.colomboApproval = colomboApproval;
   }

   public java.lang.String getPaymentType()
   {
      return this.paymentType;
   }

   public void setPaymentType(java.lang.String paymentType)
   {
      this.paymentType = paymentType;
   }

   public java.lang.String getSubject()
   {
      return this.subject;
   }

   public void setSubject(java.lang.String subject)
   {
      this.subject = subject;
   }

   public PaymentRequest(java.lang.Boolean managerApproval,
         java.lang.Boolean colomboApproval, java.lang.String paymentType,
         java.lang.String subject)
   {
      this.managerApproval = managerApproval;
      this.colomboApproval = colomboApproval;
      this.paymentType = paymentType;
      this.subject = subject;
   }

    public String toString() {
        return managerApproval + ", " + colomboApproval + ", " + paymentType + ", "+ subject;
    }
}