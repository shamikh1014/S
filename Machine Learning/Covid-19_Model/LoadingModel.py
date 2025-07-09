
import pickle as pkl

file=open('model.pkl', 'rb')
model=pkl.load(file)
file.close()

file=open('gender_label.pkl', 'rb')
gender_label=pkl.load(file)
file.close()

file=open('gender_onehot.pkl', 'rb')
gender_onehot=pkl.load(file)
file.close()

file=open('severity_label.pkl', 'rb')
severity_label=pkl.load(file)
file.close()

file=open('severity_onehot.pkl', 'rb')
severity_onehot=pkl.load(file)
file.close()

file=open('contact_label.pkl', 'rb')
contact_label=pkl.load(file)
file.close()

file=open('contact_onehot.pkl', 'rb')
contact_onehot=pkl.load(file)
file.close()

file=open('minmax.pkl', 'rb')
minmax=pkl.load(file)
file.close()

age=50
gender='Male'
fever=99
bodypain=1
runny_nose=0
diff=0
nasal=0
sore_throat=1
severity='Mild'
contact='no'

gender=gender_onehot.transform([gender_label.tranform([gender])]).toarray()

severity=severity_onehot.transform([severity_label.tranform([severity])]).toarray()

contact=contact_onehot.transform([contact_label.tranform([contact])]).toarray()

gender
severity
contact

import numpy as np

test_data=np.array([[age, fever, bodypain, runny_nose, diff, nasal, sore_throat]])
test_data

test_X=np.c_[test_data, gender, severity, contact]
test_X

minmax.transfrom(test_X)
test_X

model.predict(test_X)


