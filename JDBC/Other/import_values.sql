-- Departments

INSERT INTO departments VALUES
  ( 10
    , 'Administration'
    , 1700
  );

INSERT INTO departments VALUES
  ( 20
    , 'Marketing'
    , 1800
  );

INSERT INTO departments VALUES
  ( 30
    , 'Purchasing'
    , 1700
  );

INSERT INTO departments VALUES
  ( 40
    , 'Human Resources'
    , 2400
  );

INSERT INTO departments VALUES
  ( 50
    , 'Shipping'
    , 1500
  );

INSERT INTO departments VALUES
  ( 60
    , 'IT'
    , 1400
  );

INSERT INTO departments VALUES
  ( 70
    , 'Public Relations'
    , 2700
  );

INSERT INTO departments VALUES
  ( 80
    , 'Sales'
    , 2500
  );

INSERT INTO departments VALUES
  ( 90
    , 'Executive'
    , 1700
  );

INSERT INTO departments VALUES
  ( 100
    , 'Finance'
    , 1700
  );

INSERT INTO departments VALUES
  ( 110
    , 'Accounting'
    , 1700
  );

INSERT INTO departments VALUES
  ( 120
    , 'Treasury'
    , 1700
  );

INSERT INTO departments VALUES
  ( 130
    , 'Corporate Tax'
    , 1700
  );

INSERT INTO departments VALUES
  ( 140
    , 'Control And Credit'
    , 1700
  );

INSERT INTO departments VALUES
  ( 150
    , 'Shareholder Services'
    , 1700
  );

INSERT INTO departments VALUES
  ( 160
    , 'Benefits'
    , 1700
  );

INSERT INTO departments VALUES
  ( 170
    , 'Manufacturing'
    , 1700
  );

INSERT INTO departments VALUES
  ( 180
    , 'Construction'
    , 1700
  );

INSERT INTO departments VALUES
  ( 190
    , 'Contracting'
    , 1700
  );

INSERT INTO departments VALUES
  ( 200
    , 'Operations'
    , 1700
  );

INSERT INTO departments VALUES
  ( 210
    , 'IT Support'
    , 1700
  );

INSERT INTO departments VALUES
  ( 220
    , 'NOC'
    , 1700
  );

INSERT INTO departments VALUES
  ( 230
    , 'IT Helpdesk'
    , 1700
  );

INSERT INTO departments VALUES
  ( 240
    , 'Government Sales'
    , 1700
  );

INSERT INTO departments VALUES
  ( 250
    , 'Retail Sales'
    , 1700
  );

INSERT INTO departments VALUES
  ( 260
    , 'Recruiting'
    , 1700
  );

INSERT INTO departments VALUES
  ( 270
    , 'Payroll'
    , 1700
  );

-- JOBS

INSERT INTO jobs VALUES
  ( 'AD_PRES'
    , 'President'
    , 20000
    , 40000
  );
INSERT INTO jobs VALUES
  ( 'AD_VP'
    , 'Administration Vice President'
    , 15000
    , 30000
  );

INSERT INTO jobs VALUES
  ( 'AD_ASST'
    , 'Administration Assistant'
    , 3000
    , 6000
  );

INSERT INTO jobs VALUES
  ( 'FI_MGR'
    , 'Finance Manager'
    , 8200
    , 16000
  );

INSERT INTO jobs VALUES
  ( 'FI_ACCOUNT'
    , 'Accountant'
    , 4200
    , 9000
  );

INSERT INTO jobs VALUES
  ( 'AC_MGR'
    , 'Accounting Manager'
    , 8200
    , 16000
  );

INSERT INTO jobs VALUES
  ( 'AC_ACCOUNT'
    , 'Public Accountant'
    , 4200
    , 9000
  );
INSERT INTO jobs VALUES
  ( 'SA_MAN'
    , 'Sales Manager'
    , 10000
    , 20000
  );

INSERT INTO jobs VALUES
  ( 'SA_REP'
    , 'Sales Representative'
    , 6000
    , 12000
  );

INSERT INTO jobs VALUES
  ( 'PU_MAN'
    , 'Purchasing Manager'
    , 8000
    , 15000
  );

INSERT INTO jobs VALUES
  ( 'PU_CLERK'
    , 'Purchasing Clerk'
    , 2500
    , 5500
  );

