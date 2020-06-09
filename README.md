# Втора лабораториска вежба по софтверско инженерство
### Ана Браво, бр. на индекс 171153
###### Група на код: 4
###### Control Flow Graph
![GitHub Slika](https://github.com/BravoAna19/SI_lab2_171153/blob/slika/slika.png)
###### Цикломатска комплексност
Цикломатската комплексност на овој код е 9. Формулата за пресметување е E-N+2, каде Е е број на ребра, а N е број на темиња.
###### Тест случаи според критериумот Every branch
1. A, B, C - D

2. A, B, C - R

3. D-E, F, G

4. D - R

5. E, F, G -H, I.1

6. E, F, G - R

7. H,  I.1 - I.2

8. I.2 - J

9. J - K

10. J - L

11. K - L

12. L - M

13. L - N

14. M -N

15. N - O

16. N - I.3

17. O - I.3

18. I.3 - I.2

19. I.2 - P

20. P - Q

21. Q - S

22. P - R

23. R - S

Опфатени се сите ребра во графот.

###### Тест случаи според критериумот Every path
1. A, B C, R, S

2. A, B, C, D, R, S

3. A, B, C, D, E, F, G, R , S

4. A, B, C, D, E, F, G, H, I-1, I-2, P, R, S

5. A, B, C, D, E, F, G, H, I-1, I-2, J, K, L, M, N, O, I-3, P, Q

6.  A, B, C, D, E, F, G, H, I-1, I-2, J, L, N, I-3, P, R, S

7. A, B, C, D, E, F, G, H, I-1, I-2, J, K, L, N, I-3, P, R, S

8. A, B, C, D, E, F, G, H, I-1, I-2, J, K, L, M, N, I-3, P, R, S

9. A, B, C, D, E, F, G, H, I-1, I-2, J, K,  L, N, O, I-3, P, R, S

10. A, B, C, D, E, F, G, H, I-1, I-2, J, L, M,  N, I-3, P, R, S

11. A, B, C, D, E, F, G, H, I-1, I-2, J, L, M, N, O, I-3, P, R, S

12. A, B, C, D, E, F, G, H, I-1, I-2, J, L, N, O, I-3, P, R, S

Опфатени се сите можни патишта, за секој услов во графот.
