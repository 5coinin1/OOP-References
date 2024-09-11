# INFO

![img.png](src/src/resource/img.png)

## Câu 2. (CLO.2,3 – PI1.1,1.2,2.1,2.2 - SO.1,2 ): 7 điểm

> Trong lớp tín hiệu rời rạc, Discrete Signal thực hiện `(“implementation”)` định nghĩa tín hiệu rời rạc như sau:
![img_1.png](src/src/resource/img_1.png)
### Request:
> ![img_2.png](src/src/resource/img_2.png)

### Explain:
Cách hoạt động của công thức:
![image](https://github.com/user-attachments/assets/a95e1540-afca-4eac-bb7b-2db3aee81736)

1.**Mục tiêu của công thức:** Công thức này giúp biểu diễn lại giá trị tín hiệu x(n) dựa trên một chuỗi tín hiệu x(k) tại các thời điểm khác nhau. Nói cách khác, nó cho phép xác định giá trị của x(n) bằng cách sử dụng phép tổng có trọng số với các giá trị x(k) và hàm δ(n−k).
2.**Vai trò của hàm δ(n−k):**
![image](https://github.com/user-attachments/assets/9891a9ed-8323-4cfd-95a8-bb02abca65b9)
Hàm delta rời rạc δ(n−k) có 2 giá trị là 1 hoặc 0
-**δ(n−k)=1** khi **n-k=0** hay **n=k**; khi đó hàm trả về x(n) luôn có giá trị bằng x(k)
-**δ(n−k)=0** khi **n-k≠0** hay **n≠k**; khi đó hàm trả về x(n) luôn có giá trị bằng 0

### Experiment and expected results: 
> ![img.png](src/src/resource/expected.png)
> Results:
> ![img.png](src/src/resource/results.png)
