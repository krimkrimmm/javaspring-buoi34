//Yêu cầu
//Học viên làm Lab 4 : Đăng ký user trong giáo trình bài học
//Yêu cầu
//Trong Lab này, thay vì fix cứng mảng user như Lab 2. Chúng ta sẽ lưu danh sách user vào trong CSDL
//B1. Tạo Entity User
//Tương tự như Lab 2
//
//Nhưng lưu ý. Đây là Entity để lưu vào database
//B2, B3, B5, B6 tương tự Lab 2
//
//Tạo class Role
//Bỏ trường roles trong Entity User
//
//@Getter
//@Setter
//@NoArgsConstructor

//@AllArgsConstructor
//@Entity
//@Table(name = "role")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//

//    @Column(name = "name")
//    private String name;
//}
//Role.java
//
//Set mối quan hệ giữa User - Role : Many - Many
//
//B4. Tạo class CustomUserDetailsService
//Thay vì tìm kiếm user trong danh sách fix cứng --> Tìm kiếm user trong CSDL (tìm theo email), Yêu cầu

//1. Bổ sung thông tin cho user
//Trong class User ở Lab 3 : Bổ sung thêm trường isEnabled : Boolean
//
//isEnabled = true : User đã active
//isEnabled = false : User chưa active (cần verify thông tin qua Email)
//2. Viết API
//Học viên bổ sung thêm API để đăng ký user POST : /api/v1/auth/register
//
//Thông tin gửi lên gồm:
//
//name
//email (không được trùng nhau)
//password
//Mặc định khi tạo user thì isEnabled = false
//Password cần được mã hóa trước khi lưu vào CSDL (sử dụng Bean PasswordEncoder)-> code with springboot(chia package, class)
package vn.scrip.buoi34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buoi34Application {

	public static void main(String[] args) {
		SpringApplication.run(Buoi34Application.class, args);
	}

}