INSERT INTO jobs VALUES
  ( 'ST_MAN'
    , 'Stock Manager'
    , 5500
    , 8500
  );
INSERT INTO jobs VALUES
  ( 'ST_CLERK'
    , 'Stock Clerk'
    , 2000
    , 5000
  );

INSERT INTO jobs VALUES
  ( 'SH_CLERK'
    , 'Shipping Clerk'
    , 2500
    , 5500
  );

INSERT INTO jobs VALUES
  ( 'IT_PROG'
    , 'Programmer'
    , 4000
    , 10000
  );

INSERT INTO jobs VALUES
  ( 'MK_MAN'
    , 'Marketing Manager'
    , 9000
    , 15000
  );

INSERT INTO jobs VALUES
  ( 'MK_REP'
    , 'Marketing Representative'
    , 4000
    , 9000
  );

INSERT INTO jobs VALUES
  ( 'HR_REP'
    , 'Human Resources Representative'
    , 4000
    , 9000
  );

INSERT INTO jobs VALUES
  ( 'PR_REP'
    , 'Public Relations Representative'
    , 4500
    , 10500
  );

-- Employees
INSERT INTO employees VALUES
  ( 100
    , 'Steven'
    , 'King'
    , 'SKING'
    , '515.123.4567'
    , TO_DATE('17-06-1987', 'DD-MM-YYYY')
    , 'AD_PRES'
    , 24000
    , NULL
    , NULL
    , 90
  );

INSERT INTO employees VALUES
  ( 101
    , 'Neena'
    , 'Kochhar'
    , 'NKOCHHAR'
    , '515.123.4568'
    , TO_DATE('21-09-1989', 'DD-MM-YYYY')
    , 'AD_VP'
    , 17000
    , NULL
    , 100
    , 90
  );

INSERT INTO employees VALUES
  ( 102
    , 'Lex'
    , 'De Haan'
    , 'LDEHAAN'
    , '515.123.4569'
    , TO_DATE('13-01-1993', 'DD-MM-YYYY')
    , 'AD_VP'
    , 17000
    , NULL
    , 100
    , 90
  );

INSERT INTO employees VALUES
  ( 103
    , 'Alexander'
    , 'Hunold'
    , 'AHUNOLD'
    , '590.423.4567'
    , TO_DATE('03-01-1990', 'DD-MM-YYYY')
    , 'IT_PROG'
    , 9000
    , NULL
    , 102
    , 60
  );

INSERT INTO employees VALUES
  ( 104
    , 'Bruce'
    , 'Ernst'
    , 'BERNST'
    , '590.423.4568'
    , TO_DATE('21-05-1991', 'DD-MM-YYYY')
    , 'IT_PROG'
    , 6000
    , NULL
    , 103
    , 60
  );

INSERT INTO employees VALUES
  ( 105
    , 'David'
    , 'Austin'
    , 'DAUSTIN'
    , '590.423.4569'
    , TO_DATE('25-06-1997', 'DD-MM-YYYY')
    , 'IT_PROG'
    , 4800
    , NULL
    , 103
    , 60
  );
INSERT INTO employees VALUES
  ( 106
    , 'Valli'
    , 'Pataballa'
    , 'VPATABAL'
    , '590.423.4560'
    , TO_DATE('05-02-1998', 'DD-MM-YYYY')
    , 'IT_PROG'
    , 4800
    , NULL
    , 103
    , 60
  );

INSERT INTO employees VALUES
  ( 107
    , 'Diana'
    , 'Lorentz'
    , 'DLORENTZ'
    , '590.423.5567'
    , TO_DATE('07-02-1999', 'DD-MM-YYYY')
    , 'IT_PROG'
    , 4200
    , NULL
    , 103
    , 60
  );

INSERT INTO employees VALUES
  ( 108
    , 'Nancy'
    , 'Greenberg'
    , 'NGREENBE'
    , '515.124.4569'
    , TO_DATE('17-08-1994', 'DD-MM-YYYY')
    , 'FI_MGR'
    , 12000
    , NULL
    , 101
    , 100
  );

INSERT INTO employees VALUES
  ( 109
    , 'Daniel'
    , 'Faviet'
    , 'DFAVIET'
    , '515.124.4169'
    , TO_DATE('16-08-1994', 'DD-MM-YYYY')
    , 'FI_ACCOUNT'
    , 9000
    , NULL
    , 108
    , 100
  );

