# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_phidgets"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native libphidgets message-generation message-runtime roscpp rospy sensor-msgs std-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_phidgets/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7ee7185ae3fadd20808bf3f0bca1410"
SRC_URI[sha256sum] = "334e921bde4c55e51f83564ce4d2d79911010cbe537b80c9505a83df3f4cf5f9"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_phidgets-0.6.10-0"

inherit catkin
