
import pandas as pd

df=pd.read_csv('covid_data.csv')
df.shape
df.head()

pd.value_counts(df['Gender'])
pd.value_counts(df['Contact_with_covid_patient'])

df['Contact_with_covid_patient']=df['Contact_with_covid_patient'].str.lower()

from sklearn.preprocessing import LabelEncoder, OneHotEncoder, MinMaxScaler

gender_label=LabelEncoder()
df['Gender']=gender_label.fit_transform(df['Gender'])

pd.value_counts(df['Gender'])

severity_label=LabelEncoder()
df['Severity']=gender_label.fit_transform(df['Severity'])

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
y=df.iloc[:, -1].values

import numpy as np

X=np.c_[X, gender, severity, contact]
X[0]

minmax=MinMaxScaler()
X=minmax.fit_transform(X)
X[0]

from sklearn.model_selection import train_test_split

x_train, x_test, y_train, y_test=train_test_split(X, y, test_size=0.25)

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

import pickle as pkl

file=open('model.pkl', 'wb')
pkl.dump(model, file)

file.close()

file=open('gender_label.pkl', 'wb')
pkl.dump(gender_label, file)
file.close()

file=open('gender_onehot.pkl', 'wb')
pkl.dump(gender_onehot, file)
file.close()

file=open('severity_label.pkl', 'wb')
pkl.dump(severity_label, file)
file.close()

file=open('severity_onehot.pkl', 'wb')
pkl.dump(severity_onehot, file)
file.close()

file=open('contact_label.pkl', 'wb')
pkl.dump(contact_label, file)
file.close()

file=open('contact_onehot.pkl', 'wb')
pkl.dump(contact_onehot, file)
file.close()

file=open('minmax.pkl', 'wb')
pkl.dump(minmax, file)
file.close()

