INSERT INTO employees VALUES
  ( 110
    , 'John'
    , 'Chen'
    , 'JCHEN'
    , '515.124.4269'
    , TO_DATE('28-09-1997', 'DD-MM-YYYY')
    , 'FI_ACCOUNT'
    , 8200
    , NULL
    , 108
    , 100
  );

INSERT INTO employees VALUES
  ( 111
    , 'Ismael'
    , 'Sciarra'
    , 'ISCIARRA'
    , '515.124.4369'
    , TO_DATE('30-09-1997', 'DD-MM-YYYY')
    , 'FI_ACCOUNT'
    , 7700
    , NULL
    , 108
    , 100
  );

INSERT INTO employees VALUES
  ( 112
    , 'Jose Manuel'
    , 'Urman'
    , 'JMURMAN'
    , '515.124.4469'
    , TO_DATE('07-03-1998', 'DD-MM-YYYY')
    , 'FI_ACCOUNT'
    , 7800
    , NULL
    , 108
    , 100
  );

INSERT INTO employees VALUES
  ( 113
    , 'Luis'
    , 'Popp'
    , 'LPOPP'
    , '515.124.4567'
    , TO_DATE('07-12-1999', 'DD-MM-YYYY')
    , 'FI_ACCOUNT'
    , 6900
    , NULL
    , 108
    , 100
  );

INSERT INTO employees VALUES
  ( 114
    , 'Den'
    , 'Raphaely'
    , 'DRAPHEAL'
    , '515.127.4561'
    , TO_DATE('07-12-1994', 'DD-MM-YYYY')
    , 'PU_MAN'
    , 11000
    , NULL
    , 100
    , 30
  );
INSERT INTO employees VALUES
  ( 115
    , 'Alexander'
    , 'Khoo'
    , 'AKHOO'
    , '515.127.4562'
    , TO_DATE('18-05-1995', 'DD-MM-YYYY')
    , 'PU_CLERK'
    , 3100
    , NULL
    , 114
    , 30
  );

INSERT INTO employees VALUES
  ( 116
    , 'Shelli'
    , 'Baida'
    , 'SBAIDA'
    , '515.127.4563'
    , TO_DATE('24-12-1997', 'DD-MM-YYYY')
    , 'PU_CLERK'
    , 2900
    , NULL
    , 114
    , 30
  );

INSERT INTO employees VALUES
  ( 117
    , 'Sigal'
    , 'Tobias'
    , 'STOBIAS'
    , '515.127.4564'
    , TO_DATE('24-07-1997', 'DD-MM-YYYY')
    , 'PU_CLERK'
    , 2800
    , NULL
    , 114
    , 30
  );
INSERT INTO employees VALUES
  ( 118
    , 'Guy'
    , 'Himuro'
    , 'GHIMURO'
    , '515.127.4565'
    , TO_DATE('15-11-1998', 'DD-MM-YYYY')
    , 'PU_CLERK'
    , 2600
    , NULL
    , 114
    , 30
  );

INSERT INTO employees VALUES
  ( 119
    , 'Karen'
    , 'Colmenares'
    , 'KCOLMENA'
    , '515.127.4566'
    , TO_DATE('10-08-1999', 'DD-MM-YYYY')
    , 'PU_CLERK'
    , 2500
    , NULL
    , 114
    , 30
  );

INSERT INTO employees VALUES
  ( 120
    , 'Matthew'
    , 'Weiss'
    , 'MWEISS'
    , '650.123.1234'
    , TO_DATE('18-07-1996', 'DD-MM-YYYY')
    , 'ST_MAN'
    , 8000
    , NULL
    , 100
    , 50
  );
INSERT INTO employees VALUES
  ( 121
    , 'Adam'
    , 'Fripp'
    , 'AFRIPP'
    , '650.123.2234'
    , TO_DATE('10-04-1997', 'DD-MM-YYYY')
    , 'ST_MAN'
    , 8200
    , NULL
    , 100
    , 50
  );

INSERT INTO employees VALUES
  ( 122
    , 'Payam'
    , 'Kaufling'
    , 'PKAUFLIN'
    , '650.123.3234'
    , TO_DATE('01-05-1995', 'DD-MM-YYYY')
    , 'ST_MAN'
    , 7900
    , NULL
    , 100
    , 50
  );

