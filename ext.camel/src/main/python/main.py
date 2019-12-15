import sys
from java.util.logging import Logger
from ext.camel.rest import UserService
 
def main():
   
   print("main: python\n", file=sys.stdout, flush=True)
   UserService()
        
main()