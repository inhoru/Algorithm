select user_id, product_id
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID
    HAVING COUNT(*) > 1
    order by user_id asc, product_id desc;