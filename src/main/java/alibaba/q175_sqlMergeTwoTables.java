package alibaba;
//+-------------+---------+
//| 列名         | 类型     |
//+-------------+---------+
//| PersonId    | int     |
//| FirstName   | varchar |
//| LastName    | varchar |
//+-------------+---------+
//PersonId 是上表主键
//
//+-------------+---------+
//| 列名         | 类型    |
//+-------------+---------+
//| AddressId   | int     |
//| PersonId    | int     |
//| City        | varchar |
//| State       | varchar |
//+-------------+---------+
//AddressId 是上表主键
public class q175_sqlMergeTwoTables {
/*
    select FirstName, LastName, City, State
    from Person left join Address
    on Person.PersonId = Address.PersonId
*/
}