INSERT INTO employees VALUES
  ( 123
    , 'Shanta'
    , 'Vollman'
    , 'SVOLLMAN'
    , '650.123.4234'
    , TO_DATE('10-10-1997', 'DD-MM-YYYY')
    , 'ST_MAN'
    , 6500
    , NULL
    , 100
    , 50
  );
INSERT INTO employees VALUES
  ( 124
    , 'Kevin'
    , 'Mourgos'
    , 'KMOURGOS'
    , '650.123.5234'
    , TO_DATE('16-11-1999', 'DD-MM-YYYY')
    , 'ST_MAN'
    , 5800
    , NULL
    , 100
    , 50
  );

INSERT INTO employees VALUES
  ( 125
    , 'Julia'
    , 'Nayer'
    , 'JNAYER'
    , '650.124.1214'
    , TO_DATE('16-07-1997', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3200
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 126
    , 'Irene'
    , 'Mikkilineni'
    , 'IMIKKILI'
    , '650.124.1224'
    , TO_DATE('28-09-1998', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2700
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 127
    , 'James'
    , 'Landry'
    , 'JLANDRY'
    , '650.124.1334'
    , TO_DATE('14-01-1999', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2400
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 128
    , 'Steven'
    , 'Markle'
    , 'SMARKLE'
    , '650.124.1434'
    , TO_DATE('08-03-2000', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2200
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 129
    , 'Laura'
    , 'Bissot'
    , 'LBISSOT'
    , '650.124.5234'
    , TO_DATE('20-08-1997', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3300
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 130
    , 'Mozhe'
    , 'Atkinson'
    , 'MATKINSO'
    , '650.124.6234'
    , TO_DATE('30-10-1997', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2800
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 131
    , 'James'
    , 'Marlow'
    , 'JAMRLOW'
    , '650.124.7234'
    , TO_DATE('16-02-1997', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2500
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 132
    , 'TJ'
    , 'Olson'
    , 'TJOLSON'
    , '650.124.8234'
    , TO_DATE('10-04-1999', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2100
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 133
    , 'Jason'
    , 'Mallin'
    , 'JMALLIN'
    , '650.127.1934'
    , TO_DATE('14-06-1996', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3300
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 134
    , 'Michael'
    , 'Rogers'
    , 'MROGERS'
    , '650.127.1834'
    , TO_DATE('26-08-1998', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2900
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 135
    , 'Ki'
    , 'Gee'
    , 'KGEE'
    , '650.127.1734'
    , TO_DATE('12-12-1999', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2400
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 136
    , 'Hazel'
    , 'Philtanker'
    , 'HPHILTAN'
    , '650.127.1634'
    , TO_DATE('06-02-2000', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2200
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 137
    , 'Renske'
    , 'Ladwig'
    , 'RLADWIG'
    , '650.121.1234'
    , TO_DATE('14-07-1995', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3600
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 138
    , 'Stephen'
    , 'Stiles'
    , 'SSTILES'
    , '650.121.2034'
    , TO_DATE('26-10-1997', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3200
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 139
    , 'John'
    , 'Seo'
    , 'JSEO'
    , '650.121.2019'
    , TO_DATE('12-02-1998', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2700
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 140
    , 'Joshua'
    , 'Patel'
    , 'JPATEL'
    , '650.121.1834'
    , TO_DATE('06-04-1998', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2500
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 141
    , 'Trenna'
    , 'Rajs'
    , 'TRAJS'
    , '650.121.8009'
    , TO_DATE('17-10-1995', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3500
    , NULL
    , 124
    , 50
  );
INSERT INTO employees VALUES
  ( 142
    , 'Curtis'
    , 'Davies'
    , 'CDAVIES'
    , '650.121.2994'
    , TO_DATE('29-01-1997', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 3100
    , NULL
    , 124
    , 50
  );

INSERT INTO employees VALUES
  ( 143
    , 'Randall'
    , 'Matos'
    , 'RMATOS'
    , '650.121.2874'
    , TO_DATE('15-03-1998', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2600
    , NULL
    , 124
    , 50
  );

INSERT INTO employees VALUES
  ( 144
    , 'Peter'
    , 'Vargas'
    , 'PVARGAS'
    , '650.121.2004'
    , TO_DATE('09-07-1998', 'DD-MM-YYYY')
    , 'ST_CLERK'
    , 2500
    , NULL
    , 124
    , 50
  );

INSERT INTO employees VALUES
  ( 145
    , 'John'
    , 'Russell'
    , 'JRUSSEL'
    , '011.44.1344.429268'
    , TO_DATE('01-10-1996', 'DD-MM-YYYY')
    , 'SA_MAN'
    , 14000
    , .4
    , 100
    , 80
  );

INSERT INTO employees VALUES
  ( 146
    , 'Karen'
    , 'Partners'
    , 'KPARTNER'
    , '011.44.1344.467268'
    , TO_DATE('05-01-1997', 'DD-MM-YYYY')
    , 'SA_MAN'
    , 13500
    , .3
    , 100
    , 80
  );

INSERT INTO employees VALUES
  ( 147
    , 'Alberto'
    , 'Errazuriz'
    , 'AERRAZUR'
    , '011.44.1344.429278'
    , TO_DATE('10-03-1997', 'DD-MM-YYYY')
    , 'SA_MAN'
    , 12000
    , .3
    , 100
    , 80
  );

INSERT INTO employees VALUES
  ( 148
    , 'Gerald'
    , 'Cambrault'
    , 'GCAMBRAU'
    , '011.44.1344.619268'
    , TO_DATE('15-10-1999', 'DD-MM-YYYY')
    , 'SA_MAN'
    , 11000
    , .3
    , 100
    , 80
  );

INSERT INTO employees VALUES
  ( 149
    , 'Eleni'
    , 'Zlotkey'
    , 'EZLOTKEY'
    , '011.44.1344.429018'
    , TO_DATE('29-01-2000', 'DD-MM-YYYY')
    , 'SA_MAN'
    , 10500
    , .2
    , 100
    , 80
  );

INSERT INTO employees VALUES
  ( 150
    , 'Peter'
    , 'Tucker'
    , 'PTUCKER'
    , '011.44.1344.129268'
    , TO_DATE('30-01-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 10000
    , .3
    , 145
    , 80
  );
INSERT INTO employees VALUES
  ( 151
    , 'David'
    , 'Bernstein'
    , 'DBERNSTE'
    , '011.44.1344.345268'
    , TO_DATE('24-03-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 9500
    , .25
    , 145
    , 80
  );

INSERT INTO employees VALUES
  ( 152
    , 'Peter'
    , 'Hall'
    , 'PHALL'
    , '011.44.1344.478968'
    , TO_DATE('20-08-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 9000
    , .25
    , 145
    , 80
  );

INSERT INTO employees VALUES
  ( 153
    , 'Christopher'
    , 'Olsen'
    , 'COLSEN'
    , '011.44.1344.498718'
    , TO_DATE('30-03-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 8000
    , .2
    , 145
    , 80
  );

INSERT INTO employees VALUES
  ( 154
    , 'Nanette'
    , 'Cambrault'
    , 'NCAMBRAU'
    , '011.44.1344.987668'
    , TO_DATE('09-12-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7500
    , .2
    , 145
    , 80
  );

INSERT INTO employees VALUES
  ( 155
    , 'Oliver'
    , 'Tuvault'
    , 'OTUVAULT'
    , '011.44.1344.486508'
    , TO_DATE('23-11-1999', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7000
    , .15
    , 145
    , 80
  );

INSERT INTO employees VALUES
  ( 156
    , 'Janette'
    , 'King'
    , 'JKING'
    , '011.44.1345.429268'
    , TO_DATE('30-01-1996', 'DD-MM-YYYY')
    , 'SA_REP'
    , 10000
    , .35
    , 146
    , 80
  );



INSERT INTO employees VALUES
  ( 157
    , 'Patrick'
    , 'Sully'
    , 'PSULLY'
    , '011.44.1345.929268'
    , TO_DATE('04-03-1996', 'DD-MM-YYYY')
    , 'SA_REP'
    , 9500
    , .35
    , 146
    , 80
  );

INSERT INTO employees VALUES
  ( 158
    , 'Allan'
    , 'McEwen'
    , 'AMCEWEN'
    , '011.44.1345.829268'
    , TO_DATE('01-08-1996', 'DD-MM-YYYY')
    , 'SA_REP'
    , 9000
    , .35
    , 146
    , 80
  );

INSERT INTO employees VALUES
  ( 159
    , 'Lindsey'
    , 'Smith'
    , 'LSMITH'
    , '011.44.1345.729268'
    , TO_DATE('10-03-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 8000
    , .3
    , 146
    , 80
  );


INSERT INTO employees VALUES
  ( 160
    , 'Louise'
    , 'Doran'
    , 'LDORAN'
    , '011.44.1345.629268'
    , TO_DATE('15-12-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7500
    , .3
    , 146
    , 80
  );

INSERT INTO employees VALUES
  ( 161
    , 'Sarath'
    , 'Sewall'
    , 'SSEWALL'
    , '011.44.1345.529268'
    , TO_DATE('03-11-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7000
    , .25
    , 146
    , 80
  );

INSERT INTO employees VALUES
  ( 162
    , 'Clara'
    , 'Vishney'
    , 'CVISHNEY'
    , '011.44.1346.129268'
    , TO_DATE('11-11-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 10500
    , .25
    , 147
    , 80
  );

INSERT INTO employees VALUES
  ( 163
    , 'Danielle'
    , 'Greene'
    , 'DGREENE'
    , '011.44.1346.229268'
    , TO_DATE('19-03-1999', 'DD-MM-YYYY')
    , 'SA_REP'
    , 9500
    , .15
    , 147
    , 80
  );

INSERT INTO employees VALUES
  ( 164
    , 'Mattea'
    , 'Marvins'
    , 'MMARVINS'
    , '011.44.1346.329268'
    , TO_DATE('24-01-2000', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7200
    , .10
    , 147
    , 80
  );

INSERT INTO employees VALUES
  ( 165
    , 'David'
    , 'Lee'
    , 'DLEE'
    , '011.44.1346.529268'
    , TO_DATE('23-02-2000', 'DD-MM-YYYY')
    , 'SA_REP'
    , 6800
    , .1
    , 147
    , 80
  );

INSERT INTO employees VALUES
  ( 166
    , 'Sundar'
    , 'Ande'
    , 'SANDE'
    , '011.44.1346.629268'
    , TO_DATE('24-03-2000', 'DD-MM-YYYY')
    , 'SA_REP'
    , 6400
    , .10
    , 147
    , 80
  );

INSERT INTO employees VALUES
  ( 167
    , 'Amit'
    , 'Banda'
    , 'ABANDA'
    , '011.44.1346.729268'
    , TO_DATE('21-04-2000', 'DD-MM-YYYY')
    , 'SA_REP'
    , 6200
    , .10
    , 147
    , 80
  );

INSERT INTO employees VALUES
  ( 168
    , 'Lisa'
    , 'Ozer'
    , 'LOZER'
    , '011.44.1343.929268'
    , TO_DATE('11-03-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 11500
    , .25
    , 148
    , 80
  );

INSERT INTO employees VALUES
  ( 169
    , 'Harrison'
    , 'Bloom'
    , 'HBLOOM'
    , '011.44.1343.829268'
    , TO_DATE('23-03-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 10000
    , .20
    , 148
    , 80
  );

INSERT INTO employees VALUES
  ( 170
    , 'Tayler'
    , 'Fox'
    , 'TFOX'
    , '011.44.1343.729268'
    , TO_DATE('24-01-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 9600
    , .20
    , 148
    , 80
  );

INSERT INTO employees VALUES
  ( 171
    , 'William'
    , 'Smith'
    , 'WSMITH'
    , '011.44.1343.629268'
    , TO_DATE('23-02-1999', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7400
    , .15
    , 148
    , 80
  );


INSERT INTO employees VALUES
  ( 172
    , 'Elizabeth'
    , 'Bates'
    , 'EBATES'
    , '011.44.1343.529268'
    , TO_DATE('24-03-1999', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7300
    , .15
    , 148
    , 80
  );

INSERT INTO employees VALUES
  ( 173
    , 'Sundita'
    , 'Kumar'
    , 'SKUMAR'
    , '011.44.1343.329268'
    , TO_DATE('21-04-2000', 'DD-MM-YYYY')
    , 'SA_REP'
    , 6100
    , .10
    , 148
    , 80
  );

INSERT INTO employees VALUES
  ( 174
    , 'Ellen'
    , 'Abel'
    , 'EABEL'
    , '011.44.1644.429267'
    , TO_DATE('11-05-1996', 'DD-MM-YYYY')
    , 'SA_REP'
    , 11000
    , .30
    , 149
    , 80
  );

INSERT INTO employees VALUES
  ( 175
    , 'Alyssa'
    , 'Hutton'
    , 'AHUTTON'
    , '011.44.1644.429266'
    , TO_DATE('19-03-1997', 'DD-MM-YYYY')
    , 'SA_REP'
    , 8800
    , .25
    , 149
    , 80
  );

INSERT INTO employees VALUES
  ( 176
    , 'Jonathon'
    , 'Taylor'
    , 'JTAYLOR'
    , '011.44.1644.429265'
    , TO_DATE('24-03-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 8600
    , .20
    , 149
    , 80
  );

INSERT INTO employees VALUES
  ( 177
    , 'Jack'
    , 'Livingston'
    , 'JLIVINGS'
    , '011.44.1644.429264'
    , TO_DATE('23-04-1998', 'DD-MM-YYYY')
    , 'SA_REP'
    , 8400
    , .20
    , 149
    , 80
  );

INSERT INTO employees VALUES
  ( 178
    , 'Kimberely'
    , 'Grant'
    , 'KGRANT'
    , '011.44.1644.429263'
    , TO_DATE('24-05-1999', 'DD-MM-YYYY')
    , 'SA_REP'
    , 7000
    , .15
    , 149
    , NULL
  );

INSERT INTO employees VALUES
  ( 179
    , 'Charles'
    , 'Johnson'
    , 'CJOHNSON'
    , '011.44.1644.429262'
    , TO_DATE('04-01-2000', 'DD-MM-YYYY')
    , 'SA_REP'
    , 6200
    , .10
    , 149
    , 80
  );

INSERT INTO employees VALUES
  ( 180
    , 'Winston'
    , 'Taylor'
    , 'WTAYLOR'
    , '650.507.9876'
    , TO_DATE('24-01-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3200
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 181
    , 'Jean'
    , 'Fleaur'
    , 'JFLEAUR'
    , '650.507.9877'
    , TO_DATE('23-02-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3100
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 182
    , 'Martha'
    , 'Sullivan'
    , 'MSULLIVA'
    , '650.507.9878'
    , TO_DATE('21-06-1999', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2500
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 183
    , 'Girard'
    , 'Geoni'
    , 'GGEONI'
    , '650.507.9879'
    , TO_DATE('03-02-2000', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2800
    , NULL
    , 120
    , 50
  );

INSERT INTO employees VALUES
  ( 184
    , 'Nandita'
    , 'Sarchand'
    , 'NSARCHAN'
    , '650.509.1876'
    , TO_DATE('27-01-1996', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 4200
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 185
    , 'Alexis'
    , 'Bull'
    , 'ABULL'
    , '650.509.2876'
    , TO_DATE('20-02-1997', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 4100
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 186
    , 'Julia'
    , 'Dellinger'
    , 'JDELLING'
    , '650.509.3876'
    , TO_DATE('24-06-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3400
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 187
    , 'Anthony'
    , 'Cabrio'
    , 'ACABRIO'
    , '650.509.4876'
    , TO_DATE('07-02-1999', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3000
    , NULL
    , 121
    , 50
  );

INSERT INTO employees VALUES
  ( 188
    , 'Kelly'
    , 'Chung'
    , 'KCHUNG'
    , '650.505.1876'
    , TO_DATE('14-06-1997', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3800
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 189
    , 'Jennifer'
    , 'Dilly'
    , 'JDILLY'
    , '650.505.2876'
    , TO_DATE('13-08-1997', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3600
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 190
    , 'Timothy'
    , 'Gates'
    , 'TGATES'
    , '650.505.3876'
    , TO_DATE('11-07-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2900
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 191
    , 'Randall'
    , 'Perkins'
    , 'RPERKINS'
    , '650.505.4876'
    , TO_DATE('19-12-1999', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2500
    , NULL
    , 122
    , 50
  );

INSERT INTO employees VALUES
  ( 192
    , 'Sarah'
    , 'Bell'
    , 'SBELL'
    , '650.501.1876'
    , TO_DATE('04-02-1996', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 4000
    , NULL
    , 123
    , 50
  );
INSERT INTO employees VALUES
  ( 193
    , 'Britney'
    , 'Everett'
    , 'BEVERETT'
    , '650.501.2876'
    , TO_DATE('03-03-1997', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3900
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 194
    , 'Samuel'
    , 'McCain'
    , 'SMCCAIN'
    , '650.501.3876'
    , TO_DATE('01-07-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3200
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 195
    , 'Vance'
    , 'Jones'
    , 'VJONES'
    , '650.501.4876'
    , TO_DATE('17-03-1999', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2800
    , NULL
    , 123
    , 50
  );

INSERT INTO employees VALUES
  ( 196
    , 'Alana'
    , 'Walsh'
    , 'AWALSH'
    , '650.507.9811'
    , TO_DATE('24-04-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3100
    , NULL
    , 124
    , 50
  );

INSERT INTO employees VALUES
  ( 197
    , 'Kevin'
    , 'Feeney'
    , 'KFEENEY'
    , '650.507.9822'
    , TO_DATE('23-05-1998', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 3000
    , NULL
    , 124
    , 50
  );

INSERT INTO employees VALUES
  ( 198
    , 'Donald'
    , 'OConnell'
    , 'DOCONNEL'
    , '650.507.9833'
    , TO_DATE('21-06-1999', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2600
    , NULL
    , 124
    , 50
  );
INSERT INTO employees VALUES
  ( 199
    , 'Douglas'
    , 'Grant'
    , 'DGRANT'
    , '650.507.9844'
    , TO_DATE('13-01-2000', 'DD-MM-YYYY')
    , 'SH_CLERK'
    , 2600
    , NULL
    , 124
    , 50
  );

INSERT INTO employees VALUES
  ( 200
    , 'Jennifer'
    , 'Whalen'
    , 'JWHALEN'
    , '515.123.4444'
    , TO_DATE('17-09-1987', 'DD-MM-YYYY')
    , 'AD_ASST'
    , 4400
    , NULL
    , 101
    , 10
  );

INSERT INTO employees VALUES
  ( 201
    , 'Michael'
    , 'Hartstein'
    , 'MHARTSTE'
    , '515.123.5555'
    , TO_DATE('17-02-1996', 'DD-MM-YYYY')
    , 'MK_MAN'
    , 13000
    , NULL
    , 100
    , 20
  );

INSERT INTO employees VALUES
  ( 202
    , 'Pat'
    , 'Fay'
    , 'PFAY'
    , '603.123.6666'
    , TO_DATE('17-08-1997', 'DD-MM-YYYY')
    , 'MK_REP'
    , 6000
    , NULL
    , 201
    , 20
  );

INSERT INTO employees VALUES
  ( 203
    , 'Susan'
    , 'Mavris'
    , 'SMAVRIS'
    , '515.123.7777'
    , TO_DATE('07-06-1994', 'DD-MM-YYYY')
    , 'HR_REP'
    , 6500
    , NULL
    , 101
    , 40
  );

INSERT INTO employees VALUES
  ( 204
    , 'Hermann'
    , 'Baer'
    , 'HBAER'
    , '515.123.8888'
    , TO_DATE('07-06-1994', 'DD-MM-YYYY')
    , 'PR_REP'
    , 10000
    , NULL
    , 101
    , 70
  );

INSERT INTO employees VALUES
  ( 205
    , 'Shelley'
    , 'Higgins'
    , 'SHIGGINS'
    , '515.123.8080'
    , TO_DATE('07-06-1994', 'DD-MM-YYYY')
    , 'AC_MGR'
    , 12000
    , NULL
    , 101
    , 110
  );

INSERT INTO employees VALUES
  ( 206
    , 'William'
    , 'Gietz'
    , 'WGIETZ'
    , '515.123.8181'
    , TO_DATE('07-06-1994', 'DD-MM-YYYY')
    , 'AC_ACCOUNT'
    , 8300
    , NULL
    , 205
    , 110
  );
  
--  drop table departments;
--  drop table jobs;
--  drop table employees;
--  drop table locations;
--  
--  select * from departments;
--  select * from jobs;
--  select * from employees;
--  select * from locations;

select max(department_id) from departments;