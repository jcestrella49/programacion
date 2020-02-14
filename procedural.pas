uses
       crt;
 var
 matriz : array[1..10,1..10] of integer;
  dato, c, y : integer;
 begin
         clrscr;
        randomize;
     c := 1;
   repeat
          for y := 1 to 10 do
           begin
                  dato := random(100) + 1;
                   matriz[y,c] := dato;
           end;
        c := c + 1;
   until c > 10;
       for c := 1 to 10 do
       begin
        for y := 1 to 10 do
        begin
        write('  ',matriz[y,c]);
        end;
         writeln;
      end;
      readkey;
  end.