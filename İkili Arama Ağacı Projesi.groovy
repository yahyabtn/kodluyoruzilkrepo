İkili Arama Ağacı Projesi
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizininin Binary-Search-Tree aşamalarını yazınız.

Örnek: kök x'dir. root'un sağında bulunur. Solunda z bulunur vb.

Kök 7'dir. 5<7 yönlü 5, root'un soluna gider.

	 7
	/
       5
1<7 1, root'un soluna, 1<5 olduğu için 5'in de soluna gider.

	  7
	 /
        5
       /
      1
8>7 ile 8, root'un sağına gider.

	  7
	 / \
        5   8
       /
      1
3<7 3, kök' 3'ün 5'in de soluna, 3>1 olduğu için de 1'in sağına gider.

	  7
	 / \
        5   8
       /
      1
       \
        3
6<7 6, root' soluna, 6>5 için 5'in sağına gider.

	  7
	 / \
        5   8
       / \
      1   6
       \
        3
0<7 0, root'un 5'in de soluna, 0<1 olduğu için 1'in de soluna gider.

	  7
	 / \
        5   8
       / \
      1   6
     / \
    0   3
9>7 için 9, root'un sağına, 9>8 olduğu için 8'in de sağına gider.

	  7
	 / \
        5   8
       / \   \
      1   6   9 
     / \
    0   3
4<7 4, kök'ün 4, kök'ün 5'in de soluna, 4>1 görünüyor 1'in sağına, 4>3 3'ün de sağına gider.

	  7
	 / \
        5   8
       / \   \
      1   6   9 
     / \
    0   3
         \
          4
2<7 2, kökün soluna, 2<5'in 5'in de soluna, 2>1, 2 1'in sağına<3 3'ün soluna gider.

	  7
	 / \
        5   8
       / \   \
      1   6   9 
     / \
    0   3
       / \
      2   4