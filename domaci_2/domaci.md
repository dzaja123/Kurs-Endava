# Други домаћи задатак
Path путање и локатори

### Почетна страна

| Елемент | Путања  | Локатор |
| ------- | --- | --- |
| username | /html/body/div[1]/div/div[2]/div[2]/form/div[1]/input | //input[@id='username']  
| password | /html/body/div[1]/div/div[2]/div[2]/form/div[2]/input | //input[@id='password'] |
| submit | /html/body/div[1]/div/div[2]/div[2]/form/div[3]/div/input | //input[@type='submit'] |
| register | /html/body/div[1]/div/div[2]/div[2]/form/div[4]/a[1] | //a[.='Create account']/@href | 
| forgotpassword | /html/body/div[1]/div/div[2]/div[2]/form/div[4]/a[2] | //a[.='reset password']/@href |

### user Details дијалог

| Елемент | Путања  | Локатор |
| ------- | --- | --- |
| Username | /html/body/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]/p/span[1] | //span[text() = 'Username: '] | 
| First Name | /html/body/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]/p/span[3] | //span[text() = 'First Name: '] |
| Last Name | /html/body/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]/p/span[5] | //span[text() = 'Last Name: '] |
| About | /html/body/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]/span[1] | //span[text() = 'About: '] | 
| Close | /html/body/div[1]/div/div/div[3]/div/div/div/div[3]/button | //button[contains(text(),'Close')] |
