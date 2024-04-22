select user_id, product_id
   from(
   SELECT USER_ID, PRODUCT_ID
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID
    HAVING COUNT(*) > 1
       ) AS repeated_sales
    ORDER BY user_id ASC, product_id DESC;