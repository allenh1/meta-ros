# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_phidget_em_state package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-phidgets rospy"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_phidget_em_state/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5781a398f25a5aa3a1f304d210560d2d"
SRC_URI[sha256sum] = "9d019b1c61717748287c4b2fc03ea9f9840c99fc0b3bb7d021cf89c38407a972"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_phidget_em_state-0.6.10-0"

inherit catkin
