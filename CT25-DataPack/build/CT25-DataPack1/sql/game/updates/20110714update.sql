-- AugmentationBlackList
DELETE FROM `item_attributes` WHERE `itemId` IN (SELECT `object_id` FROM `items` WHERE `item_id` IN (6656,6657,6658,6659,6660,6661,6662,8191,10170,10314,13740,13741,13742,13743,13744,13745,13746,13747,13748,14592,14593,14594,14595,14596,14597,14598,14599,14600,14664,14665,14666,14667,14668,14669,14670,14671,14672,14801,14802,14803,14804,14805,14806,14807,14808,14809,15282,15283,15284,15285,15286,15287,15288,15289,15290,15291,15292,15293,15294,15295,15296,15297,15298,15299,16025,16026,21712));
DELETE FROM `item_elementals` WHERE `itemId` IN (SELECT `object_id` FROM `items` WHERE `item_id` IN (6656,6657,6658,6659,6660,6661,6662,8191,10170,10314,13740,13741,13742,13743,13744,13745,13746,13747,13748,14592,14593,14594,14595,14596,14597,14598,14599,14600,14664,14665,14666,14667,14668,14669,14670,14671,14672,14801,14802,14803,14804,14805,14806,14807,14808,14809,15282,15283,15284,15285,15286,15287,15288,15289,15290,15291,15292,15293,15294,15295,15296,15297,15298,15299,16025,16026,21712));
-- Common Items
DELETE FROM `item_attributes` WHERE `itemId` IN (SELECT `object_id` FROM `items` WHERE (item_id>=11605 AND item_id<=12361));
DELETE FROM `item_elementals` WHERE `itemId` IN (SELECT `object_id` FROM `items` WHERE (item_id>=11605 AND item_id<=12361));
-- Hero Items
DELETE FROM `item_attributes` WHERE `itemId` IN (SELECT `object_id` FROM `items` WHERE (item_id>=6611 AND item_id<=6621) OR item_id=6842 OR (item_id>=9388 AND item_id<=9390));
DELETE FROM `item_elementals` WHERE `itemId` IN (SELECT `object_id` FROM `items` WHERE (item_id>=6611 AND item_id<=6621) OR item_id=6842 OR (item_id>=9388 AND item_id<=9390));