import models.Pedido;
import models.PedidoLinea;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //INSERT
 Pedido pedido = new Pedido("cliente2@gmail.com",LocalDate.now(),"pendiente");




 Session session = HibernateUtil.getSessionFactory().openSession();
     Transaction tx = session.beginTransaction();
     session.persist(pedido);
     tx.commit();
     System.out.println("Pedido creado perfectamente");
     session.close();
     HibernateUtil.shutdown();




  //READ
  //UPDATE
  //DELETE
}
