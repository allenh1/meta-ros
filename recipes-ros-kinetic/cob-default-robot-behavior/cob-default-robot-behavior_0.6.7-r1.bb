# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_default_robot_behavior package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-light cob-script-server rospy std-msgs std-srvs"
SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/kinetic/cob_default_robot_behavior/0.6.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c64836a1272e4de9589ad6473775a17f"
SRC_URI[sha256sum] = "79d9d6e3b7afff948ce7fc32d73006f41f4e03cb7a4f06069fa5dc6e12acdf9d"
S = "${WORKDIR}/cob_robots-release-release-kinetic-cob_default_robot_behavior-0.6.7-1"

inherit catkin
