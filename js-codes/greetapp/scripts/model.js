
export const titleCase=(str)=>str.charAt(0).toUpperCase()+str.substring(1).toLowerCase();
export const fullName=(firstName, lastName)=>titleCase(firstName)+" "+titleCase(lastName);