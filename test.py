s=input().strip()
for i in range(len(s)):
    if s[i].isnumeric():
        n=int(s[i])
        print(s[i-1]+chr(ord(s[i-1])+n),end="")
