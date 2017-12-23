# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package published a laser scan message out of a Sick S300 laser scanner."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native diagnostic-msgs roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_sick_s300/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a35ab169427c49e95d4af3a439b0196"
SRC_URI[sha256sum] = "4102d5b2a019b3a7b3956203607a24ae5b22cf086a5d4c9956e6399bee181150"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_sick_s300-0.6.10-0"

inherit catkin
