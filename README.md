
## Instancias lanzadas EC2 para math service

<img width="1919" height="1040" alt="image" src="https://github.com/user-attachments/assets/a8bdc629-1a47-499c-9ff5-5992a250f535" />


### Mathservice1
<img width="1713" height="678" alt="image" src="https://github.com/user-attachments/assets/e00af8ed-631f-4056-9449-d2018269b4f6" />


### Mathservice2
<img width="1693" height="683" alt="image" src="https://github.com/user-attachments/assets/e3c62007-47d6-4fa9-b837-6963b48360f3" />


Se comprueba que las dos instancias EC2 para Math Services funcionan correctamente.

<img width="1919" height="1037" alt="image" src="https://github.com/user-attachments/assets/0a963793-9106-4592-8fb8-f5abf3d5d9f3" />


En ambas está corriendo spring boot:

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/459de96d-057a-44bc-8187-a3e890403c4c" />


Se lanza instancia para el proxy:

<img width="1703" height="690" alt="image" src="https://github.com/user-attachments/assets/51f0b74e-ad75-4059-9eb1-4b011ae8db78" />



Primero, se hace prueba local de proxy que funciona correctamente viendo que en consola se está cambiando de servidor math service.

En la siguiente imagen se ve que primero responde el servidor con IP 3.95.64.158:

<img width="1908" height="991" alt="image" src="https://github.com/user-attachments/assets/371f6f73-891c-403b-b0e8-4b53e11fd776" />

Y luego, se realiza otra solicitud viendo que ya es otro servidor el que responde, con IP 3.88.101.229:
<img width="1905" height="983" alt="image" src="https://github.com/user-attachments/assets/5f30d83a-2dd3-4b83-98a3-4db10beb85f4" />


<img width="962" height="190" alt="image" src="https://github.com/user-attachments/assets/01ecb8d4-b061-4a65-abec-b7c8d3ed5fe0" />


## Funcionamiento final ya con las tres instancias EC2


<img width="1677" height="691" alt="image" src="https://github.com/user-attachments/assets/f3db43fd-5eba-449c-ac1d-5d40f59e70c5" />

En la anterior imagen se ve que la IP del proxy es 54.91.124.91.

Se accede a la URL para hacer prueba:

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/2f163dfe-169c-4ec1-bb3b-3b36c266db71" />


<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/2de0e5a0-b756-49e1-b965-140eb287753f" />


<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/93aa79a1-cf72-4892-870c-832e9589f11c" />

Proxy funciona correctamente:

<img width="970" height="158" alt="image" src="https://github.com/user-attachments/assets/657b9665-340f-4b1c-a001-5f62e8f0064f" />



