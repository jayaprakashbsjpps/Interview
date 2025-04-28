//package com.jayaprakash.instabyte100;
//
//@RestController(url="/api/{v1}")
//public class Cognizant8 {
//
//    @Autowired
//    CustomerService customerService;
//
//    @CircuitBreaker(service="cust-service",fallback="custUnavailable")
//    public void redirectService{
//
//
//    }
//
//   public  Cognizant8(CustomerService customerService) {
//
//       this.customerService = customerService;
//    }
//
//}
//
//@Service
//class CustomerService {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    public  CustomerService(CustomerRepository customerRepository) {
//
//        this.customerRepository = customerRepository;
//    }
//
//    public List<Customer> createCustomer(Customer customer) {
//
//         customerRepository.createCustomer();
//    }
//}
//
//
//@Entity(table="") {
//
//
//}
//
//@Repository
//interface CustomerRepository implements CrudRepository<Customer> {
//
//      List<Customer> createCustomer(Customer customer);
//      List<Customer> updateCustomer(int id);
//      void deleteCustoemr(int id);
//      List<Customer> findAllUsers();
//}
//
//application.properties
//    JDBC-properties:
//
//    rateLimiter:50
