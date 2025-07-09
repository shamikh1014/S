import pandas as pd

df=pd.read_csv('covid_data.csv')
df.shape
df.head()

pd.value_counts(df['Gender'])
pd.value_counts(df['Contact_with_covid_patient'])

df['Contact_with_covid_patient']=df['Contact_with_covid_patient'].str.lower()

from sklearn.preprocessing import LabelEncoder, OneHotEncoder, MinMaxScaler

label=LabelEncoder()
df['Gender']=label.fit_transform(df['Gender'])

pd.value_counts(df['Gender'])

severity_label=LabelEncoder()
df['Severity']=label.fit_transform(df['Severity'])

contact_label=LabelEncoder()
df['Contact_with_covid_patient']=contact_label.fit_transform(df['Contact_with_covid_patient'])

gender=df['Gender'].values
severity=df['Severity'].values
contact=df['Contact_with_covid_patient'].values

gender
severity
contact

gender_onehot=OneHotEncoder()
gender=gender_onehot.fit_transform(gender.reshape(-1, 1))

gender

gender=gender.toarray()

gender

severity_onehot=OneHotEncoder()
severity=severity_onehot.fit_transform(severity.reshape(-1, 1)).toarray()

contact_onehot=OneHotEncoder()
contact=severity_onehot.fit_transform(contact.reshape(-1, 1)).toarray()

severity

contact

df.drop(columns=['Country', 'Gender', 'Severity', 'Contact_with_covid_patient'], inplace=True)

X=df.iloc[:, :-1].values
Y=df.iloc[:, -1].values

import numpy as np

X=np.c_[X, gender, severity, contact]
X[0]

minmax=MinMaxScaler()
X=minmax.fit_transform(X)

X[0]

from sklearn.model_selection import train_test_split

x_train, x_test, y_train, y_test=train_test_split(X, Y, test_size=0.25)

x_train.shape
x_test.shape

from sklearn.linear_model import LogisticRegression

model=LogisticRegression()
model.fir(x_train, y_train)

y_pred=model.predict(x_test)

from sklearn.metrics import accuracy_score, confusion_matrix

accuracy_score(y_test, y_pred)

confusion_matrix(y_test, y_pred)

y_pred.shape

# correct predictions
308+285

# wrong predictions
22+10

291/(291+5)

304/(304+25)

import matplotlib.pyplot as plt

from sklearn.metrics import roc_curve

pred_prob=model.predict_proba(x_test)
pred_prob

fpr, tpr, thresh=roc_curve(y_test, pred_prob[:, 1], pos_label=1)

# thresh

random_prob=[0 for i in range(len(y_test))]
p_fpr, p_tpr, _=roc_curve(y_test, random_prob, pos_label=1)

plt.plot(fpr, tpr, linestyle='--')
plt.plot(p_fpr, p_tpr, color='red')
plt.show()































