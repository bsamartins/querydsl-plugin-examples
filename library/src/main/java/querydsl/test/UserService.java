package querydsl.test;

import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;

public class UserService {

  private EntityManager em;

  public User findById(int id) {
    QUser user = QUser.user;
    return new JPAQuery<Void>(em)
      .select(user)
      .from(user)
      .where(user.id.eq(id))
      .fetchOne();
//    return null;
  }

}
