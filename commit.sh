# First, check out the commit you wish to go back to (get sha-1 from git log)
git reset --hard 9d3c3a0caa7f7b35ef15adb96fc80fcbb59ac72a

# Then do a forced update.
git push origin +9d3c3a0caa7f7b35ef15adb96fc80fcbb59ac72a^:develop

# Push specific commit
git push origin 9d3c3a0caa7f7b35ef15adb96fc80fcbb59ac72a:develop
